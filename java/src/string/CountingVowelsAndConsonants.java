package string;

public class CountingVowelsAndConsonants {

	public static void main(String[] args) {
        count();
	}
     public static void count() {
    	 String a="HariraM".toLowerCase();
    	 int vowels=0;
    	 int consonants=0;
    	 for(int i=0;i<a.length();i++) {
    		 char c=a.charAt(i);
    		 if(c=='a'|| c=='e'||c=='i'||c=='o' || c=='u') {
    			vowels++;
    		 }
    		 else {
    			 consonants++;
    		 }
    	 }
    	 System.out.println("count of the vowels="+vowels+"\ncount of the consonants="+consonants);
    	
     }
}
