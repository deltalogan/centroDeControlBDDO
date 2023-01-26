package centroDeControlBDDO;

public interface DatePicker extends DatePanel
{
	void setTextEditable (boolean editable);

	boolean isTextEditable ();

	void setButtonFocusable (boolean focusable);

	boolean getButtonFocusable ();

	int getTextfieldColumns ();

	void setTextfieldColumns (int columns);
}