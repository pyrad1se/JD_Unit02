package by.htp.tasks.method;

/*Написать метод(методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух
натуральных чисел:







 
=
( , )
( , )
НОД А В
А В*/

public class Method02 {
	public static void main(String[] args) {
		double r = nod(34, 68);
		nok(34, 68, r);
		
	}
	
	public static double nod(double a, double b) {
		System.out.println("Наибольший общий делитель равен: ");
		while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            System.out.println(b);
            double r = b;
            return r;
        } else {
            System.out.println(a);
            double r = a;
            return r;
        }
		
	}
	
	public static void nok(double e, double t, double p) {
		System.out.println("Наибольшее общее кратное равно: ");
		double result = (e * t) / p;
		System.out.println(result);
		
		
	}

}
