package by.htp.tasks.method;

/*Написать метод(методы) для нахождения суммы 
 * большего и меньшего из трех чисел.*/
public class Method05 {
	public static void main(String[] args) {
		
		int x = 954;
		int y = 22222;
		int z = 11;
		
		sum_min_max(x, y, z);
		
		
	}
	
	public static void sum_min_max(int a, int b, int c) {
		
		int r = Math.min(a, b);
		int min = Math.min(r, c);
		
		int k = Math.max(a, b);
		int max = Math.max(k, c);
		
		int sum = min + max;
		
		System.out.println("Сумма большего и меньшего из трех"
				+ " чисел равна " + sum);
	}
}
