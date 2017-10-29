package slgservice;

import javax.annotation.Resource;

import org.junit.Test;

import com.slg.service.HeroService;

public class TestHeroService extends BaseTest {
	
	@Resource(name="heroService")
	HeroService heroService;
	
	@Test
	public void testInsertHero() {
		heroService.insertHero("苍月", 100, 99, 10000, 5, 0.1, 101);
		//heroService.insertHero(1, "刘三刀");
	}

}
