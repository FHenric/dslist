package com.fhenric.dslist.repositories;

import com.fhenric.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository faz consulta com o banco
public interface GameRepository extends JpaRepository<Game, Long> {
}
