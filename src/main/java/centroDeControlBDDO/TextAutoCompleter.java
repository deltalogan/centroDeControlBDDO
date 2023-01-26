package centroDeControlBDDO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.text.JTextComponent;

public class TextAutoCompleter extends AutoCompleter {
	private int a;
	private boolean b;
	private Object c;
	private AutoCompleterCallback d;
	private boolean e;

	public TextAutoCompleter(final JTextComponent textComponent) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(new Object[0], this.a, this.b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(new Object[0], this.a, this.b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, this.a, this.b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list,
			final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, this.a, this.b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list, final int n) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, n, this.b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list, final int n,
			final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, n, this.b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list, final int n,
			final boolean b) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, n, b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final ArrayList<Object> list, final int n,
			final boolean b, final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(list, n, b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, this.a, this.b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array,
			final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, this.a, this.b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array, final int n) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, n, this.b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array, final int n,
			final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, n, this.b, autoCompleterCallback);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array, final int n, final boolean b) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, n, b, this.d);
	}

	public TextAutoCompleter(final JTextComponent textComponent, final Object[] array, final int n, final boolean b,
			final AutoCompleterCallback autoCompleterCallback) {
		super(textComponent);
		this.a = -1;
		this.b = false;
		this.c = null;
		this.d = null;
		this.e = false;
		this.a(array, n, b, autoCompleterCallback);
	}

	private void a(final ArrayList<Object> items, final int a, final boolean b, final AutoCompleterCallback d) {
		if (items == null) {
			this.setItems(new Object[0]);
		} else {
			this.setItems(items);
		}
		this.a = a;
		this.b = b;
		this.d = d;
	}

	private void a(final Object[] items, final int a, final boolean b, final AutoCompleterCallback d) {
		if (items == null) {
			this.setItems(new Object[0]);
		} else {
			this.setItems(items);
		}
		this.a = a;
		this.b = b;
		this.d = d;
	}

	public void addItem(final Object e) {
		this.items.add(e);
	}

	public void addItems(final ArrayList<Object> c) {
		this.items.addAll(c);
	}

	public void addItems(final Object[] a) {
		this.items.addAll(Arrays.asList(a));
	}

	public boolean removeItem(final Object o) {
		return this.items.remove(o);
	}

	public boolean removeItemByValue(final String anObject) {
		boolean b = false;
		final Iterator<Object> iterator = this.items.iterator();
		while (iterator.hasNext()) {
			final Object next;
			if ((next = iterator.next()).toString().equals(anObject)) {
				this.items.remove(next);
				b = true;
				break;
			}
		}
		return b;
	}

	public boolean removeItemByValueIgnoreCase(final String anotherString) {
		boolean b = false;
		final Iterator<Object> iterator = this.items.iterator();
		while (iterator.hasNext()) {
			final Object next;
			if ((next = iterator.next()).toString().equalsIgnoreCase(anotherString)) {
				this.items.remove(next);
				b = true;
				break;
			}
		}
		return b;
	}

	public void removeAllItems() {
		this.items.clear();
	}

	public boolean itemExists(final Object o) {
		return this.items.contains(o);
	}

	public boolean itemExists(final String s) {
		for (final Object next : this.items) {
			if (this.isCaseSensitive()) {
				if (next.toString().equals(s)) {
					return true;
				}
				continue;
			} else {
				if (next.toString().equalsIgnoreCase(s)) {
					return true;
				}
				continue;
			}
		}
		return false;
	}

	public int getMode() {
		return this.a;
	}

	public void setMode(final int a) {
		this.a = a;
	}

	public boolean isCaseSensitive() {
		return this.b;
	}

	public void setCaseSensitive(final boolean b) {
		this.b = b;
	}

	public boolean isClearOnIncorrect() {
		return this.e;
	}

	public void setClearOnIncorrect(final boolean e) {
		this.e = e;
	}

	public Object getItemSelected() {
		if (this.c != null) {
			return this.c;
		}
		return this.findItem(this.getTextComponent().getText());
	}

	public Object findItem(final String s) {
		Object o = null;
		for (final Object next : this.items) {
			Label_0061: {
				if (this.isCaseSensitive()) {
					if (next.toString().equals(s)) {
						break Label_0061;
					}
					continue;
				} else {
					if (next.toString().equalsIgnoreCase(s)) {
						break Label_0061;
					}
					continue;
				}
				// continue;
			}
			o = next;
			break;
		}
		return o;
	}

	@Deprecated
	public Object findItem(final Object o) {
		if (this.items.contains(o)) {
			return o;
		}
		return null;
	}

	@Override
	protected void acceptedListItem(final Object c) {
		if (c == null) {
			return;
		}
		if (this.d != null) {
			this.d.callback(c);
		}
		this.c = c;
		this.getTextComponent().setText(c.toString());
	}

	@Override
	protected void lostFocusAction() {
	}

	@SuppressWarnings("unchecked")
	@Override
	protected boolean updateListData() {
		final String text;
		if ((text = this.getTextComponent().getText()).isEmpty()) {
			this.getList().setListData(new Object[0]);
			return false;
		}
		if (this.c != null && this.c.toString().equalsIgnoreCase(text)) {
			this.getList().setListData(new Object[0]);
			return false;
		}
		final String anotherString = this.isCaseSensitive() ? text : text.toLowerCase();
		final ArrayList<Object> list = new ArrayList<Object>();
		for (final Object next : this.items) {
			final String s = this.isCaseSensitive() ? next.toString() : next.toString().toLowerCase();
			switch (this.getMode()) {
			case -1: {
				if (s.startsWith(anotherString)) {
					list.add(next);
					continue;
				}
				continue;
			}
			case 0: {
				if (s.contains(anotherString)) {
					list.add(next);
					continue;
				}
				continue;
			}
			case 1: {
				if (s.endsWith(anotherString)) {
					list.add(next);
					continue;
				}
				continue;
			}
			}
		}
		Label_0280: {
			if (list.size() > 0) {
				if (list.size() == 1) {
					if (this.isCaseSensitive()) {
						if (list.get(0).toString().equals(anotherString)) {
							break Label_0280;
						}
					} else if (list.get(0).toString().equalsIgnoreCase(anotherString)) {
						break Label_0280;
					}
				}
				this.getList().setListData(list.toArray());
				return true;
			}
		}
		this.getList().setListData(new Object[0]);
		return true;
	}
}