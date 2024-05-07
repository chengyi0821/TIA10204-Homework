package hw5_2;

public class SwordMan extends Hero {
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
		this.attack = new SwordAttack();
		this.move = new MoveInterface();
		this.defend = new DefendInterface();
	}
}
