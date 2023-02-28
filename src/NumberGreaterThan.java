import java.util.Scanner;

public class NumberGreaterThan {
	static public void main(String... Arvind) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		loginFunction(number);
	}

	public static void loginFunction(int number) {
		String len = String.valueOf(number);
		int lengthh = len.length();
		int[] nummm = new int[lengthh];
		int i = 0;
		int product = 1;
		int sum = 0;

		if (number > 9) {
			String num = String.valueOf(number);
			char[] ch = num.toCharArray();
			for (char c : ch) {
				String n1 = String.valueOf(c);
				nummm[i] = Integer.parseInt(n1);
				System.out.println(nummm[i]);
				i++;
			}
			for (int k = 0; k < lengthh; k++) {
				product = product * nummm[k];

			}
			System.out.println(product);

			
			loginFunction(product);
		}

	}

}
