package com.nilaapps.adaptive.learning.path.builder.dto;

import com.nilaapps.adaptive.learning.path.builder.entity.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleDTO {
	private Long id;
	private ComponentType sourceType;
	private Long sourceNodeId;
	private String metric;
	private String operator;
	private Object value; // boolean or number in JSON
	private RangeDTO range;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RangeDTO {
		private Double min;
		private Double max;
		private Boolean minInclusive;
		private Boolean maxInclusive;
	}

}
