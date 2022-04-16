package ch02;

public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;  // final 이라고 붙으면 상수라고 뜻하며 값을 변경할 수 없다. 변경하려고하면 에러가 발생할 것이다.
		boolean power   = true;
		//byte b = 128;  // -128~127
		
		long l = 10_000_000_000L;  // _ 이것은 jdk 1.7에 추가된 문법인데 큰 수를 담을때 보기 쉽게 하기위해 만들어졌다.
		
		
		System.out.println(power);
		System.out.println(score);
	}

}
