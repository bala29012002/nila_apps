package com.nilaapps.adaptive.learning.path.builder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_components")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Component {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="title", nullable = false, length = 150)
	private String title;

	@Column(name="short_description", nullable = false, length = 280)
	private String shortDescription;

	@Column(name="type", nullable = false, length = 20)
	private String type;

	@Column(name="approximate_duration_minutes", nullable = false)
	private Integer approximateDurationMinutes;
	
	@Column(name = "max_score", nullable = true)
	private Integer maxScore;
	
	@Column(name = "passing_score", nullable = true)
	private Integer passingScore;

	@Column(name = "recommended_minutes", nullable = true)
	private Integer recommendedMinutes;
}
