package com.nilaapps.adaptive.learning.path.builder.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_edge")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Edge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "source_node_id", nullable = false, length = 100)
	private Long sourceNodeId;

	@Column(name = "target_node_id", nullable = false, length = 100)
	private Long targetNodeId;

	@Column(name = "label", length = 150 , nullable = true)
	private String label;

	@Column(name = "priority", length = 150 , nullable = true)
	private Integer priority;
	
	@Column(name = "is_default", length = 150 , nullable = true)
	private Boolean isDefault;

	@Column(name = "conditions_operator", length = 150 , nullable = true)
	private String conditionsOperator;

	@OneToMany(mappedBy = "edge", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Rule> rules;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "learning_path_id", nullable = false)
	@ToString.Exclude
	private LearningPath learningPath;
}
