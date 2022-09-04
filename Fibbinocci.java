package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = firstNum + secNum;
		System.out.print(firstNum);
		System.out.print(",");
		System.out.print(secNum);
		System.out.print(",");
		System.out.print(sum);
		System.out.print(",");
		for (int i = 1; i <= 11; i += 1) {
			firstNum = secNum;
			secNum = sum;
			sum = firstNum + secNum;
			System.out.println(sum);
			System.out.println(",");
		}

	}

}
