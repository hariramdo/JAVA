package string;

public class OnlyNumberCheck {

	public static void main(String[] args) {
		//preDefiend();
		//manual();
		//simple
		String s="83729";
		if(s.matches("\\d+")) {
			System.out.println("true");
		}
	}
	
	//predefiend method
	public static void preDefiend() {
		String a="18473";
		if(a.matches("\\d+")) {
			System.out.println("containing only number");
		}
		else {
			System.out.println("false");
		}
	}
	
	//mannual
	public static void manual() {
		String a=".47389";
		boolean b=false;
		 for(int i=0;i<a.length();i++){
			 char c=a.charAt(i);
			 if(c<'0'||c>'9') {
				 b=false;
				 break;
			 }
			 else {
				 b=true;
				}
		 }
		 System.out.println(b);
	}

}
