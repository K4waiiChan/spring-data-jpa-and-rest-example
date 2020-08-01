package org.scesi.example.clases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulePeriodRepository extends JpaRepository<SchedulePeriod, Long> {
}
