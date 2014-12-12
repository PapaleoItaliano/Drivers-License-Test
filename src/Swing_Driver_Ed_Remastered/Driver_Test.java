package Swing_Driver_Ed_Remastered;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Driver_Test extends JFrame {
	private DetailsStuff details;
	public Driver_Test(String Title) {		
		super(Title);
		final char[] arr1 = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		final DriversTest test1 = new DriversTest(arr1);
		Scanner scan = new Scanner(System.in);	
		final char[] arr2 = {'A','B','C','D','E','B','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		final DriversTest test2 = new DriversTest(arr2);

		DriversTest.setKey("BDAACABACDBCDADCCBDA");
		
		setLayout(new BorderLayout());
		final JTextArea textArea = new JTextArea();
		JButton button = new JButton("Get Results");
		JOptionPane k = new JOptionPane();
		details = new DetailsStuff();

		final Container c = getContentPane();	
		details.addDetailListener(new DetailListener(){
			public void detailEventOccurred(DetailEvent event)
			{
				String text = event.getText();	
				final DriversTest test3= new DriversTest(DetailsStuff.getAnswers());
				textArea.append(text);
				textArea.append("\n" + Arrays.toString(DriversTest.getAnswers()) + " - Your Answers");
				textArea.append("\n" + Arrays.toString(DriversTest.getKey())+ " - Here is the answer key");
				textArea.append("\n" + test3.totalCorrect() + " - Questions Correct");
				textArea.append("\n" + test3.totalIncorrect() + " - Question Missed");
				textArea.append("\n" + Arrays.toString(test3.questionsMissed()) + " - Questions you missed");
				
				if(test3.passed())
				JOptionPane.showMessageDialog(c, "You have Passed!", 
						"Results of DriverTest", JOptionPane.INFORMATION_MESSAGE);
				else {
					JOptionPane.showMessageDialog(c,  "Failed, Better Luck Next Time",
							"Results of the DriverTest",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		c.add(textArea, BorderLayout.CENTER);
/*		c.add(button, BorderLayout.SOUTH);*/
		c.add(details, BorderLayout.WEST);
/*		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("ASDA\n");
			}
		});*/
	}
}