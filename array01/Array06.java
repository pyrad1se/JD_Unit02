package by.htp.tasks.array01;
/*Дана последовательность чисел а1 ,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую все эти числа*/
public class Array06 {
	public static void main(String[] args) {
		int nums[] = {3, 88, 12, 34, 40, 98, 667};
		int min, max;
		min = max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Наименьшая длина числовой оси равна " +
		(max - min));
		
	}

}
