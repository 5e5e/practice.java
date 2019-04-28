public class Customer {
	public Lottery buy(String Type) {
		return Type.equals("즉석복권") ? new InstanceLottery() : new DrawLottery();
	}
}
