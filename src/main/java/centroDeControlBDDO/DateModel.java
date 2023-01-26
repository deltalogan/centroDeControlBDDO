package centroDeControlBDDO;

import javax.swing.event.ChangeListener;

import java.beans.PropertyChangeListener;

public interface DateModel <T>
{
	void addChangeListener (ChangeListener changeListener);

	void removeChangeListener (ChangeListener changeListener);

	int getYear ();

	void setYear (int year);

	int getMonth ();

	void setMonth (int month);

	int getDay ();

	void setDay (int day);

	void setDate (int year, int month, int day);

	void addYear (int add);

	void addMonth (int add);

	void addDay (int add);

	T getValue ();

	void setValue (T value);

	boolean isSelected ();

	void setSelected (boolean selected);

	void addPropertyChangeListener (PropertyChangeListener listener);

	void removePropertyChangeListener (PropertyChangeListener listener);
}