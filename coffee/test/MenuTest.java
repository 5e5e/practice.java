import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {
	private static final Logger logger = LoggerFactory.getLogger(MenuTest.class);
	private Menu menu;

	@BeforeEach
	void setUp() {
		menu = new Menu(Arrays.asList(new MenuItem("에스프레소", 2500), new MenuItem("카라멜 마끼아또", 2500),
				new MenuItem("카푸치노", 2000), new MenuItem("아메리카노", 1500)));
	}

	@Test
	void choose() {
		MenuItem menuItem = menu.choose("에스프레소");
		assertEquals(new MenuItem("에스프레소", 2500), menuItem);
	}
}

