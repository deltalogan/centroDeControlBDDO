package centroDeControlBDDO;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.HashMap;

import java.util.Map;

public final class ComponentFormatDefaults
{

	private static ComponentFormatDefaults instance;

	public static ComponentFormatDefaults getInstance ()
	{
		if  (instance == null)
		{
			instance = new ComponentFormatDefaults ();
		}

		return instance;
	}

	public enum Key
	{
		TODAY_SELECTOR, DOW_HEADER, MONTH_SELECTOR, SELECTED_DATE_FIELD
	}

	private Map <Key, DateFormat> formats;

	private ComponentFormatDefaults ()
	{
		formats = new HashMap <Key, DateFormat> ();
		
		formats.put (Key.TODAY_SELECTOR, SimpleDateFormat.getDateInstance (SimpleDateFormat.MEDIUM));
		formats.put (Key.DOW_HEADER, new SimpleDateFormat ("EE"));
		formats.put (Key.MONTH_SELECTOR, new SimpleDateFormat ("MMMM"));
		formats.put (Key.SELECTED_DATE_FIELD, SimpleDateFormat.getDateInstance (SimpleDateFormat.MEDIUM));
	}

	public DateFormat getFormat (Key key)
	{
		return formats.get (key);
	}

	public void setFormat (Key key, DateFormat format)
	{
		formats.put (key, format);
	}
}