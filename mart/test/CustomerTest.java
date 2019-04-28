import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CustomerTest {
	private static final Logger logger = LoggerFactory.getLogger(CustomerTest.class);
	private Customer customer;

	@BeforeEach
	void setUp() {
		customer = new Customer();
	}

	@Test
	void buy1() {
		Lottery lottery = customer.buy("즉석복권");
		assertEquals(lottery, new InstanceLottery());
	}

	@Test
	void buy2() {
		Lottery lottery = customer.buy("즉석복권");
		assertNotEquals(lottery, new DrawLottery());
	}
}
