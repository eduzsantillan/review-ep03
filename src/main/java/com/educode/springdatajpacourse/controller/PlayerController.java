package com.educode.springdatajpacourse.controller;

import com.educode.springdatajpacourse.entity.Player;
import com.educode.springdatajpacourse.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public void add(@RequestBody  Player player){
        playerService.add(player);
    }

    @GetMapping("/getbyname")
    public Player getByName(@RequestParam  String name){
        return playerService.findByName(name);
    }

    @GetMapping("/getbyteam")
    public List<Player> getByTeam(@RequestParam Long idTeam){
        return playerService.getByTeam(idTeam);
    }

    @GetMapping("/getbyteamname")
    public List<Player> getByTeamName(@RequestParam String team){
        return playerService.getByTeamName(team);
    }

    @GetMapping("/getall")
    public List<Player> getAll(){
        return playerService.getAll();
    }

}
