package by.htp.tasks.array01;
/* В массив A [N] занесены натуральные числа. Найти сумму тех элементов, 
 * которые кратны данному К.
*/
public class Array01 {
	public static void main(String[] args) {
		int a[] = {2, 1, 8, 32, 44};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++ ) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		System.out.println("Сумма элементов равна " + sum);
	}
}
