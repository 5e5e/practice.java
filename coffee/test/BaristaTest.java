import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaristaTest {
	private static final Logger logger = LoggerFactory.getLogger(BaristaTest.class);
	private Barista barista;

	@BeforeEach
	void setUp() {
		barista = new Barista();
	}

	@Test
	void makeCoffee() {
		Coffee coffee = barista.makeCoffee(new MenuItem("카푸치노",2500));
		assertEquals(new Coffee(new MenuItem("카푸치노", 2500)), coffee);
	}
}
