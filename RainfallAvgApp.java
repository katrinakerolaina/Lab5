package Lab5;

import java.text.DecimalFormat;
import java.util.*;

/**
2D Arrays Problems
Compute the average of the rainfall values stored each day for 4 weeks
 RainfallAvgApp
 -- prompts the user to input the rainfall values for 4 weeks
 -- calculates the average of the rainfall
 -- displays the values from the rainfall 2D array
 */
public class RainfallAvgApp {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		//declare and create 2D array with 4 weeks(row) 7 day(col)
		int rainfall[][] = new int [4][7];
		
		//input
		Scanner sc = new Scanner(System.in);
		
		//ask the user to input data
		//traverse the 2D array by using outer and inner loop
		//to store the values provide the user
		for (int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.print("Please enter value  for week: " + (row+1) + " day " + (col+1) + ":");
				
				//read the value entered by the user and save in 2D[]col
				rainfall[row][col] = sc.nextInt();
				
			}
		}
		//processing
		//calculate the sum of all elements of the [] 
		//how many elements the [] contains
		
		int sum = 0;
		int counter = 0;//the number of elements in 2D[]
		double average;
		
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				//add the current element from the array rainfall to the sum
				sum = sum + rainfall[row][col];
				
				//another element has been added to the sum, 
				//the element from [row][col] 
				counter++;
			}
		}
		
		//compute the average of all the elements in the []
		average = (double)sum/counter;
		
		//output
		System.out.println("=====================");
		System.out.println("Average: " + average);
		
		
		//output the 2D [] - the data the user entered 
		System.out.println("=====================");
		System.out.println("The rainfall values are: ");
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.print(rainfall[row][col] + " ");
			}
			System.out.println();
		}
		
		
	}//end main
	
}//end class
