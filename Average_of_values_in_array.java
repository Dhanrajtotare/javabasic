package practice;

public class Average_of_values_in_array {
	public static void main(String[] args) {
		
		int sum=0;
		int nos[]=new int[4];
		nos[0]=6;
		nos[1]=12;
		nos[2]=18;
		nos[3]=24;
		
		for(int i = 0; i<4; i++)
		{sum= sum + nos[i];
		
		System.out.println(sum);
		// double average = sum/nos.length;
		//System.out.println(average);
		}
	}

}
