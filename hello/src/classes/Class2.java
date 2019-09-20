package classes;

public class Class2 {
	public static void main(String[] args) {
		exchange(567890);
		
	}
	public static void exchange(int a) {
		int money = a;
		int result = 0, remain=0;
		int[] perAry = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < perAry.length; i++) {
			result = money / perAry[i];
			remain = money % perAry[i];
			a=remain;
			
			System.out.println(perAry[i]+"원"+result+"개");

		
		}
	}
}
