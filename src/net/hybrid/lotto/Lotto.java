package net.hybrid.lotto; 

import java.util.Random;


public class Lotto {


	public static void main(String[] args) {
		new Lotto().getLotto();
	}
	
	public int[] getLotto() {
		int[] numbers = new int[6];
		for (int i = 0; i < 6; i++) {
			numbers[i] = getNumber();
		}
		return numbers;
	}

	Random random = new Random();
	private int getNumber() {
		return random.nextInt(45) + 1;
	}

}
