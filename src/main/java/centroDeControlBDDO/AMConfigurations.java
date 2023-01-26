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

public class AMConfigurations extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMConfigurations = null;

	private JLabel jLabelTradeName;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JComboBox <String> jComboBoxTradeName = null;
	
	private JLabel jLabelcantidad_intentos = null;
	
	private JTextField jTextFieldcantidad_intentos = null;
	
	private JLabel jLabelpasswordLengthMin = null;
	
	private JTextField jTextFieldpasswordLengthMin = null;
	
	private JLabel jLabelpasswordLengthMax = null;
	
	private JTextField jTextFieldpasswordLengthMax = null;
	
	private JLabel jLabelcharacterUpperCase = null;
	
	private JTextField jTextFieldcharacterUpperCase = null;
	
	private JLabel jLabelcharacterLowerCase = null;
	
	private JTextField jTextFieldcharacterLowerCase = null;
	
	private JLabel jLabelcharacterSpecial = null;
	
	private JTextField jTextFieldcharacterSpecial = null;
	
	private JLabel jLabelcharacterNumeric = null;
	
	private JTextField jTextFieldcharacterNumeric = null;
	
	private JLabel jLabeldaysExpiration = null;
	
	private JTextField jTextFielddaysExpiration = null;
	
	private JLabel jLabeldifferentsPasswords = null;
	
	private JTextField jTextFielddifferentsPasswords = null;
	
	private JLabel jLabelEnableProtesto = null;
	
	private JComboBox <String> jComboBoxEnableProtesto = null;
	
	private JLabel jLabelEmailOR = null;
	
	private JTextField jTextFieldEmailOR = null;
	
	private JLabel jLabelTienePCR = null;
	
	private JComboBox <String> jComboBoxTienePCR = null;

	private JLabel jLabelesPCRCloud = null;

	private JComboBox <String> jComboBoxesPCRCloud = null;
	
	private JLabel jLabelURLPCR = null;
	
	private JTextField jTextFieldURLPCR = null;
	
	private JLabel jLabelenviarEmail = null;
	
	private JComboBox <String> jComboBoxenviarEmail = null;
	
	private JLabel jLabelreenviarEmail = null;
	
	private JComboBox <String> jComboBoxreenviarEmail = null;
	
	private JLabel jLabelenviarGeneracionClaves = null;
	
	private JComboBox <String> jComboBoxenviarGeneracionClaves = null;
	
	private JLabel jLabelbloquearFechaPrevia = null;
	
	private JComboBox <String> jComboBoxbloquearFechaPrevia = null;
	
	private JLabel jLabelenviarFirmadoEmpleador = null;
	
	private JComboBox <String> jComboBoxenviarFirmadoEmpleador = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;

	public AMConfigurations (Frame owner, String titulo, String idConfiguration, String idCompany, String cantidad_intentos, String passwordLengthMin, String passwordLengthMax, String characterUpperCase, String characterLowerCase, String characterSpecial, String characterNumeric, String daysExpiration, String differentsPasswords, String enableProtesto, String emailOR, String tienePCR, String esPCRCloud, String urlPCR, String enviarEmail, String reenviarEmail, String enviarGeneracionClaves, String bloquearFechaPrevia, String enviarFirmadoEmpleador)
	{
		super (owner);
		initialize (titulo, idConfiguration, idCompany, cantidad_intentos, passwordLengthMin, passwordLengthMax, characterUpperCase, characterLowerCase, characterSpecial, characterNumeric, daysExpiration, differentsPasswords, enableProtesto, emailOR, tienePCR, esPCRCloud, urlPCR, enviarEmail, reenviarEmail, enviarGeneracionClaves, bloquearFechaPrevia, enviarFirmadoEmpleador);
	}
	
	private void initialize (String titulo, String idConfiguration, String idCompany, String cantidad_intentos, String passwordLengthMin, String passwordLengthMax, String characterUpperCase, String characterLowerCase, String characterSpecial, String characterNumeric, String daysExpiration, String differentsPasswords, String enableProtesto, String emailOR, String tienePCR, String esPCRCloud, String urlPCR, String enviarEmail, String reenviarEmail, String enviarGeneracionClaves, String bloquearFechaPrevia, String enviarFirmadoEmpleador)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMConfigurations ());
		this.setTitle (titulo);		
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMConfigurations (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMConfigurations ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "Company, CompanySection, CompanySubsidiary", "TradeName", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany");
		getJTextFieldcantidad_intentos ().setText (cantidad_intentos);
		getJTextFieldpasswordLengthMin ().setText (passwordLengthMin);
		getJTextFieldpasswordLengthMax ().setText (passwordLengthMax);
		getJTextFieldcharacterUpperCase ().setText (characterUpperCase);
		getJTextFieldcharacterLowerCase ().setText (characterLowerCase);
		getJTextFieldcharacterSpecial ().setText (characterSpecial);
		getJTextFieldcharacterNumeric ().setText (characterNumeric);
		getJTextFielddaysExpiration ().setText (daysExpiration);
		getJTextFielddifferentsPasswords ().setText (differentsPasswords);
		Utilidades.cargarComboBoxBoolean (getJComboBoxEnableProtesto (), true);
		getJComboBoxEnableProtesto ().setSelectedItem (enableProtesto);		
		getJTextFieldEmailOR ().setText (emailOR);
		Utilidades.cargarComboBoxBoolean (getJComboBoxTienePCR (), true);
		getJComboBoxTienePCR ().setSelectedItem (tienePCR);		
		Utilidades.cargarComboBoxBoolean (getJComboBoxesPCRCloud (), true);
		getJComboBoxesPCRCloud ().setSelectedItem (esPCRCloud);		
		getJTextFieldURLPCR ().setText (urlPCR);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarEmail (), true);
		getJComboBoxenviarEmail ().setSelectedItem (enviarEmail);
		Utilidades.cargarComboBoxBoolean (getJComboBoxreenviarEmail (), true);
		getJComboBoxreenviarEmail ().setSelectedItem (reenviarEmail);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarGeneracionClaves (), true);
		getJComboBoxenviarGeneracionClaves ().setSelectedItem (enviarGeneracionClaves);
		Utilidades.cargarComboBoxBoolean (getJComboBoxbloquearFechaPrevia (), true);
		getJComboBoxbloquearFechaPrevia ().setSelectedItem (bloquearFechaPrevia);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarFirmadoEmpleador (), true);
		getJComboBoxenviarFirmadoEmpleador ().setSelectedItem (enviarFirmadoEmpleador);
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJButtonAceptar ().setToolTipText (idConfiguration);
			getJComboBoxTradeName ().setSelectedItem (idCompany);
		}
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelAMConfigurations ()
	{
		if (jPanelAMConfigurations == null)
		{
			jPanelAMConfigurations = new JPanel ();
			GridBagLayout gbl_jPanelAMConfigurations = new GridBagLayout ();
			gbl_jPanelAMConfigurations.columnWidths = new int [] {871, 0};
			gbl_jPanelAMConfigurations.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMConfigurations.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMConfigurations.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMConfigurations.setLayout (gbl_jPanelAMConfigurations);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMConfigurations.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMConfigurations.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMConfigurations;
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
							
							String idConfigurationByTradeName = Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company", "IdConfiguration", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
							
							String idConfiguration = (getJButtonAceptar ().getToolTipText () == null ? "0" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();
							
							String idCompany = Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
							
							String cantidad_intentos = (getJTextFieldcantidad_intentos ().getText ().toString ().isEmpty () ? "0" : getJTextFieldcantidad_intentos ().getText ().toString ()).toString ();
							
							String passwordLengthMin = (getJTextFieldpasswordLengthMin ().getText ().toString ().isEmpty () ? "0" : getJTextFieldpasswordLengthMin ().getText ().toString ()).toString ();
							
							String passwordLengthMax = (getJTextFieldpasswordLengthMax ().getText ().toString ().isEmpty () ? "0" : getJTextFieldpasswordLengthMax ().getText ().toString ()).toString ();
							
							String characterUpperCase = (getJTextFieldcharacterUpperCase ().getText ().toString ().isEmpty () ? "0" : getJTextFieldcharacterUpperCase ().getText ().toString ()).toString ();
							
							String characterLowerCase = (getJTextFieldcharacterLowerCase ().getText ().toString ().isEmpty () ? "0" : getJTextFieldcharacterLowerCase ().getText ().toString ()).toString ();
							
							String characterSpecial = (getJTextFieldcharacterSpecial ().getText ().toString ().isEmpty () ? "0" : getJTextFieldcharacterSpecial ().getText ().toString ()).toString ();
							
							String characterNumeric = (getJTextFieldcharacterNumeric ().getText ().toString ().isEmpty () ? "0" : getJTextFieldcharacterNumeric ().getText ().toString ()).toString ();
							
							String daysExpiration = (getJTextFielddaysExpiration ().getText ().toString ().isEmpty () ? "0" : getJTextFielddaysExpiration ().getText ().toString ()).toString ();
							
							String differentsPasswords = (getJTextFielddifferentsPasswords ().getText ().toString ().isEmpty () ? "0" : getJTextFielddifferentsPasswords ().getText ().toString ()).toString ();
							
							String enableProtesto = (getJComboBoxEnableProtesto ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String tienePCR = (getJComboBoxTienePCR ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String esPCRCloud = (getJComboBoxesPCRCloud ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String enviarEmail = (getJComboBoxenviarEmail ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String reenviarEmail = (getJComboBoxreenviarEmail ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String enviarGeneracionClaves = (getJComboBoxenviarGeneracionClaves ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String bloquearFechaPrevia = (getJComboBoxbloquearFechaPrevia ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
							
							String enviarFirmadoEmpleador = (getJComboBoxenviarFirmadoEmpleador ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();

							if (getTitle ().toString ().equals ("Agregar")
							?
							idConfigurationByTradeName.equals ("0")
							:
							idConfiguration.equals (idConfigurationByTradeName)
							?
							! idConfigurationByTradeName.equals ("0")
							:
							idConfigurationByTradeName.equals ("0")
							)					
							{
								if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
								{
									if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO CONFIGURATIONS (IdCompany, cantidad_intentos, passwordLengthMin, passwordLengthMax, characterUpperCase, characterLowerCase, characterSpecial, characterNumeric, daysExpiration, differentsPasswords, EnableProtesto, EmailOR, TienePCR, esPCRCloud, URLPCR, enviarEmail, reenviarEmail, enviarGeneracionClaves, bloquearFechaPrevia, enviarFirmadoEmpleador) VALUES (" + idCompany + ", " + cantidad_intentos + ", " + passwordLengthMin + ", " + passwordLengthMax + ", " + characterUpperCase + ", " + characterLowerCase + ", " + characterSpecial + ", " + characterNumeric + ", " + daysExpiration + ", " + differentsPasswords + ", " + enableProtesto + ", '" + getJTextFieldEmailOR ().getText ().toString () + "', " + tienePCR + ", " + esPCRCloud + ", '" + getJTextFieldURLPCR ().getText ().toString () + "', " + enviarEmail + ", " + reenviarEmail + ", " + enviarGeneracionClaves + ", " + bloquearFechaPrevia + ", " + enviarFirmadoEmpleador + ")" : "UPDATE CONFIGURATIONS SET IdCompany = " + idCompany + ", cantidad_intentos = " + cantidad_intentos + ", passwordLengthMin = " + passwordLengthMin + ", passwordLengthMax = " + passwordLengthMax + ", characterUpperCase = " + characterUpperCase + ", characterLowerCase = " + characterLowerCase + ", characterSpecial = " + characterSpecial + ", characterNumeric = " + characterNumeric + ", daysExpiration = " + daysExpiration + ", differentsPasswords = " + differentsPasswords + ", EnableProtesto = " + enableProtesto + ", EmailOR = '" + getJTextFieldEmailOR ().getText ().toString () + "', TienePCR = " + tienePCR + ", esPCRCloud = " + esPCRCloud + ", URLPCR = '" + getJTextFieldURLPCR ().getText ().toString () + "', enviarEmail = " + enviarEmail + ", reenviarEmail = " + reenviarEmail + ", enviarGeneracionClaves = " + enviarGeneracionClaves + ", bloquearFechaPrevia = " + bloquearFechaPrevia + ", enviarFirmadoEmpleador = " + enviarFirmadoEmpleador + " WHERE IdConfiguration = " + idConfiguration))
									{	
										Utilidades.finalizarTransaccionALaBaseDeDatos ();
										JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);

										if (getTitle ().toString ().equals ("Agregar"))
										{
											getJTextFieldcantidad_intentos ().setText ("5");
											getJTextFieldpasswordLengthMin ().setText ("0");
											getJTextFieldpasswordLengthMax ().setText ("8");
											getJTextFieldcharacterUpperCase ().setText ("3");
											getJTextFieldcharacterLowerCase ().setText ("2");
											getJTextFieldcharacterSpecial ().setText ("1");
											getJTextFieldcharacterNumeric ().setText ("2");
											getJTextFielddaysExpiration ().setText ("1");
											getJTextFielddifferentsPasswords ().setText ("10");
											getJComboBoxEnableProtesto ().setSelectedItem ("Verdadero");
											getJTextFieldEmailOR ().setText ("");
											getJComboBoxTienePCR ().setSelectedItem ("Falso");
											getJComboBoxesPCRCloud ().setSelectedItem ("Falso");
											getJTextFieldURLPCR ().setText ("");
											getJComboBoxenviarEmail ().setSelectedItem ("Verdadero");
											getJComboBoxreenviarEmail ().setSelectedItem ("Verdadero");
											getJComboBoxenviarGeneracionClaves ().setSelectedItem ("Verdadero");
											getJComboBoxbloquearFechaPrevia ().setSelectedItem ("Verdadero");
											getJComboBoxenviarFirmadoEmpleador ().setSelectedItem ("Verdadero");
											getJComboBoxTradeName ().requestFocus ();
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

								JOptionPane.showMessageDialog (null, "La configuraci\u00f3n ya est\u00e1 asignada a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString () , JOptionPane.ERROR_MESSAGE);

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
	
	private JComboBox <String> getJComboBoxTradeName ()
	{
		if (jComboBoxTradeName == null)
		{
			jComboBoxTradeName = new JComboBox <String> ();
		}
		
		return jComboBoxTradeName;
	}
	
	private JLabel getJLabelcantidad_intentos ()
	{
		if (jLabelcantidad_intentos == null)
		{
			jLabelcantidad_intentos = new JLabel ("cantidad_intentos:");
		}
		
		return jLabelcantidad_intentos;
	}
	
	private JTextField getJTextFieldcantidad_intentos ()
	{
		if (jTextFieldcantidad_intentos == null)
		{
			jTextFieldcantidad_intentos = new JTextField ();
		}
		
		return jTextFieldcantidad_intentos;
	}
	
	private JLabel getJLabelpasswordLengthMin ()
	{
		if (jLabelpasswordLengthMin == null)
		{
			jLabelpasswordLengthMin = new JLabel ("passwordLengthMin:");
		}
		
		return jLabelpasswordLengthMin;
	}
	
	private JTextField getJTextFieldpasswordLengthMin ()
	{
		if (jTextFieldpasswordLengthMin == null)
		{
			jTextFieldpasswordLengthMin = new JTextField ();
		}
		
		return jTextFieldpasswordLengthMin;
	}
	
	private JLabel getJLabelpasswordLengthMax ()
	{
		if (jLabelpasswordLengthMax == null)
		{
			jLabelpasswordLengthMax = new JLabel ("passwordLengthMax:");
		}
		
		return jLabelpasswordLengthMax;
	}
	
	private JTextField getJTextFieldpasswordLengthMax ()
	{
		if (jTextFieldpasswordLengthMax == null)
		{
			jTextFieldpasswordLengthMax = new JTextField ();
		}
		
		return jTextFieldpasswordLengthMax;
	}
	
	private JLabel getJLabelcharacterUpperCase ()
	{
		if (jLabelcharacterUpperCase == null)
		{
			jLabelcharacterUpperCase = new JLabel ("characterUpperCase:");
		}
		
		return jLabelcharacterUpperCase;
	}
	
	private JTextField getJTextFieldcharacterUpperCase ()
	{
		if (jTextFieldcharacterUpperCase == null)
		{
			jTextFieldcharacterUpperCase = new JTextField ();
		}
		
		return jTextFieldcharacterUpperCase;
	}
	
	private JLabel getJLabelcharacterLowerCase ()
	{
		if (jLabelcharacterLowerCase == null)
		{
			jLabelcharacterLowerCase = new JLabel ("characterLowerCase:");
		}
		
		return jLabelcharacterLowerCase;
	}
	
	private JTextField getJTextFieldcharacterLowerCase ()
	{
		if (jTextFieldcharacterLowerCase == null)
		{
			jTextFieldcharacterLowerCase = new JTextField ();
		}
		
		return jTextFieldcharacterLowerCase;
	}
	
	private JLabel getJLabelcharacterSpecial ()
	{
		if (jLabelcharacterSpecial == null)
		{
			jLabelcharacterSpecial = new JLabel ("characterSpecial:");
		}
		
		return jLabelcharacterSpecial;
	}
	
	private JTextField getJTextFieldcharacterSpecial ()
	{
		if (jTextFieldcharacterSpecial == null)
		{
			jTextFieldcharacterSpecial = new JTextField ();
		}
		
		return jTextFieldcharacterSpecial;
	}
	
	private JLabel getJLabelcharacterNumeric ()
	{
		if (jLabelcharacterNumeric == null)
		{
			jLabelcharacterNumeric = new JLabel ("characterNumeric:");
		}
		
		return jLabelcharacterNumeric;
	}
	
	private JTextField getJTextFieldcharacterNumeric ()
	{
		if (jTextFieldcharacterNumeric == null)
		{
			jTextFieldcharacterNumeric = new JTextField ();
		}
		
		return jTextFieldcharacterNumeric;
	}
	
	private JLabel getJLabeldaysExpiration ()
	{
		if (jLabeldaysExpiration == null)
		{
			jLabeldaysExpiration = new JLabel ("daysExpiration:");
		}
		
		return jLabeldaysExpiration;
	}
	
	private JTextField getJTextFielddaysExpiration ()
	{
		if (jTextFielddaysExpiration == null)
		{
			jTextFielddaysExpiration = new JTextField ();
		}
		
		return jTextFielddaysExpiration;
	}
	
	private JLabel getJLabeldifferentsPasswords ()
	{
		if (jLabeldifferentsPasswords == null)
		{
			jLabeldifferentsPasswords = new JLabel ("differentsPasswords:");
		}
		
		return jLabeldifferentsPasswords;
	}
	
	private JTextField getJTextFielddifferentsPasswords ()
	{
		if (jTextFielddifferentsPasswords == null)
		{
			jTextFielddifferentsPasswords = new JTextField ();
		}
		
		return jTextFielddifferentsPasswords;
	}
	
	private JLabel getJLabelEnableProtesto ()
	{
		if (jLabelEnableProtesto == null)
		{
			jLabelEnableProtesto = new JLabel ("EnableProtesto:");
		}
		
		return jLabelEnableProtesto;
	}
	
	private JComboBox <String> getJComboBoxEnableProtesto ()
	{
		if (jComboBoxEnableProtesto == null)
		{
			jComboBoxEnableProtesto = new JComboBox <String> ();
		}
		
		return jComboBoxEnableProtesto;
	}
	
	private JLabel getJLabelEmailOR ()
	{
		if (jLabelEmailOR == null)
		{
			jLabelEmailOR = new JLabel ("EmailOR:");
		}
		
		return jLabelEmailOR;
	}
	
	private JTextField getJTextFieldEmailOR ()
	{
		if (jTextFieldEmailOR == null)
		{
			jTextFieldEmailOR = new JTextField ();
		}
		
		return jTextFieldEmailOR;
	}
	
	private JLabel getJLabelTienePCR ()
	{
		if (jLabelTienePCR == null)
		{
			jLabelTienePCR = new JLabel ("TienePCR:");
		}
		
		return jLabelTienePCR;
	}
	
	private JComboBox <String> getJComboBoxTienePCR ()
	{
		if (jComboBoxTienePCR == null)
		{
			jComboBoxTienePCR = new JComboBox <String> ();
			jComboBoxTienePCR.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					if (e.getStateChange () == ItemEvent.SELECTED)
						
						getJTextFieldURLPCR ().setEnabled (! (getJComboBoxTienePCR ().getSelectedIndex () > 0));
				}
			}
			);
		}
		
		return jComboBoxTienePCR;
	}
	
	private JLabel getJLabelesPCRCloud ()
	{
		if (jLabelesPCRCloud == null)
		{
			jLabelesPCRCloud = new JLabel ("esPCRCloud:");
		}
		
		return jLabelesPCRCloud;
	}
	
	private JComboBox <String> getJComboBoxesPCRCloud ()
	{
		if (jComboBoxesPCRCloud == null)
		{
			jComboBoxesPCRCloud = new JComboBox <String> ();
		}
		
		return jComboBoxesPCRCloud;
	}
	
	private JLabel getJLabelURLPCR ()
	{
		if (jLabelURLPCR == null)
		{
			jLabelURLPCR = new JLabel ("URLPCR:");
		}
		
		return jLabelURLPCR;
	}
	
	private JTextField getJTextFieldURLPCR ()
	{
		if (jTextFieldURLPCR == null)
		{
			jTextFieldURLPCR = new JTextField ();
		}
		
		return jTextFieldURLPCR;
	}
	
	private JLabel getJLabelenviarEmail ()
	{
		if (jLabelenviarEmail == null)
		{
			jLabelenviarEmail = new JLabel ("enviarEmail:");
		}
		
		return jLabelenviarEmail;
	}
	
	private JComboBox <String> getJComboBoxenviarEmail ()
	{
		if (jComboBoxenviarEmail == null)
		{
			jComboBoxenviarEmail = new JComboBox <String> ();
		}
		
		return jComboBoxenviarEmail;
	}
	
	private JLabel getJLabelreenviarEmail ()
	{
		if (jLabelreenviarEmail == null)
		{
			jLabelreenviarEmail = new JLabel ("reenviarEmail:");
		}
		
		return jLabelreenviarEmail;
	}
	
	private JComboBox <String> getJComboBoxreenviarEmail ()
	{
		if (jComboBoxreenviarEmail == null)
		{
			jComboBoxreenviarEmail = new JComboBox <String> ();
		}
		
		return jComboBoxreenviarEmail;
	}
	
	private JLabel getJLabelenviarGeneracionClaves ()
	{
		if (jLabelenviarGeneracionClaves == null)
		{
			jLabelenviarGeneracionClaves = new JLabel ("enviarGeneracionClaves:");
		}
		
		return jLabelenviarGeneracionClaves;
	}
	
	private JComboBox <String> getJComboBoxenviarGeneracionClaves ()
	{
		if (jComboBoxenviarGeneracionClaves == null)
		{
			jComboBoxenviarGeneracionClaves = new JComboBox <String> ();
		}
		
		return jComboBoxenviarGeneracionClaves;
	}
	
	private JLabel getJLabelbloquearFechaPrevia ()
	{
		if (jLabelbloquearFechaPrevia == null)
		{
			jLabelbloquearFechaPrevia = new JLabel ("bloquearFechaPrevia:");
		}
		
		return jLabelbloquearFechaPrevia;
	}
	
	private JComboBox<String> getJComboBoxbloquearFechaPrevia ()
	{
		if (jComboBoxbloquearFechaPrevia == null)
		{
			jComboBoxbloquearFechaPrevia = new JComboBox <String> ();
		}
		
		return jComboBoxbloquearFechaPrevia;
	}
	
	private JLabel getJLabelenviarFirmadoEmpleador ()
	{
		if (jLabelenviarFirmadoEmpleador == null)
		{
			jLabelenviarFirmadoEmpleador = new JLabel ("enviarFirmadoEmpleador:");
		}
		
		return jLabelenviarFirmadoEmpleador;
	}
	
	private JComboBox <String> getJComboBoxenviarFirmadoEmpleador ()
	{
		if (jComboBoxenviarFirmadoEmpleador == null)
		{
			jComboBoxenviarFirmadoEmpleador = new JComboBox <String> ();
		}
		
		return jComboBoxenviarFirmadoEmpleador;
	}
	
	private JPanel getJPanelAtributos ()
	{
		if (jPanelAtributos == null)
		{
			jPanelAtributos = new JPanel ();
			GridBagLayout gbl_jPanelAtributos = new GridBagLayout ();
			gbl_jPanelAtributos.columnWidths = new int [] {124, 387, 148, 406, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			jLabelTradeName = new JLabel ();
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeName.gridx = 0;
			gbc_jLabelTradeName.gridy = 0;
			jPanelAtributos.add (jLabelTradeName, gbc_jLabelTradeName);
			jLabelTradeName.setText ("TradeName:");
			GridBagConstraints gbc_jComboBoxTradeName = new GridBagConstraints ();
			gbc_jComboBoxTradeName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxTradeName.gridx = 1;
			gbc_jComboBoxTradeName.gridy = 0;
			jPanelAtributos.add (getJComboBoxTradeName (), gbc_jComboBoxTradeName);
			GridBagConstraints gbc_jLabelcantidad_intentos = new GridBagConstraints ();
			gbc_jLabelcantidad_intentos.anchor = GridBagConstraints.EAST;
			gbc_jLabelcantidad_intentos.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcantidad_intentos.gridx = 2;
			gbc_jLabelcantidad_intentos.gridy = 0;
			jPanelAtributos.add (getJLabelcantidad_intentos (), gbc_jLabelcantidad_intentos);
			GridBagConstraints gbc_jTextFieldcantidad_intentos = new GridBagConstraints ();
			gbc_jTextFieldcantidad_intentos.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcantidad_intentos.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldcantidad_intentos.gridx = 3;
			gbc_jTextFieldcantidad_intentos.gridy = 0;
			jPanelAtributos.add (getJTextFieldcantidad_intentos (), gbc_jTextFieldcantidad_intentos);
			GridBagConstraints gbc_jLabelpasswordLengthMin = new GridBagConstraints ();
			gbc_jLabelpasswordLengthMin.anchor = GridBagConstraints.EAST;
			gbc_jLabelpasswordLengthMin.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelpasswordLengthMin.gridx = 0;
			gbc_jLabelpasswordLengthMin.gridy = 1;
			jPanelAtributos.add (getJLabelpasswordLengthMin (), gbc_jLabelpasswordLengthMin);
			GridBagConstraints gbc_jTextFieldpasswordLengthMin = new GridBagConstraints ();
			gbc_jTextFieldpasswordLengthMin.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldpasswordLengthMin.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldpasswordLengthMin.gridx = 1;
			gbc_jTextFieldpasswordLengthMin.gridy = 1;
			jPanelAtributos.add (getJTextFieldpasswordLengthMin (), gbc_jTextFieldpasswordLengthMin);
			GridBagConstraints gbc_jLabelpasswordLengthMax = new GridBagConstraints ();
			gbc_jLabelpasswordLengthMax.anchor = GridBagConstraints.EAST;
			gbc_jLabelpasswordLengthMax.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelpasswordLengthMax.gridx = 2;
			gbc_jLabelpasswordLengthMax.gridy = 1;
			jPanelAtributos.add (getJLabelpasswordLengthMax (), gbc_jLabelpasswordLengthMax);
			GridBagConstraints gbc_jTextFieldpasswordLengthMax = new GridBagConstraints ();
			gbc_jTextFieldpasswordLengthMax.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldpasswordLengthMax.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldpasswordLengthMax.gridx = 3;
			gbc_jTextFieldpasswordLengthMax.gridy = 1;
			jPanelAtributos.add (getJTextFieldpasswordLengthMax (), gbc_jTextFieldpasswordLengthMax);
			GridBagConstraints gbc_jLabelcharacterUpperCase = new GridBagConstraints ();
			gbc_jLabelcharacterUpperCase.anchor = GridBagConstraints.EAST;
			gbc_jLabelcharacterUpperCase.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcharacterUpperCase.gridx = 0;
			gbc_jLabelcharacterUpperCase.gridy = 2;
			jPanelAtributos.add (getJLabelcharacterUpperCase (), gbc_jLabelcharacterUpperCase);
			GridBagConstraints gbc_jTextFieldcharacterUpperCase = new GridBagConstraints ();
			gbc_jTextFieldcharacterUpperCase.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcharacterUpperCase.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldcharacterUpperCase.gridx = 1;
			gbc_jTextFieldcharacterUpperCase.gridy = 2;
			jPanelAtributos.add (getJTextFieldcharacterUpperCase (), gbc_jTextFieldcharacterUpperCase);
			GridBagConstraints gbc_jLabelcharacterLowerCase = new GridBagConstraints ();
			gbc_jLabelcharacterLowerCase.anchor = GridBagConstraints.EAST;
			gbc_jLabelcharacterLowerCase.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcharacterLowerCase.gridx = 2;
			gbc_jLabelcharacterLowerCase.gridy = 2;
			jPanelAtributos.add (getJLabelcharacterLowerCase (), gbc_jLabelcharacterLowerCase);
			GridBagConstraints gbc_jTextFieldcharacterLowerCase = new GridBagConstraints ();
			gbc_jTextFieldcharacterLowerCase.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcharacterLowerCase.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldcharacterLowerCase.gridx = 3;
			gbc_jTextFieldcharacterLowerCase.gridy = 2;
			jPanelAtributos.add (getJTextFieldcharacterLowerCase (), gbc_jTextFieldcharacterLowerCase);
			GridBagConstraints gbc_jLabelcharacterSpecial = new GridBagConstraints ();
			gbc_jLabelcharacterSpecial.anchor = GridBagConstraints.EAST;
			gbc_jLabelcharacterSpecial.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcharacterSpecial.gridx = 0;
			gbc_jLabelcharacterSpecial.gridy = 3;
			jPanelAtributos.add (getJLabelcharacterSpecial (), gbc_jLabelcharacterSpecial);
			GridBagConstraints gbc_jTextFieldcharacterSpecial = new GridBagConstraints ();
			gbc_jTextFieldcharacterSpecial.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcharacterSpecial.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldcharacterSpecial.gridx = 1;
			gbc_jTextFieldcharacterSpecial.gridy = 3;
			jPanelAtributos.add (getJTextFieldcharacterSpecial (), gbc_jTextFieldcharacterSpecial);
			GridBagConstraints gbc_jLabelcharacterNumeric = new GridBagConstraints ();
			gbc_jLabelcharacterNumeric.anchor = GridBagConstraints.EAST;
			gbc_jLabelcharacterNumeric.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcharacterNumeric.gridx = 2;
			gbc_jLabelcharacterNumeric.gridy = 3;
			jPanelAtributos.add (getJLabelcharacterNumeric (), gbc_jLabelcharacterNumeric);
			GridBagConstraints gbc_jTextFieldcharacterNumeric = new GridBagConstraints ();
			gbc_jTextFieldcharacterNumeric.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcharacterNumeric.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldcharacterNumeric.gridx = 3;
			gbc_jTextFieldcharacterNumeric.gridy = 3;
			jPanelAtributos.add (getJTextFieldcharacterNumeric (), gbc_jTextFieldcharacterNumeric);
			GridBagConstraints gbc_jLabeldaysExpiration = new GridBagConstraints ();
			gbc_jLabeldaysExpiration.anchor = GridBagConstraints.EAST;
			gbc_jLabeldaysExpiration.insets = new Insets (0, 0, 5, 5);
			gbc_jLabeldaysExpiration.gridx = 0;
			gbc_jLabeldaysExpiration.gridy = 4;
			jPanelAtributos.add (getJLabeldaysExpiration (), gbc_jLabeldaysExpiration);
			GridBagConstraints gbc_jTextFielddaysExpiration = new GridBagConstraints ();
			gbc_jTextFielddaysExpiration.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFielddaysExpiration.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFielddaysExpiration.gridx = 1;
			gbc_jTextFielddaysExpiration.gridy = 4;
			jPanelAtributos.add (getJTextFielddaysExpiration (), gbc_jTextFielddaysExpiration);
			GridBagConstraints gbc_jLabeldifferentsPasswords = new GridBagConstraints ();
			gbc_jLabeldifferentsPasswords.anchor = GridBagConstraints.EAST;
			gbc_jLabeldifferentsPasswords.insets = new Insets (0, 0, 5, 5);
			gbc_jLabeldifferentsPasswords.gridx = 2;
			gbc_jLabeldifferentsPasswords.gridy = 4;
			jPanelAtributos.add (getJLabeldifferentsPasswords (), gbc_jLabeldifferentsPasswords);
			GridBagConstraints gbc_jTextFielddifferentsPasswords = new GridBagConstraints ();
			gbc_jTextFielddifferentsPasswords.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFielddifferentsPasswords.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFielddifferentsPasswords.gridx = 3;
			gbc_jTextFielddifferentsPasswords.gridy = 4;
			jPanelAtributos.add (getJTextFielddifferentsPasswords (), gbc_jTextFielddifferentsPasswords);
			GridBagConstraints gbc_jLabelEnableProtesto = new GridBagConstraints ();
			gbc_jLabelEnableProtesto.anchor = GridBagConstraints.EAST;
			gbc_jLabelEnableProtesto.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEnableProtesto.gridx = 0;
			gbc_jLabelEnableProtesto.gridy = 5;
			jPanelAtributos.add (getJLabelEnableProtesto (), gbc_jLabelEnableProtesto);
			GridBagConstraints gbc_jComboBoxEnableProtesto = new GridBagConstraints ();
			gbc_jComboBoxEnableProtesto.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEnableProtesto.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxEnableProtesto.gridx = 1;
			gbc_jComboBoxEnableProtesto.gridy = 5;
			jPanelAtributos.add (getJComboBoxEnableProtesto (), gbc_jComboBoxEnableProtesto);
			GridBagConstraints gbc_jLabelEmailOR = new GridBagConstraints ();
			gbc_jLabelEmailOR.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmailOR.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmailOR.gridx = 2;
			gbc_jLabelEmailOR.gridy = 5;
			jPanelAtributos.add (getJLabelEmailOR (), gbc_jLabelEmailOR);
			GridBagConstraints gbc_jTextFieldEmailOR = new GridBagConstraints ();
			gbc_jTextFieldEmailOR.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldEmailOR.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldEmailOR.gridx = 3;
			gbc_jTextFieldEmailOR.gridy = 5;
			jPanelAtributos.add (getJTextFieldEmailOR (), gbc_jTextFieldEmailOR);
			GridBagConstraints gbc_jLabelTienePCR = new GridBagConstraints ();
			gbc_jLabelTienePCR.anchor = GridBagConstraints.EAST;
			gbc_jLabelTienePCR.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTienePCR.gridx = 0;
			gbc_jLabelTienePCR.gridy = 6;
			jPanelAtributos.add (getJLabelTienePCR (), gbc_jLabelTienePCR);
			GridBagConstraints gbc_jComboBoxTienePCR = new GridBagConstraints ();
			gbc_jComboBoxTienePCR.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTienePCR.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxTienePCR.gridx = 1;
			gbc_jComboBoxTienePCR.gridy = 6;
			jPanelAtributos.add (getJComboBoxTienePCR (), gbc_jComboBoxTienePCR);
			GridBagConstraints gbc_jLabelesPCRCloud = new GridBagConstraints ();
			gbc_jLabelesPCRCloud.anchor = GridBagConstraints.EAST;
			gbc_jLabelesPCRCloud.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelesPCRCloud.gridx = 2;
			gbc_jLabelesPCRCloud.gridy = 6;
			jPanelAtributos.add (getJLabelesPCRCloud (), gbc_jLabelesPCRCloud);
			GridBagConstraints gbc_jComboBoxesPCRCloud = new GridBagConstraints ();
			gbc_jComboBoxesPCRCloud.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxesPCRCloud.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxesPCRCloud.gridx = 3;
			gbc_jComboBoxesPCRCloud.gridy = 6;
			jPanelAtributos.add (getJComboBoxesPCRCloud (), gbc_jComboBoxesPCRCloud);
			GridBagConstraints gbc_jLabelURLPCR = new GridBagConstraints ();
			gbc_jLabelURLPCR.anchor = GridBagConstraints.EAST;
			gbc_jLabelURLPCR.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelURLPCR.gridx = 0;
			gbc_jLabelURLPCR.gridy = 7;
			jPanelAtributos.add (getJLabelURLPCR (), gbc_jLabelURLPCR);
			GridBagConstraints gbc_jTextFieldURLPCR = new GridBagConstraints ();
			gbc_jTextFieldURLPCR.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldURLPCR.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldURLPCR.gridx = 1;
			gbc_jTextFieldURLPCR.gridy = 7;
			jPanelAtributos.add (getJTextFieldURLPCR (), gbc_jTextFieldURLPCR);
			GridBagConstraints gbc_jLabelenviarEmail = new GridBagConstraints ();
			gbc_jLabelenviarEmail.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelenviarEmail.gridx = 2;
			gbc_jLabelenviarEmail.gridy = 7;
			jPanelAtributos.add (getJLabelenviarEmail (), gbc_jLabelenviarEmail);
			GridBagConstraints gbc_jComboBoxenviarEmail = new GridBagConstraints ();
			gbc_jComboBoxenviarEmail.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarEmail.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxenviarEmail.gridx = 3;
			gbc_jComboBoxenviarEmail.gridy = 7;
			jPanelAtributos.add (getJComboBoxenviarEmail (), gbc_jComboBoxenviarEmail);
			GridBagConstraints gbc_jLabelreenviarEmail = new GridBagConstraints ();
			gbc_jLabelreenviarEmail.anchor = GridBagConstraints.EAST;
			gbc_jLabelreenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelreenviarEmail.gridx = 0;
			gbc_jLabelreenviarEmail.gridy = 8;
			jPanelAtributos.add (getJLabelreenviarEmail (), gbc_jLabelreenviarEmail);
			GridBagConstraints gbc_jComboBoxreenviarEmail = new GridBagConstraints ();
			gbc_jComboBoxreenviarEmail.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxreenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxreenviarEmail.gridx = 1;
			gbc_jComboBoxreenviarEmail.gridy = 8;
			jPanelAtributos.add (getJComboBoxreenviarEmail (), gbc_jComboBoxreenviarEmail);
			GridBagConstraints gbc_jLabelenviarGeneracionClaves = new GridBagConstraints ();
			gbc_jLabelenviarGeneracionClaves.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarGeneracionClaves.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelenviarGeneracionClaves.gridx = 2;
			gbc_jLabelenviarGeneracionClaves.gridy = 8;
			jPanelAtributos.add (getJLabelenviarGeneracionClaves (), gbc_jLabelenviarGeneracionClaves);
			GridBagConstraints gbc_jComboBoxenviarGeneracionClaves = new GridBagConstraints ();
			gbc_jComboBoxenviarGeneracionClaves.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarGeneracionClaves.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxenviarGeneracionClaves.gridx = 3;
			gbc_jComboBoxenviarGeneracionClaves.gridy = 8;
			jPanelAtributos.add (getJComboBoxenviarGeneracionClaves (), gbc_jComboBoxenviarGeneracionClaves);
			GridBagConstraints gbc_jLabelbloquearFechaPrevia = new GridBagConstraints ();
			gbc_jLabelbloquearFechaPrevia.anchor = GridBagConstraints.EAST;
			gbc_jLabelbloquearFechaPrevia.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelbloquearFechaPrevia.gridx = 0;
			gbc_jLabelbloquearFechaPrevia.gridy = 9;
			jPanelAtributos.add (getJLabelbloquearFechaPrevia (), gbc_jLabelbloquearFechaPrevia);
			GridBagConstraints gbc_jComboBoxbloquearFechaPrevia = new GridBagConstraints ();
			gbc_jComboBoxbloquearFechaPrevia.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxbloquearFechaPrevia.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxbloquearFechaPrevia.gridx = 1;
			gbc_jComboBoxbloquearFechaPrevia.gridy = 9;
			jPanelAtributos.add (getJComboBoxbloquearFechaPrevia (), gbc_jComboBoxbloquearFechaPrevia);
			GridBagConstraints gbc_jLabelenviarFirmadoEmpleador = new GridBagConstraints ();
			gbc_jLabelenviarFirmadoEmpleador.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarFirmadoEmpleador.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelenviarFirmadoEmpleador.gridx = 2;
			gbc_jLabelenviarFirmadoEmpleador.gridy = 9;
			jPanelAtributos.add (getJLabelenviarFirmadoEmpleador (), gbc_jLabelenviarFirmadoEmpleador);
			GridBagConstraints gbc_jComboBoxenviarFirmadoEmpleador = new GridBagConstraints ();
			gbc_jComboBoxenviarFirmadoEmpleador.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarFirmadoEmpleador.gridx = 3;
			gbc_jComboBoxenviarFirmadoEmpleador.gridy = 9;
			jPanelAtributos.add (getJComboBoxenviarFirmadoEmpleador (), gbc_jComboBoxenviarFirmadoEmpleador);
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
			gbc_jButtonCancelar.anchor = GridBagConstraints.NORTHEAST;
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