import java.util.Objects;

public class MenuItem {

	private String menuName;
	private int price;

	public MenuItem(String menuName, int price) {
		this.menuName = menuName;
		this.price = price;
	}

	public String getName() {
		return menuName;
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"menuName='" + menuName + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MenuItem)) return false;
		MenuItem menuItem = (MenuItem) o;
		return Objects.equals(menuName, menuItem.menuName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(menuName);
	}

	public int cost() {
		return price;
	}
}
