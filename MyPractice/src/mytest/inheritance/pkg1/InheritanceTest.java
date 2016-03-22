package mytest.inheritance.pkg1;


public class InheritanceTest {

	public static void main(String[] args) {
		BaseClass baseClass = new ChildClass(1, 2, 3, 4);
		baseClass.methodA();
		baseClass.methodB();
		baseClass.methodD();
		System.out.println(baseClass.val);
	}

}
