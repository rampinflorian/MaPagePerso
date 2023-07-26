package com.mpp.mapageperso.repositories;

import com.mpp.mapageperso.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
