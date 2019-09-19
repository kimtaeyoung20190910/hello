package hello.common;

public class ArrayExample4 {
		public static void main(String[] args) {
		char chr = 'A';
		int num =  chr;
		//배열 복사하는법
		//for (int i = 65; i<90; i++);
		//System.out.println(chr + "(" + num + ")");
		
		String[] strAry = {"Hello", "World", "Good", "Morning"};
		String[] copyAry = new String[strAry.length];
		for(int i = 0; i < strAry.length; i++) {
			copyAry[1] = strAry[i];
		}
		for (String str : copyAry) {
			System.out.println(str);
		System.arraycopy(strAry, 0, copyAry, 0, length);
		for (String str : copyAry) {
			System.out.println(str);
		}
		}
	}
}

