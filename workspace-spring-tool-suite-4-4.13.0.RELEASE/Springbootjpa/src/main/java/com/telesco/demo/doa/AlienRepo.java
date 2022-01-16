package com.telesco.demo.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telesco.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
