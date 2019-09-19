package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		cal.execute(a, b);
	}
}
