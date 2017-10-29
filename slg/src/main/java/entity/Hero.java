package entity;

public class Hero {
	private String name;
	private Integer attack;
	private Integer hp;
	private Integer defense;
	private Integer rare;
	private Double attackRate;
	private Integer speed;
	private Integer breakPoint = 0;

	public Integer getBreakPoint() {
		return breakPoint;
	}

	public void setBreakPoint(Integer breakPoint) {
		this.breakPoint = breakPoint;
	}

	public Hero() {
		
	}
	
	public Hero(String name, Integer attack, Integer defense, Integer hp, Integer rare, Double attackRate, Integer speed) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.rare = rare;
		this.attackRate = attackRate;
		this.speed = speed;
	}
	
	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Double getAttackRate() {
		return attackRate;
	}
	public void setAttackRate(Double attackRate) {
		this.attackRate = attackRate;
	}
	public Integer getRare() {
		return rare;
	}
	public void setRare(Integer rare) {
		this.rare = rare;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
