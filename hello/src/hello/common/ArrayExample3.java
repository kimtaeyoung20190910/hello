package hello.common;

public class ArrayExample3 {
	public static void main(String[] args) {
	int[][] aAry = new int[5][5];
	int a = 1;
	for (int i = 0; i < aAry.length; i++ ) {
		for (int j = 0; j < aAry[i].length; j++) {
			aAry[i][j] = a++; 
		}
	}

	for (int i = 0; i < aAry.length; i++) {
		for (int j = 0; j < aAry[i].length; j++) {
			System.out.print(aAry[i][j]+" ");
			
		}
		System.out.println();
}

	}
}

