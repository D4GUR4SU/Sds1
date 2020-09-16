package io.github.dagurasu56.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dagurasu56.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
