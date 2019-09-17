package hello.common;

public class d {
	public static void main(String[] args) {
		int[][] aAry = new int[5][5];
		int a = 1;
		for (int c = 0; c < aAry.length; c++ ) {
			for (int r = aAry.length-1; r >=0; r--) {
				aAry[r][c] = a++;
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