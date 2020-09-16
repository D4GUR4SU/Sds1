package io.github.dagurasu56.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.dagurasu56.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
}
