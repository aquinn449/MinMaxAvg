package uk.ac.mmu.advprog.lab2;

public class MinMaxAvg {
	
	public int getMaxNum (int[] temperatureArray) {
		int maxNum = 0;
		for(int i=0; i < temperatureArray.length; i++) {
			if(temperatureArray[i] > maxNum) {
				maxNum = temperatureArray[i];
			}
		}
		return maxNum;
	}
	
	public int getMinNum (int[] temperatureArray) {
		int minNum = temperatureArray[0];
		for(int i=0; i < temperatureArray.length; i++) {
			if(temperatureArray[i] < minNum) {
				minNum = temperatureArray[i];
			}
		}
		return minNum; 
	}
	public static double average (int[] temperatureArray) {
		int length = temperatureArray.length;
		double sum = 0;
		
		for(int i = 0; i < temperatureArray.length; i++) {
			sum += temperatureArray[i];
		}
		
		return (double) sum/temperatureArray.length;
		
	}

}
