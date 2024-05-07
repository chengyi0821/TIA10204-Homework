package hw5_2;
public class RoleGameTest {

	public static void main(String[] args) {
		Hero[] h = new Hero[2];
		h[0]= new SwordMan("亞拉岡", 1, 0);
		h[1]= new ArrowMan("勒苟拉斯", 1, 0);
		for(int i = 0; i <= 1 ; i++) {
			h[i].attack();
			h[i].display();
			System.out.println("================");
		}
	}
}
