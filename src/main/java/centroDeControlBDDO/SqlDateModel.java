package centroDeControlBDDO;

import java.sql.Date;

import java.util.Calendar;

public class SqlDateModel extends AbstractDateModel <java.sql.Date>
{
	public SqlDateModel ()
	{
		this (null);
	}

	public SqlDateModel (Date value)
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