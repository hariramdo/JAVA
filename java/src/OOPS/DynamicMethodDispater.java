package OOPS;

public class DynamicMethodDispater {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();

	}

}

class A{
	public void show()
	{
		System.out.println("A method");
	}
}

class B extends A{
	public void show() {
		System.out.println("B method");
	}
}