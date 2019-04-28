import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuItemTest {
	private static final Logger logger = LoggerFactory.getLogger(MenuItemTest.class);
	private MenuItem menuItem;

	@BeforeEach
	void setUp() {
		menuItem = new MenuItem("에스프레소",2500);
	}

}
