package Swing_Driver_Ed_Remastered;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main_Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame run = new Driver_Test("Driver_Test");
				run.setSize(600, 400);
				run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				run.setLocationRelativeTo(null);
				run.setVisible(true);
				run.setResizable(true);
				// herro
			}
		});
	}
}