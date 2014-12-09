package DriversEd_Swing;

import java.util.EventObject;

public class DetailEvent extends EventObject {
	private String y;
	public DetailEvent(Object source, String x)
	{
		super(source);
		y = x;
		
	}
	public String getText()
	{
		return y;
	}
}
