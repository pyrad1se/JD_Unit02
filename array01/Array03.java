package by.htp.tasks.array01;
/*Дана последовательность целых чисел а1 а2,..., аn . Выяснить, 
 * какое число встречается раньше - положительное или
отрицательное*/
public class Array03 {
	public static void main(String[] args) {
		int a[] = {-2, 3, 6, 11, -3, -100};
		
		if (a[0] < 0) {
			System.out.println("Отрицательное");
		}
		if (a[0] > 0) {
			System.out.println("Положительное");
		}
	}

}
