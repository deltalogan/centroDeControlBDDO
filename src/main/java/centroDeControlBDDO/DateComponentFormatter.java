package centroDeControlBDDO;

import javax.swing.*;

import java.text.DateFormat;

import java.text.ParseException;

import java.util.Calendar;

import java.util.Date;

public class DateComponentFormatter extends JFormattedTextField.AbstractFormatter
{
	private static final long serialVersionUID = 1L;

	public String valueToString (Object value) throws ParseException
	{
		Calendar cal =  (Calendar) value;

		if  (cal == null)
		{
			return "";
		}

		DateFormat format = ComponentFormatDefaults.getInstance ().getFormat (ComponentFormatDefaults.Key.SELECTED_DATE_FIELD);

		return format.format (cal.getTime ());
	}

	public Object stringToValue (String text) throws ParseException
	{
		if  (text == null || text.equals (""))
		{
			return null;
		}

		DateFormat format = ComponentFormatDefaults.getInstance ().getFormat (ComponentFormatDefaults.Key.SELECTED_DATE_FIELD);

		Date date = format.parse (text);

		Calendar calendar = Calendar.getInstance ();

		calendar.setTime (date);

		return calendar;
	}
}