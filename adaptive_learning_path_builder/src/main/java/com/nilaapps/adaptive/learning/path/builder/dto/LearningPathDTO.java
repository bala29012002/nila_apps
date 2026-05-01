package com.nilaapps.adaptive.learning.path.builder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningPathDTO {
	private Long id;
	private String name;
	private String description;
	private String status;
	private Integer version;
	private CanvasDTO canvas;
	private List<NodeDTO> nodes;
	private List<EdgeDTO> edges;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CanvasDTO {
		private Double zoom;
		private Double offsetX;
		private Double offsetY;
	}
}
