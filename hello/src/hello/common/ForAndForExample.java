package hello.common;

public class ForAndForExample {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("<<" + i + "단>>");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		////////////////////////
		int i = 2;
		while (i < 10) {
		/////////////
			int j =  1;
			while (j < 10) {
				System.out.println();
				j++;
			}
			//////////
			i++;
		}
		
		///////////////////////
	
	} // end of main

}

