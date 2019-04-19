package Chicks;

import java.awt.*;

public class BlueChick extends Chick implements Flyable {
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("파란병아리", x, y - 2);
		g.fillOval(x, y, CHICK_SIZE, CHICK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("날다", x + 20, y - 2);
	}


}
