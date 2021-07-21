package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
    public static int sumIntArray(int[] values) {
    	int b = values[0];
    	int sum = 0;
    	for(int i = 1; i<values.length; i++) {
    		sum = b + values[i];
    		b = sum;
    	}
        return sum;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
    	double sum = sumIntArray(values);
    	double average = sum/values.length;
        return average;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	
    	boolean contains = false;
    	
    	for(int s: array) {
    	if(s == value) {
    		contains = true;
    		break;
    	}
    	}
    	
        return contains;
    	
    }

    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	int output = -1;
    	
    	boolean contains = containsIntValue(arr, value);
    	
    	if(contains == true) {
    		for(int i = 0; i < arr.length; i ++) {
    			if(arr[i] == value) {
    				output = i;
    				break;
    			}
    		}
    	}
    	
        return output;
    }
}
