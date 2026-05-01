package com.nilaapps.adaptive.learning.path.builder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComponentListResponseDTO {
	private List<ComponentDTO> items;
	private Integer totalCount;
}
