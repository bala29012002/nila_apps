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
@Table(name = "tbl_rules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="source_type", nullable = false, length = 20)
    private ComponentType sourceType; // assessment, unit

    @Column(name="source_node_id", nullable = false, length = 100)
    private Long sourceNodeId;

    @Column(name="metric", nullable = false, length = 50)
    private String metric; 

    @Column(name="operator", nullable = false, length = 10)
    private String operator; 

    // For boolean/number values stored as String
    @Column(name="value", nullable = true)
    private String value;

    @Column(name="range_min", nullable = true)
    private Double rangeMin;
    @Column(name="range_max", nullable = true)
    private Double rangeMax;
    @Column(name="range_min_inclusive", nullable = true)
    private Boolean rangeMinInclusive;
    @Column(name="range_max_inclusive", nullable = true)
    private Boolean rangeMaxInclusive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "edge_id", nullable = false)
    @ToString.Exclude
    private Edge edge;
}

