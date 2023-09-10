package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
	      ArrayList a=new ArrayList<Integer>();
	      for(int i=1;i<=10;i++) {
	    	  a.add(i);
	      }
	      Iterator i=a.iterator();
	      while(i.hasNext()) {
	    	  Integer I=(Integer)i.next();
	    	  if(I%2==0) {
	    		  System.out.print(I+" ");
	    	  }
	    	  else {
	    		  i.remove();
	    	  }
	      }
	      System.out.println(a);
	}

}
