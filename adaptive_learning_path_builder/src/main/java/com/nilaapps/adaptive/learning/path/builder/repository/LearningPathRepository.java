package com.nilaapps.adaptive.learning.path.builder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nilaapps.adaptive.learning.path.builder.entity.LearningPath;

@Repository
public interface LearningPathRepository extends JpaRepository<LearningPath, Long> {

}
