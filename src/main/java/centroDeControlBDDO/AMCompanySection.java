package centroDeControlBDDO;

import java.awt.Cursor;

import java.awt.Dimension;

import java.awt.Frame;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.Insets;

import java.awt.Toolkit;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

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

public class AMCompanySection extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMCompanySection = null;

	private JLabel jLabelCompanySectionDescription = null;

	private JTextField jTextFieldCompanySectionDescription = null;
	
	private JLabel jLabelCompanySubsidiaryDescription = null;
	
	private JComboBox <String> jComboBoxCompanySubsidiaryDescription = null;

	private JLabel jLabelCuit = null;

	private JTextField jTextFieldCuit = null;

	private JLabel jLabelTradeName = null;

	private JComboBox <String> jComboBoxTradeName = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;

	public AMCompanySection (Frame owner, String titulo, String idCompanySection, String companySectionDescription, String companySubsidiaryDescription, String tradeName, String cuit)
	{
		super (owner);
		initialize (titulo, idCompanySection, companySectionDescription, companySubsidiaryDescription, tradeName, cuit);
	}
	
	private void initialize (String titulo, String idCompanySection, String companySectionDescription, String companySubsidiaryDescription, String tradeName, String cuit)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMCompanySection ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMCompanySection (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMCompanySection ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany");
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJButtonAceptar ().setToolTipText (idCompanySection);
			getJTextFieldCompanySectionDescription ().setText (companySectionDescription);
			getJComboBoxTradeName ().setSelectedItem (tradeName);
			getJComboBoxCompanySubsidiaryDescription ().setSelectedItem (companySubsidiaryDescription);
			getJTextFieldCuit ().setText (cuit);
		}

		this.setVisible (true);
	}
	
	private JPanel getJPanelAMCompanySection ()
	{
		if (jPanelAMCompanySection == null)
		{
			jPanelAMCompanySection = new JPanel ();
			GridBagLayout gbl_jPanelAMCompanySection = new GridBagLayout ();
			gbl_jPanelAMCompanySection.columnWidths = new int [] {871, 0};
			gbl_jPanelAMCompanySection.rowHeights = new int [] {403, 33, 0};
			gbl_jPanelAMCompanySection.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMCompanySection.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMCompanySection.setLayout (gbl_jPanelAMCompanySection);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMCompanySection.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMCompanySection.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMCompanySection;
	}

	private JLabel getJLabelCompanySectionDescription ()
	{
		if (jLabelCompanySectionDescription == null)
		{
			jLabelCompanySectionDescription = new JLabel ();
			jLabelCompanySectionDescription.setText ("<html>CompanySection Description (<font color='red'>*</font>):</html>");
		}
		
		return jLabelCompanySectionDescription;
	}
	
	private JTextField getJTextFieldCompanySectionDescription ()
	{
		if (jTextFieldCompanySectionDescription == null)
		{
			jTextFieldCompanySectionDescription = new JTextField ();
		}
		
		return jTextFieldCompanySectionDescription;
	}
	
	private JTextField getJTextFieldCuit ()
	{
		if (jTextFieldCuit == null)
		{
			jTextFieldCuit = new JTextField ();
		}
		
		return jTextFieldCuit;
	}
	
	private JLabel getJLabelCompanySubsidiaryDescription ()
	{
		if (jLabelCompanySubsidiaryDescription == null)
		{
			jLabelCompanySubsidiaryDescription = new JLabel ();
			jLabelCompanySubsidiaryDescription.setText ("CompanySubsidiary Description:");
		}
		
		return jLabelCompanySubsidiaryDescription;		
	}
	
	private JComboBox<String> getJComboBoxCompanySubsidiaryDescription ()
	{
		if (jComboBoxCompanySubsidiaryDescription == null)
		{
			jComboBoxCompanySubsidiaryDescription = new JComboBox <String> ();
		}
		
		return jComboBoxCompanySubsidiaryDescription;
	}
	
	private JComboBox <String> getJComboBoxTradeName ()
	{
		if (jComboBoxTradeName == null)
		{
			jComboBoxTradeName = new JComboBox <String> ();
			jComboBoxTradeName.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxTradeName ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();
							
							Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), true, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
							getJTextFieldCuit ().setText (Utilidades.devolverAtributoClave ("CompanySubsidiary, Company", "Cuit", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'"));
							getJComboBoxTradeName ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};
					
					if (e.getStateChange () == ItemEvent.SELECTED)
					{
						if (SwingUtilities.isEventDispatchThread ())
							
							new Thread (runnable).start ();

						else
						{
							Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), true, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
							getJTextFieldCuit ().setText (Utilidades.devolverAtributoClave ("CompanySubsidiary, Company", "Cuit", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'"));
						}
					}
				}
			}
			);
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
					if (! getJTextFieldCompanySectionDescription ().getText ().toString ().isEmpty ())
					{
						Runnable runnable = new Runnable ()
						{
							public void run ()
							{
								getJButtonAceptar ().setEnabled (false);
								setEnabled (false);
								setCursor (new Cursor (Cursor.WAIT_CURSOR));
															
								Cargando cargando = new Cargando ();
								
								String idCompanySectionByTradeName = Utilidades.devolverAtributoClave ("CompanySection, CompanySubsidiary, Company", "IdCompanySection", "CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany  = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.Description = '" + getJTextFieldCompanySectionDescription ().getText ().toString () + "' AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String idCompanySection = (getJButtonAceptar ().getToolTipText () == null ? "0" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();
								
								String idCompany = Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String cuit = (getJTextFieldCuit ().getText ().toString ().isEmpty () ? "0" : getJTextFieldCuit ().getText ().toString ()).toString ();
								
								String idCompanySubsidiary = Utilidades.devolverAtributoClave ("CompanySubsidiary", "IdCompanySubsidiary", "Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'").toString ();

								if (getTitle ().toString ().equals ("Agregar")
								?
								idCompanySectionByTradeName.equals ("0")
								:
								idCompanySection.equals (idCompanySectionByTradeName)
								?
								! idCompanySectionByTradeName.equals ("0")
								:
								idCompanySectionByTradeName.equals ("0")
								)					
								{
									if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
									{
										if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO CompanySection (Description, IdCompany, cuit, IdCompanySubsidiary) VALUES ('" + getJTextFieldCompanySectionDescription ().getText ().toString () + "', " + idCompany + ", " + cuit + ", " + idCompanySubsidiary + ")" : "UPDATE CompanySection SET Description = '" + getJTextFieldCompanySectionDescription ().getText ().toString () + "', IdCompany = " + idCompany + ", cuit = " + cuit + ", IdCompanySubsidiary = " + idCompanySubsidiary + " WHERE IdCompanySection = " + idCompanySection))
										{
											Utilidades.finalizarTransaccionALaBaseDeDatos ();
											JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);

											if (getTitle ().toString ().equals ("Agregar"))
											{
												getJTextFieldCompanySectionDescription ().setText ("");
												getJTextFieldCompanySectionDescription ().requestFocus ();
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

									JOptionPane.showMessageDialog (null, "La secci\u00f3n ya est\u00e1 asignada a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString () , JOptionPane.ERROR_MESSAGE);

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
			gbl_jPanelAtributos.columnWidths = new int [] {189, 388, 184, 254, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			GridBagConstraints gbc_jLabelCompanySectionDescription = new GridBagConstraints ();
			gbc_jLabelCompanySectionDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySectionDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySectionDescription.gridx = 0;
			gbc_jLabelCompanySectionDescription.gridy = 0;
			jPanelAtributos.add (getJLabelCompanySectionDescription (), gbc_jLabelCompanySectionDescription);
			GridBagConstraints gbc_jTextFieldCompanySectionDescription = new GridBagConstraints ();
			gbc_jTextFieldCompanySectionDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCompanySectionDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldCompanySectionDescription.gridx = 1;
			gbc_jTextFieldCompanySectionDescription.gridy = 0;
			jPanelAtributos.add (getJTextFieldCompanySectionDescription (), gbc_jTextFieldCompanySectionDescription);
			GridBagConstraints gbc_jLabelCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jLabelCompanySubsidiaryDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySubsidiaryDescription.gridx = 2;
			gbc_jLabelCompanySubsidiaryDescription.gridy = 0;
			jPanelAtributos.add (getJLabelCompanySubsidiaryDescription (), gbc_jLabelCompanySubsidiaryDescription);
			GridBagConstraints gbc_jComboBoxCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanySubsidiaryDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxCompanySubsidiaryDescription.gridx = 3;
			gbc_jComboBoxCompanySubsidiaryDescription.gridy = 0;
			jPanelAtributos.add (getJComboBoxCompanySubsidiaryDescription (), gbc_jComboBoxCompanySubsidiaryDescription);
			jLabelTradeName = new JLabel ();
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelTradeName.gridx = 0;
			gbc_jLabelTradeName.gridy = 1;
			jPanelAtributos.add (jLabelTradeName, gbc_jLabelTradeName);
			jLabelTradeName.setText ("TradeName:");
			GridBagConstraints gbc_jComboBoxTradeName = new GridBagConstraints ();
			gbc_jComboBoxTradeName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTradeName.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxTradeName.gridx = 1;
			gbc_jComboBoxTradeName.gridy = 1;
			jPanelAtributos.add (getJComboBoxTradeName (), gbc_jComboBoxTradeName);
			jLabelCuit = new JLabel ();
			GridBagConstraints gbc_jLabelCuit = new GridBagConstraints ();
			gbc_jLabelCuit.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuit.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelCuit.gridx = 2;
			gbc_jLabelCuit.gridy = 1;
			jPanelAtributos.add (jLabelCuit, gbc_jLabelCuit);
			jLabelCuit.setText ("Cuit:");
			GridBagConstraints gbc_jTextFieldCuit = new GridBagConstraints ();
			gbc_jTextFieldCuit.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuit.gridx = 3;
			gbc_jTextFieldCuit.gridy = 1;
			jPanelAtributos.add (getJTextFieldCuit (), gbc_jTextFieldCuit);
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