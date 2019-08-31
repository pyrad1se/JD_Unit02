package by.htp.tasks.array01;
/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, 
 * для которых аi > i.
*/
public class Array10 {
	public static void main(String[] args) {
		int nums[] = {4, 543, 0, 1, 234, 2, -30020};
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > i) {
				System.out.println(nums[i]);
			}
		}
		
		
	}

}
