package bit.alg.search;

import java.util.Random;

/**
 * 
 * @author phanidhar
 * This is used to shuffle the array , this will result random shuffle in linear time
 * ex : deck of cards shuffle, 
 * we can use alternative logic random generated numbers and sort them in order , but this will not be linear
 * as it contains sorting logic extra
 */
public class RandomShuffleDemo { 
	public static void shuffle(String[] input){
		for (int i = 0; i < input.length; i++) {
			exchange(input, i ,randomNumber(i));
		}
	}
	
	public static void exchange(String[] input , int p , int q){
		String temp = input[p];
		input[p] =  input[q];
		input[q] = temp;
	}
	public static void show(String[] input){
		System.out.println();
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}
	public static int randomNumber(int i){
		int randomNumber = (int)(Math.random()*i);
		//int randomNumber = new Random().nextInt(20);
		//System.out.println(randomNumber);
		return randomNumber;
	}
	
	public static void main(String[] args) {
		int length = 20;
		String[] input = new String[length];
		for (int i = 0; i < length; i++) {
			input[i] = ""+i;
		}
		show(input);
		shuffle(input);
		show(input);
	}
}
