package Lab5;

import java.util.*;

public class ArrayApp {

	public static void main(String[] args) {
		
		//declare 2d variable []
		int arr[][] = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		
		/*
		c
		o
		l
	row 1 2 3
		4 5 6
		7 8 9
		
		*/
		
		//System.out.println(arr[0][2]);
		
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++ ) {
				System.out.print(arr[row][column] + " ");
				
			}
			System.out.println();
		}
		//input
		Scanner input = new Scanner(System.in);
		ArrayDemo myArr = new ArrayDemo();
		
		myArr.setNums(arr);
		
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				System.out.println("Please enter a number: ");
				int num = input.nextInt();
				myArr.setArrayNumber(row, column, num);
			}
		}
		//output
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}
		

	}//end main

}//end class
