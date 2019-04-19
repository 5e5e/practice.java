package Chicks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class GreenChick extends Chick implements Ppickable {
	private static final Logger logger = LoggerFactory.getLogger(GreenChick.class);

	@Override
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString("초록병아리", x, y - 2);
		g.fillOval(x, y, CHICK_SIZE, CHICK_SIZE);
	}

	@Override
	public void ppick(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString("삐리릭", x - 12, y - 2);
	}
}
