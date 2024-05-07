package hw5_2;

public class ArrowMan extends Hero {
	@Override
	public void display() {
		System.out.println("move:" + move + "\ndefend:" + defend);
	}

	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	@Override
	public void attack() {
		System.out.println("射弓箭!");
	}
}
