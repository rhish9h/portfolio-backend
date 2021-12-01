package in.rhish.portfolio.service;

import in.rhish.portfolio.dto.ContactEmailDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ContactEmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Value("${mail.send.to}")
    private String sendTo;

    public void sendEmail(ContactEmailDto contactEmailDto) throws Exception {
        sendSimpleEmail(sendTo,
                "Contact Email from " + contactEmailDto.getFrom() + " [rhish.in]",
                contactEmailDto.getBody());
    }

    public void sendSimpleEmail(String to, String subject, String text) throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@rhish.in");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        try {
            emailSender.send(message);
            log.info("Sent email : " + message.toString());
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception("Error in sending email");
        }
    }
}