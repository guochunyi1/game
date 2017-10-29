package persistence;

import entity.Hero;

public interface HeroMapper {
	
	Integer insertHero(Hero hero);
	Hero selectHeroByName(String name);

}
