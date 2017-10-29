package dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import entity.Hero;
import persistence.HeroMapper;

@Service
public class HeroDao {
	
	@Resource
	HeroMapper heroMapper;
	
	public Integer insertHero(Hero hero) {
		return heroMapper.insertHero(hero);
	}
	
	public Hero selectHeroByName(String name) {
		return heroMapper.selectHeroByName(name);
	}

}
