package centroDeControlBDDO;

import java.util.Calendar;

public class UtilCalendarModel extends AbstractDateModel <Calendar>
{
	public UtilCalendarModel ()
	{
		this (null);
	}

	public UtilCalendarModel (Calendar value)
	{
		super ();
		setValue (value);
	}

	protected Calendar fromCalendar (Calendar from)
	{
		return  (Calendar) from.clone ();
	}

	protected Calendar toCalendar (Calendar from)
	{
		return  (Calendar) from.clone ();
	}
}