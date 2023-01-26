package centroDeControlBDDO;

import org.jdatepicker.DateModel;

public interface DateSelectionConstraint
{
	boolean isValidSelection (DateModel <?> model);
}