package Core;

public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException  {
	c obj=new c();
	obj.i=5;
	obj.j=5;
	System.out.println(obj);
	c obj1=(c) obj.clone();
	System.out.println(obj1);
	obj.i=110;
	System.out.println(obj);
	System.out.println(obj1);
	}

}

class c implements Cloneable{
	int i;
	int j;
	public String toString() {
		return  "i="+i+"j="+j;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
