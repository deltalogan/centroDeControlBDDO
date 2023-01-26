package centroDeControlBDDO;

import javax.swing.JPanel;

import java.awt.Toolkit;

import javax.swing.JDialog;

import java.awt.GridBagLayout;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.border.TitledBorder;

import javax.swing.JLabel;

import java.awt.Cursor;
import java.awt.GridBagConstraints;

public class Cargando extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelCargando = null;
	
	private JLabel jLabelCargando = null;
	
	public Cargando ()
	{
		super ();
		initialize ();
	}
	
	private void initialize ()
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());				
		this.setSize (180, 180);
		this.setModalExclusionType (ModalExclusionType.TOOLKIT_EXCLUDE);
		//this.setModalityType (ModalityType.MODELESS);
		this.setContentPane (getJPanelCargando ());
		this.setResizable (false);
		this.setTitle ("Cargando...");		
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		this.setUndecorated (true);
		this.getJPanelCargando ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		this.getJLabelCargando ().setIcon (new ImageIcon (getClass ().getResource ("/Cargando.gif")));
		this.setCursor (new Cursor (Cursor.WAIT_CURSOR));
		this.setVisible (true);
	}
	
	private JPanel getJPanelCargando ()
	{
		if (jPanelCargando == null)
		{
			jPanelCargando = new JPanel ();
			GridBagLayout gbl_jPanelCargando = new GridBagLayout ();
			gbl_jPanelCargando.columnWidths = new int [] {59, 0};
			gbl_jPanelCargando.rowHeights = new int [] {14, 0};
			gbl_jPanelCargando.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelCargando.rowWeights = new double [] {1.0, Double.MIN_VALUE};
			jPanelCargando.setLayout (gbl_jPanelCargando);
			GridBagConstraints gbc_jLabelCargando = new GridBagConstraints ();
			gbc_jLabelCargando.gridx = 0;
			gbc_jLabelCargando.gridy = 0;
			jPanelCargando.add (getJLabelCargando (), gbc_jLabelCargando);
		}
		
		return jPanelCargando;
	}
	
	private JLabel getJLabelCargando ()
	{
		if (jLabelCargando == null)
		{
			jLabelCargando = new JLabel ("");
		}
		
		return jLabelCargando;
	}
}