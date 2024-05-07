package hw5_2;

public abstract class Hero {
	// 省略 getter/setter...

	private String name;
	private int level;
	private double exp;

	protected AttackMethod attack;
	protected MoveMethod move;
	protected DefendMethod defend;

	public Hero() {
		this("David", 1, 0);
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	public void attack() {
		attack.attack();
	}
	public void move() {
		move.move();
	}
	public void defind() {
		defend.defend();
	}
}
