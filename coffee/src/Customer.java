public class Customer {

	public Coffee order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem= menu.choose(menuName);
		Coffee coffee =  barista.makeCoffee(menuItem);
		return coffee;
	}
}
