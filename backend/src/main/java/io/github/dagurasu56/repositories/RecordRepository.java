package io.github.dagurasu56.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.dagurasu56.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
