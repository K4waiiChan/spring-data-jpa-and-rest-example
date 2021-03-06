package org.scesi.example.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "subjects")
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
