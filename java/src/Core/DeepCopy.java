package Core;

public class DeepCopy {

	public static void main(String[] args) {
		B obj=new B();
		obj.i=5;
		obj.j=5;
		System.out.println(obj);
		B obj1=new B();
		obj1.i=obj.i;
		obj1.j=obj.j;
		System.out.println(obj1);
	}

}

class B{
	int i;
	int j;
	
	public String toString() {
		return "DeepCopy{"+"i="+i+"j="+j+"}";
	}
}