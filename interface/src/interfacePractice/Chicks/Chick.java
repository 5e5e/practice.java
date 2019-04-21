package interfacePractice.Chicks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.Random;

public abstract class Chick {
	public static final int CHICK_SIZE = 50;
	private static final Logger logger = LoggerFactory.getLogger(Chick.class);
	int x;
	int y;

	public Chick() {
		Random random = new Random();
		x = random.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		y = random.nextInt(MyFrame.FRAME_HEIGHT - 100) + 50;
	}

	public Chick(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void display(Graphics g);

	public void walk() {

	}

	private class MyFrame {
		public static final int FRAME_WIDTH = 800;
		public static final int FRAME_HEIGHT = 600;
	}
}
