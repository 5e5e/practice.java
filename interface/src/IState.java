public interface IState {
	public static final int state_ready = 0;
	public static final int state_finish = 1;
	public static final int state_update = 2;

	public void init();

	public void destroy();

	public void update();
}
