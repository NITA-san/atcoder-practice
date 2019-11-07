package beginner_contest_144_f;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Integer s[] = new Integer[m];
		Integer t[] = new Integer[m];

		for (int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		Double[] dp = new Double[m];
		
		
		Arrays.stream(s).forEach(System.out::println);

	}

}
