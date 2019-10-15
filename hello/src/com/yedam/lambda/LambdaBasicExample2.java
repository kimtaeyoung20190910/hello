package com.yedam.lambda;

interface MyInterfaceNoArgs { // 매개값, return 값x
	public void method1();
}

interface MyInterfacewithArgs {
	public void method2(int a); // 매개값이 하나있는 interface.
}

interface MyInterfacewithReturn {
	public int method3(int a, int b); // 매개값, return 값 있는 interface.
}

public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> {
			System.out.println("no arguments expression.");
		};
		fina.method1();

		MyInterfacewithArgs fiwa = (a) -> {
			System.out.println("result is " + (a));
		};
		fiwa.method2(5);

		MyInterfacewithReturn fiwr = (a, b) -> {
			return a + b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과 값은: " + result);
	}
}
