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
		
		String type = in.next();
		
		if(type.equals("rectangle")) {
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			double p3 = in.nextDouble();
			double p4 = in.nextDouble();
			
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			if(isFilled) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}else {
				StdDraw.rectangle(p1, p2, p3, p4);
			}
			
			
		}else if(type.equals("ellipse")) {
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			double p3 = in.nextDouble();
			double p4 = in.nextDouble();
			
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			if(isFilled) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}
			
			
		}else {
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			double p3 = in.nextDouble();
			double p4 = in.nextDouble();
			double p5 = in.nextDouble();
			double p6 = in.nextDouble();
			
			double[] x = new double[] {p1,p3,p5};
			double[] y = new double[] {p2,p4,p6};
			
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			if(isFilled) {
				StdDraw.filledPolygon(x,y);
			}else {
				StdDraw.polygon(x, y);
			}
			
		}
		
	}
}
