package Lab5;

import java.util.*;

public class RainfallAvgMaxMinApp {
	public static void main(String[] args) {
		double[][] rainfall;
		
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
		RainfallAvgMaxMin avgAvg = new RainfallAvgMaxMin();
		RainfallAvgMaxMin avgMax = new RainfallAvgMaxMin();
		RainfallAvgMaxMin avgMin = new RainfallAvgMaxMin();
		
		avgAvg.setRainfall(rainfall);
		avgMax.setRainfall(rainfall);
		avgMin.setRainfall(rainfall);
		
		//calculation
		avgAvg.calcAverage();
		avgMax.calcMax();
		avgMin.calcMin();
		
		//output
		double a = avgAvg.getAverage();
		int b = avgMax.getMax();
		int c = avgMin.getMin();
		
		System.out.println("=====================");
		System.out.println("Average: " + a);
		
		
		//output the 2D [] - the data the user entered 
		System.out.println("=====================");
		System.out.println("The rainfall values are: ");
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.print(rainfall[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		System.out.println("max is: " + b);
		
		System.out.println("=====================");
		
		System.out.println("min is: " + c);
		
		
	}

}