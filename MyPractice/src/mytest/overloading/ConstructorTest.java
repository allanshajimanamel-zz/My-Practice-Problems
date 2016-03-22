package mytest.overloading;

public class ConstructorTest {

	int something;

	ConstructorTest() {
		this.something = 0;
	}

	public ConstructorTest(int something) {
		super();
		this.something = something;
	}

	public static void main(String[] args) {
		// ConstructorTest test = new ConstructorTest(1);
		// System.out.println(test.something);
		// main(1, "Allan");
		// main("Allan", 2);
		if (args.length > 0 && args[0] == "A") {
			System.out.println("Breaking out before endless loop");
		} else {
			String[] xyx = new String[3];
			xyx[0] = "A";
			xyx[1] = "B";
			xyx[2] = "C";
			main(xyx);
		}
	}

	public static void main(String j, int i) throws CustomException1{
		System.out.println(j);
		System.out.println(i);
	}

	public static void main(String j, String i) throws CustomException2{
		System.out.println(j);
		System.out.println(i);
	}
}
