package org.scesi.example.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "periods")
public interface PeriodRepository extends JpaRepository<Period, Long> {
}
