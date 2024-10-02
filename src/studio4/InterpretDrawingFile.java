package studio4;

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
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double xOne = in.nextInt();
		double yOne = in.nextInt();
		double xTwo = in.nextInt();
		double yTwo = in.nextInt();
				
		StdDraw.setPenColor(red, green, blue);
		
		if (shape.equals("triangle")) {
			if (filled) {
				double [] x = {xOne, yTwo, xTwo};
				double [] y = {xOne, yTwo, xTwo};
				StdDraw.filledPolygon(x, y);
			} else {
				double [] x = {xOne, yTwo, xTwo};
				double [] y = {xOne, yTwo, xTwo};
				StdDraw.polygon(x, y);
			}	
		} else if (shape.equals("rectangle")) {
			if (filled) {
				StdDraw.filledRectangle(xOne, yOne, xTwo, yTwo);
			} else {
				StdDraw.rectangle(xOne, yOne, xTwo, yTwo);
			}
		} else if (shape.equals("ellipse")) { //use this way to show strings are equivalent
			if (filled) {
				StdDraw.filledEllipse(xOne, yOne, xTwo, yTwo);
			} else {
				StdDraw.ellipse(xOne, yOne, xTwo, yTwo); //automatically unfilled b/c not specified
			}
		}
		
		
		
	}
}
