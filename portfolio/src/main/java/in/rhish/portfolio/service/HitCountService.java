package in.rhish.portfolio.service;

import org.springframework.stereotype.Service;

import in.rhish.portfolio.model.HitCount;
import in.rhish.portfolio.repository.HitCountRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HitCountService {
	private final HitCountRepository hitCountRepository;
	
	public HitCount registerHit(String slug) {
		HitCount hitCount = hitCountRepository.findBySlug(slug);
		
		if (hitCount == null) {
			hitCount = HitCount.builder()
								.slug(slug)
								.hits(1)
								.build();
		} else {
			hitCount.setHits(hitCount.getHits() + 1);
		}
		
		return hitCountRepository.save(hitCount);
	}
}
