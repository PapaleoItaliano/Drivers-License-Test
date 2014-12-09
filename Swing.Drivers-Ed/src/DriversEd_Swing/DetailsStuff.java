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
import javax.swing.event.EventListenerList;
public class DetailsStuff extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3252811051456351743L;
	private EventListenerList listenerList = new EventListenerList();
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
		
		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				String lastNameo = lastNameField.getText();
				
				
				String text = name + " " + lastNameo + "\n";
				fireDetailEvent(new DetailEvent(this, text));
			}
		});
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
	public void fireDetailEvent(DetailEvent event){
		Object[] listeners = listenerList.getListenerList();
		for(int i = 0; i<listeners.length;i+=2)
		{
			if(listeners[i] == DetailListener.class)
			{
				((DetailListener)listeners[i+1]).detailEventOccurred(event);
			}
		}
	}
	public void addDetailListener(DetailListener listener){
		listenerList.add(DetailListener.class, listener);
	}
}