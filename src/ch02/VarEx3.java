package ch02;

public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;  // final �̶�� ������ ������ ���ϸ� ���� ������ �� ����. �����Ϸ����ϸ� ������ �߻��� ���̴�.
		boolean power   = true;
		//byte b = 128;  // -128~127
		
		long l = 10_000_000_000L;  // _ �̰��� jdk 1.7�� �߰��� �����ε� ū ���� ������ ���� ���� �ϱ����� ���������.
		
		
		System.out.println(power);
		System.out.println(score);
	}

}
