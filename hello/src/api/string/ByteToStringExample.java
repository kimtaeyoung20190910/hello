package api.string;

public class ByteToStringExample { //바이트배열->문자열로 변환
	
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes); //배열 전체를 String 객체로 생성
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6번째에서 4개 문자열 추출
		System.out.println(str2);
	}
}
