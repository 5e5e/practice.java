import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class tShirtsTest {
	private static final Logger logger = LoggerFactory.getLogger(tShirtsTest.class);

	@Test
	public void test() {
		int[] p = {1, 2, 3};
		int[] t = {1, 1};
		List<Integer> peoples = Arrays.stream(p).boxed().collect(Collectors.toList());
		List<Integer> tshirts = Arrays.stream(t).boxed().collect(Collectors.toList());
		int count = 0;
		for (Iterator<Integer> iterator1 = peoples.iterator(); iterator1.hasNext(); ) {
			int value1 = iterator1.next();
			for (Iterator<Integer> iterator2 = tshirts.iterator(); iterator2.hasNext(); ) {
				int value2 = iterator2.next();
				if (value1 == value2) {
					iterator1.remove();
					iterator2.remove();
					count += 1;
					break;
				}
			}
		}
	}
}
