package com.educode.springdatajpacourse.repository;

import com.educode.springdatajpacourse.entity.Player;
import com.educode.springdatajpacourse.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    Player findPlayerByName(String name);

    List<Player> findPlayerByTeamId(Long idTeam);



    List<Player> findPlayerByTeamName(String team);


}
