package io.github.dagurasu56.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dagurasu56.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
