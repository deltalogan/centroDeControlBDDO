package centroDeControlBDDO;

import java.awt.*;

import java.util.HashMap;

import java.util.Map;

public final class ComponentColorDefaults
{
	private static ComponentColorDefaults instance;

	public static ComponentColorDefaults getInstance ()
	{
		if  (instance == null)
		{
			instance = new ComponentColorDefaults ();
		}

		return instance;
	}

	public enum Key
	{
		FG_MONTH_SELECTOR, BG_MONTH_SELECTOR, FG_GRID_HEADER, BG_GRID_HEADER, FG_GRID_THIS_MONTH, FG_GRID_OTHER_MONTH, FG_GRID_TODAY, BG_GRID, BG_GRID_NOT_SELECTABLE, FG_GRID_SELECTED, BG_GRID_SELECTED, FG_GRID_TODAY_SELECTED, BG_GRID_TODAY_SELECTED, FG_TODAY_SELECTOR_ENABLED, FG_TODAY_SELECTOR_DISABLED, BG_TODAY_SELECTOR, POPUP_BORDER;
	}

	private Map <Key, Color> colors;

	private ComponentColorDefaults ()
	{
		colors = new HashMap <Key, Color> ();

		colors.put (Key.FG_MONTH_SELECTOR, SystemColor.activeCaptionText);
		colors.put (Key.BG_MONTH_SELECTOR, SystemColor.activeCaption);
		colors.put (Key.FG_GRID_HEADER, new Color (10, 36, 106));
		colors.put (Key.BG_GRID_HEADER, Color.LIGHT_GRAY);
		colors.put (Key.FG_GRID_THIS_MONTH, Color.BLACK);
		colors.put (Key.FG_GRID_OTHER_MONTH, Color.LIGHT_GRAY);
		colors.put (Key.FG_GRID_TODAY, Color.RED);
		colors.put (Key.BG_GRID, Color.WHITE);
		colors.put (Key.BG_GRID_NOT_SELECTABLE, new Color (240, 240, 240));
		colors.put (Key.FG_GRID_SELECTED, Color.WHITE);
		colors.put (Key.BG_GRID_SELECTED, new Color (10, 36, 106));
		colors.put (Key.FG_GRID_TODAY_SELECTED, Color.RED);
		colors.put (Key.BG_GRID_TODAY_SELECTED, new Color (10, 36, 106));
		colors.put (Key.FG_TODAY_SELECTOR_ENABLED, Color.BLACK);
		colors.put (Key.FG_TODAY_SELECTOR_DISABLED, Color.LIGHT_GRAY);
		colors.put (Key.BG_TODAY_SELECTOR, Color.WHITE);
		colors.put (Key.POPUP_BORDER, Color.BLACK);
	}

	public Color getColor (Key key)
	{
		return colors.get (key);
	}

	public void setColor (Key key, Color color)
	{
		colors.put (key, color);
	}
}