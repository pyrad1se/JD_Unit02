package by.htp.tasks.method;
/*Вычислить площадь правильного шестиугольника со стороной а,
 *  используя метод вычисления площади
треугольника.
*/
public class Method06 {
	public static void main(String[] args) {
		
		double a = 6;
		
		double sq_six = square(a) * 6;
		
		System.out.println("Площадь шестиугольника равна " + sq_six);
		
	}
	
	static double square(double a) {
		
		double s = (Math.sqrt(3) / 4) * a * a;
		
		return s;
		
	}

}
