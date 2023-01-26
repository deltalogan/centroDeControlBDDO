package centroDeControlBDDO;

import java.awt.Cursor;

import java.awt.Dimension;

import java.awt.Frame;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.Insets;

import java.awt.Toolkit;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JDialog;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextField;

import javax.swing.SwingUtilities;

import javax.swing.border.TitledBorder;

public class AMCompanySubsidiary extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMCompanySubsidiary = null;

	private JLabel jLabelDescription = null;

	private JTextField jTextFieldDescription = null;

	private JLabel jLabelNumeroDeAR = null;

	private JTextField jTextFieldNumeroDeAR = null;

	private JLabel jLabelTradeName = null;

	private JComboBox <String> jComboBoxTradeName = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;
	
	public AMCompanySubsidiary (Frame owner, String titulo, String idCompanySubsidiary, String description, String tradeName, String numeroDeAR)
	{
		super (owner);
		initialize (titulo, idCompanySubsidiary, description, tradeName, numeroDeAR);
	}
	
	private void initialize (String titulo, String idCompanySubsidiary, String description, String tradeName, String numeroDeAR)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMCompanySubsidiary ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMCompanySubsidiary (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMCompanySubsidiary ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "Company", "TradeName", null);
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJButtonAceptar ().setToolTipText (idCompanySubsidiary);
			getJTextFieldDescription ().setText (description);
			getJComboBoxTradeName ().setSelectedItem (tradeName);
			getJTextFieldNumeroDeAR ().setText (numeroDeAR);
		}
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelAMCompanySubsidiary ()
	{
		if (jPanelAMCompanySubsidiary == null)
		{
			jPanelAMCompanySubsidiary = new JPanel ();
			GridBagLayout gbl_jPanelAMCompanySubsidiary = new GridBagLayout ();
			gbl_jPanelAMCompanySubsidiary.columnWidths = new int [] {871, 0};
			gbl_jPanelAMCompanySubsidiary.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMCompanySubsidiary.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMCompanySubsidiary.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMCompanySubsidiary.setLayout (gbl_jPanelAMCompanySubsidiary);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMCompanySubsidiary.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMCompanySubsidiary.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMCompanySubsidiary;
	}
	
	private JTextField getJTextFieldDescription ()
	{
		if (jTextFieldDescription == null)
		{
			jTextFieldDescription = new JTextField ();
		}
		
		return jTextFieldDescription;
	}
	
	private JTextField getJTextFieldNumeroDeAR ()
	{
		if (jTextFieldNumeroDeAR == null)
		{
			jTextFieldNumeroDeAR = new JTextField ();
		}
		
		return jTextFieldNumeroDeAR;
	}
	
	private JComboBox <String> getJComboBoxTradeName ()
	{
		if (jComboBoxTradeName == null)
		{
			jComboBoxTradeName = new JComboBox <String> ();
		}
		
		return jComboBoxTradeName;
	}
	
	private JButton getJButtonAceptar ()
	{
		if (jButtonAceptar == null)
		{
			jButtonAceptar = new JButton ();
			jButtonAceptar.setText ("Aceptar");
			jButtonAceptar.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (! getJTextFieldDescription ().getText ().toString ().isEmpty ())
					{
						Runnable runnable = new Runnable ()
						{
							public void run ()
							{
								getJButtonAceptar ().setEnabled (false);
								setEnabled (false);
								setCursor (new Cursor (Cursor.WAIT_CURSOR));
															
								Cargando cargando = new Cargando ();
								
								String idCompanySubsidiaryByTradeName = Utilidades.devolverAtributoClave ("CompanySubsidiary, Company", "IdCompanySubsidiary", "CompanySubsidiary.IdCompany = Company.IdCompany AND Description = '" + getJTextFieldDescription ().getText ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String idCompanySubsidiary = (getJButtonAceptar ().getToolTipText () == null ? "0" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();
								
								String idCompany = Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String numeroDeAR = (getJTextFieldNumeroDeAR ().getText ().toString ().isEmpty () ? "0" : getJTextFieldNumeroDeAR ().getText ().toString ()).toString ();

								if (getTitle ().toString ().equals ("Agregar")
								?
								idCompanySubsidiaryByTradeName.equals ("0")
								:
								idCompanySubsidiary.equals (idCompanySubsidiaryByTradeName)
								?
								! idCompanySubsidiaryByTradeName.equals ("0")
								:
								idCompanySubsidiaryByTradeName.equals ("0")
								)					
								{
									if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
									{
										if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO CompanySubsidiary (Description, IdCompany, IdAr) VALUES ('" + getJTextFieldDescription ().getText ().toString () + "', " + idCompany + ", " + numeroDeAR + ")" : "UPDATE CompanySubsidiary SET Description = '" + getJTextFieldDescription ().getText ().toString () + "', IdCompany = " + idCompany + ", IdAr = " + numeroDeAR + " WHERE IdCompanySubsidiary = " + idCompanySubsidiary))
										{
											Utilidades.finalizarTransaccionALaBaseDeDatos ();
											JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);
												
											if (getTitle ().toString ().equals ("Agregar"))
											{
												getJTextFieldDescription ().setText ("");
												getJTextFieldDescription ().requestFocus ();
											}
												
											else

												dispose ();
										}
												
										else

											JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "No se pudieron agregar los datos." : "No se pudieron actualizar los datos.", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);

										Utilidades.finalizarConexionALaBaseDeDatos ();						
									}
								}
									
								else

									JOptionPane.showMessageDialog (null, "La sucursal ya est\u00e1 asignada a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString () , JOptionPane.ERROR_MESSAGE);

								getJButtonAceptar ().setEnabled (true);
								setEnabled (true);
								setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
								cargando.dispose ();
							}
						};

						if (SwingUtilities.isEventDispatchThread ())

							new Thread (runnable).start ();

						else

							SwingUtilities.invokeLater (runnable);						
					}
					
					else
						
						JOptionPane.showMessageDialog (null, "El campo Description es requerido.", getTitle ().toString () , JOptionPane.ERROR_MESSAGE);
				}
			}
			);
		}
		
		return jButtonAceptar;
	}
	
	private JButton getJButtonCancelar ()
	{
		if (jButtonCancelar == null)
		{
			jButtonCancelar = new JButton ();
			jButtonCancelar.setText ("Cancelar");
			jButtonCancelar.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					dispose ();
				}
			}
			);
		}
		
		return jButtonCancelar;
	}
	
	private JPanel getJPanelAtributos ()
	{
		if (jPanelAtributos == null)
		{
			jPanelAtributos = new JPanel ();
			GridBagLayout gbl_jPanelAtributos = new GridBagLayout ();
			gbl_jPanelAtributos.columnWidths = new int [] {96, 440, 72, 31, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			jLabelDescription = new JLabel ();
			GridBagConstraints gbc_jLabelDescription = new GridBagConstraints ();
			gbc_jLabelDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelDescription.gridx = 0;
			gbc_jLabelDescription.gridy = 0;
			jPanelAtributos.add (jLabelDescription, gbc_jLabelDescription);
			jLabelDescription.setText ("<html>Description (<font color = 'red'>*</font>):</html>");
			GridBagConstraints gbc_jTextFieldDescription = new GridBagConstraints ();
			gbc_jTextFieldDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldDescription.gridx = 1;
			gbc_jTextFieldDescription.gridy = 0;
			jPanelAtributos.add (getJTextFieldDescription (), gbc_jTextFieldDescription);
			jLabelTradeName = new JLabel ();
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeName.gridx = 2;
			gbc_jLabelTradeName.gridy = 0;
			jPanelAtributos.add (jLabelTradeName, gbc_jLabelTradeName);
			jLabelTradeName.setText ("TradeName:");
			GridBagConstraints gbc_jComboBoxTradeName = new GridBagConstraints ();
			gbc_jComboBoxTradeName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTradeName.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxTradeName.gridx = 3;
			gbc_jComboBoxTradeName.gridy = 0;
			jPanelAtributos.add (getJComboBoxTradeName (), gbc_jComboBoxTradeName);
			jLabelNumeroDeAR = new JLabel ();
			GridBagConstraints gbc_jLabelNumeroDeAR = new GridBagConstraints ();
			gbc_jLabelNumeroDeAR.anchor = GridBagConstraints.EAST;
			gbc_jLabelNumeroDeAR.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelNumeroDeAR.gridx = 0;
			gbc_jLabelNumeroDeAR.gridy = 1;
			jPanelAtributos.add (jLabelNumeroDeAR, gbc_jLabelNumeroDeAR);
			jLabelNumeroDeAR.setText ("N\u00FAmero de A.R.:");
			GridBagConstraints gbc_jTextFieldNumeroDeAR = new GridBagConstraints ();
			gbc_jTextFieldNumeroDeAR.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldNumeroDeAR.insets = new Insets (0, 0, 0, 5);
			gbc_jTextFieldNumeroDeAR.gridx = 1;
			gbc_jTextFieldNumeroDeAR.gridy = 1;
			jPanelAtributos.add (getJTextFieldNumeroDeAR (), gbc_jTextFieldNumeroDeAR);
		}
		
		return jPanelAtributos;
	}
	
	private JPanel getJPanelAC ()
	{
		if (jPanelAC == null)
		{
			jPanelAC = new JPanel ();
			jPanelAC.setBorder (BorderFactory.createTitledBorder (null, "AC", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			GridBagLayout gbl_jPanelAC = new GridBagLayout ();
			gbl_jPanelAC.columnWidths = new int [] {71, 75, 0};
			gbl_jPanelAC.rowHeights = new int [] {23, 0};
			gbl_jPanelAC.columnWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAC.rowWeights = new double [] {0.0, Double.MIN_VALUE};
			jPanelAC.setLayout (gbl_jPanelAC);
			GridBagConstraints gbc_jButtonAceptar = new GridBagConstraints ();
			gbc_jButtonAceptar.anchor = GridBagConstraints.SOUTHWEST;
			gbc_jButtonAceptar.gridx = 0;
			gbc_jButtonAceptar.gridy = 0;
			jPanelAC.add (getJButtonAceptar (), gbc_jButtonAceptar);
			GridBagConstraints gbc_jButtonCancelar = new GridBagConstraints ();
			gbc_jButtonCancelar.anchor = GridBagConstraints.SOUTHEAST;
			gbc_jButtonCancelar.gridx = 1;
			gbc_jButtonCancelar.gridy = 0;
			jPanelAC.add (getJButtonCancelar (), gbc_jButtonCancelar);
		}
		
		return jPanelAC;
	}
	
	private JScrollPane getJScrollPaneAtributos ()
	{
		if (jScrollPaneAtributos == null)
		{
			jScrollPaneAtributos = new JScrollPane ();
			jScrollPaneAtributos.setViewportBorder (BorderFactory.createTitledBorder (null, "Atributos", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneAtributos.setViewportView (getJPanelAtributos ());
		}
		
		return jScrollPaneAtributos;
	}
}