package centroDeControlBDDO;

import java.util.Comparator;

final class d implements Comparator<Object> {
	d(final AutoCompleter autoCompleter) {
	}

	@Override
	public final int compare(final Object o, final Object o2) {
		return o.toString().compareTo(o2.toString());
	}
}