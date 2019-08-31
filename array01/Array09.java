package by.htp.tasks.array01;
/*Даны действительные числа а1 ,а2 ,..., аn . 
 * Поменять местами наибольший и наименьший элементы*/

public class Array09 {
	public static void main(String[] args) {
		double nums[] = {234, 423, 47, 12, 0, -104};
		double max, min;
		max = min = nums[0];
		int index_min = 0;
		int index_max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			index_min = i;
			if (nums[i] > max) {
				max = nums[i];
			}
			index_max = i;
		}
		nums[index_max] = min;
		nums[index_min] = max;
		
		
	}

}
