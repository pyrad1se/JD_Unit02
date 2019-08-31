package by.htp.tasks.array01;
/*Дан массив действительных чисел, размерность которого N. Подсчитать, 
 * сколько в нем отрицательных,
положительных и нулевых элементов.*/
public class Array08 {
	public static void main(String[] args) {
		double nums[] = {-1, -300, 234, 124, 456, 0};
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum++;
		}
		System.out.println("Элементов всего: " + sum);
	}

}
