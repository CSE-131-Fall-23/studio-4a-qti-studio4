package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	
		StdDraw.setPenColor(Color.BLACK);

		StdDraw.filledRectangle(1,1,1,1);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.4);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5,0.3,0.15);
		
	
	}
}