package centroDeControlBDDO;

import org.jdatepicker.constraints.DateSelectionConstraint;

import java.awt.event.ActionListener;

import java.util.Set;

public interface DateComponent
{
	DateModel <?> getModel ();

	void addActionListener (ActionListener actionListener);

	void removeActionListener (ActionListener actionListener);

	void addDateSelectionConstraint (DateSelectionConstraint constraint);

	void removeDateSelectionConstraint (DateSelectionConstraint constraint);

	void removeAllDateSelectionConstraints ();

	Set <DateSelectionConstraint> getDateSelectionConstraints ();
}