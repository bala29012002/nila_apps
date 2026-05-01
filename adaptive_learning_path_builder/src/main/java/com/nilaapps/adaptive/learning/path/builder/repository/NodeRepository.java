package com.nilaapps.adaptive.learning.path.builder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilaapps.adaptive.learning.path.builder.entity.Node;

public interface NodeRepository extends JpaRepository<Node, Long> {
	List<Node> findByLearningPathId(Long learningPathId);

	void deleteByLearningPathId(Long learningPathId);
}
