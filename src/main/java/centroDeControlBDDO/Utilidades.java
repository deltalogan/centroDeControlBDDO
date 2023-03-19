package centroDeControlBDDO;

import java.awt.AWTException;

import java.awt.Component;

import java.awt.Container;

import java.awt.Event;

import java.awt.Robot;

import java.awt.Toolkit;

import java.awt.Window;

import java.awt.datatransfer.DataFlavor;

import java.awt.datatransfer.Transferable;

import java.awt.datatransfer.UnsupportedFlavorException;

import java.awt.event.ActionEvent;

import java.awt.event.FocusEvent;

import java.awt.event.FocusListener;

import java.awt.event.InputEvent;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Timestamp;

import java.text.DateFormat;

import java.util.Calendar;

import java.util.Properties;

import java.util.Vector;

import javax.swing.AbstractAction;

import javax.swing.AbstractButton;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JTable;

import javax.swing.KeyStroke;

import javax.swing.ListSelectionModel;

import javax.swing.LookAndFeel;

import javax.swing.SwingUtilities;

import javax.swing.UIManager;

import javax.swing.UIManager.LookAndFeelInfo;

import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.WindowConstants;

import javax.swing.table.DefaultTableModel;

import javax.swing.text.JTextComponent;

import com.jtattoo.plaf.AbstractLookAndFeel;

public abstract class Utilidades
{
	static ResultSet resultset = null;
	
	static Connection connection = null;

	static Statement statement = null;
	
	static String driverManager = null;

	static String dataSourceName = null;

	public static boolean buscar (int valor, int [] arreglo)
	{
		int indice = 0;

		boolean estado = false;

		for (indice = 0; indice < arreglo.length; indice ++)

			if (arreglo [indice] == valor)
			{
				estado = true;

				break;
			}

		return estado;
	}

	public static boolean cargarComboBox (JComboBox <String> comboBox, boolean estadoDelCombo, String tabla, String atributo, String condicion)
	{
		boolean estado = false;
		
		comboBox.removeAllItems ();
		
		if (estadoDelCombo)
			
			comboBox.addItem ("");
		
		else
			
			comboBox.addItem ("Todos");
		
		if (iniciarConexionALaBaseDeDatos () && iniciarTransaccionALaBaseDeDatos ())
		{
			if (ejecutarSentenciaDeSqlQuery ("SELECT DISTINCT " + (atributo == null || atributo.toString ().isEmpty () ? "*" : atributo.toString ()) + " FROM " + tabla.toString () + (condicion == null || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ()) + (atributo == null ? "" : " ORDER BY 1")))				
			{
				try
				{
					while (resultset.next ())
						
						if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Boolean.class.getName ().toString ()))
								
							comboBox.addItem (resultset.getString (1) == null ? "Falso" : resultset.getBoolean (1) ? "Verdadero" : "Falso");
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Number.class.getName ().toString ()))
								
							comboBox.addItem (resultset.getString (1) == null ? "0" : resultset.getString (1).toString ().isEmpty () ? "0" : resultset.getString (1).toString ());
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (String.class.getName ().toString ()))
								
							comboBox.addItem (resultset.getString (1) == null ? "" : resultset.getString (1).toString ());
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Timestamp.class.getName ().toString ()))
								
							comboBox.addItem (resultset.getString (1) == null ? "" : DateFormat.getDateInstance (DateFormat.MEDIUM).format (resultset.getDate (1)).toString ());
						
						else
								
							comboBox.addItem (resultset.getString (1) == null ? "" : resultset.getString (1).toString ());
					
					estado = true;
				}

				catch (SQLException e)
				{
					JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
				}
				
				finalizarTransaccionALaBaseDeDatos ();
			}

			finalizarConexionALaBaseDeDatos ();
		}
		
		if (estadoDelCombo && comboBox.getItemCount () > 0 && comboBox.getItemAt (1) != null)
			
			comboBox.removeItemAt (0);

		return estado;
	}
	
	public static void cargarComboBoxBoolean (JComboBox <String> comboBox, boolean estadoDelCombo)
	{
		comboBox.removeAllItems ();
		
		if (! estadoDelCombo)

			comboBox.addItem ("Todos");
		
		comboBox.addItem ("Verdadero");
		comboBox.addItem ("Falso");
	}

	public static void cargarComboBoxsFecha (final JComboBox <String> dias, final JComboBox <String> meses, final JComboBox <String> anos)
	{
		int ano = 0, mes = 0;

		for (ano = 1900; ano <= 2099; ano ++)

			anos.addItem (String.valueOf (ano));

		for (mes = 1; mes <= 12; mes ++)

			meses.addItem (mes < 10 ? "0" + String.valueOf (mes) : String.valueOf (mes));

		anos.addItemListener (new ItemListener ()
		{
			public void itemStateChanged (ItemEvent e)
			{
				if (e.getStateChange () == ItemEvent.SELECTED)
					
					meses.setSelectedIndex (meses.getSelectedIndex ());
			}
		}
		);

		meses.addActionListener (new java.awt.event.ActionListener ()
		{
			public void actionPerformed (java.awt.event.ActionEvent e)
			{
				int dia = 0, diaSeleccionado = 0;

				diaSeleccionado = dias.getSelectedIndex ();
				dias.removeAllItems ();

				if (meses.getSelectedIndex () == Calendar.JANUARY || meses.getSelectedIndex () == Calendar.MARCH || meses.getSelectedIndex () == Calendar.MAY || meses.getSelectedIndex () == Calendar.JULY || meses.getSelectedIndex () == Calendar.AUGUST || meses.getSelectedIndex () == Calendar.OCTOBER || meses.getSelectedIndex () == Calendar.DECEMBER)

					for (dia = 1; dia <= 31; dia ++)

						dias.addItem (dia < 10 ? "0" + String.valueOf (dia) : String.valueOf (dia));

				else

					if (meses.getSelectedIndex () == Calendar.APRIL || meses.getSelectedIndex () == Calendar.JUNE || meses.getSelectedIndex () == Calendar.SEPTEMBER || meses.getSelectedIndex () == Calendar.NOVEMBER)

						for (dia = 1; dia <= 30; dia ++)

							dias.addItem (dia < 10 ? "0" + String.valueOf (dia) : String.valueOf (dia));

					else

						if (meses.getSelectedIndex () == Calendar.FEBRUARY)

							if (Integer.parseInt ((String) anos.getSelectedItem ().toString ()) % 4 == 0)

								for (dia = 1; dia <= 29; dia ++)

									dias.addItem (dia < 10 ? "0" + String.valueOf (dia) : String.valueOf (dia));
							else

								for (dia = 1; dia <= 28; dia ++)

									dias.addItem (dia < 10 ? "0" + String.valueOf (dia) : String.valueOf (dia));

				if (diaSeleccionado < dias.getItemCount ())

					dias.setSelectedIndex (diaSeleccionado);
			}
		}
		);

		anos.setSelectedItem (String.valueOf (Calendar.getInstance ().get (Calendar.YEAR)));
		meses.setSelectedItem (Calendar.getInstance ().get (Calendar.MONTH) + 1 < 10 ? "0" + String.valueOf (Calendar.getInstance ().get (Calendar.MONTH) + 1) : String.valueOf (Calendar.getInstance ().get (Calendar.MONTH) + 1));
		dias.setSelectedItem (Calendar.getInstance ().get (Calendar.DAY_OF_MONTH) < 10 ? "0" + String.valueOf (Calendar.getInstance ().get (Calendar.DAY_OF_MONTH)) : String.valueOf (Calendar.getInstance ().get (Calendar.DAY_OF_MONTH)));
	}
	
	public static void cargarComboBoxLookAndFeels (final JComboBox <String> lookAndFeels)
	{
		LookAndFeelInfo [] LookAndFeelInfo = UIManager.getInstalledLookAndFeels ();
		
		int lookAndFeel = 0;
		
		lookAndFeels.removeAllItems ();
		
		for (lookAndFeel = 0; lookAndFeel < LookAndFeelInfo.length; lookAndFeel ++)
			
			lookAndFeels.insertItemAt (LookAndFeelInfo [lookAndFeel].getName ().toString (), lookAndFeel);
		
		lookAndFeels.addItemListener (new ItemListener ()
		{
			public void itemStateChanged (ItemEvent e)
			{
				if (e.getStateChange () == ItemEvent.SELECTED)
				{
					LookAndFeelInfo [] LookAndFeelInfo = UIManager.getInstalledLookAndFeels ();
					
					try
					{
						UIManager.setLookAndFeel (LookAndFeelInfo [lookAndFeels.getSelectedIndex ()].getClassName ().toString ());
					}
					
					catch (ClassNotFoundException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
					
					catch (InstantiationException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
					
					catch (IllegalAccessException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
					
					catch (UnsupportedLookAndFeelException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
					
					Window windows [] = Window.getWindows ();

					for (Window window : windows)
						
						if (window.isDisplayable ())
							
							SwingUtilities.updateComponentTreeUI (window);
				}
			}
		}
		);
	}
	
	public static void cargarComboBoxLookAndFeelsJTattoo (final JComboBox <String> lookAndFeels, final JComboBox <String> themes, final String logoString)
	{
		String [] lookAndFeelNamesJTattoo = Constants.LAF_NAMES;
		
		int lookAndFeel = 0;
		
		lookAndFeels.removeAllItems ();
		
		for (lookAndFeel = 0; lookAndFeel < lookAndFeelNamesJTattoo.length; lookAndFeel ++)
			
			lookAndFeels.insertItemAt (lookAndFeelNamesJTattoo [lookAndFeel].toString (), lookAndFeel);
		
		lookAndFeels.addItemListener (new ItemListener ()
		{
			public void itemStateChanged (ItemEvent e)
			{
				if (e.getStateChange () == ItemEvent.SELECTED)
				{
					setLookAndFeel (lookAndFeels.getSelectedIndex (), logoString);
					
					Window windows [] = Window.getWindows ();

					for (Window window : windows)
							
						if (window.isDisplayable ())
								
							SwingUtilities.updateComponentTreeUI (window);
					
					if (themes != null)

						cargarComboBoxThemesJTattoo (themes, lookAndFeels, logoString);
				}
			}
		}
		);
	}
	
	public static void cargarComboBoxThemesJTattoo (final JComboBox <String> themes, final JComboBox <String> lookAndFeels, final String logoString)
	{
		int theme = 0;
		
		themes.removeAllItems ();
		
		LookAndFeel lookAndFeel = UIManager.getLookAndFeel ();
		
        if (lookAndFeel instanceof com.jtattoo.plaf.acryl.AcrylLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.acryl.AcrylLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.acryl.AcrylLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.aero.AeroLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.aero.AeroLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.aero.AeroLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.aluminium.AluminiumLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.bernstein.BernsteinLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.fast.FastLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.fast.FastLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.fast.FastLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.graphite.GraphiteLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.graphite.GraphiteLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.graphite.GraphiteLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.hifi.HiFiLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.hifi.HiFiLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.hifi.HiFiLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.luna.LunaLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.luna.LunaLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.luna.LunaLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.mcwin.McWinLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.mcwin.McWinLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.mcwin.McWinLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.mint.MintLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.mint.MintLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.mint.MintLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.noire.NoireLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.noire.NoireLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.noire.NoireLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.smart.SmartLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.smart.SmartLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.smart.SmartLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        else if (lookAndFeel instanceof com.jtattoo.plaf.texture.TextureLookAndFeel)
        	
        	for (theme = 0; theme < com.jtattoo.plaf.texture.TextureLookAndFeel.getThemes ().toArray ().length; theme ++)
        		
        		themes.insertItemAt (com.jtattoo.plaf.texture.TextureLookAndFeel.getThemes ().get (theme).toString (), theme);
        
        themes.addItemListener (new ItemListener ()
		{
			public void itemStateChanged (ItemEvent e)
			{
				if (e.getStateChange () == ItemEvent.SELECTED)
				{
					setLookAndFeelJTattoo (lookAndFeels.getSelectedIndex (), themes, logoString);
					
					Window windows [] = Window.getWindows ();

					for (Window window : windows)
							
						if (window.isDisplayable ())
								
							SwingUtilities.updateComponentTreeUI (window);	
				}
				
			}
		}
		);
        
        if (UIManager.getLookAndFeel () instanceof AbstractLookAndFeel)
        	
        	themes.setSelectedItem ("Default");
	}
	
	public static Properties getLAFProps (String logoString)
	{
		Properties properties = new Properties ();
		
		properties.put ("logoString", logoString == null || logoString.isEmpty() ? "\u00A0" : logoString.toString ());
		
		return properties;
    }
    
    public static void setLookAndFeel (int selectedLaf, String logoString)
    {
    	try
    	{
    		Properties properties = getLAFProps (logoString);
    		
    		switch (selectedLaf)
    		{
    			case Constants.LAF_ACRYL:

    				com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

    				break;

    			case Constants.LAF_AERO:

    				com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.aero.AeroLookAndFeel");

    				break;

    			case Constants.LAF_ALUMINIUM:

    				com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

    				break;

    			case Constants.LAF_BERNSTEIN:

    				com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

    				break;

    			case Constants.LAF_FAST:

    				com.jtattoo.plaf.fast.FastLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.fast.FastLookAndFeel");

    				break;

    			case Constants.LAF_GRAPHITE:

    				com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

    				break;

    			case Constants.LAF_HIFI:

    				com.jtattoo.plaf.hifi.HiFiLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

    				break;

    			case Constants.LAF_LUNA:

    				com.jtattoo.plaf.luna.LunaLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.luna.LunaLookAndFeel");

    				break;

    			case Constants.LAF_MCWIN:

    				com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

    				break;

    			case Constants.LAF_MINT:

    				com.jtattoo.plaf.mint.MintLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.mint.MintLookAndFeel");

    				break;

    			case Constants.LAF_NOIRE:

    				com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.noire.NoireLookAndFeel");

    				break;

    			case Constants.LAF_SMART:

    				com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.smart.SmartLookAndFeel");

    				break;

    			case Constants.LAF_TEXTURE:

    				com.jtattoo.plaf.texture.TextureLookAndFeel.setTheme (properties);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.texture.TextureLookAndFeel");

    				break;
    		}
    	}

    	catch (ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (InstantiationException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (IllegalAccessException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (UnsupportedLookAndFeelException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public static void setLookAndFeelJTattoo (int selectedLaf, final JComboBox <String> themes, final String logoString)
    {
    	try
    	{
    		switch (selectedLaf)
    		{
    			case Constants.LAF_ACRYL:
    			
    				com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme(themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

    				break;

    			case Constants.LAF_AERO:

    				com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.aero.AeroLookAndFeel");

    				break;

    			case Constants.LAF_ALUMINIUM:

    				com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

    				break;

    			case Constants.LAF_BERNSTEIN:

    				com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

    				break;

    			case Constants.LAF_FAST:

    				com.jtattoo.plaf.fast.FastLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.fast.FastLookAndFeel");

    				break;

    			case Constants.LAF_GRAPHITE:

    				com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

    				break;

    			case Constants.LAF_HIFI:

    				com.jtattoo.plaf.hifi.HiFiLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

    				break;

    			case Constants.LAF_LUNA:

    				com.jtattoo.plaf.luna.LunaLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.luna.LunaLookAndFeel");

    				break;

    			case Constants.LAF_MCWIN:

    				com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

    				break;

    			case Constants.LAF_MINT:

    				com.jtattoo.plaf.mint.MintLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.mint.MintLookAndFeel");

    				break;

    			case Constants.LAF_NOIRE:

    				com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.noire.NoireLookAndFeel");

    				break;

    			case Constants.LAF_SMART:

    				com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.smart.SmartLookAndFeel");

    				break;

    			case Constants.LAF_TEXTURE:

    				com.jtattoo.plaf.texture.TextureLookAndFeel.setTheme (themes.getSelectedItem ().toString (), "", logoString);
    				UIManager.setLookAndFeel ("com.jtattoo.plaf.texture.TextureLookAndFeel");

    				break;
    		}
    	}

    	catch (ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (InstantiationException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (IllegalAccessException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
		
		catch (UnsupportedLookAndFeelException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}
    }

    public static boolean cargarTable (final JTable table, String tabla, String atributo, String condicion, String orden)
	{
		int columna = 0;

		boolean estado = false;

		DefaultTableModel defaultTableModel = new DefaultTableModel ()
		{
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable (int rowIndex, int columnIndex)
			{
				return false;
			}
		};

		if (iniciarConexionALaBaseDeDatos () && iniciarTransaccionALaBaseDeDatos ())
		{
			if (ejecutarSentenciaDeSqlQuery ("SELECT " + (atributo == null || atributo.toString ().isEmpty () ? "*" : atributo.toString ()) + " FROM " + tabla.toString () + (condicion == null  || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ()) + (orden == null ? "" : " ORDER BY " + orden.toString ())))
			{
				try
				{
					for (columna = 0; columna < resultset.getMetaData ().getColumnCount (); columna ++)

						defaultTableModel.addColumn (resultset.getMetaData ().getColumnName (columna + 1));

					while (resultset.next ())
					{
						Vector <String> fila = new Vector <String> ();
						
						for (columna = 0; columna < resultset.getMetaData ().getColumnCount (); columna ++)
							
							if (resultset.getMetaData ().getColumnClassName (columna + 1).toString ().equals (Boolean.class.getName ().toString ()))
								
								fila.add (resultset.getString (columna + 1) == null ? "Falso" : resultset.getBoolean (columna + 1) ? "Verdadero" : "Falso");
						
							else if (resultset.getMetaData ().getColumnClassName (columna + 1).toString ().equals (Number.class.getName ().toString ()))
								
								fila.add (resultset.getString (columna + 1) == null ? "0" : resultset.getString (columna + 1).toString ().isEmpty () ? "0" : resultset.getString (columna + 1).toString ());
						
							else if (resultset.getMetaData ().getColumnClassName (columna + 1).toString ().equals (String.class.getName ().toString ()))
								
								fila.add (resultset.getString (columna + 1) == null ? "" : resultset.getString (columna + 1).toString ());
						
							else if (resultset.getMetaData ().getColumnClassName (columna + 1).toString ().equals (Timestamp.class.getName ().toString ()))
								
								fila.add (resultset.getString (columna + 1) == null ? "" : DateFormat.getDateInstance (DateFormat.MEDIUM).format (resultset.getDate (columna + 1)).toString ());
						
							else
								
								fila.add (resultset.getString (columna + 1) == null ? "" : resultset.getString (columna + 1).toString ());
						
						defaultTableModel.addRow (fila);
					}
					
					table.setModel (defaultTableModel);					
					table.getSelectionModel ().setSelectionInterval (0, 0);					
					estado = true;
				}

				catch (SQLException e)
				{
					JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
				}

				finalizarTransaccionALaBaseDeDatos ();
			}

			finalizarConexionALaBaseDeDatos ();
		}

		return estado;
	}
    
	public static boolean cargarTextAutoCompleter (TextAutoCompleter textAutoCompleter, String tabla, String atributo, String condicion)
	{
		boolean estado = false;
		
		textAutoCompleter.removeAllItems ();
		textAutoCompleter.setMode (0);
		
		if (iniciarConexionALaBaseDeDatos () && iniciarTransaccionALaBaseDeDatos ())
		{
			if (ejecutarSentenciaDeSqlQuery ("SELECT DISTINCT " + (atributo == null || atributo.toString ().isEmpty () ? "*" : atributo.toString ()) + " FROM " + tabla.toString () + (condicion == null || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ()) + (atributo == null ? "" : " ORDER BY 1")))				
			{
				try
				{
					while (resultset.next ())
						
						if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Boolean.class.getName ().toString ()))
								
							textAutoCompleter.addItem (resultset.getString (1) == null ? "Falso" : resultset.getBoolean (1) ? "Verdadero" : "Falso");
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Number.class.getName ().toString ()))
								
							textAutoCompleter.addItem (resultset.getString (1) == null ? "0" : resultset.getString (1).toString ().isEmpty () ? "0" : resultset.getString (1).toString ());
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (String.class.getName ().toString ()))
								
							textAutoCompleter.addItem (resultset.getString (1) == null ? "" : resultset.getString (1).toString ());
						
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Timestamp.class.getName ().toString ()))
								
							textAutoCompleter.addItem (resultset.getString (1) == null ? "" : DateFormat.getDateInstance (DateFormat.MEDIUM).format (resultset.getDate (1)).toString ());
						
						else
								
							textAutoCompleter.addItem (resultset.getString (1) == null ? "" : resultset.getString (1).toString ());
					
					estado = true;
				}

				catch (SQLException e)
				{
					JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
				}
				
				finalizarTransaccionALaBaseDeDatos ();
			}

			finalizarConexionALaBaseDeDatos ();
		}
		
		return estado;
	}

	public static boolean ejecutarSentenciaDeSqlQuery (String sentenciaDeSqlQuery)
	{
		boolean estado = false;

		try
		{
			resultset = statement.executeQuery (sentenciaDeSqlQuery);			
			estado = true;
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static boolean ejecutarSentenciaDeSqlUpdate (String sentenciaDeSqlUpdate)
	{
		boolean estado = false;

		try
		{
			statement.executeUpdate (sentenciaDeSqlUpdate);
			estado = true;
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static boolean eliminarAtributo (String tabla, String condicion)
	{
		return ejecutarSentenciaDeSqlUpdate ("DELETE FROM " + tabla.toString () + (condicion == null || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ()));
	}

	public static boolean finalizarConexionALaBaseDeDatos ()
	{
		boolean estado = false;

		try
		{
			connection.close ();
			estado = true;
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static boolean finalizarTransaccionALaBaseDeDatos ()
	{
		boolean estado = false;

		try
		{
			statement.close ();
			estado = true;
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static boolean iniciarConexionALaBaseDeDatos ()
	{
		boolean estado = false;

		try
		{
			Class.forName (driverManager.toString ());
			connection = DriverManager.getConnection ((driverManager.toString ().equals ("sun.jdbc.odbc.JdbcOdbcDriver") ? "jdbc:odbc:" : driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "jdbc:sqlserver:" : "") + dataSourceName.toString ());
			estado = true;
		}

		catch (ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static boolean iniciarTransaccionALaBaseDeDatos ()
	{
		boolean estado = false;

		try
		{
			statement = connection.createStatement ();
			estado = true;
		}

		catch (SQLException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		return estado;
	}

	public static String devolverAtributoClave (String tabla, String atributoClave, String condicion)
	{
		String id = null;

		if (iniciarConexionALaBaseDeDatos () && iniciarTransaccionALaBaseDeDatos ())
		{
			if (ejecutarSentenciaDeSqlQuery ("SELECT DISTINCT " + (atributoClave == null ? "*" : atributoClave.toString ().isEmpty () ? "*" : atributoClave.toString ()) + " FROM " + tabla.toString () + (condicion == null || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ()) + (atributoClave == null ? "" : " ORDER BY 1")))
			{
				try
				{
					if (resultset.next ())
						
						if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Boolean.class.getName ().toString ()))
							
							id = resultset.getString (1) == null ? "Falso" : resultset.getBoolean (1) ? "Verdadero" : "Falso";
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Number.class.getName ().toString ()))
							
							id = resultset.getString (1) == null ? "0" : resultset.getString (1).toString ().isEmpty () ? "0" : resultset.getString (1).toString ();
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (String.class.getName ().toString ()))
							
							id = resultset.getString (1) == null ? "" : resultset.getString (1).toString ();
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Timestamp.class.getName ().toString ()))
							
							id = resultset.getString (1) == null ? "" : DateFormat.getDateInstance (DateFormat.MEDIUM).format (resultset.getDate (1)).toString ();
					
						else
							
							id = resultset.getString (1) == null ? "" : resultset.getString (1).toString ();
					
					else
						
						id = "0";
				}

				catch (SQLException e)
				{
					JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
				}

				finalizarTransaccionALaBaseDeDatos ();
			}

			finalizarConexionALaBaseDeDatos ();
		}

		return id;
	}

	public static String devolverMaximoValorDeUnAtributo (String tabla, String atributo, String condicion)
	{
		String maximoValorDeUnAtributo = null;

		if (iniciarConexionALaBaseDeDatos () && iniciarTransaccionALaBaseDeDatos ())
		{
			if (ejecutarSentenciaDeSqlQuery ("SELECT DISTINCT " + (atributo == null || atributo.toString ().isEmpty () ? "*" : "MAX (" + atributo.toString () + ")") + " FROM " + tabla.toString () + (condicion == null || condicion.toString ().isEmpty () ? "" : " WHERE " + condicion.toString ())))
			{
				try
				{
					if (resultset.next ())
						
						if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Boolean.class.getName ().toString ()))
							
							maximoValorDeUnAtributo = resultset.getString (1) == null ? "Falso" : resultset.getBoolean (1) ? "Verdadero" : "Falso";
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Number.class.getName ().toString ()))
							
							maximoValorDeUnAtributo = resultset.getString (1) == null ? "0" : resultset.getString (1).toString ().isEmpty () ? "0" : resultset.getString (1).toString ();
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (String.class.getName ().toString ()))
							
							maximoValorDeUnAtributo = resultset.getString (1) == null ? "" : resultset.getString (1).toString ();
					
						else if (resultset.getMetaData ().getColumnClassName (1).toString ().equals (Timestamp.class.getName ().toString ()))
							
							maximoValorDeUnAtributo = resultset.getString (1) == null ? "" : DateFormat.getDateInstance (DateFormat.MEDIUM).format (resultset.getDate (1)).toString ();
					
						else
							
							maximoValorDeUnAtributo = resultset.getString (1) == null ? "" : resultset.getString (1).toString ();
					
					else
						
						maximoValorDeUnAtributo = "0";
				}

				catch (SQLException e)
				{
					JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
				}

				finalizarTransaccionALaBaseDeDatos ();
			}

			finalizarConexionALaBaseDeDatos ();
		}

		return maximoValorDeUnAtributo;
	}

	public static void main (String [] args)
	{
		try
		{
			UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ().toString ());
		}

		catch (ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		catch (InstantiationException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		catch (IllegalAccessException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		catch (UnsupportedLookAndFeelException e)
		{
			JOptionPane.showMessageDialog (null, e.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
		}

		new Conectar ();
	}

	public static void ordenar (int [] arreglo)
	{
		int primerIndice = 0, segundoIndice = 0, valorAuxiliar = 0;

		for (primerIndice = 1; primerIndice < arreglo.length; primerIndice ++)

			for (segundoIndice = 0; segundoIndice < arreglo.length - 1; segundoIndice ++)

				if (arreglo [primerIndice] < arreglo [segundoIndice])
				{
					valorAuxiliar = arreglo [segundoIndice];
					arreglo [segundoIndice] = arreglo [primerIndice];
					arreglo [primerIndice] = valorAuxiliar;
				}
	}
	
	public static void confirmarCerrar (final Window ventana)
	{
		((JFrame) ventana).setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);
		
		ventana.addWindowListener (new WindowAdapter ()
		{
			public void windowActivated (WindowEvent e)
			{
					
			}
				
			public void windowClosed (WindowEvent e)
			{
					
			}
				
			public void windowClosing (WindowEvent e)
			{
				if (JOptionPane.showConfirmDialog (null, "¿Esta seguro que desea cerrar est\u00e1 ventana?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				
					((JFrame) ventana).dispose ();
			}
				
			public void windowDeactivated (WindowEvent e)
			{
					
			}
				
			public void windowDeiconified (WindowEvent e)
			{
					
			}
				
			public void windowIconified (WindowEvent e)
			{
					
			}
				
			public void windowOpened (WindowEvent e)
			{
					
			}
		}
		);
	}
	
	public static void metodosAbreviadosAComponentes (Component componente, final Window ventana, final tipoDeVentana tipoDeVentana, final boolean confirmarCerrar)
	{
		for (final Component componentes : ((Container) componente).getComponents ())
		{
			if (componentes instanceof AbstractButton)
				
				((AbstractButton) componentes).setMnemonic (((AbstractButton) componentes).getText ().toString ().matches ("Agregar") ? KeyEvent.VK_A : ((AbstractButton) componentes).getText ().toString ().matches ("Eliminar") ? KeyEvent.VK_E : ((AbstractButton) componentes).getText ().toString ().matches ("Modificar") ? KeyEvent.VK_M : ((AbstractButton) componentes).getText ().toString ().matches ("Aplicar") ? KeyEvent.VK_P : ((AbstractButton) componentes).getMnemonic ());

			else if (componentes instanceof JTable)
			{
				((JTable) componentes).addMouseListener (new MouseAdapter ()
				{
					public void mouseClicked (java.awt.event.MouseEvent e)
					{
						if (e.getClickCount () == 2)
						{
							try
							{
								new Robot ().keyPress (KeyEvent.VK_ENTER);
								new Robot ().keyRelease (KeyEvent.VK_ENTER);
								new Robot ().delay (25);
							}

							catch (AWTException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
				);
				
				((JTable) componentes).addMouseMotionListener (new MouseMotionListener ()
				{
					public void mouseMoved (MouseEvent e)
					{
						/*try
						{
							new Robot ().mousePress (MouseEvent.MOUSE_PRESSED);
							new Robot ().mouseRelease (MouseEvent.MOUSE_RELEASED);
						}

						catch (AWTException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
						}*/
					}
					
					public void mouseDragged (MouseEvent e)
					{

					}
				}
				);
				
				((JTable) componentes).setAutoResizeMode (JTable.AUTO_RESIZE_OFF);
				((JTable) componentes).setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
				((JTable) componentes).getInputMap (JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put (KeyStroke.getKeyStroke (KeyEvent.VK_ENTER, 0, false), "selectColumnCell");
				((JTable) componentes).getInputMap (JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put (KeyStroke.getKeyStroke (KeyEvent.VK_TAB, 0, false), "selectColumnCell");
			}
			
			else if (componentes instanceof JTextComponent && tipoDeVentana.equals (Utilidades.tipoDeVentana.CARGA))
			{
				((JTextComponent) componentes).addFocusListener (new FocusListener ()
				{
					public void focusGained (FocusEvent e)
					{
						((JTextComponent) componentes).setSelectionStart (0);
						((JTextComponent) componentes).setSelectionEnd (((JTextComponent) componentes).getText ().length ());
					}
					
					public void focusLost (FocusEvent e)
					{
						
					}
				}
				);
			}
			
			componentes.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					switch (e.getKeyCode ())
					{
					case KeyEvent.VK_ENTER:
						
						if (componentes instanceof AbstractButton && (! UIManager.getLookAndFeel ().getName ().toString ().equals ("Windows") || ! UIManager.getLookAndFeel ().getName ().toString ().equals ("Windows Classic") || ! UIManager.getLookAndFeel ().getName ().toString ().equals ("CDE/Motif")))
							
							((AbstractButton) componentes).doClick ();
						
						else if (tipoDeVentana.equals (Utilidades.tipoDeVentana.CARGA))
							
							componentes.transferFocus ();
						
						else if (tipoDeVentana.equals (Utilidades.tipoDeVentana.ABM))
							
							if (componentes instanceof JComboBox)
							
								try
								{
									new Robot ().keyPress (KeyEvent.VK_ALT);
									new Robot ().keyPress (KeyEvent.VK_P);
									new Robot ().keyRelease (KeyEvent.VK_P);
									new Robot ().keyRelease (KeyEvent.VK_ALT);
									new Robot ().delay (25);
								}

								catch (AWTException e1)
								{
									JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
								}
						
							else if (! (componentes instanceof JTextComponent))
								
								try
								{
									new Robot ().keyPress (KeyEvent.VK_ALT);
									new Robot ().keyPress (KeyEvent.VK_M);
									new Robot ().keyRelease (KeyEvent.VK_M);
									new Robot ().keyRelease (KeyEvent.VK_ALT);
									new Robot ().delay (25);
								}

								catch (AWTException e1)
								{
									JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
								}
						
						break;
						
					case KeyEvent.VK_ESCAPE:
						
						if (confirmarCerrar)
						{
							if (JOptionPane.showConfirmDialog (null, "¿Esta seguro que desea cerrar est\u00e1 ventana?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
								
								ventana.dispose ();
						}
						
						else
							
							ventana.dispose ();
						
						break;
						
					case KeyEvent.VK_SPACE:
						
						if (componentes instanceof JComboBox)
						{
							//((JComboBox <String>) componentes);
						}
						
						break;
					}
				}
				
				public void keyReleased (KeyEvent e)
				{
					switch (e.getKeyCode ())
					{
					case KeyEvent.VK_DELETE:
						
						try
						{
							new Robot ().keyPress (KeyEvent.VK_ALT);							
							new Robot ().keyPress (KeyEvent.VK_E);
							new Robot ().keyRelease (KeyEvent.VK_E);
							new Robot ().keyRelease (KeyEvent.VK_ALT);
							new Robot ().delay (25);
						}

						catch (AWTException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
						}
						
						break;
					
					case KeyEvent.VK_INSERT:
						
						try
						{
							new Robot ().keyPress (KeyEvent.VK_ALT);
							new Robot ().keyPress (KeyEvent.VK_A);							
							new Robot ().keyRelease (KeyEvent.VK_A);							
							new Robot ().keyRelease (KeyEvent.VK_ALT);
							new Robot ().delay (25);
						}

						catch (AWTException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
						}
						
						break;
					}
				}
			}
			);
			
			if (componentes instanceof Container)
				
				metodosAbreviadosAComponentes ((Container) componentes, ventana, tipoDeVentana, confirmarCerrar);
		}
	}
	
	public static void validarNumeroEnComponenteTexto (final JTextComponent componenteTexto, final int cantidadMaximaDeCaracteres, final boolean signo, final boolean decimal)
	{
		componenteTexto.getInputMap ().put (KeyStroke.getKeyStroke (KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), Event.CTRL_MASK + KeyEvent.VK_V);
		componenteTexto.getActionMap ().put (Event.CTRL_MASK + KeyEvent.VK_V, new AbstractAction ()
		{
			private static final long serialVersionUID = 1L;

			public void actionPerformed (ActionEvent e)
			{
				Transferable transferable = Toolkit.getDefaultToolkit ().getSystemClipboard ().getContents (null);
				
				if (transferable != null && transferable.isDataFlavorSupported (DataFlavor.stringFlavor))
				{
					int caracter = 0;
						
					String portapapeles = null, portapapelesFiltrado = null;
						
					try
					{
						portapapeles = transferable.getTransferData (DataFlavor.stringFlavor).toString ();
					}
						
					catch (UnsupportedFlavorException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
						
					catch (IOException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
						
					for (caracter = 0; caracter < portapapeles.toString ().length (); caracter ++)
					{	
						if (! signo && ! decimal)
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)))
								
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + String.valueOf (portapapeles.toString ().charAt (caracter)));
						}

						else if (signo && ! decimal)
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '+' || portapapeles.toString ().charAt (caracter) == '-')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (((((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (((! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : String.valueOf (portapapeles.toString ().charAt (caracter))));
						}
							
						else if (! signo && decimal)
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '.')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (String.valueOf (portapapeles.toString ().charAt (caracter)).equals (".") && (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().contains (".") ? "" : String.valueOf (portapapeles.toString ().charAt (caracter))));
						}
							
						else if (signo && decimal)
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '+' || portapapeles.toString ().charAt (caracter) == '-' || portapapeles.toString ().charAt (caracter) == '.')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (((((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (((! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (String.valueOf (portapapeles.toString ().charAt (caracter)).equals (".") && (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().contains (".") ? "" : String.valueOf (portapapeles.toString ().charAt (caracter)))));
						}
					}
					//aaaaaaaa
					componenteTexto.setToolTipText (
					/*(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith (".")
				 	?
				 	"0" + (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ())
				 	:*/
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+.")
					?
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().replace ('+', 'P').replaceAll ("P.", "+0.")
					:
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-.")
					?
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().replace ('-', 'N').replaceAll ("N.", "-0.")
					:
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ()
					);

					for (caracter = 0; caracter < (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().length (); caracter ++)

						if ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().length () + componenteTexto.getText ().toString ().length () - (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().length () < ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("-") ? cantidadMaximaDeCaracteres + 1 : cantidadMaximaDeCaracteres))

							portapapelesFiltrado = (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString () + String.valueOf ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().charAt (caracter));

					componenteTexto.replaceSelection (
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("-")
					?
						componenteTexto.getSelectionStart () > 0
						?
							((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")) && ! (((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") || (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")))
							?
								(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
								?
								(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
								:
								(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
						:
						((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")) && ! (((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") || (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")))
						?
							(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
							?
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "")
						:
						(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
						?
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
						:
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
					:
					componenteTexto.getCaretPosition () == 0 && ((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().startsWith  ("-"))
					?
						""
					:
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith (".")
					?
						componenteTexto.getSelectionStart () > 0 
						?
							(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
							?
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
						:
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
					:
					(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
					?
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
					:
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
					);
					componenteTexto.setToolTipText (null);
				}
			}
		}
		);

		componenteTexto.addFocusListener (new FocusListener ()
		{
			public void focusGained (FocusEvent e)
			{

			}

			public void focusLost (FocusEvent e)
			{
				componenteTexto.setText (
				componenteTexto.getText ().toString ().equals (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "")
				:
				componenteTexto.getText ().toString ().startsWith ("+.")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P.", "+0.")
				:
				componenteTexto.getText ().toString ().startsWith ("-.")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N.", "-0.")
				:
				componenteTexto.getText ().toString ().startsWith (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "0.")				
				:
				componenteTexto.getText ().toString ().endsWith ("+.")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P.", "")
				:
				componenteTexto.getText ().toString ().endsWith ("-.")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N.", "")
				:
				componenteTexto.getText ().toString ().endsWith (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "")
				:
				componenteTexto.getText ().toString ().endsWith ("+")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P", "")
				:
				componenteTexto.getText ().toString ().endsWith ("-")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N", "")
				:
				componenteTexto.getText ().toString ()
				);
				//componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).contains ("+") ? componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).replace ('+', 'P').replaceAll ("P", "") : componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).contains  ("-") ? componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).replace ('-', 'N').replaceAll ("N", "") : 
			}
		}
		);

		componenteTexto.addKeyListener (new KeyAdapter ()
		{
			public void keyTyped (KeyEvent e)
			{
				if ((componenteTexto.getText ().toString ().length () - ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().length ())) < cantidadMaximaDeCaracteres)
				{
					if (! signo && ! decimal)
					{	
						if (! Character.isDigit (e.getKeyChar ()))

							e.consume ();
					}

					else if (signo && ! decimal)
					{
						if ((! Character.isDigit (e.getKeyChar ()) && ((e.getKeyChar () != '+' && e.getKeyChar () != '-') || componenteTexto.getSelectionStart () != 0 || (componenteTexto.getText ().toString ().contains ("+") || componenteTexto.getText ().toString ().contains ("-")) && ! (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") && ! (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-"))))

							e.consume ();
					}

					else if (! signo && decimal)
					{
						if (! Character.isDigit (e.getKeyChar ()) && (e.getKeyChar () != '.' || componenteTexto.getSelectionStart () < 1 || componenteTexto.getText ().toString ().contains (".")))

							e.consume ();
					}

					if (signo && decimal)
					{
						if (
						(! Character.isDigit (e.getKeyChar ()) && ((e.getKeyChar () != '+' && e.getKeyChar () != '-') || componenteTexto.getSelectionStart () != 0 || (componenteTexto.getText ().toString ().contains ("+") || componenteTexto.getText ().toString ().contains ("-")) && ! (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") && ! (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-")))
						&&
						(! Character.isDigit (e.getKeyChar ()) && (e.getKeyChar () != '.' || componenteTexto.getSelectionStart () < 1 || componenteTexto.getText ().toString ().contains (".")))
						||
						(componenteTexto.getCaretPosition () == 0 && (componenteTexto.getText ().toString ().startsWith ("+") || componenteTexto.getText ().toString ().startsWith ("-")))
						)
							e.consume ();
					}
				}

				else

					e.consume ();
			}
		}
		);
	}
	
	enum tipoDeLetra
	{
		INDISTINTO, MAYUSCULA, MINUSCULA 
	}
	
	enum tipoDeVentana
	{
		ABM, CARGA 
	}
	
	enum espacio
	{
		INDISTINTO, CON_ESPACIO, SIN_ESPACIO
	}
	
	public static void validarTextoEnComponenteTexto (final JTextComponent componenteTexto, final int cantidadMaximaDeCaracteres, String caracteresEspeciales, final tipoDeLetra tipoDeLetra, final espacio espacio)
	{
		componenteTexto.getInputMap ().put (KeyStroke.getKeyStroke (KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), Event.CTRL_MASK + KeyEvent.VK_V);
		componenteTexto.getActionMap ().put (Event.CTRL_MASK + KeyEvent.VK_V, new AbstractAction ()
		{
			private static final long serialVersionUID = 1L;

			public void actionPerformed (ActionEvent e)
			{
				Transferable transferable = Toolkit.getDefaultToolkit ().getSystemClipboard ().getContents (null);
				
				if (transferable != null && transferable.isDataFlavorSupported (DataFlavor.stringFlavor))
				{
					int caracter = 0;
						
					String portapapeles = null, portapapelesFiltrado = null;
						
					try
					{
						portapapeles = transferable.getTransferData (DataFlavor.stringFlavor).toString ();
					}
						
					catch (UnsupportedFlavorException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
						
					catch (IOException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), "Utilidades", JOptionPane.ERROR_MESSAGE);
					}
						
					for (caracter = 0; caracter < portapapeles.toString ().length (); caracter ++)
					{
						if (tipoDeLetra.equals (Utilidades.tipoDeLetra.INDISTINTO) && espacio.equals (Utilidades.espacio.INDISTINTO))
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)))
								
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + String.valueOf (portapapeles.toString ().charAt (caracter)));
						}

						else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.MAYUSCULA) && espacio.equals (Utilidades.espacio.INDISTINTO))						
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '+' || portapapeles.toString ().charAt (caracter) == '-')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (((((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (((! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : String.valueOf (portapapeles.toString ().charAt (caracter))));
						}
						
						else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.INDISTINTO) && espacio.equals (Utilidades.espacio.CON_ESPACIO))						
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '.')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (String.valueOf (portapapeles.toString ().charAt (caracter)).equals (".") && (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().contains (".") ? "" : String.valueOf (portapapeles.toString ().charAt (caracter))));
						}
						
						else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.MAYUSCULA) && espacio.equals (Utilidades.espacio.CON_ESPACIO))
						{
							if (Character.isDigit (portapapeles.toString ().charAt (caracter)) || portapapeles.toString ().charAt (caracter) == '+' || portapapeles.toString ().charAt (caracter) == '-' || portapapeles.toString ().charAt (caracter) == '.')
									
								componenteTexto.setToolTipText ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString () + (((((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (((! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+") && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-")) && ! (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().isEmpty ()) && (String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("+") || String.valueOf (portapapeles.toString ().charAt (caracter)).equals ("-"))) ? "" : (String.valueOf (portapapeles.toString ().charAt (caracter)).equals (".") && (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().contains (".") ? "" : String.valueOf (portapapeles.toString ().charAt (caracter)))));
						}
					}
					//aaaaaaaa
					componenteTexto.setToolTipText (
					/*(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith (".")
				 	?
				 	"0" + (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ())
				 	:*/
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("+.")
					?
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().replace ('+', 'P').replaceAll ("P.", "+0.")
					:
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().startsWith ("-.")
					?
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().replace ('-', 'N').replaceAll ("N.", "-0.")
					:
					(componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ()
					);

					for (caracter = 0; caracter < (componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().length (); caracter ++)

						if ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().length () + componenteTexto.getText ().toString ().length () - (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().length () < ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("-") ? cantidadMaximaDeCaracteres + 1 : cantidadMaximaDeCaracteres))

							portapapelesFiltrado = (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString () + String.valueOf ((componenteTexto.getToolTipText () == null ? "" : componenteTexto.getToolTipText ().toString ()).toString ().charAt (caracter));

					componenteTexto.replaceSelection (
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith ("-")
					?
						componenteTexto.getSelectionStart () > 0
						?
							((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")) && ! (((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") || (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")))
							?
								(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
								?
								(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
								:
								(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
						:
						((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")) && ! (((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("+") || (componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains ("-")) && ((portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("+") || (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("-")))
						?
							(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
							?
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "").replace ('.', ' ').replaceAll (" ", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('+', 'P').replace ('-', 'N').replaceAll ("P", "").replaceAll ("N", "")
						:
						(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
						?
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
						:
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
					:
					componenteTexto.getCaretPosition () == 0 && ((componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().startsWith ("+") || (componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().startsWith  ("-"))
					?
						""
					:
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().startsWith (".")
					?
						componenteTexto.getSelectionStart () > 0 
						?
							(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
							?
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
							:
							(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
						:
						(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
					:
					(componenteTexto.getText () == null ? "" : componenteTexto.getText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains (".") && ! ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().contains (".") && (portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().contains ("."))
					?
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ().replace ('.', ' ').replaceAll (" ", "")
					:
					(portapapelesFiltrado == null ? "" : portapapelesFiltrado.toString ()).toString ()
					);
					componenteTexto.setToolTipText (null);
				}
			}
		}
		);

		componenteTexto.addFocusListener (new FocusListener ()
		{
			public void focusGained (FocusEvent e)
			{

			}

			public void focusLost (FocusEvent e)
			{
				componenteTexto.setText (
				componenteTexto.getText ().toString ().equals (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "")
				:
				componenteTexto.getText ().toString ().startsWith ("+.")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P.", "+0.")
				:
				componenteTexto.getText ().toString ().startsWith ("-.")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N.", "-0.")
				:
				componenteTexto.getText ().toString ().startsWith (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "0.")				
				:
				componenteTexto.getText ().toString ().endsWith ("+.")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P.", "")
				:
				componenteTexto.getText ().toString ().endsWith ("-.")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N.", "")
				:
				componenteTexto.getText ().toString ().endsWith (".")
				?
				componenteTexto.getText ().toString ().replace ('.', ' ').replaceAll (" ", "")
				:
				componenteTexto.getText ().toString ().endsWith ("+")
				?
				componenteTexto.getText ().toString ().replace ('+', 'P').replaceAll ("P", "")
				:
				componenteTexto.getText ().toString ().endsWith ("-")
				?
				componenteTexto.getText ().toString ().replace ('-', 'N').replaceAll ("N", "")
				:
				componenteTexto.getText ().toString ()
				);
				//componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).contains ("+") ? componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).replace ('+', 'P').replaceAll ("P", "") : componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).contains  ("-") ? componenteTexto.getText ().toString ().substring (1, componenteTexto.getText ().toString ().length () - 1).replace ('-', 'N').replaceAll ("N", "") : 
			}
		}
		);

		componenteTexto.addKeyListener (new KeyAdapter ()
		{
			public void keyTyped (KeyEvent e)
			{
				if ((componenteTexto.getText ().toString ().length () - ((componenteTexto.getSelectedText () == null ? "" : componenteTexto.getSelectedText ().toString ()).toString ().length ())) < cantidadMaximaDeCaracteres)
				{
					if (tipoDeLetra.equals (Utilidades.tipoDeLetra.INDISTINTO) && espacio.equals (Utilidades.espacio.INDISTINTO))					
					{	
						if (! Character.isAlphabetic (e.getKeyChar ()) && ! Character.isSpaceChar (e.getKeyChar ()))
							
							e.consume ();
					}

					else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.MAYUSCULA) && espacio.equals (Utilidades.espacio.INDISTINTO))					
					{
						if (! Character.isAlphabetic (e.getKeyChar ()) && ! Character.isSpaceChar (e.getKeyChar ()))

							e.consume ();
						
						else if (Character.isLowerCase (e.getKeyChar ()))
							
							e.setKeyChar (Character.toUpperCase (e.getKeyChar ()));
					}

					else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.MAYUSCULA) && espacio.equals (Utilidades.espacio.CON_ESPACIO))					
					{
						//por ac� va la posta
						//System.out.println (String.valueOf (componenteTexto.getText ().toString ().charAt (componenteTexto.getCaretPosition () - 1)).equals (" "));
						//System.out.println (componenteTexto.getText ().toString ().charAt (componenteTexto.getCaretPosition () - 1));
						
						if (! Character.isAlphabetic (e.getKeyChar ()) && (componenteTexto.getText ().toString ().endsWith (" ") ? Character.isSpaceChar (e.getKeyChar ()) : ! Character.isSpaceChar (e.getKeyChar ())))

							e.consume ();
						
						else if (Character.isLowerCase (e.getKeyChar ()))
							
							e.setKeyChar (Character.toUpperCase (e.getKeyChar ()));
					}

					else if (tipoDeLetra.equals (Utilidades.tipoDeLetra.MAYUSCULA) && espacio.equals (Utilidades.espacio.SIN_ESPACIO))					
					{
						if (! Character.isAlphabetic (e.getKeyChar ()) && Character.isSpaceChar (e.getKeyChar ()))

							e.consume ();
						
						else if (Character.isLowerCase (e.getKeyChar ()))
							
							e.setKeyChar (Character.toUpperCase (e.getKeyChar ()));
					}
				}

				else

					e.consume ();
			}
		}
		);
	}
}