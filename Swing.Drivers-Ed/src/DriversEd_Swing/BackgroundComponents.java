package DriversEd_Swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SpringLayout.Constraints;
public class BackgroundComponents extends JFrame{
	public BackgroundComponents (String Title)
	{
		super(Title);
		JLabel firstName = new JLabel("First Name");
		JTextArea textarea = new JTextArea(5,10);
		JTextField textfield = new JTextField(10);
		JPanel jp = new JPanel();
		GridBagConstraints gg1 = new GridBagConstraints();
		gg1.gridx = 50;
		gg1.gridy = 60;
		gg1.insets = new Insets(50,50,50,50);
		//jp.setLayout(new FlowLayout(FlowLayout.LEADING));
		JButton button = new JButton("FHRITP");
		//jp.add(textfield);
		//add(jp);
		//getContentPane().add(jp, "Center");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(textarea);
		firstName.setBounds(5,5, 5, 5);
		c.add(firstName);
		c.add(button,BorderLayout.SOUTH);
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				textarea.append("ASDA\n");
			}
		});
		
		
	}
}
