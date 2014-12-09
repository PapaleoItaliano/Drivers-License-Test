package DriversEd_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Driver_Test extends JFrame {
	private DetailsStuff details;
	public Driver_Test(String Title) {		
		super(Title);
		char[] arr1 = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		DriversTest test1 = new DriversTest(arr1);
		char[] arr2 = {'A','B','C','D','E','B','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		DriversTest test2 = new DriversTest(arr2);
		
		DriversTest.setKey("BDAACABACDBCDADCCBDA");
		
		setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		JButton button = new JButton("FHRITP");
		JOptionPane k = new JOptionPane();
		details = new DetailsStuff();

		Container c = getContentPane();	
		details.addDetailListener(new DetailListener(){
			public void detailEventOccurred(DetailEvent event)
			{
				String text = event.getText();
				textArea.append(text);
				if(test2.passed())
				JOptionPane.showMessageDialog(c, "You have Passed!", 
						"Results of DriverTest", JOptionPane.INFORMATION_MESSAGE);
				else {
					JOptionPane.showMessageDialog(c,  "Sorry, Better Luck Next Time",
							"Results of the DriverTest",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		c.add(details, BorderLayout.WEST);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("ASDA\n");
			}
		});
	}
}