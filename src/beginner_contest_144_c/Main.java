package beginner_contest_144_c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long i;

//		for (i = 1; a >= i * i; i++) {

//		}
		i =(long)Math.floor(Math.sqrt(a));
		System.out.println((i - 1) * 2 + (a - i*i));
		
	}

}
