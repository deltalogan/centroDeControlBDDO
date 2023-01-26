package centroDeControlBDDO;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

final class a implements DocumentListener {
	private /* synthetic */ AutoCompleter a;

	a(final AutoCompleter a) {
		this.a = a;
	}

	@Override
	public final void insertUpdate(final DocumentEvent documentEvent) {
		AutoCompleter.c(this.a);
	}

	@Override
	public final void removeUpdate(final DocumentEvent documentEvent) {
		AutoCompleter.c(this.a);
	}

	@Override
	public final void changedUpdate(final DocumentEvent documentEvent) {
	}
}