package centroDeControlBDDO;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

final class c implements MouseListener {
	private /* synthetic */ AutoCompleter a;

	c(final AutoCompleter a) {
		this.a = a;
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseEvent) {
		final int selectedIndex;
		if ((selectedIndex = this.a.a.getSelectedIndex()) >= 0) {
			this.a.a.getModel().getElementAt(selectedIndex);
			this.a.acceptedListItem(this.a.a.getModel().getElementAt(selectedIndex).toString());
			this.a.b.setVisible(false);
		}
	}

	@Override
	public final void mousePressed(final MouseEvent mouseEvent) {
	}

	@Override
	public final void mouseReleased(final MouseEvent mouseEvent) {
	}

	@Override
	public final void mouseEntered(final MouseEvent mouseEvent) {
	}

	@Override
	public final void mouseExited(final MouseEvent mouseEvent) {
	}
}