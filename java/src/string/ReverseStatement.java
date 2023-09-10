package string;

public class ReverseStatement {

	public static void main(String[] args) {
		reverse();
	}
	
	public static void reverse() {
		String a="Hello is was";
		String[] b=a.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for(int i=b.length-1;i>=0;i--) {
			sb.append(b[i]);
			if(i>0) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
		
	}

}
