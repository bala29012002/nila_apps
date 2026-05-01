package com.nilaapps.adaptive.learning.path.builder.dto;

import com.nilaapps.adaptive.learning.path.builder.entity.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NodeDTO {
	private Long id;
	private Long componentId;
	private ComponentType type;
	private String label;
	private String description;
	private PositionDTO position;
	private ConfigDTO config;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PositionDTO {
		private Double x;
		private Double y;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ConfigDTO {
		private Integer approximateDurationMinutes;
		private AssessmentConfigDTO assessment;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AssessmentConfigDTO {
		private Integer maxScore;
		private Integer passingScore;
	}
}
