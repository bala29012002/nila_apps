package com.nilaapps.adaptive.learning.path.builder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConditionDTO {
	private String operator;
	private List<RuleDTO> rules;
}
