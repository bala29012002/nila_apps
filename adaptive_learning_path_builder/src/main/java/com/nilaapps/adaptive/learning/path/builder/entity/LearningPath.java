package com.nilaapps.adaptive.learning.path.builder.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_learning_path")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LearningPath {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "version", nullable = true)
	private Integer version;
	
	@Column(name = "canvas_zoom", nullable = true)
    private Double canvasZoom;
	
	@Column(name = "canvas_offset_x", nullable = true)
    private Double canvasOffsetX;
	
	@Column(name = "canvas_offset_y", nullable = true)
    private Double canvasOffsetY;

    @OneToMany(mappedBy = "learningPath", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Node> nodes;

    @OneToMany(mappedBy = "learningPath", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Edge> edges;

}
