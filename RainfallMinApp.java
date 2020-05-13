package Lab5;

import java.text.DecimalFormat;
import java.util.*;

public class RainfallMinApp {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		double rainfall[][] = new double [4][7];
		
		//input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println("Please enter number of days per week: ");
		int days = sc.nextInt();
		
		rainfall = new double[weeks][days];
		
		for (int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length;col++) {
				System.out.println("enter rainfall value for week: " + (row+1) + " day " + (col+1) + ": ");
				rainfall[row][col] = sc.nextDouble();
			}
		}//end for
		
		//processing
		double min;
		min = rainfall[0][0];
		
		for (int row = 0; row < rainfall.length; row++) {
			//retrieve the current row located at the index given by the value of the row variable
			double r[] = rainfall[row];
			//traverse all the element of current row
			for(int col = 0; col < r.length; col++) {
				//if the value of min variable is greater than the current element from the array 
				//the min value will be updated with that element
				if(min > rainfall[row][col]) {
					//a new max value has been found
					min = rainfall[row][col];//store the value of current element in the max
					//the previous value from the max is replaced
				}//end if
				
			}//end inner loop
		}//end outer loop
		
		//output
				System.out.println("min is: " + min);

	}

}
