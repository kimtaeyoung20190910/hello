package hello.common;

public class MethodExample {
	public static void main(String[] args) {
		// System.out.println(args[0]);

		showName();
		showAge(30);
		showMe(175.5, 65.5);
		int result = sum(4, 5) + multi(5, 6);
		double result2 = minus(5, 4);
		double weight = Weight(160);
		System.out.println("적정 몸무게는" + weight);

		System.out.println("결과값: " + result);
		// System.out.println(args[1]);
	}

	public static int sum(int a, int b) {
		return a + b;

	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static void showAge(int age) {
		System.out.println("I am" + age + " 24 years old.");
	}

	public static void showMe(double height, double weight) {
		System.out.println("I am" + height + "cm and" + weight + "kg");
	}

	public static double Weight(double height) {
		return (height - 100) * 0.9;
	}

	public static void showName() {
		System.out.println("Hello, my name is taeyoung.");
	}
}
