import java.util.Objects;

public class Coffee {
	private int price;
	private String menuName;


	public Coffee() {

	}

	public Coffee(MenuItem menuItem) {
		this.menuName = menuItem.getName();
		this.price = menuItem.cost();
	}

	@Override
	public String toString() {
		return "Coffee{" +
				"price=" + price +
				", menuName='" + menuName + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Coffee)) return false;
		Coffee coffee = (Coffee) o;
		return price == coffee.price &&
				Objects.equals(menuName, coffee.menuName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, menuName);
	}

}
