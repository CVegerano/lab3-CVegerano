import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Christopher");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(600, 400);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	      MyPanelClass myPanel = new MyPanelClass();
          myFrame.getContentPane().add(myPanel);
	}
}