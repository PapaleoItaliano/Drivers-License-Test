package DriversEd_Swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class BackgroundComponents extends JFrame{
	public BackgroundComponents (String Title)
	{
		super(Title);
		setLayout(new BorderLayout());
		JTextArea textarea = new JTextArea(5,10);
		JTextField textfield = new JTextField(30);
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton button = new JButton("FHRITP");
		jp.add(textfield);
		add(jp);
		getContentPane().add(jp, "Center");
		/*Container c = getContentPane();
		c.add(textfield);*/
		/*c.add(button,BorderLayout.SOUTH);*/
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
