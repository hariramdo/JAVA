package string;

public class PalindromeCheck {

	public static void main(String[] args) {
		// high();
		simple();
	}

	// simple code
	public static void simple() {
              String a="malayalamhi";
              StringBuilder sb= new StringBuilder(a).reverse();
             if(a.equals(sb.toString())) {
            	System.out.println("Given String is a Palindrome");
             }
             else {
            	 System.out.println("This String is not a Palindrome");
             }
             
	}

	// length of the code is high
	public static void high() {
		String a = "malayalam";
		int left = 0;
		int right = a.length() - 1;
		boolean b = false;

		while (left < right) {
			if (a.charAt(left) != a.charAt(right)) {
				b = false;
				break;
			} else {
				b = true;
			}
			left++;
			right--;
		}
		if (b) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("not it is not a palindrome");
		}
	}

}
