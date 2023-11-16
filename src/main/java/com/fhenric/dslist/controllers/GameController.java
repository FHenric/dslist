package com.fhenric.dslist.controllers;

import java.util.List;

import com.fhenric.dslist.dto.GameDTO;
import com.fhenric.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.fhenric.dslist.dto.GameDTO;
import com.fhenric.dslist.dto.GameMinDTO;
import com.fhenric.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService; //Injeção do service no controller

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}