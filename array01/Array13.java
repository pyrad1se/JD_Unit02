package by.htp.tasks.array01;
/*Определить количество элементов последовательности натуральных чисел, 
 * кратных числу М и заключенных в
промежутке от L до N.*/

public class Array13 {
	public static void main(String[] args) {
		double nums[] = {65, 43, 77, 98, 56, 7653, 43, 6666, 9968};
		
		double M, L, N;
		
		M = 7;
		L = 19;
		N = 767;
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % M == 0 & nums[i] < N & nums[i] > L) {
				sum++;
			}
		}
		System.out.println("Количество элементов равно " + sum);
		
		
	}

}
