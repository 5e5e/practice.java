import java.awt.*;

public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	private ChickManager chickManager = ChickManager.getInstance();

	public MyFrame() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		if(chickManager != null) {
			chickManager.displayAllChick(g);
		}
	}
}
