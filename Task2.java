package uk.ac.mmu.advprog.lab2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperatureArray[];
		
		temperatureArray = new int[] {-3, -2, 0, -1, 4, 5, 6, 6, 7, 11, 7, 2};
		
		MinMaxAvg m = new MinMaxAvg();
		
		System.out.println("Max Temperature: " + m.getMaxNum(temperatureArray));
		
		System.out.println("Min Temperature: " + m.getMinNum(temperatureArray));
		
		System.out.println("Average Temperature: " + m.average(temperatureArray));

	}

}
