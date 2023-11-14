package com.fhenric.dslist.services;

import com.fhenric.dslist.dto.GameMinDTO;
import com.fhenric.dslist.entities.Game;
import com.fhenric.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//o Service é um componente que deve ser registrado, diferente do Repository q recebe um extends e já é OBSERVADO pelo sistema como um repository
//como fazemos isso: @Service
@Service
public class GameService {

    @Autowired //Injeção do game repository dentro do service (conectando o service ao repository
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList(); //transforma o List<Game> em <GameMinDTO>


    };
}