package ch01;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수는 몇개: ");
		int num = scanner.nextInt();

		int[] k = new int[num];

		for (int i = 0; i < k.length; i++) {
//			
			k[i] = (int)(Math.random() * 100) + 1;
			for(int j=0;j<i;j++) {
				if(k[i]==k[j]) {
					i--;
				}
			}
			
		}
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

	}

}
