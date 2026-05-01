package com.nilaapps.adaptive.learning.path.builder.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nilaapps.adaptive.learning.path.builder.entity.Edge;

@Repository
public interface EdgeRepository {
	List<Edge> findByLearningPathId(Long learningPathId);

	void deleteByLearningPathId(Long learningPathId);
}
