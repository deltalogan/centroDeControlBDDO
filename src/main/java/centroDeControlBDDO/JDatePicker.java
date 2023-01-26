package centroDeControlBDDO;

import org.jdatepicker.constraints.DateSelectionConstraint;

import javax.swing.*;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;

import java.awt.*;

import java.awt.event.*;

import java.beans.PropertyChangeEvent;

import java.beans.PropertyChangeListener;

import java.util.Calendar;

import java.util.HashSet;

import java.util.Set;

public class JDatePicker extends JComponent implements DatePicker
{
	private static final long serialVersionUID = 1L;

	private Popup popup;

	private JFormattedTextField formattedTextField;

	private JButton button;

	private JDatePanel datePanel;

	public JDatePicker ()
	{
		this (new JDatePanel ());
	}

	public JDatePicker (Calendar value)
	{
		this (new JDatePanel (value));
	}

	public JDatePicker (java.util.Date value)
	{
		this (new JDatePanel (value));
	}

	public JDatePicker (java.sql.Date value)
	{
		this (new JDatePanel (value));
	}

	public JDatePicker (DateModel <?> model)
	{
		this (new JDatePanel (model));
	}

	private JDatePicker (JDatePanel datePanel)
	{
		this.datePanel = datePanel;
		popup = null;
		datePanel.setBorder (BorderFactory.createLineBorder (getColors ().getColor (ComponentColorDefaults.Key.POPUP_BORDER)));
		InternalEventHandler internalEventHandler = new InternalEventHandler ();
		SpringLayout layout = new SpringLayout ();
		setLayout (layout);
		formattedTextField = new JFormattedTextField (new DateComponentFormatter ());
		DateModel <?> model = datePanel.getModel ();
		setTextFieldValue (formattedTextField, model.getYear (), model.getMonth (), model.getDay (), model.isSelected ());
		formattedTextField.setEditable (false);
		add (formattedTextField);
		layout.putConstraint (SpringLayout.WEST, formattedTextField, 0, SpringLayout.WEST, this);
		layout.putConstraint (SpringLayout.SOUTH, this, 0, SpringLayout.SOUTH, formattedTextField);
		button = new JButton ();
		button.setFocusable (true);
		Icon icon = ComponentIconDefaults.getInstance ().getPopupButtonIcon ();
		button.setIcon (icon);

		if  (icon == null)
		{
			button.setText ("...");
		}

		else
		{
			button.setText ("");
		}

		add (button);
		layout.putConstraint (SpringLayout.WEST, button, 1, SpringLayout.EAST, formattedTextField);
		layout.putConstraint (SpringLayout.EAST, this, 0, SpringLayout.EAST, button);
		layout.putConstraint (SpringLayout.SOUTH, this, 0, SpringLayout.SOUTH, button);

		int h =  (int) button.getPreferredSize ().getHeight ();

		int w =  (int) datePanel.getPreferredSize ().getWidth ();

		button.setPreferredSize (new Dimension (h, h));
		formattedTextField.setPreferredSize (new Dimension (w - h - 1, h));
		addHierarchyBoundsListener (internalEventHandler);
		button.addActionListener (internalEventHandler);
		formattedTextField.addPropertyChangeListener ("value", internalEventHandler);
		datePanel.addActionListener (internalEventHandler);
		datePanel.getModel ().addChangeListener (internalEventHandler);

		long eventMask = MouseEvent.MOUSE_PRESSED;

		Toolkit.getDefaultToolkit ().addAWTEventListener (internalEventHandler, eventMask);
	}

	private static ComponentColorDefaults getColors ()
	{
		return ComponentColorDefaults.getInstance ();
	}

	public void addActionListener (ActionListener actionListener)
	{
		datePanel.addActionListener (actionListener);
	}

	public void removeActionListener (ActionListener actionListener)
	{
		datePanel.removeActionListener (actionListener);
	}

	public DateModel <?> getModel ()
	{
		return datePanel.getModel ();
	}

	public void setTextEditable (boolean editable)
	{
		formattedTextField.setEditable (editable);
	}

	public boolean isTextEditable ()
	{
		return formattedTextField.isEditable ();
	}

	public void setButtonFocusable (boolean focusable)
	{
		button.setFocusable (focusable);
	}

	public boolean getButtonFocusable ()
	{
		return button.isFocusable ();
	}

	public DatePanel getJDateInstantPanel ()
	{
		return datePanel;
	}

	private void showPopup ()
	{
		if  (popup == null)
		{
			PopupFactory fac = new PopupFactory ();
			Point xy = getLocationOnScreen ();
			datePanel.setVisible (true);
			popup = fac.getPopup (this, datePanel,  (int) xy.getX (),  (int)  (xy.getY ()  + this.getHeight ()));
			popup.show ();
		}
	}

	private void hidePopup ()
	{
		if  (popup != null)
		{
			popup.hide ();
			popup = null;
		}
	}

	private Set <Component> getAllComponents (Component component)
	{
		Set <Component> children = new HashSet <Component> ();
		children.add (component);

		if  (component instanceof Container)
		{
			Container container =  (Container) component;
			Component [] components = container.getComponents ();

			for  (int i = 0; i  < components.length; i ++)
			{
				children.addAll (getAllComponents (components [i]));
			}
		}

		return children;
	}

	public boolean isDoubleClickAction ()
	{
		return datePanel.isDoubleClickAction ();
	}

	public boolean isShowYearButtons ()
	{
		return datePanel.isShowYearButtons ();
	}

	public void setDoubleClickAction (boolean doubleClickAction)
	{
		datePanel.setDoubleClickAction (doubleClickAction);
	}

	public void setShowYearButtons (boolean showYearButtons)
	{
		datePanel.setShowYearButtons (showYearButtons);
	}

	private void setTextFieldValue (JFormattedTextField textField, int year, int month, int day, boolean isSelected)
	{
		if  (! isSelected)
		{
			textField.setValue (null);
		}

		else
		{
			Calendar calendar = Calendar.getInstance ();
			calendar.set (year, month, day, 0, 0, 0);
			calendar.set (Calendar.MILLISECOND, 0);
			textField.setValue (calendar);
		}
	}

	public void addDateSelectionConstraint (DateSelectionConstraint constraint)
	{
		datePanel.addDateSelectionConstraint (constraint);
	}

	public void removeDateSelectionConstraint (DateSelectionConstraint constraint)
	{
		datePanel.removeDateSelectionConstraint (constraint);
	}

	public void removeAllDateSelectionConstraints ()
	{
		datePanel.removeAllDateSelectionConstraints ();
	}

	public Set <DateSelectionConstraint> getDateSelectionConstraints ()
	{
		return datePanel.getDateSelectionConstraints ();
	}

	public int getTextfieldColumns ()
	{
		return formattedTextField.getColumns ();
	}

	public void setTextfieldColumns (int columns)
	{
		formattedTextField.setColumns (columns);
	}

	public void setVisible (boolean aFlag)
	{
		if  (! aFlag)
		{
			hidePopup ();
		}

		super.setVisible (aFlag);
	}

	public void setEnabled (boolean enabled)
	{
		button.setEnabled (enabled);
		datePanel.setEnabled (enabled);
		formattedTextField.setEnabled (enabled);
		super.setEnabled (enabled);
	}

	private class InternalEventHandler implements ActionListener, HierarchyBoundsListener, ChangeListener, PropertyChangeListener, AWTEventListener
	{
		public void ancestorMoved (HierarchyEvent arg0)
		{
			hidePopup ();
		}

		public void ancestorResized (HierarchyEvent arg0)
		{
			hidePopup ();
		}

		public void actionPerformed (ActionEvent arg0)
		{
			if  (arg0.getSource () == button)
			{
				if  (popup == null)
				{
					showPopup ();
				}

				else
				{
					hidePopup ();
				}
			}

			else if  (arg0.getSource () == datePanel)
			{
				hidePopup ();
			}
		}

		public void stateChanged (ChangeEvent arg0)
		{
			if  (arg0.getSource () == datePanel.getModel ())
			{
				DateModel <?> model = datePanel.getModel ();
				setTextFieldValue (formattedTextField, model.getYear (), model.getMonth (), model.getDay (), model.isSelected ());
			}
		}

		public void propertyChange (PropertyChangeEvent evt)
		{
			if  (evt.getOldValue () == null && evt.getNewValue () == null)
			{
				return;
			}

			if  (evt.getOldValue () != null && evt.getOldValue ().equals (evt.getNewValue ()))
			{
				return;
			}

			if  (! formattedTextField.isEditable ())
			{
				return;
			}

			if  (evt.getNewValue () != null)
			{
				Calendar value =  (Calendar) evt.getNewValue ();
				DateModel <?> model = new UtilCalendarModel (value);

				if  (! datePanel.checkConstraints (model))
				{
					formattedTextField.setValue (evt.getOldValue ());

					return;
				}

				datePanel.getModel ().setDate (value.get (Calendar.YEAR), value.get (Calendar.MONTH), value.get (Calendar.DATE));
				datePanel.getModel ().setSelected (true);
			}

			if  (evt.getNewValue () == null)
			{
				getModel ().setSelected (false);
			}
		}

		public void eventDispatched (AWTEvent event)
		{
			if  (MouseEvent.MOUSE_CLICKED == event.getID () && event.getSource () != button)
			{
				Set <Component> components = getAllComponents (datePanel);

				boolean clickInPopup = false;

				for  (Component component : components)
				{
					if  (event.getSource () == component)
					{
						clickInPopup = true;
					}
				}

				if  (! clickInPopup)
				{
					hidePopup ();
				}
			}
		}
	}
}