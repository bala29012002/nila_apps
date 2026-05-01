package com.nilaapps.adaptive.learning.path.builder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EdgeDTO {
	private Long id;
	private Long sourceNodeId;
	private Long targetNodeId;
	private String label;
	private Boolean isDefault;
	private ConditionDTO conditions;
}
