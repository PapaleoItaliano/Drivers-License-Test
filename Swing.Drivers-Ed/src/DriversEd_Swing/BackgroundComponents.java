package DriversEd_Swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class BackgroundComponents extends JFrame{
	public BackgroundComponents (String Title)
	{
		super(Title);
		setLayout(new BorderLayout());
		JTextArea textarea = new JTextArea();
		JButton button = new JButton("FHRITP");
		
		Container c = getContentPane();
		c.add(textarea, BorderLayout.CENTER);
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
