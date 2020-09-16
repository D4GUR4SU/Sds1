package io.github.dagurasu56.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dagurasu56.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}
