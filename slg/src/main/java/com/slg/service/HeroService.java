package com.slg.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.HeroDao;
import entity.Hero;

@Service
public class HeroService {
	
	@Resource
	HeroDao heroDao;
	
	public void insertHero(String name, Integer attack, Integer defense, Integer hp, Integer rare, Double attackRate, Integer speed) {
		Hero hero = new Hero(name, attack, defense, hp, rare, attackRate, speed);
		heroDao.insertHero(hero);
	}
	
}
