package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryCheck {

	public static void main(String[] args) {
	//  preDefiend();
	 // mannual();
		//simple
	  String a="01101";
	  if(a.matches("^[01]+$")) {
		  System.out.println("true");
	  }
	  else {
		  System.out.println("false");
	  }
	}
	
	//PreDefiend method is used
	public static void preDefiend() {
		String input="01011";
		String check="^[01]+$";
		
		Pattern p=Pattern.compile(check);
		Matcher m=p.matcher(input);
		boolean b=m.matches();
		if(b) {
			System.out.println("Yes,This String consist of binary");
		}
		else 
		{
			System.out.println("No,This String not consist of binary");   
		}
	}
    
	//Without PreDefiend method
	public static void mannual() {
		String a="1010";
		boolean b=false;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c !='0' && c != '1') {
				b=false;
				break;
			}
			else {
				b=true;
			}
		}
		if(b) {
			System.out.println("Yes,This String consist of binary");
		}
		else 
		{
			System.out.println("No,This String not consist of binary");   
		}
	}
}
