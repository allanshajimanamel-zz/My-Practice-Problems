package mytest.inheritance.pkg1;

import mytest.inheritance.pkg1.BaseClass.innerClass;


public class InheritanceTest2 {

	public static void main(String[] args) {
		BaseClass x = new BaseClass(1, 2, 3, 4);
		innerClass innerClass = x. new innerClass();
		innerClass.innerMethod();
		innerClass.methodC();
	}

}
