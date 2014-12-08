package DriversEd_Swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SpringLayout.Constraints;
public class DetailsStuff extends JPanel{
	public DetailsStuff ()
	{
		Dimension size = getPreferredSize();
		size.width = 300;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Test Results"));
		JLabel nameLabel = new JLabel("First Name: ");
		JLabel lastName = new JLabel("Last Name: ");
		JTextField nameField = new JTextField(10);
		JTextField lastNameField = new JTextField(10);
		
		JButton addBtn = new JButton("Submit");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(nameLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(lastName, gc);
		
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(lastNameField,gc);
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weighty = 10;
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn,gc);
}
}