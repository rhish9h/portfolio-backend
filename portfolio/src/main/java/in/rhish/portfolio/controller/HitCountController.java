package in.rhish.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.rhish.portfolio.model.HitCount;
import in.rhish.portfolio.service.HitCountService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class HitCountController {
	
	private final HitCountService hitCounterService;
	
	@GetMapping("/registerHit")
	public HitCount registerHit(@RequestParam String slug) {
		return hitCounterService.registerHit(slug);
	}
}
