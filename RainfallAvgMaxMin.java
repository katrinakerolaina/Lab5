package Lab5;

import java.text.DecimalFormat;
import java.util.*;

public class RainfallAvgMaxMin {

	//declare variables
	private double rainfall[][];
	private double average;
	private int max;
	private int min;
	
	//constructor
	public RainfallAvgMaxMin() {
	}

	//setter
	public void setRainfall(double[][] rainfall) {
		this.rainfall = rainfall;
	}

	//getters
	public double getAverage() {
		return average;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}
	
	//processing
	public void calcAverage() {
		double sum = 0;
		double counter = 0;//the number of elements in 2D[]
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
	}
	
	public void calcMax() {
		double max;
		max = rainfall[0][0];
		
		for (int row = 0; row < rainfall.length; row++) {
			double r[] = rainfall[row];
			for(int col = 0; col < r.length; col++) {
				if(max < rainfall[row][col]) {
					max = rainfall[row][col];
					
				}//end if
				
			}//end inner loop
		}//end outer loop
	}//end method
		
		public void calcMin() {
			double min;
			min = rainfall[0][0];
			
			for (int row = 0; row < rainfall.length; row++) {
				double r[] = rainfall[row];
				for(int col = 0; col < r.length; col++) {
						if(min > rainfall[row][col]) {
						min = rainfall[row][col];
					}//end if
					
				}//end inner loop
			}//end outer loop
		}
	
		
		
	}//end class
