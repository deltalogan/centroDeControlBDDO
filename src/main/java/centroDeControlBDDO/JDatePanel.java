package centroDeControlBDDO;

import org.jdatepicker.constraints.DateSelectionConstraint;

import javax.swing.*;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;

import javax.swing.event.TableModelEvent;

import javax.swing.event.TableModelListener;

import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.JTableHeader;

import javax.swing.table.TableColumn;

import javax.swing.table.TableModel;

import java.awt.*;

import java.awt.event.*;

import java.text.DateFormat;

import java.util.*;

public class JDatePanel extends JComponent implements DatePanel
{
	private static final long serialVersionUID = 1L;

	private Set <ActionListener> actionListeners;

	private Set <DateSelectionConstraint> dateConstraints;

	private boolean showYearButtons;

	private boolean doubleClickAction;

	private int firstDayOfWeek;

	private InternalCalendarModel internalModel;

	private InternalController internalController;

	private InternalView internalView;

	public JDatePanel ()
	{
		this (createModel ());
	}

	public JDatePanel (Calendar value)
	{
		this (createModelFromValue (value));
	}

	public JDatePanel (java.util.Date value)
	{
		this (createModelFromValue (value));
	}

	public JDatePanel (java.sql.Date value)
	{
		this (createModelFromValue (value));
	}

	public JDatePanel (DateModel <?> model)
	{
		actionListeners = new HashSet <ActionListener> ();
		dateConstraints = new HashSet <DateSelectionConstraint> ();

		showYearButtons = false;
		doubleClickAction = false;
		firstDayOfWeek = Calendar.getInstance ().getFirstDayOfWeek ();

		internalModel = new InternalCalendarModel (model);
		internalController = new InternalController ();
		internalView = new InternalView ();

		setLayout (new GridLayout (1, 1));
		add (internalView);
	}

	public static DateModel <Calendar> createModel ()
	{
		return new UtilCalendarModel ();
	}

	private static DateModel <?> createModelFromValue (Object value)
	{
		if  (value instanceof java.util.Calendar)
		{
			return new UtilCalendarModel ((Calendar) value);
		}

		if  (value instanceof java.util.Date)
		{
			return new UtilDateModel ((java.util.Date) value);
		}

		if  (value instanceof java.sql.Date)
		{
			return new SqlDateModel ((java.sql.Date) value);
		}

		throw new IllegalArgumentException ("No model could be constructed from the initial value object.");
	}

	public void addActionListener (ActionListener actionListener)
	{
		actionListeners.add (actionListener);
	}

	public void removeActionListener (ActionListener actionListener)
	{
		actionListeners.remove (actionListener);
	}

	private void fireActionPerformed ()
	{
		for  (ActionListener actionListener : actionListeners) {
			actionListener.actionPerformed (new ActionEvent (this, ActionEvent.ACTION_PERFORMED, "Date selected"));
		}
	}

	public void setShowYearButtons (boolean showYearButtons)
	{
		this.showYearButtons = showYearButtons;
		internalView.updateShowYearButtons ();
	}

	public boolean isShowYearButtons ()
	{
		return this.showYearButtons;
	}

	public void setDoubleClickAction (boolean doubleClickAction)
	{
		this.doubleClickAction = doubleClickAction;
	}

	public boolean isDoubleClickAction ()
	{
		return doubleClickAction;
	}

	public DateModel <?> getModel ()
	{
		return internalModel.getModel ();
	}

	public void addDateSelectionConstraint (DateSelectionConstraint constraint)
	{
		dateConstraints.add (constraint);
	}

	public void removeDateSelectionConstraint (DateSelectionConstraint constraint)
	{
		dateConstraints.remove (constraint);
	}

	public void removeAllDateSelectionConstraints ()
	{
		dateConstraints.clear ();
	}

	public Set <DateSelectionConstraint> getDateSelectionConstraints ()
	{
		return Collections.unmodifiableSet (dateConstraints);
	}

	protected boolean checkConstraints (DateModel <?> model)
	{
		for  (DateSelectionConstraint constraint : dateConstraints)
		{
			if  (! constraint.isValidSelection ((org.jdatepicker.DateModel <?>) model))
			{
				return false;
			}
		}

		return true;
	}

	private static ComponentTextDefaults getTexts ()
	{
		return ComponentTextDefaults.getInstance ();
	}

	private static ComponentIconDefaults getIcons ()
	{
		return ComponentIconDefaults.getInstance ();
	}

	private static ComponentColorDefaults getColors ()
	{
		return ComponentColorDefaults.getInstance ();
	}

	private static ComponentFormatDefaults getFormats ()
	{
		return ComponentFormatDefaults.getInstance ();
	}

	public void setVisible (boolean aFlag)
	{
		super.setVisible (aFlag);

		if  (aFlag)
		{
			internalView.updateTodayLabel ();
		}
	}

	public void setEnabled (boolean enabled)
	{
		internalView.setEnabled (enabled);
		super.setEnabled (enabled);
	}

	private class InternalView extends JPanel
	{
		private static final long serialVersionUID = 1L;

		private JPanel centerPanel;

		private JPanel northCenterPanel;

		private JPanel northPanel;

		private JPanel southPanel;

		private JPanel previousButtonPanel;

		private JPanel nextButtonPanel;

		private JTable dayTable;

		private JTableHeader dayTableHeader;

		private InternalTableCellRenderer dayTableCellRenderer;

		private JLabel monthLabel;

		private JLabel todayLabel;

		private JLabel noneLabel;

		private JPopupMenu monthPopupMenu;

		private JMenuItem [] monthPopupMenuItems;

		private JButton nextMonthButton;

		private JButton previousMonthButton;

		private JButton previousYearButton;

		private JButton nextYearButton;

		private JSpinner yearSpinner;

		private void updateShowYearButtons ()
		{
			if  (showYearButtons)
			{
				getNextButtonPanel ().add (getNextYearButton ());
				getPreviousButtonPanel ().removeAll ();
				getPreviousButtonPanel ().add (getPreviousYearButton ());
				getPreviousButtonPanel ().add (getPreviousMonthButton ());
			}

			else
			{
				getNextButtonPanel ().remove (getNextYearButton ());
				getPreviousButtonPanel ().remove (getPreviousYearButton ());
			}
		}

		private void updateMonthLabel ()
		{
			monthLabel.setText (getTexts ().getText (ComponentTextDefaults.Key.getMonthKey (internalModel.getModel ().getMonth ())));
		}

		public InternalView ()
		{
			initialise ();
		}

		private void initialise ()
		{
			this.setLayout (new java.awt.BorderLayout ());
			this.setSize (200, 180);
			this.setPreferredSize (new java.awt.Dimension (200, 180));
			this.setOpaque (false);
			this.add (getNorthPanel (), java.awt.BorderLayout.NORTH);
			this.add (getSouthPanel (), java.awt.BorderLayout.SOUTH);
			this.add (getCenterPanel (), java.awt.BorderLayout.CENTER);
		}

		private JPanel getNorthPanel ()
		{
			if  (northPanel == null)
			{
				northPanel = new javax.swing.JPanel ();
				northPanel.setLayout (new java.awt.BorderLayout ());
				northPanel.setName ("");
				northPanel.setBorder (javax.swing.BorderFactory.createEmptyBorder (3, 3, 3, 3));
				northPanel.setBackground (getColors ().getColor (ComponentColorDefaults.Key.BG_MONTH_SELECTOR));
				northPanel.add (getPreviousButtonPanel (), java.awt.BorderLayout.WEST);
				northPanel.add (getNextButtonPanel (), java.awt.BorderLayout.EAST);
				northPanel.add (getNorthCenterPanel (), java.awt.BorderLayout.CENTER);
			}

			return northPanel;
		}

		private JPanel getNorthCenterPanel ()
		{
			if  (northCenterPanel == null)
			{
				northCenterPanel = new javax.swing.JPanel ();
				northCenterPanel.setLayout (new java.awt.BorderLayout ());
				northCenterPanel.setBorder (javax.swing.BorderFactory.createEmptyBorder (0, 5, 0, 5));
				northCenterPanel.setOpaque (false);
				northCenterPanel.add (getMonthLabel (), java.awt.BorderLayout.CENTER);
				northCenterPanel.add (getYearSpinner (), java.awt.BorderLayout.EAST);
			}

			return northCenterPanel;
		}

		private JLabel getMonthLabel ()
		{
			if  (monthLabel == null)
			{
				monthLabel = new javax.swing.JLabel ();
				monthLabel.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_MONTH_SELECTOR));
				monthLabel.setHorizontalAlignment (javax.swing.SwingConstants.CENTER);
				monthLabel.addMouseListener (internalController);
				updateMonthLabel ();
			}

			return monthLabel;
		}

		private JSpinner getYearSpinner ()
		{
			if  (yearSpinner == null)
			{
				yearSpinner = new javax.swing.JSpinner ();
				yearSpinner.setModel (internalModel);
			}

			return yearSpinner;
		}

		private JPanel getSouthPanel ()
		{
			if  (southPanel == null)
			{
				southPanel = new javax.swing.JPanel ();
				southPanel.setLayout (new java.awt.BorderLayout ());
				southPanel.setBackground (getColors ().getColor (ComponentColorDefaults.Key.BG_TODAY_SELECTOR));
				southPanel.setBorder (javax.swing.BorderFactory.createEmptyBorder (3, 3, 3, 3));
				southPanel.add (getTodayLabel (), java.awt.BorderLayout.WEST);
				southPanel.add (getNoneLabel (), java.awt.BorderLayout.EAST);
			}

			return southPanel;
		}

		private JLabel getNoneLabel ()
		{
			if  (noneLabel == null)
			{
				noneLabel = new javax.swing.JLabel ();
				noneLabel.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_TODAY_SELECTOR_ENABLED));
				noneLabel.setHorizontalAlignment (javax.swing.SwingConstants.CENTER);
				noneLabel.addMouseListener (internalController);
				noneLabel.setIcon (getIcons ().getClearIcon ());
			}

			return noneLabel;
		}

		private void updateTodayLabel ()
		{
			Calendar now = Calendar.getInstance ();
			DateFormat df = getFormats ().getFormat (ComponentFormatDefaults.Key.TODAY_SELECTOR);
			todayLabel.setText (getTexts ().getText (ComponentTextDefaults.Key.TODAY) + ": " + df.format (now.getTime ()));
		}

		private JLabel getTodayLabel ()
		{
			if  (todayLabel == null)
			{
				todayLabel = new javax.swing.JLabel ();
				todayLabel.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_TODAY_SELECTOR_ENABLED));
				todayLabel.setHorizontalAlignment (javax.swing.SwingConstants.CENTER);
				todayLabel.addMouseListener (internalController);
				updateTodayLabel ();
			}

			return todayLabel;
		}

		private JPanel getCenterPanel ()
		{
			if  (centerPanel == null)
			{
				centerPanel = new javax.swing.JPanel ();
				centerPanel.setLayout (new java.awt.BorderLayout ());
				centerPanel.setOpaque (false);
				centerPanel.add (getDayTableHeader (), java.awt.BorderLayout.NORTH);
				centerPanel.add (getDayTable (), java.awt.BorderLayout.CENTER);
			}

			return centerPanel;
		}

		private JTable getDayTable ()
		{
			if  (dayTable == null)
			{
				dayTable = new javax.swing.JTable ();
				dayTable.setAutoResizeMode (javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
				dayTable.setModel (internalModel);
				dayTable.setShowGrid (true);
				dayTable.setGridColor (getColors ().getColor (ComponentColorDefaults.Key.BG_GRID));
				dayTable.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
				dayTable.setCellSelectionEnabled (true);
				dayTable.setRowSelectionAllowed (true);
				dayTable.setFocusable (false);
				dayTable.addMouseListener (internalController);

				for  (int i = 0; i < 7; i ++)
				{
					TableColumn column = dayTable.getColumnModel ().getColumn (i);
					column.setCellRenderer (getDayTableCellRenderer ());
				}

				dayTable.addComponentListener (new ComponentListener ()
				{
					public void componentResized (ComponentEvent e)
					{
						final double w = e.getComponent ().getSize ().getWidth ();

						final double h = e.getComponent ().getSize ().getHeight ();

						final float sw =  (float) Math.floor (w / 16);

						final float sh =  (float) Math.floor (h / 8);

						dayTable.setFont (dayTable.getFont ().deriveFont (Math.min (sw, sh)));

						final int r =  (int) Math.floor (h / 6);

						dayTable.setRowHeight (r);
					}

					public void componentMoved (ComponentEvent e)
					{

					}

					public void componentShown (ComponentEvent e)
					{

					}

					public void componentHidden (ComponentEvent e)
					{

					}

				}
				);
			}

			return dayTable;
		}

		private InternalTableCellRenderer getDayTableCellRenderer ()
		{
			if  (dayTableCellRenderer == null)
			{
				dayTableCellRenderer = new InternalTableCellRenderer ();
			}

			return dayTableCellRenderer;
		}

		private JTableHeader getDayTableHeader ()
		{
			if  (dayTableHeader == null)
			{
				dayTableHeader = getDayTable ().getTableHeader ();
				dayTableHeader.setResizingAllowed (false);
				dayTableHeader.setReorderingAllowed (false);
				dayTableHeader.setDefaultRenderer (getDayTableCellRenderer ());
			}

			return dayTableHeader;
		}

		private JPanel getPreviousButtonPanel ()
		{
			if  (previousButtonPanel == null)
			{
				previousButtonPanel = new javax.swing.JPanel ();
				java.awt.GridLayout layout = new java.awt.GridLayout (1, 2);
				layout.setHgap (3);
				previousButtonPanel.setLayout (layout);
				previousButtonPanel.setName ("");
				previousButtonPanel.setOpaque (false);

				if  (isShowYearButtons ())
				{
					previousButtonPanel.add (getPreviousYearButton ());
				}

				previousButtonPanel.add (getPreviousMonthButton ());
			}

			return previousButtonPanel;
		}

		private JPanel getNextButtonPanel ()
		{
			if  (nextButtonPanel == null)
			{
				nextButtonPanel = new javax.swing.JPanel ();
				java.awt.GridLayout layout = new java.awt.GridLayout (1, 2);
				layout.setHgap (3);
				nextButtonPanel.setLayout (layout);
				nextButtonPanel.setName ("");
				nextButtonPanel.setOpaque (false);
				nextButtonPanel.add (getNextMonthButton ());

				if  (isShowYearButtons ())
				{
					nextButtonPanel.add (getNextYearButton ());
				}
			}

			return nextButtonPanel;
		}

		private JButton getNextMonthButton ()
		{
			if  (nextMonthButton == null)
			{
				nextMonthButton = new JButton ();
				nextMonthButton.setIcon (getIcons ().getNextMonthIconEnabled ());
				nextMonthButton.setDisabledIcon (getIcons ().getNextMonthIconDisabled ());
				nextMonthButton.setText ("");
				nextMonthButton.setPreferredSize (new java.awt.Dimension (20, 15));
				nextMonthButton.setBorder (javax.swing.BorderFactory.createBevelBorder (javax.swing.border.BevelBorder.RAISED));
				nextMonthButton.setFocusable (false);
				nextMonthButton.setOpaque (true);
				nextMonthButton.addActionListener (internalController);
				nextMonthButton.setToolTipText (getTexts ().getText (ComponentTextDefaults.Key.MONTH));
			}

			return nextMonthButton;
		}

		private JButton getNextYearButton ()
		{
			if  (nextYearButton == null)
			{
				nextYearButton = new JButton ();
				nextYearButton.setIcon (getIcons ().getNextYearIconEnabled ());
				nextYearButton.setDisabledIcon (getIcons ().getNextYearIconDisabled ());
				nextYearButton.setText ("");
				nextYearButton.setPreferredSize (new java.awt.Dimension (20, 15));
				nextYearButton.setBorder (javax.swing.BorderFactory.createBevelBorder (javax.swing.border.BevelBorder.RAISED));
				nextYearButton.setFocusable (false);
				nextYearButton.setOpaque (true);
				nextYearButton.addActionListener (internalController);
				nextYearButton.setToolTipText (getTexts ().getText (ComponentTextDefaults.Key.YEAR));
			}

			return nextYearButton;
		}

		private JButton getPreviousMonthButton ()
		{
			if  (previousMonthButton == null)
			{
				previousMonthButton = new JButton ();
				previousMonthButton.setIcon (getIcons ().getPreviousMonthIconEnabled ());
				previousMonthButton.setDisabledIcon (getIcons ().getPreviousMonthIconDisabled ());
				previousMonthButton.setText ("");
				previousMonthButton.setPreferredSize (new java.awt.Dimension (20, 15));
				previousMonthButton.setBorder (javax.swing.BorderFactory.createBevelBorder (javax.swing.border.BevelBorder.RAISED));
				previousMonthButton.setFocusable (false);
				previousMonthButton.setOpaque (true);
				previousMonthButton.addActionListener (internalController);
				previousMonthButton.setToolTipText (getTexts ().getText (ComponentTextDefaults.Key.MONTH));
			}

			return previousMonthButton;
		}

		private JButton getPreviousYearButton ()
		{
			if  (previousYearButton == null)
			{
				previousYearButton = new JButton ();
				previousYearButton.setIcon (getIcons ().getPreviousYearIconEnabled ());
				previousYearButton.setDisabledIcon (getIcons ().getPreviousYearIconDisabled ());
				previousYearButton.setText ("");
				previousYearButton.setPreferredSize (new java.awt.Dimension (20, 15));
				previousYearButton.setBorder (javax.swing.BorderFactory.createBevelBorder (javax.swing.border.BevelBorder.RAISED));
				previousYearButton.setFocusable (false);
				previousYearButton.setOpaque (true);
				previousYearButton.addActionListener (internalController);
				previousYearButton.setToolTipText (getTexts ().getText (ComponentTextDefaults.Key.YEAR));
			}

			return previousYearButton;
		}

		private JPopupMenu getMonthPopupMenu ()
		{
			if  (monthPopupMenu == null)
			{
				monthPopupMenu = new javax.swing.JPopupMenu ();
				JMenuItem [] menuItems = getMonthPopupMenuItems ();

				for  (int i = 0; i < menuItems.length; i ++)
				{
					monthPopupMenu.add (menuItems [i]);
				}
			}

			return monthPopupMenu;
		}

		private JMenuItem [] getMonthPopupMenuItems ()
		{
			if  (monthPopupMenuItems == null)
			{
				monthPopupMenuItems = new JMenuItem [12];

				for  (int i = 0; i < 12; i ++)
				{
					JMenuItem mi = new JMenuItem (getTexts ().getText (ComponentTextDefaults.Key.getMonthKey (i)));
					mi.addActionListener (internalController);
					monthPopupMenuItems [i] = mi;
				}
			}

			return monthPopupMenuItems;
		}

		public void setEnabled (boolean enabled)
		{
			dayTable.setEnabled (enabled);
			dayTableCellRenderer.setEnabled (enabled);
			nextMonthButton.setEnabled (enabled);

			if  (nextYearButton != null)
			{
				nextYearButton.setEnabled (enabled);
			}

			previousMonthButton.setEnabled (enabled);

			if  (previousYearButton != null)
			{
				previousYearButton.setEnabled (enabled);
			}

			yearSpinner.setEnabled (enabled);

			if  (enabled)
			{
				todayLabel.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_TODAY_SELECTOR_ENABLED));
			}

			else
			{
				todayLabel.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_TODAY_SELECTOR_DISABLED));
			}

			super.setEnabled (enabled);
		}
	}

	private class InternalTableCellRenderer extends DefaultTableCellRenderer
	{
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
		{
			if  (value == null)
			{
				return super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
			}

			JLabel label =  (JLabel) super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
			label.setHorizontalAlignment (JLabel.CENTER);

			if  (row == -1)
			{
				label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_HEADER));
				label.setBackground (getColors ().getColor (ComponentColorDefaults.Key.BG_GRID_HEADER));
				label.setHorizontalAlignment (JLabel.CENTER);
				
				return label;
			}

			Calendar todayCal = Calendar.getInstance ();
			Calendar selectedCal = Calendar.getInstance ();
			selectedCal.set (internalModel.getModel ().getYear (), internalModel.getModel ().getMonth (), internalModel.getModel ().getDay ());

			int cellDayValue =  (Integer) value;

			int lastDayOfMonth = selectedCal.getActualMaximum (Calendar.DAY_OF_MONTH);

			if  (cellDayValue < 1 || cellDayValue > lastDayOfMonth)
			{
				label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_OTHER_MONTH));
				Calendar calForDay = Calendar.getInstance ();
				calForDay.set (internalModel.getModel ().getYear (), internalModel.getModel ().getMonth (), cellDayValue);
				DateModel <Calendar> modelForDay = new UtilCalendarModel (calForDay);
				label.setBackground (checkConstraints (modelForDay) ? getColors ().getColor (ComponentColorDefaults.Key.BG_GRID) : getColors ().getColor (ComponentColorDefaults.Key.BG_GRID_NOT_SELECTABLE));

				if  (cellDayValue > lastDayOfMonth)
				{
					label.setText (Integer.toString (cellDayValue - lastDayOfMonth));
				}

				else
				{
					Calendar lastMonth = new GregorianCalendar ();
					lastMonth.set (selectedCal.get (Calendar.YEAR), selectedCal.get (Calendar.MONTH) - 1, 1);
					int lastDayLastMonth = lastMonth.getActualMaximum (Calendar.DAY_OF_MONTH);
					label.setText (Integer.toString (lastDayLastMonth + cellDayValue));
				}
			}

			else
			{
				label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_THIS_MONTH));
				Calendar calForDay = Calendar.getInstance ();
				calForDay.set (internalModel.getModel ().getYear (), internalModel.getModel ().getMonth (), cellDayValue);
				DateModel <Calendar> modelForDay = new UtilCalendarModel (calForDay);
				label.setBackground (checkConstraints (modelForDay) ? getColors ().getColor (ComponentColorDefaults.Key.BG_GRID) : getColors ().getColor (ComponentColorDefaults.Key.BG_GRID_NOT_SELECTABLE));

				if  (todayCal.get (Calendar.DATE) == cellDayValue && todayCal.get (Calendar.MONTH) == internalModel.getModel ().getMonth () && todayCal.get (Calendar.YEAR) == internalModel.getModel ().getYear ())
				{
					label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_TODAY));

					if  (internalModel.getModel ().isSelected () && selectedCal.get (Calendar.DATE) == cellDayValue)
					{
						label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_TODAY_SELECTED));
						label.setBackground (getColors ().getColor (ComponentColorDefaults.Key.BG_GRID_TODAY_SELECTED));
					}
				}

				else
				{
					if  (internalModel.getModel ().isSelected () && selectedCal.get (Calendar.DATE) == cellDayValue)
					{
						label.setForeground (getColors ().getColor (ComponentColorDefaults.Key.FG_GRID_SELECTED));
						label.setBackground (getColors ().getColor (ComponentColorDefaults.Key.BG_GRID_SELECTED));
					}
				}
			}

			return label;
		}

	}

	private class InternalController implements ActionListener, MouseListener
	{
		public void actionPerformed (ActionEvent arg0)
		{
			if  (! JDatePanel.this.isEnabled ())
			{
				return;
			}

			if  (arg0.getSource () == internalView.getNextMonthButton ())
			{
				internalModel.getModel ().addMonth (1);
			}

			else if  (arg0.getSource () == internalView.getPreviousMonthButton ())
			{
				internalModel.getModel ().addMonth (-1);
			}

			else if  (arg0.getSource () == internalView.getNextYearButton ())
			{
				internalModel.getModel ().addYear (1);
			}

			else if  (arg0.getSource () == internalView.getPreviousYearButton ())
			{
				internalModel.getModel ().addYear (-1);
			}

			else
			{
				for  (int month = 0; month < internalView.getMonthPopupMenuItems ().length; month ++)
				{
					if  (arg0.getSource () == internalView.getMonthPopupMenuItems () [month])
					{
						internalModel.getModel ().setMonth (month);
					}
				}
			}
		}

		public void mousePressed (MouseEvent arg0)
		{
			if  (! JDatePanel.this.isEnabled ())
			{
				return;
			}

			if  (arg0.getSource () == internalView.getMonthLabel ())
			{
				internalView.getMonthPopupMenu ().setLightWeightPopupEnabled (false);
				internalView.getMonthPopupMenu ().show ((Component) arg0.getSource (), arg0.getX (), arg0.getY ());
			}

			else if  (arg0.getSource () == internalView.getTodayLabel ())
			{
				Calendar today = Calendar.getInstance ();
				internalModel.getModel ().setDate (today.get (Calendar.YEAR), today.get (Calendar.MONTH), today.get (Calendar.DATE));
			}

			else if  (arg0.getSource () == internalView.getDayTable ())
			{
				int row = internalView.getDayTable ().getSelectedRow ();
				int col = internalView.getDayTable ().getSelectedColumn ();

				if  (row >= 0 && row <= 5)
				{
					Integer date =  (Integer) internalModel.getValueAt (row, col);

					int oldDay = internalModel.getModel ().getDay ();

					internalModel.getModel ().setDay (date);

					if  (! checkConstraints (internalModel.getModel ()))
					{
						internalModel.getModel ().setDay (oldDay);

						return;
					}

					internalModel.getModel ().setSelected (true);

					if  (doubleClickAction && arg0.getClickCount () == 2)
					{
						fireActionPerformed ();
					}

					if  (! doubleClickAction)
					{
						fireActionPerformed ();
					}
				}
			}

			else if  (arg0.getSource () == internalView.getNoneLabel ())
			{
				internalModel.getModel ().setSelected (false);

				if  (doubleClickAction && arg0.getClickCount () == 2)
				{
					fireActionPerformed ();
				}

				if  (! doubleClickAction)
				{
					fireActionPerformed ();
				}
			}
		}

		public void mouseClicked (MouseEvent arg0)
		{

		}

		public void mouseEntered (MouseEvent arg0)
		{

		}

		public void mouseExited (MouseEvent arg0)
		{

		}

		public void mouseReleased (MouseEvent arg0)
		{

		}

	}

	protected class InternalCalendarModel implements TableModel, SpinnerModel, ChangeListener
	{
		private DateModel <?> model;

		private Set <ChangeListener> spinnerChangeListeners;

		private Set <TableModelListener> tableModelListeners;

		public InternalCalendarModel (DateModel <?> model)
		{
			this.spinnerChangeListeners = new HashSet <ChangeListener> ();
			this.tableModelListeners = new HashSet <TableModelListener> ();
			this.model = model;
			model.addChangeListener (this);
		}

		public DateModel <?> getModel ()
		{
			return model;
		}

		public void addChangeListener (ChangeListener arg0)
		{
			spinnerChangeListeners.add (arg0);
		}

		public void removeChangeListener (ChangeListener arg0)
		{
			spinnerChangeListeners.remove (arg0);
		}

		public Object getNextValue ()
		{
			return Integer.toString (model.getYear () + 1);
		}

		public Object getPreviousValue ()
		{
			return Integer.toString (model.getYear () - 1);
		}

		public void setValue (Object text)
		{
			String year =  (String) text;
			model.setYear (Integer.parseInt (year));
		}

		public Object getValue ()
		{
			return Integer.toString (model.getYear ());
		}

		public void addTableModelListener (TableModelListener arg0)
		{
			tableModelListeners.add (arg0);
		}

		public void removeTableModelListener (TableModelListener arg0)
		{
			tableModelListeners.remove (arg0);
		}

		public int getColumnCount ()
		{
			return 7;
		}

		public int getRowCount ()
		{
			return 6;
		}

		public String getColumnName (int columnIndex)
		{
			ComponentTextDefaults.Key key = ComponentTextDefaults.Key.getDowKey (( (firstDayOfWeek - 1) + columnIndex) % 7);

			return getTexts ().getText (key);
		}

		private int [] lookup = null;

		private int [] lookup ()
		{
			if  (lookup == null)
			{
				lookup = new int [8];
				lookup [(firstDayOfWeek - 1) % 7] = 0;
				lookup [(firstDayOfWeek + 0) % 7] = 1;
				lookup [(firstDayOfWeek + 1) % 7] = 2;
				lookup [(firstDayOfWeek + 2) % 7] = 3;
				lookup [(firstDayOfWeek + 3) % 7] = 4;
				lookup [(firstDayOfWeek + 4) % 7] = 5;
				lookup [(firstDayOfWeek + 5) % 7] = 6;
			}

			return lookup;
		}

		public Object getValueAt (int rowIndex, int columnIndex)
		{
			int series = columnIndex + rowIndex * 7 + 1;

			Calendar firstOfMonth = Calendar.getInstance ();
			firstOfMonth.set (model.getYear (), model.getMonth (), 1);

			int dowForFirst = firstOfMonth.get (Calendar.DAY_OF_WEEK);

			int daysBefore = lookup () [dowForFirst - 1];

			return series - daysBefore;
		}

		@SuppressWarnings ({ "unchecked", "rawtypes" })
		
		public Class getColumnClass (int arg0)
		{
			return Integer.class;
		}

		public boolean isCellEditable (int arg0, int arg1)
		{
			return false;
		}

		public void setValueAt (Object arg0, int arg1, int arg2)
		{

		}

		private void fireValueChanged ()
		{
			for  (ChangeListener cl : spinnerChangeListeners)
			{
				cl.stateChanged (new ChangeEvent (this));
			}

			internalView.updateMonthLabel ();

			for  (TableModelListener tl : tableModelListeners)
			{
				tl.tableChanged (new TableModelEvent (this));
			}
		}

		public void stateChanged (ChangeEvent e)
		{
			fireValueChanged ();
		}
	}
}