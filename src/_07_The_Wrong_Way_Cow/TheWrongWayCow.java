/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.HashMap;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	
    	//TheWrongWayCowTest cowTest = new TheWrongWayCowTest();
    	/*int[][] cowCoordinates = new int[1][1];
        int col;
        int row;*/
        
        int northCnt = 0;
        int eastCnt = 0;
        int southCnt = 0;
        int westCnt = 0;
        
        HashMap<String, int[]> hm = new HashMap<String, int[]>(4);
        
       /* field = cowTest.simple();
        if(cowTest.) {
        	
        }*/
        
        
        //redo: Which ever direction has only 1 cow, that's the WWC!

        for(int i = 0; i<field.length; i++ ) {
        	for(int k = 0; k<field[i].length; k++) {
        		if(field[i][k] == 'c') {
        			if(field[i+1][k] == 'o' && field[i+2][k] == 'w') {
        				//right-way cow
        			}
        			else {
        				//wrong-way cow
        				
        			}
        		}
        	}
        	
        }
        
        
        /*TIPS: 
        int northCnt = 0;
        int southCnt = 0;
        int westCnt = 0;
        int eastCnt = 0;
        
        HashMap<String, int[]> hm = new HashMap<String, int[]>(4);
// Check if the search should continue: 2 directions found and at least 3 cows found
   // Set i to break out of outer loop

 // Found a 'c', find the direction of the cow!
  //north
 //south
 //east
 //west
// Which ever direction has only 1 cow, that's the WWC!
"north", int array
hm.put( "north", new int[] { j, i } );
hm.get( "north" );
        
        */
        return null;
        
       
        
    }
 
}
