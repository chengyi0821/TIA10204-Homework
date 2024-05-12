package hw6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		setXY(x, y);
	}

	public void setXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		} else {
			System.out.println(x + "的" + y + "次方等於:" + (int)Math.pow(x, y));
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
