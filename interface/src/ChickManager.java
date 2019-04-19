import Chicks.*;

import java.awt.*;
import java.util.Random;

public class ChickManager {
	private static ChickManager instance = new ChickManager();

	Chick[] arr = new Chick[20];

	private ChickManager() {
		makeChicks();
	}

	public static ChickManager getInstance() {
		return instance;
	}

	private void makeChicks() {
		if (arr != null) {
			int type;
			for (int i = 0; i < arr.length; i++) {
				Random random = new Random();
				type = random.nextInt(4);
				switch (type) {
					case 0:
						arr[i] = new GeneralChick();
						break;
					case 1:
						arr[i] = new RedChick();
						break;
					case 2:
						arr[i] = new GreenChick();
						break;
					case 3:
						arr[i] = new BlueChick();
						break;
				}
			}
		}
	}

	public void displayAllChick(Graphics g) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].display(g);
		}
	}
}
