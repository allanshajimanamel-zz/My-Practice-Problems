package mytest.inheritance.pkg1;

public class BaseClass {
	int defaultVal;
	public int publicVal;
	private int privateVal;
	protected int protectedVal;
	public int val = 9;

	protected BaseClass(int a, int b, int c, int d){
		this.defaultVal = a;
		this.publicVal = b;
		this.privateVal = c;
		this.protectedVal = d;
	}

	void methodA(){
		System.out.println(" base method A with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	public void methodB(){
		System.out.println(" base method B with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	private void methodC(){
		System.out.println(" base method C with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	protected void methodD(){
		System.out.println(" base method D with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	public class innerClass extends BaseClass{

		innerClass(){
			super(5, 6, 7, 8);
		}

		public void innerMethod(){
			System.out.println("Value of val "+val);
		}

		public void methodC(){
			System.out.println("Calling parent private method");
			super.methodC();
		}
	}
}
