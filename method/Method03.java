package by.htp.tasks.method;
/*Написать метод(методы) для нахождения наибольшего общего 
 * делителя четырех натуральных чисел.*/
public class Method03 {
	public static void main(String[] args) {
		
		double x = 16;
		double y = 20;
		double z = 40;
		double j = 100;
		
		double nod1 = nod(x, y);
		double nod2 = nod(z, j);
		double nod_result = nod(nod1, nod2);
		
		System.out.println("Наибольший общий делитель равен " + nod_result);
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

}
