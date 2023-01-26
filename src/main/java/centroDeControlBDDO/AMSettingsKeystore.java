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

import javax.swing.SwingUtilities;

import javax.swing.border.TitledBorder;

public class AMSettingsKeystore extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMSettingsKeystore = null;

	private JLabel jLabelcuil = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JComboBox <String> jComboBoxcuil = null;
	
	private JLabel jLabelisDeleteKs = null;
	
	private JComboBox <String> jComboBoxisDeleteKs = null;
	
	private JLabel jLabelisResetPasswordKs = null;
	
	private JComboBox <String> jComboBoxisResetPasswordKs = null;
	
	private JLabel jLabeTradeName = null;
	
	private JComboBox <String> jComboBoxTradeName = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;
	
	public AMSettingsKeystore (Frame owner, String titulo, String cuil, String isDeleteKs, String isResetPasswordKs, String tradeName)
	{
		super (owner);
		initialize (titulo, cuil, isDeleteKs, isResetPasswordKs, tradeName);
	}
	
	private void initialize (String titulo, String cuil, String isDeleteKs, String isResetPasswordKs, String tradeName)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMSettingsKeystore ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMSettingsKeystore (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMSettingsKeystore ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		getJComboBoxisDeleteKs ().addItem ("Verdadero");
		getJComboBoxisDeleteKs ().addItem ("Falso");		
		getJComboBoxisResetPasswordKs ().addItem ("Verdadero");
		getJComboBoxisResetPasswordKs ().addItem ("Falso");
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "Company, CompanySection, CompanySubsidiary, Employee", "TradeName", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND CompanySection.IdCompanySection = Employee.IdCompanySection AND CompanySubsidiary.IdCompanySubsidiary = Employee.IdCompanySubsidiary");
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJComboBoxTradeName ().setSelectedItem (tradeName);
			getJComboBoxcuil ().setSelectedItem (cuil);
			getJComboBoxisDeleteKs ().setSelectedItem (isDeleteKs);
			getJComboBoxisResetPasswordKs ().setSelectedItem (isResetPasswordKs);
			getJButtonAceptar ().setToolTipText ("cuil = '" + cuil + "' AND idCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + tradeName + "'"));
		}
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelAMSettingsKeystore ()
	{
		if (jPanelAMSettingsKeystore == null)
		{
			jPanelAMSettingsKeystore = new JPanel ();
			GridBagLayout gbl_jPanelAMSettingsKeystore = new GridBagLayout ();
			gbl_jPanelAMSettingsKeystore.columnWidths = new int [] {871, 0};
			gbl_jPanelAMSettingsKeystore.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMSettingsKeystore.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMSettingsKeystore.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMSettingsKeystore.setLayout (gbl_jPanelAMSettingsKeystore);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMSettingsKeystore.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMSettingsKeystore.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMSettingsKeystore;
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
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAceptar ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));
														
							Cargando cargando = new Cargando ();

							String settingskeystoreidCompany = Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "SETTINGSKEYSTORE.idCompany", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJComboBoxcuil ().getSelectedItem ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
							
							String idSettingsKeystore = (getJButtonAceptar ().getToolTipText () == null ? "" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();
							
							String idCompany = Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
							
							String cuil = (getJComboBoxcuil ().getSelectedItem ().toString ().isEmpty () ? "0" : getJComboBoxcuil ().getSelectedItem ().toString ()).toString ();
							
							String isDeleteKs = (getJComboBoxisDeleteKs ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String isResetPasswordKs = (getJComboBoxisResetPasswordKs ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							if (getTitle ().toString ().equals ("Agregar")
							?
							settingskeystoreidCompany.equals ("0")
							:
							idSettingsKeystore.equals ("cuil = '" + getJComboBoxcuil ().getSelectedItem ().toString () + "' AND idCompany = " + idCompany)
							?
							! settingskeystoreidCompany.equals ("0")
							:
							settingskeystoreidCompany.equals ("0")
							)
							{
								if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
								{
									if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO SETTINGSKEYSTORE (cuil, isDeleteKs, isResetPasswordKs, idCompany) VALUES ('" + cuil + "', " + isDeleteKs + ", " + isResetPasswordKs + ", " + idCompany + ")" : "UPDATE SETTINGSKEYSTORE SET cuil = '" + cuil + "', isDeleteKs = " + isDeleteKs + ", isResetPasswordKs = " + isResetPasswordKs + ", idCompany = " + idCompany + " WHERE " + idSettingsKeystore))
									{	
										Utilidades.finalizarTransaccionALaBaseDeDatos ();
										JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);
												
										if (getTitle ().toString ().equals ("Agregar"))
										{
											getJComboBoxisDeleteKs ().setSelectedItem ("Verdadero");
											getJComboBoxisResetPasswordKs ().setSelectedItem ("Verdadero");
											getJComboBoxcuil ().requestFocus ();
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

								JOptionPane.showMessageDialog (null, "El SettingsKeystore para el n\u00famero de C.U.I.L. " + getJComboBoxcuil ().getSelectedItem ().toString () + ", ya est\u00e1 asignado a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);

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
	
	private JComboBox <String> getJComboBoxcuil ()
	{
		if (jComboBoxcuil == null)
		{
			jComboBoxcuil = new JComboBox <String> ();
		}
		
		return jComboBoxcuil;
	}
	
	private JLabel getJLabelisDeleteKs ()
	{
		if (jLabelisDeleteKs == null)
		{
			jLabelisDeleteKs = new JLabel ("isDeleteKs:");
		}
		
		return jLabelisDeleteKs;
	}
	
	private JComboBox <String> getJComboBoxisDeleteKs ()
	{
		if (jComboBoxisDeleteKs == null)
		{
			jComboBoxisDeleteKs = new JComboBox <String> ();
		}
		
		return jComboBoxisDeleteKs;
	}
	
	private JLabel getJLabelisResetPasswordKs ()
	{
		if (jLabelisResetPasswordKs == null)
		{
			jLabelisResetPasswordKs = new JLabel ("isResetPasswordKs:");
		}
		
		return jLabelisResetPasswordKs;
	}
	
	private JComboBox <String> getJComboBoxisResetPasswordKs ()
	{
		if (jComboBoxisResetPasswordKs == null)
		{
			jComboBoxisResetPasswordKs = new JComboBox <String> ();
		}
		
		return jComboBoxisResetPasswordKs;
	}
	
	private JLabel getJLabeTradeName ()
	{
		if (jLabeTradeName == null)
		{
			jLabeTradeName = new JLabel ("TradeName:");
		}
		
		return jLabeTradeName;
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

							Utilidades.cargarComboBox (getJComboBoxcuil (), true, "Employee, CompanySection, CompanySubsidiary, Company", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
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

							Utilidades.cargarComboBox (getJComboBoxcuil (), true, "Employee, CompanySection, CompanySubsidiary, Company", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
					}
				}
			}
			);
		}
		
		return jComboBoxTradeName;
	}
	
	private JPanel getJPanelAtributos ()
	{
		if (jPanelAtributos == null)
		{
			jPanelAtributos = new JPanel ();
			GridBagLayout gbl_jPanelAtributos = new GridBagLayout ();
			gbl_jPanelAtributos.columnWidths = new int [] {114, 31, 72, 31, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			jLabelcuil = new JLabel ();
			GridBagConstraints gbc_jLabelcuil = new GridBagConstraints ();
			gbc_jLabelcuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelcuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcuil.gridx = 0;
			gbc_jLabelcuil.gridy = 0;
			jPanelAtributos.add (jLabelcuil, gbc_jLabelcuil);
			jLabelcuil.setText ("cuil:");
			GridBagConstraints gbc_jComboBoxcuil = new GridBagConstraints ();
			gbc_jComboBoxcuil.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxcuil.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxcuil.gridx = 1;
			gbc_jComboBoxcuil.gridy = 0;
			jPanelAtributos.add (getJComboBoxcuil (), gbc_jComboBoxcuil);
			GridBagConstraints gbc_jLabelisDeleteKs = new GridBagConstraints ();
			gbc_jLabelisDeleteKs.anchor = GridBagConstraints.EAST;
			gbc_jLabelisDeleteKs.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelisDeleteKs.gridx = 2;
			gbc_jLabelisDeleteKs.gridy = 0;
			jPanelAtributos.add (getJLabelisDeleteKs (), gbc_jLabelisDeleteKs);
			GridBagConstraints gbc_jComboBoxisDeleteKs = new GridBagConstraints ();
			gbc_jComboBoxisDeleteKs.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxisDeleteKs.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxisDeleteKs.gridx = 3;
			gbc_jComboBoxisDeleteKs.gridy = 0;
			jPanelAtributos.add (getJComboBoxisDeleteKs (), gbc_jComboBoxisDeleteKs);
			GridBagConstraints gbc_jLabelisResetPasswordKs = new GridBagConstraints ();
			gbc_jLabelisResetPasswordKs.anchor = GridBagConstraints.EAST;
			gbc_jLabelisResetPasswordKs.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelisResetPasswordKs.gridx = 0;
			gbc_jLabelisResetPasswordKs.gridy = 1;
			jPanelAtributos.add (getJLabelisResetPasswordKs (), gbc_jLabelisResetPasswordKs);
			GridBagConstraints gbc_jComboBoxisResetPasswordKs = new GridBagConstraints ();
			gbc_jComboBoxisResetPasswordKs.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxisResetPasswordKs.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxisResetPasswordKs.gridx = 1;
			gbc_jComboBoxisResetPasswordKs.gridy = 1;
			jPanelAtributos.add (getJComboBoxisResetPasswordKs (), gbc_jComboBoxisResetPasswordKs);
			GridBagConstraints gbc_jLabeTradeName = new GridBagConstraints ();
			gbc_jLabeTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabeTradeName.insets = new Insets (0, 0, 0, 5);
			gbc_jLabeTradeName.gridx = 2;
			gbc_jLabeTradeName.gridy = 1;
			jPanelAtributos.add (getJLabeTradeName (), gbc_jLabeTradeName);
			GridBagConstraints gbc_jComboBoxTradeName = new GridBagConstraints ();
			gbc_jComboBoxTradeName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTradeName.gridx = 3;
			gbc_jComboBoxTradeName.gridy = 1;
			jPanelAtributos.add (getJComboBoxTradeName (), gbc_jComboBoxTradeName);
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