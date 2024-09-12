package com.drimer.pkmutil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

  @GetMapping("/pokemon/random")
  public String randomPokemon() {
    return "Pikachu";
  }
}
