import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - no one needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 400;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 30;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 20;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/3;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// first ear starts at half the x of the eye
	private static final int EAR1_X = EYE_X/2;
	private static final int EAR1_Y = EYE_Y;
	// Ears are going to be a 4 of the HEAD_DIMENSION
	private static final int EAR_HEIGHT = HEAD_DIMENSION/4;
	private static final int EAR_WIDTH = HEAD_DIMENSION/4;
	// second ear starts at x of the eye + the eye separation times 2
	private static final int EAR2_X = EYE_X + (EYE_SEPARATION * 2);
	private static final int EAR2_Y = EYE_Y;
	
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.red);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		// Draw the first ear
		g2.setColor(Color.red);
		x = EAR1_X;
		y = EAR1_Y;
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		x = EAR2_X;
		y = EAR2_Y;
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Ruff", catX, catY+HEAD_DIMENSION+10);	
	}
}
