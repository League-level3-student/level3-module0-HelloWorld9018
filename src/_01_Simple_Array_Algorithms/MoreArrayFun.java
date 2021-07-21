package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

		public static void main(String[] args) {
			
			String[] myStringsArray = new String[6];
			
			myStringsArray[0] = "Hello";
			myStringsArray[1] = "my";
			myStringsArray[2] = "name";
			myStringsArray[3] = "is";
			myStringsArray[4] = "Lily";
			myStringsArray[5] = "Covarrubias";
			
			printStrings(myStringsArray);
			System.out.println("\n");
			printReverse(myStringsArray);
			System.out.println("\n");
			printEvens(myStringsArray);
			System.out.println("\n");
			printRandom(myStringsArray);
			
		}

     //2. Write a method that takes an array of Strings and prints all the Strings in the array.

		static void printStrings(String[] array) {
			
			for(String s: array) {
				System.out.println(s);
			}
			
		}
		
    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

		static void printReverse(String[] array) {
			
			for(int i = array.length-1; i>0; i--) {
				System.out.println(array[i]);
			}
			
		}

    //4. Write a method that takes an array of Strings and prints every other String in the array.

		static void printEvens(String[] array) {
			
			for(int i = 0; i < array.length; i++) {
				if(i%2 == 0) {
					System.out.println(array[i]);
				}
			}
			
		}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.

		static void printRandom(String[] array) {
			
			Random ran = new Random();
			int x = ran.nextInt(array.length);
			for(String s: array) {
				ran = new Random();
				x = ran.nextInt(array.length);
				System.out.println(array[x]);
			}
			
		}
		
}
