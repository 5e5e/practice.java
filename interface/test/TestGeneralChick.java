import Chicks.GeneralChick;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class TestGeneralChick {
	private static final Logger logger = LoggerFactory.getLogger(TestGeneralChick.class);
	private GeneralChick generalChick;
	private Graphics graphics;

	@BeforeEach
	void setUp() {
		generalChick = new GeneralChick();
	}

	@Test
	void display() {
		generalChick.display(graphics);
	}
}
