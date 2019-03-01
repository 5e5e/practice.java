import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	@Test
	public void test() {
		List<String> list = new ArrayList<String>();

		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		list.add("EEEE");
		list.add("FFFF");
		list.add("GGGG");

		for(Iterator<String> it = list.iterator(); it.hasNext() ; )
		{
			String value = it.next();

			if(value.startsWith("C"))
			{
				it.remove();
			}
		}

		System.out.println("Result: " + list);
	}
}
