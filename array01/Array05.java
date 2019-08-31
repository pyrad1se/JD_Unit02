package by.htp.tasks.array01;
/*Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте*/
public class Array05 {
	public static void main(String[] args) {
		double a[] = {44, 22, 11, 13, 965, 944, 10000, 522};
		double b[] = {};
		
		
		for (int i = 0; i < a.length ; i++ ) {
			if (a[i] % 2 == 0) {
				System.out.println(1);
				b[i] = a[i];
			}
			else {
				System.out.println("хуй");
			}
		}
	}

}
