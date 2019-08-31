package by.htp.tasks.array01;
/*В целочисленной последовательности есть нулевые элементы. 
 * Создать массив из номеров этих элементов.*/
public class Array02 {
	public static void main(String[] args) {
		
		int a[] = {0, 5, 777, 2, 0, 45, 223};
		
		for (int i = 0; i < a.length; i++) {
			int zeros[] = {};
			if (a[i] == 0) {
				for (int j = 0; ; j++) {
					zeros[j] = i;
					System.out.println(i);
				}
				
			}
		}
		
	}

}
