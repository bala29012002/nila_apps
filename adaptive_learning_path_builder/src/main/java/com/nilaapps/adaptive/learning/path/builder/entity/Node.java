package com.nilaapps.adaptive.learning.path.builder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_node")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="component_id",nullable = false, length = 100)
	private Long componentId;

	@Column(name="type",nullable = false, length = 20)
	private ComponentType type; 

	@Column(name="label",nullable = false, length = 150)
	private String label;

	@Column(name="description",length = 1000)
	private String description;

	@Column(name="position_x", nullable = true)
	private Double positionX;
	@Column(name="position_y", nullable = true)
	private Double positionY;

	@Column(name="approximate_duration_minutes", nullable = true)
	private Integer approximateDurationMinutes;
	
	@Column(name="max_score", nullable = true)
	private Integer maxScore;
	
	@Column(name="passing_score", nullable = true)
	private Integer passingScore;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "learning_path_id", nullable = false)
	@ToString.Exclude
	private LearningPath learningPath;

}
