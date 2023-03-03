/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
 package com.example.player.controller;

import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
/**
  * PlayerController
  */
@RestController
public class PlayerController{
  @Autowired
  PlayerH2Service pService;
  @DeleteMapping("/players/{playerId}")
  public void deletePlayer(@PathVariable("playerId") int playerId) {
    // TODO Auto-generated method stub
    pService.deletePlayer(playerId);
  }
  @PutMapping("/players/{playerId}")
  public Player updatePlayer(@PathVariable("playerId") int playerId,@RequestBody Player player) {
    // TODO Auto-generated method stub
    return pService.updatePlayer(playerId, player);
  }
  @PostMapping("/players")
  public Player addPlayer(@RequestBody Player player) {
    // TODO Auto-generated method stub
    return pService.addPlayer(player);
  }
  @GetMapping("/players/{playerId}")
  public Player getPlayerById(@PathVariable("playerId") int playerId) {
    // TODO Auto-generated method stub
    return pService.getPlayerById(playerId);
  }
  @GetMapping("/players")
  public ArrayList<Player> getPlayers() {
    return pService.getPlayers();
  }
 }
