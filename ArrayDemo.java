package Lab5;

public class ArrayDemo {

	//declare data members
	private int nums[][];

	//constructor
	public ArrayDemo() {
	}

	public int[][] getNums() {
		return nums;
	}

	public void setNums(int[][] nums) {
		this.nums = nums;
	}

	public void setArrayNumber(int row, int column, int num) {
		nums[row][column] = num;
	}
	
	
}
