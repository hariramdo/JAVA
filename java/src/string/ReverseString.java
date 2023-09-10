package string;

public class ReverseString {

	public static void main(String[] args) {
		//loop();
		small();
	}
	
	//using loop
	public static void loop() {
		String a="hello";
		System.out.println("hello");
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	//using StringBuilder
	public static void small() {
		String a="hello";
		System.out.println("hello");
		StringBuilder sb=new StringBuilder(a).reverse();
		System.out.println(sb);
	}

}
