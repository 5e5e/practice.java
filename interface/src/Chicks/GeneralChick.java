package Chicks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class GeneralChick extends Chick implements Flyable, Ppickable {
	private static final Logger logger = LoggerFactory.getLogger(GeneralChick.class);

	@Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("노란병아리", x, y - 2);
		g.fillOval(x, y, CHICK_SIZE, CHICK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("날다", x + 20, y - 2);
	}

	@Override
	public void ppick(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("삑삑", x - 12, y - 2);
	}
}
