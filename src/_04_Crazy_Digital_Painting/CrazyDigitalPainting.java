package _04_Crazy_Digital_Painting;
import java.awt.Color;

public class CrazyDigitalPainting {
    // 1. Create two final static integers for the width and height of the display.

		final static int CANVASWIDTH = 1500;
		final static int CANVASHEIGHT = 900;
	
    // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.

		Color [][] my2dArray = new Color [CANVASWIDTH+1][CANVASHEIGHT+1];

    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.

        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
        //    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
    	
    	for(int i = 0; i<my2dArray.length; i++) {
    		for(int k = 0; k<my2dArray[i].length; k++) {
    			
    			//int g = ;(i*k)%9
    			
    			my2dArray[i][k] = new Color((i+k)% 100, (i^k) % 90, (i+k)% 200);
    			
    		}
    	}

        // 5. Come up with your own pattern to make a cool crazy image.

        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
    	ColorArrayDisplayer.displayColorsAsImage(my2dArray);
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
    }
}
