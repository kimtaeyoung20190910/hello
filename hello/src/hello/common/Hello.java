package hello.common;

public class Hello {
	public static void main(String[] args) {
		int sum = 0;
		int a = 1, b = 10;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				sum += i;
				
			}
		}
		System.out.println(a + "~" + b + " 합은 " + sum);
	}
}
