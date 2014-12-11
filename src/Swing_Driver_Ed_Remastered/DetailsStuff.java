package Swing_Driver_Ed_Remastered;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
public class DetailsStuff extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3252811051456351743L;
	private EventListenerList listenerList = new EventListenerList();
	private static String yourAnswers;
	public DetailsStuff ()
	{
		Dimension size = getPreferredSize();
		size.width = 300;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Test Results"));
		JLabel nameLabel = new JLabel("First Name: ");
		JLabel lastName = new JLabel("Last Name: ");
		JLabel answersLabel = new JLabel("Your Answers: ");
		final JTextField nameField = new JTextField(10);
		final JTextField lastNameField = new JTextField(10);
		final JTextField answers = new JTextField(15);
		JButton addBtn = new JButton("Submit");
		
		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				String lastNameo = lastNameField.getText();
				yourAnswers = answers.getText();
				String text = name + " " + lastNameo + "\nResults";
				fireDetailEvent(new DetailEvent(this, text));
			}
			
		});
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		//Starting Location
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		//First Name Placement
		gc.gridx = 0;
		gc.gridy = 0;
		add(nameLabel,gc);
		
		
		//Last Name Label Placement
		gc.gridx = 0;
		gc.gridy = 1;
		add(lastName, gc);
		
		//User-Inputed Label Placement
		gc.anchor = GridBagConstraints.CENTER;
;
		gc.gridx = 0;
		gc.gridy = 2;
		add(answersLabel, gc);
		
		//First Name TextArea Placement
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField,gc);
		
		
		//Last Name TextArea Placement
		gc.gridx = 1;
		gc.gridy = 1;
		add(lastNameField,gc);
		
		
		//Pushes the columns up
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weighty = 10;
		
		
		//Button Placement
		gc.gridx = 1;
		gc.gridy = 3;
		add(addBtn,gc);
		
		//User-Inputed Answers
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 1;
		gc.gridy = 2;
		add(answers,gc);
}
	public static String getAnswers()
	{
		return yourAnswers;
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