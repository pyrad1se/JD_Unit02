package by.htp.tasks.method;
/*Написать метод(методы) для нахождения наименьшего 
 * общего кратного трех натуральных чисел.*/
public class Method04 {
	public static void main(String[] args) {
		double x = 4;
		double y = 8;
		double z = 12;
		
		double nod1 = nod(x, y);
		double nod_final = nod(nod1, z);
		
		double nok1 = nok(x, y, nod_final);
		double nok_final = nok(nok1, z, nod_final);
		
		System.out.println("Наименьшее общее кратное равно " + nok_final);
		
	}
	
	public static double nod(double a, double b) {
		while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            double r = b;
            return r;
        } else {
            double r = a;
            return r;
        }
		
		
	}
	
	public static double nok(double e, double t, double p) {
		double result = (e * t) / p;
		return result;

}
