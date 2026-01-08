package Conditionalstatements;

public class ifElseBlock {
	/* if else block syntax:-
	 * if(condition)
	 * {
	 * }
	 * else
	 * {
	 * }
	 */
	
	public static void main(String[] args) {
		
		int age=17;
		
		if(age>=18) {
			System.out.println("adult> 18+ Eligible for vote");
		}
		
		else {
			System.out.println("Minor> below 18 not eligible for vote");
		}
	}

}
