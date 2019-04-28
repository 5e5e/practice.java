import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeTest {
	private static final Logger logger = LoggerFactory.getLogger(CoffeeTest.class);
	private Coffee coffee;

	@BeforeEach
	void setUp() {
		coffee = new Coffee();
	}
}
