package com.educode.springdatajpacourse.service;

import com.educode.springdatajpacourse.entity.Player;
import com.educode.springdatajpacourse.entity.Team;
import com.educode.springdatajpacourse.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void add(Player player){

        playerRepository.save(player);
    }

    public Player findByName(String name){
        return playerRepository.findPlayerByName(name);
    }

    public void updatePlayer(Player player,Long id){

        Player playerToUpdate = playerRepository.findById(id).get();

        playerToUpdate.setAge(30);

        playerRepository.save(playerToUpdate);

    }

    public List<Player> getAll(){
        return playerRepository.findAll();
    }

    public List<Player> getByTeam(Long idTeam){
        return playerRepository.findPlayerByTeamId(idTeam);
    }


    public List<Player> getByTeamName(String team){
        return playerRepository.findPlayerByTeamName(team);
    }
}
