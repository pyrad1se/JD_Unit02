package by.htp.tasks.array01;
/* Дана последовательность действительных чисел а1 а2 ,..., аn . 
 * Выяснить, будет ли она возрастающей*/
public class Array04 {
	public static void main(String[] args) {
		int a[] = {2, 4, 5, 3, 500, 999999};
		
		for (int i = 0; i < a.length; i++ ) {
			if (a[i] < a[i + 1]) {
				System.out.println("возрастает");
			}
			if (a[i] >= a[i + 1]) {
				System.out.println("Не возрастает");
				break;
			}
			
		}
	}

}
