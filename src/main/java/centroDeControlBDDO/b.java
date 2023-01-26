package centroDeControlBDDO;

import javax.swing.KeyStroke;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

final class b implements PopupMenuListener {
	private /* synthetic */ AutoCompleter a;

	b(final AutoCompleter a) {
		this.a = a;
	}

	@Override
	public final void popupMenuWillBecomeVisible(final PopupMenuEvent popupMenuEvent) {
	}

	@Override
	public final void popupMenuWillBecomeInvisible(final PopupMenuEvent popupMenuEvent) {
		this.a.c.unregisterKeyboardAction(KeyStroke.getKeyStroke(10, 0));
		this.a.c.transferFocus();
	}

	@Override
	public final void popupMenuCanceled(final PopupMenuEvent popupMenuEvent) {
	}
}