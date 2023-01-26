package centroDeControlBDDO;

public interface DatePanel extends DateComponent
{
	void setShowYearButtons (boolean showYearButtons);

	boolean isShowYearButtons ();

	void setDoubleClickAction (boolean doubleClickAction);

	boolean isDoubleClickAction ();
}