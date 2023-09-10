package Core;

public class ShallowCopy {
   public static void main(String arg[]) {
	   A obj= new A();
	   obj.i=5;
	   obj.j=5;
	   System.out.println(obj);
	   A obj1=obj;
	   obj1.i=10;
	   System.out.println(obj1);
	   System.out.println(obj);
   }
  
}

class A{
	int i;
	int j;
	 public String toString() {
		   return "ShallowCopy{"+"i="+i+" "+"j="+j+"}";
	   }
}