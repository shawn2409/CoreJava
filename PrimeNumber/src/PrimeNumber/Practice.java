package PrimeNumber;

public class Practice {

	public static void a(int n) {
		int flag = 0;
		int m = n / 2;

		if (n == 0 | n == 1) {
			System.out.println(n + " not a prime number");
		} else {
			for (int i = 2; i < m; i++) {

				if (n % 2 == 0) {
					System.out.println(n + " not a prime number");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {

				System.out.println(n + " is a prime number");
			}
		}

	}

	public static void main(String[] args) {
		a(1);
		a(3);
		a(17);
		a(20);

	}

}