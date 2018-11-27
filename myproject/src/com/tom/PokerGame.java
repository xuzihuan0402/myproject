package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(13)+1 ;
		char[]A = {'S','H','D','C'};
		Random r = new Random();
		int sub = r.nextInt(A.length);
		System.out.print(num);
		System.out.print(A[sub]);

	}

}
