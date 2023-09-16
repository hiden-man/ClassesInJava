package ClassLes;

public class Main {
	public static void main(String[] args) {
		TestClass tc = new TestClass(545);
		System.out.println("Your number = " + tc.ReturnNum());
	}
}

class TestClass{
	int num;
	public TestClass(int num) {
		this.num = num;
	}
	public int ReturnNum() {
		return num;
	}
}
