package com.nilaapps.adaptive.learning.path.builder.dto;

import com.nilaapps.adaptive.learning.path.builder.entity.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComponentDTO {
    private Long id;
    private String title;
    private String shortDescription;
    private ComponentType type;
    private Integer approximateDurationMinutes;
    private MetadataDTO metadata;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MetadataDTO {
        private AssessmentMetaDTO assessment;
        private UnitMetaDTO unit;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AssessmentMetaDTO {
        private Integer maxScore;
        private Integer passingScore;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitMetaDTO {
        private Integer recommendedMinutes;
    }
}
