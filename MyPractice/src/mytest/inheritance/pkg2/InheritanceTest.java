package mytest.inheritance.pkg2;

import mytest.inheritance.pkg1.BaseClass;

public class InheritanceTest {

	public static void main(String[] args) {
		BaseClass baseClass = new ChildClass(1, 2, 3, 4);
		baseClass.methodB();
		System.out.println(baseClass.val);
	}

}
