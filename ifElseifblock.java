package Conditionalstatements;

public class ifElseifblock {
	/* if else if block syntax
	 * if(condition)
	 * {
	 *  }
	 *  else if(condition)
	 *  {
	 *  }
	 *  else
	 *  {
	 *  }
	 *  
	 */
	
	public static void main(String[] args) {
		  
		int a =100;
		int b = 30;
		int c = 30;
		
		if(b>a) {
			
			System.out.println("1");
		}
		else if(b!=c) {
			System.out.println("2");
		}
		
		else {
			System.out.println("invalid request No match found>3");
		}
	}

}
/* 1. we can write single 'if condition'and single else condition but we can have
multiple 'else condition' also
  2. the condition only be written in 'if' and 'else if'
  3. under any circumstances it is possible for both the conditions to be true its 
  depends on the condition,conditions are made to be true or false
  4. which ever block has become true for the first time that will only execute always 
    and others will be just ignored
  5. whenever you have two conditions or 100 conditions its possible that all of them
     become true but the one who has become true for the first time will only execute.  

*/