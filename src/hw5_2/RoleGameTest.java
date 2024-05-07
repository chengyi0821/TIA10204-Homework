package hw5_2;
public class RoleGameTest {
	public static void main(String[] args) {
		Hero justin = new ArrowMan("賈斯丁",1,0);
		Hero bieber = new SwordMan("比伯",1,0);

		justin.attack();
		justin.move();
		justin.defend();
		
		bieber.attack();
		bieber.move();
		bieber.defend();
	}
}
