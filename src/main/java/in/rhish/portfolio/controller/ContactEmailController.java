package in.rhish.portfolio.controller;

import in.rhish.portfolio.dto.ContactEmailDto;
import in.rhish.portfolio.service.ContactEmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/contactEmail")
@AllArgsConstructor
public class ContactEmailController {

    private ContactEmailService contactEmailService;

    @PostMapping
    public ResponseEntity sendEmail(@RequestBody @Valid ContactEmailDto contactEmailDto) throws Exception {
        contactEmailService.sendEmail(contactEmailDto);
        return ResponseEntity.ok().body("success");
    }

}
