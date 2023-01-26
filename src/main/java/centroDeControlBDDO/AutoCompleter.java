package centroDeControlBDDO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

public abstract class AutoCompleter {
	JList<?> a;
	protected ArrayList<Object> items;
	JPopupMenu b;
	JTextComponent c;
	public static final String AUTOCOMPLETER = "AUTOCOMPLETER";
	private static Action d;
	private DocumentListener e;
	private static Action f;
	private static Action g;
	private static Action h;

	protected abstract void acceptedListItem(final Object p0);

	protected abstract boolean updateListData();

	protected abstract void lostFocusAction();

	@SuppressWarnings("rawtypes")
	public AutoCompleter(final JTextComponent c) {
		this.a = new JList();
		this.b = new JPopupMenu();
		this.e = new a(this);
		(this.c = c).putClientProperty("AUTOCOMPLETER", this);
		final JScrollPane comp;
		(comp = new JScrollPane(this.a)).setBorder(null);
		this.a.setFocusable(false);
		comp.getVerticalScrollBar().setFocusable(false);
		comp.getHorizontalScrollBar().setFocusable(false);
		this.b.setBorder(BorderFactory.createLineBorder(Color.black));
		this.b.add(comp);
		if (this.c instanceof JTextField) {
			this.c.registerKeyboardAction(AutoCompleter.f, KeyStroke.getKeyStroke(40, 0), 0);
			this.c.getDocument().addDocumentListener(this.e);
		} else {
			this.c.registerKeyboardAction(AutoCompleter.f, KeyStroke.getKeyStroke(32, 2), 0);
		}
		this.c.registerKeyboardAction(AutoCompleter.g, KeyStroke.getKeyStroke(38, 0), 0);
		this.c.registerKeyboardAction(AutoCompleter.h, KeyStroke.getKeyStroke(27, 0), 0);
		this.b.addPopupMenuListener(new b(this));
		this.a.setRequestFocusEnabled(false);
		this.a.addMouseListener(new c(this));
	}

	protected void selectNextPossibleValue() {
		final int selectedIndex;
		if ((selectedIndex = this.a.getSelectedIndex()) < this.a.getModel().getSize() - 1) {
			this.a.setSelectedIndex(selectedIndex + 1);
			this.a.ensureIndexIsVisible(selectedIndex + 1);
		}
	}

	protected void selectPreviousPossibleValue() {
		final int selectedIndex;
		if ((selectedIndex = this.a.getSelectedIndex()) > 0) {
			this.a.setSelectedIndex(selectedIndex - 1);
			this.a.ensureIndexIsVisible(selectedIndex - 1);
		}
	}

	public Object[] getItems() {
		return this.items.toArray();
	}

	public void setItems(final Object[] a) {
		this.items = new ArrayList<Object>(Arrays.asList(a));
	}

	public void setItems(final ArrayList<Object> items) {
		this.items = items;
	}

	protected JTextComponent getTextComponent() {
		return this.c;
	}

	@SuppressWarnings("rawtypes")
	protected JList getList() {
		return this.a;
	}

	protected JPopupMenu getPopup() {
		return this.b;
	}

	static /* synthetic */ void c(AutoCompleter autoCompleter) {
		Collections.sort((autoCompleter/* = autoCompleter */).items, new d(autoCompleter));
		autoCompleter.b.setVisible(false);
		if (autoCompleter.c.isEnabled() && autoCompleter.updateListData()
				&& autoCompleter.a.getModel().getSize() != 0) {
			if (!(autoCompleter.c instanceof JTextField)) {
				autoCompleter.c.getDocument().addDocumentListener(autoCompleter.e);
			}
			autoCompleter.c.registerKeyboardAction(AutoCompleter.d, KeyStroke.getKeyStroke(10, 0), 0);
			final int size = autoCompleter.a.getModel().getSize();
			autoCompleter.a.setVisibleRowCount((size < 10) ? size : 10);
			autoCompleter.a.setSelectedIndex(0);
			autoCompleter.b.show(autoCompleter.c, 0, autoCompleter.c.getHeight());
		} else {
			autoCompleter.b.setVisible(false);
		}
		autoCompleter.c.requestFocus();
	}

	static {
		AutoCompleter.d = new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public final void actionPerformed(final ActionEvent actionEvent) {
				final AutoCompleter autoCompleter;
				(autoCompleter = (AutoCompleter) ((JComponent) actionEvent.getSource())
						.getClientProperty("AUTOCOMPLETER")).b.setVisible(false);
				autoCompleter.acceptedListItem(autoCompleter.a.getSelectedValue());
			}
		};
		AutoCompleter.f = new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public final void actionPerformed(final ActionEvent actionEvent) {
				final JComponent component;
				final AutoCompleter autoCompleter = (AutoCompleter) (component = (JComponent) actionEvent.getSource())
						.getClientProperty("AUTOCOMPLETER");
				if (component.isEnabled()) {
					if (autoCompleter.b.isVisible()) {
						autoCompleter.selectNextPossibleValue();
						return;
					}
					AutoCompleter.c(autoCompleter);
				}
			}
		};
		AutoCompleter.g = new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public final void actionPerformed(final ActionEvent actionEvent) {
				final JComponent component;
				final AutoCompleter autoCompleter = (AutoCompleter) (component = (JComponent) actionEvent.getSource())
						.getClientProperty("AUTOCOMPLETER");
				if (component.isEnabled() && autoCompleter.b.isVisible()) {
					autoCompleter.selectPreviousPossibleValue();
				}
			}
		};
		AutoCompleter.h = new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public final void actionPerformed(final ActionEvent actionEvent) {
				final JComponent component;
				final AutoCompleter autoCompleter = (AutoCompleter) (component = (JComponent) actionEvent.getSource())
						.getClientProperty("AUTOCOMPLETER");
				if (component.isEnabled()) {
					autoCompleter.b.setVisible(false);
				}
			}
		};
	}
}