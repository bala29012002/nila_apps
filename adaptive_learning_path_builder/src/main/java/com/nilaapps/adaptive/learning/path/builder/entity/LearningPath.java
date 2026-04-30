package com.nilaapps.adaptive.learning.path.builder.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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

	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "status", nullable = true)
	private String status;
	private Integer version;

	@Lob
	@Column(name = "graph_json", columnDefinition = "LONGTEXT", nullable = true)
	private String graphJson;

}
