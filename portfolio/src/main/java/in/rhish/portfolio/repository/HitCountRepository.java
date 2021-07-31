package in.rhish.portfolio.repository;

import org.springframework.data.repository.CrudRepository;

import in.rhish.portfolio.model.HitCount;

public interface HitCountRepository extends CrudRepository<HitCount, Integer> {
	public HitCount findBySlug(String slug);
}
