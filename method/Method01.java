package by.htp.tasks.method;
/* Треугольник задан координатами своих вершин. 
 * Написать метод для вычисления его площади*/

public class Method01 {
	
	public static void main(String[] args) {
		
		
		square(2, 4, 0, 15, 9, -4);
		
	}
	
	
	static void square(double x1, double y1, double x2, double y2, 
			double x3, double y3) {
		
		double result = Math.abs(((x1 - x3) * (y2 - y3) - (y1 - y3) * 
				(x2 - x3)) / 2);
		
		System.out.println("Площадь равна " + result);
		
		
		
	}
	
	

}
