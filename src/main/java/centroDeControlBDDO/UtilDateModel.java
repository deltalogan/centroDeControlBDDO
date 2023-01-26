package centroDeControlBDDO;

import java.util.Calendar;

import java.util.Date;

public class UtilDateModel extends AbstractDateModel <java.util.Date>
{
	public UtilDateModel ()
	{
		this (null);
	}

	public UtilDateModel (Date value)
	{
		super ();
		setValue (value);
	}
	
	protected Date fromCalendar (Calendar from)
	{
		return new Date (from.getTimeInMillis ());
	}
	
	protected Calendar toCalendar (Date from)
	{
		Calendar to = Calendar.getInstance ();
		to.setTime (from);
		
		return to;
	}
}