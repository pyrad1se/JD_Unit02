package by.htp.tasks.array01;
/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.*/
public class Array07 {
	public static void main(String[] args) {
		int nums[] = {800, 2042, 97, 55, -444, 16};
		
		int z = 507;
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > z) {
				nums[i] = z;
				sum++;
			}
		}
		System.out.println("Количество замен: " + sum);
	}

}
