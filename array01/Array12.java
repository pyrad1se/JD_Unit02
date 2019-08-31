package by.htp.tasks.array01;
/* Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
 * порядковые номера которых являются
простыми числами.*/
public class Array12 {
	public static void main(String[] args) {
		double nums[] = {32, 12, 54, 5, 89, 322};
		
		double sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < i; j++) {
				if (i / j != 0) {
					System.out.println("Простое");
					sum +=nums[i];
				}
				else {
					System.out.println("Сложное");
				}
			}
		}
		System.out.println("Сумма чисел равна " + sum);
	}
}
