package in.rhish.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HitCount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hitID;
	
	@Column(unique = true)
	private String slug;
	private long hits;
}
