package hw5_2;

public class ArrowMan extends Hero {
	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
		this.attack = new ArrowAttack();
		this.move = new MoveInterface();
		this.defend = new DefendInterface();
	}
}
