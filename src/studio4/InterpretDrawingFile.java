package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */

public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String rec = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
	
		boolean isFilled = in.nextBoolean();
		
		double para1 = in.nextDouble();
		double para2 = in.nextDouble();
		double para3 = in.nextDouble();
		double para4 = in.nextDouble();
		
		if (isFilled == true) {
			Color purply = new Color(red, green, blue);
			StdDraw.setPenColor(purply);

			StdDraw.filledRectangle(para1, para2, para3, para4);
		}
		
		else {
			StdDraw.rectangle(para1, para2, para3, para4);
		}
		
		
		
		
	}
}
