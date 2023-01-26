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

import javax.swing.event.CaretEvent;

import javax.swing.event.CaretListener;

public class AMCompany extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMCompany = null;
	
	private JLabel jLabelTradeName = null;

	private JTextField jTextFieldTradeName = null;

	private JLabel jLabelAddress = null;
	
	private JLabel jLabelCuit = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JTextField jTextFieldAddress = null;
	
	private JTextField jTextFieldCuit = null;
	
	private JLabel jLabelAccountNumber = null;	
	
	private JTextField jTextFieldAccountNumber = null;
	
	private JLabel jLabelCompanyCuitFormatDescription = null;
	
	private JComboBox <String> jComboBoxCompanyCuitFormatDescription = null;
	
	private JLabel jLabelCompanyAgreementTypeDescription = null;
	
	private JComboBox <String> jComboBoxCompanyAgreementTypeDescription = null;
	
	private JLabel jLabelEmployeeCount = null;
	
	private JTextField jTextFieldEmployeeCount = null;
	
	private JLabel jLabelStreetAdress = null;
	
	private JTextField jTextFieldStreetAdress = null;
	
	private JLabel jLabelStreetNumber = null;
	
	private JTextField jTextFieldStreetNumber = null;
	
	private JLabel jLabelFloor = null;
	
	private JTextField jTextFieldFloor = null;
	
	private JLabel jLabelDpto = null;
	
	private JTextField jTextFieldDpto = null;
	
	private JLabel jLabelAfipPrimaryActivity = null;
	
	private JTextField jTextFieldAfipPrimaryActivity = null;
	
	private JLabel jLabelAfipSecundaryActivity = null;
	
	private JTextField jTextFieldAfipSecundaryActivity = null;
	
	private JLabel jLabelMail = null;
	
	private JTextField jTextFieldMail = null;
	
	private JLabel jLabelIvaConditiondenomination = null;
	
	private JComboBox <String> jComboBoxIvaConditiondenomination = null;
	
	private JLabel jLabelCompanyTypedenomination = null;
	
	private JComboBox <String> jComboBoxCompanyTypedenomination = null;
	
	private JLabel jLabelCountryStateDescription = null;
	
	private JComboBox <String> jComboBoxCountryStateDescription = null;
	
	private JLabel jLabellocalidadName = null;
	
	private JComboBox <String> jComboBoxlocalidadName = null;
	
	private JLabel jLabelPhoneNumber = null;
	
	private JTextField jTextFieldPhoneNumber = null;
	
	private JLabel jLabelIdOrganization = null;
	
	private JTextField jTextFieldIdOrganization = null;
	
	private JLabel jLabelcountryName = null;
	
	private JComboBox <String> jComboBoxcountryName = null;
	
	private JLabel jLabelIsDeleted = null;
	
	private JComboBox <String> jComboBoxIsDeleted = null;
	
	private JLabel jLabelUsuario_Internet = null;
	
	private JTextField jTextFieldUsuario_Internet = null;
	
	private JLabel jLabelClave_Internet = null;
	
	private JTextField jTextFieldClave_Internet = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;
	
	public AMCompany (Frame owner, String titulo, String idCompany, String accountNumber, String tradeName, String address, String cuit, String idCompanyCuitFormat, String idCompanyAgreementType, String employeeCount, String streetAdress, String streetNumber, String floor, String dpto, String afipPrimaryActivity, String afipSecundaryActivity, String mail, String idIvaCondition, String idCompanyType, String idProv, String idLoca, String phoneNumber, String idOrganization, String idPais, String isDeleted, String usuario_Internet, String clave_Internet)
	{
		super (owner);
		initialize (titulo, idCompany, accountNumber, tradeName, address, cuit, idCompanyCuitFormat, idCompanyAgreementType, employeeCount, streetAdress, streetNumber, floor, dpto, afipPrimaryActivity, afipSecundaryActivity, mail, idIvaCondition, idCompanyType, idProv, idLoca, phoneNumber, idOrganization, idPais, isDeleted, usuario_Internet, clave_Internet);
	}

	private void initialize (String titulo, String idCompany, String accountNumber, String tradeName, String address, String cuit, String idCompanyCuitFormat, String idCompanyAgreementType, String employeeCount, String streetAdress, String streetNumber, String floor, String dpto, String afipPrimaryActivity, String afipSecundaryActivity, String mail, String idIvaCondition, String idCompanyType, String idProv, String idLoca, String phoneNumber, String idOrganization, String idPais, String isDeleted, String usuario_Internet, String clave_Internet)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMCompany ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMCompany (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMCompany ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		//Utilidades.validarNumeroEnComponenteTexto (getJTextFieldAccountNumber (), 13, true, true);
		getJTextFieldAccountNumber ().setText (accountNumber);
		getJTextFieldTradeName ().setText (tradeName);
		//Utilidades.validarTextoEnComponenteTexto (getJTextFieldTradeName (), 13, "", Utilidades.tipoDeLetra.MAYUSCULA, Utilidades.espacio.CON_ESPACIO);
		getJTextFieldAddress ().setText (address);
		getJTextFieldAddress ().setEditable (false);
		getJTextFieldCuit ().setText (cuit);
		Utilidades.cargarComboBox (getJComboBoxCompanyCuitFormatDescription (), true, "CompanyCuitFormat", "Description", null);
		getJComboBoxCompanyCuitFormatDescription ().setSelectedItem (idCompanyCuitFormat);
		Utilidades.cargarComboBox (getJComboBoxCompanyAgreementTypeDescription (), true, "CompanyAgreementType", "Description", null);
		getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem (idCompanyAgreementType);
		getJTextFieldEmployeeCount ().setText (employeeCount);
		getJTextFieldStreetAdress ().setText (streetAdress);
		getJTextFieldStreetNumber ().setText (streetNumber);
		getJTextFieldAddress ().setText (getJTextFieldStreetAdress ().getText ().toString () + getJTextFieldStreetNumber ().getText ().toString ());
		getJTextFieldFloor ().setText (floor);
		getJTextFieldDpto ().setText (dpto);
		getJTextFieldAfipPrimaryActivity ().setText (afipPrimaryActivity);
		getJTextFieldAfipSecundaryActivity ().setText (afipSecundaryActivity);
		getJTextFieldMail ().setText (mail);
		Utilidades.cargarComboBox (getJComboBoxIvaConditiondenomination (), true, "IvaCondition", "denomination", null);
		getJComboBoxIvaConditiondenomination ().setSelectedItem (idIvaCondition);
		Utilidades.cargarComboBox (getJComboBoxCompanyTypedenomination (), true, "OrganizationType", "denomination", null);
		getJComboBoxCompanyTypedenomination ().setSelectedItem (idCompanyType);
		
		Utilidades.cargarComboBox (getJComboBoxcountryName (), true, "Country", "countryName", null);
		
		getJComboBoxcountryName ().setSelectedItem (idPais);
		getJComboBoxCountryStateDescription ().setSelectedItem (idProv);
		getJComboBoxlocalidadName ().setSelectedItem (idLoca);
		getJTextFieldPhoneNumber ().setText (phoneNumber);
		getJTextFieldIdOrganization ().setText (idOrganization);
		getJTextFieldIdOrganization ().setEditable (false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), true);
		getJComboBoxIsDeleted ().setSelectedItem (isDeleted);
		getJTextFieldUsuario_Internet ().setText (usuario_Internet);
		getJTextFieldClave_Internet ().setText (clave_Internet);
		
		if (this.getTitle ().toString ().equals ("Modificar"))
			
			getJButtonAceptar ().setToolTipText (idCompany);
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelAMCompany ()
	{
		if (jPanelAMCompany == null)
		{
			jPanelAMCompany = new JPanel ();
			jPanelAMCompany.setBorder (BorderFactory.createTitledBorder (null, null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			GridBagLayout gbl_jPanelAMCompany = new GridBagLayout ();
			gbl_jPanelAMCompany.columnWidths = new int [] {871, 0};
			gbl_jPanelAMCompany.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMCompany.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMCompany.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMCompany.setLayout (gbl_jPanelAMCompany);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMCompany.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMCompany.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMCompany;
	}
	
	private JTextField getJTextFieldTradeName ()
	{
		if (jTextFieldTradeName == null)
		{
			jTextFieldTradeName = new JTextField ();
		}
		
		return jTextFieldTradeName;
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
					if (! getJTextFieldTradeName ().getText ().toString ().isEmpty () && ! getJTextFieldCuit ().getText ().toString ().isEmpty ())					
					{
						Runnable runnable = new Runnable ()
						{
							public void run ()
							{
								getJButtonAceptar ().setEnabled (false);
								setEnabled (false);
								setCursor (new Cursor (Cursor.WAIT_CURSOR));

								Cargando cargando = new Cargando ();

								String idCompanyByTradeName = Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJTextFieldTradeName ().getText ().toString () + "'").toString ();

								String idCompanyByCuit = Utilidades.devolverAtributoClave ("Company", "IdCompany", "Cuit = '" + getJTextFieldCuit ().getText ().toString () + "'").toString ();
								
								String idCompany = (getJButtonAceptar ().getToolTipText () == null ? "0" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();

								String idCompanyCuitFormat = Utilidades.devolverAtributoClave ("CompanyCuitFormat", "IdCompanyCuitFormat", "Description = '" + getJComboBoxCompanyCuitFormatDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String idCompanyAgreementType = Utilidades.devolverAtributoClave ("CompanyAgreementType", "IdCompanyAgreementType", "Description = '" + getJComboBoxCompanyAgreementTypeDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String idCondition = Utilidades.devolverAtributoClave ("IvaCondition", "IdCondition", "denomination = '" + getJComboBoxIvaConditiondenomination ().getSelectedItem ().toString () + "'").toString ();
								
								String idEmpTipo = Utilidades.devolverAtributoClave ("OrganizationType", "IdEmpTipo", "denomination = '" + getJComboBoxCompanyTypedenomination ().getSelectedItem ().toString () + "'").toString ();
								
								String idCountryState = Utilidades.devolverAtributoClave ("CountryState", "IdCountryState", "Description = '" + getJComboBoxCountryStateDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String idLocalidad = Utilidades.devolverAtributoClave ("Localidad", "IdLocalidad", "localidadName = '" + getJComboBoxlocalidadName ().getSelectedItem ().toString () + "'").toString ();
								
								String idCountry = Utilidades.devolverAtributoClave ("Country", "IdCountry", "countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'").toString ();
								
								String accountNumber = (getJTextFieldAccountNumber ().getText ().toString ().isEmpty () ? "0" : getJTextFieldAccountNumber ().getText ().toString ()).toString ();
								
								String cuit = (getJTextFieldCuit ().getText ().toString ().isEmpty () ? "0" : getJTextFieldCuit ().getText ().toString ()).toString ();
								
								String employeeCount = (getJTextFieldEmployeeCount ().getText ().toString ().isEmpty () ? "0" : getJTextFieldEmployeeCount ().getText ().toString ()).toString ();
								
								String streetNumber = (getJTextFieldStreetNumber ().getText ().toString ().isEmpty () ? "0" : getJTextFieldStreetNumber ().getText ().toString ()).toString ();
								
								String floor = (getJTextFieldFloor ().getText ().toString ().isEmpty () ? "0" : getJTextFieldFloor ().getText ().toString ()).toString ();
								
								String afipPrimaryActivity = (getJTextFieldAfipPrimaryActivity ().getText ().toString ().isEmpty () ? "0" : getJTextFieldAfipPrimaryActivity ().getText ().toString ()).toString ();
								
								String afipSecundaryActivity = (getJTextFieldAfipSecundaryActivity ().getText ().toString ().isEmpty () ? "0" : getJTextFieldAfipSecundaryActivity ().getText ().toString ()).toString ();
								
								String isDeleted = (getJComboBoxIsDeleted ().getSelectedItem ().toString ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
								
								String usuario_Internet = (getJTextFieldUsuario_Internet ().getText ().toString ().isEmpty () ? "0" : getJTextFieldUsuario_Internet ().getText ().toString ()).toString ();
								
								String clave_Internet = (getJTextFieldClave_Internet ().getText ().toString ().isEmpty () ? "0" : getJTextFieldClave_Internet ().getText ().toString ()).toString ();

								if (
								getTitle ().toString ().equals ("Agregar")
								?
								(idCompanyByTradeName.equals ("0") && idCompanyByCuit.equals ("0"))
								://si es modificar
									(idCompany.equals (idCompanyByTradeName) && idCompany.equals (idCompanyByCuit))
									?
									(! idCompanyByTradeName.equals ("0") && ! idCompanyByCuit.equals ("0"))
									:
										(idCompanyByTradeName.equals ("0") && idCompanyByCuit.equals ("0"))
										||
									    ((! idCompanyByTradeName.equals ("0") && idCompanyByTradeName.equals (idCompany)) && idCompanyByCuit.equals ("0"))
										||
										(idCompanyByTradeName.equals ("0") && (! idCompanyByCuit.equals ("0") && idCompanyByCuit.equals (idCompany))))					
								{
									
									if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
									{
										if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO Company (AccountNumber, TradeName, Address, Cuit, IdCompanyCuitFormat, IdCompanyAgreementType, EmployeeCount, StreetAdress, StreetNumber, Floor, Dpto, AfipPrimaryActivity, AfipSecundaryActivity, Mail, IdIvaCondition, IdCompanyType, IdProv, IdLoca, PhoneNumber, IdOrganization, IdPais, IsDeleted, Usuario_Internet, Clave_Internet) VALUES (" + accountNumber + ", '" + getJTextFieldTradeName ().getText ().toString () + "', '" + getJTextFieldAddress ().getText ().toString () + "', " + cuit + ", " + idCompanyCuitFormat + ", " + idCompanyAgreementType + ", " + employeeCount + ", '" + getJTextFieldStreetAdress ().getText ().toString () + "', " + streetNumber + ", " + floor + ", '" + getJTextFieldDpto ().getText ().toString () + "', " + afipPrimaryActivity + ", " + afipSecundaryActivity + ", '" + getJTextFieldMail ().getText ().toString () + "', " + idCondition + ", " + idEmpTipo + ", " + idCountryState + ", " + idLocalidad + ", '" + getJTextFieldPhoneNumber ().getText ().toString () + "', '" + getJTextFieldIdOrganization ().getText ().toString () + "', " + idCountry + ", " + isDeleted + ", " + usuario_Internet + ", " + clave_Internet + ")" : "UPDATE Company SET AccountNumber = " + accountNumber + ", TradeName = '" + getJTextFieldTradeName ().getText ().toString () + "', Address = '" + getJTextFieldAddress ().getText ().toString () + "', Cuit = " + cuit + ", IdCompanyCuitFormat = " + idCompanyCuitFormat + ", IdCompanyAgreementType = " + idCompanyAgreementType + ", EmployeeCount = " + employeeCount + ", StreetAdress = '" + getJTextFieldStreetAdress ().getText ().toString () + "', StreetNumber = " + streetNumber + ", Floor = " + floor + ", Dpto = '" + getJTextFieldDpto ().getText ().toString () + "', AfipPrimaryActivity = " + afipPrimaryActivity + ", AfipSecundaryActivity = " + afipSecundaryActivity + ", Mail = '" + getJTextFieldMail ().getText ().toString () + "', IdIvaCondition = " + idCondition + ", IdCompanyType = " + idEmpTipo + ", IdProv = " + idCountryState + ", IdLoca = " + idLocalidad + ", PhoneNumber = '" + getJTextFieldPhoneNumber ().getText ().toString () + "', IdOrganization = '" + getJTextFieldIdOrganization ().getText ().toString () + "', IdPais = " + idCountry + ", IsDeleted = " + isDeleted + ", Usuario_Internet = " + usuario_Internet + ", Clave_Internet = " + clave_Internet + " WHERE IdCompany = " + idCompany))
										{	
											Utilidades.finalizarTransaccionALaBaseDeDatos ();
											JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);
												
											if (getTitle ().toString ().equals ("Agregar"))
											{
												getJTextFieldAccountNumber ().setText ("1");
												getJTextFieldTradeName ().setText ("");
												getJTextFieldCuit ().setText ("");
												getJComboBoxCompanyCuitFormatDescription ().setSelectedItem ("Normal");
												getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem ("Indeterminado");
												getJTextFieldEmployeeCount ().setText ("1000");
												getJTextFieldStreetAdress ().setText ("DomicilioPrueba");
												getJTextFieldStreetNumber ().setText ("1");
												getJTextFieldFloor ().setText ("");
												getJTextFieldDpto ().setText ("");
												getJTextFieldAfipPrimaryActivity ().setText ("620900");
												getJTextFieldAfipSecundaryActivity ().setText ("");
												getJTextFieldMail ().setText ("EmailPrueba@EmailPrueba.com.ar");
												getJComboBoxIvaConditiondenomination ().setSelectedItem ("Responsable Inscripto");
												getJComboBoxCompanyTypedenomination ().setSelectedItem ("S.A. - Sociedad An\u00f3nima");
												getJComboBoxcountryName ().setSelectedItem ("Argentina");
												getJComboBoxCountryStateDescription ().setSelectedItem ("CORDOBA");
												getJComboBoxlocalidadName ().setSelectedItem ("CORDOBA                                 ");
												getJTextFieldPhoneNumber ().setText ("1");
												getJTextFieldIdOrganization ().setText ("EMP");			
												getJComboBoxIsDeleted ().setSelectedItem ("Falso");
												getJTextFieldUsuario_Internet ().setText ("");
												getJTextFieldClave_Internet ().setText ("");
												getJTextFieldAccountNumber ().requestFocus ();
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

									JOptionPane.showMessageDialog (null, (! idCompanyByTradeName.equals ("0") && idCompanyByCuit.equals ("0")) ? "La empresa " + getJTextFieldTradeName ().getText ().toString () + ", ya est\u00e1 asignada." : (idCompanyByTradeName.equals ("0") && ! idCompanyByCuit.equals ("0")) ? "El C.U.I.T. " + getJTextFieldCuit ().getText ().toString () + ", ya est\u00e1 asignado." : "La empresa " + getJTextFieldTradeName ().getText ().toString () + " y C.U.I.T. " + getJTextFieldCuit ().getText ().toString () + ", ya est\u00e1n asignados.", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);

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
						
						JOptionPane.showMessageDialog (null, ! getJTextFieldTradeName ().getText ().toString ().isEmpty () && getJTextFieldCuit ().getText ().toString ().isEmpty () ? "El campo Cuit es requerido." : getJTextFieldTradeName ().getText ().toString ().isEmpty () && ! getJTextFieldCuit ().getText ().toString ().isEmpty () ? "El campo TradeName es requerido." : "Los campos TradeName y Cuit son requeridos.", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
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
	
	private JTextField getJTextFieldAddress ()
	{
		if (jTextFieldAddress == null)
		{
			jTextFieldAddress = new JTextField ();
		}
		
		return jTextFieldAddress;
	}
	private JTextField getJTextFieldCuit () {
		if (jTextFieldCuit == null) {
			jTextFieldCuit = new JTextField ();
		}
		return jTextFieldCuit;
	}
	private JLabel getJLabelAccountNumber () {
		if (jLabelAccountNumber == null) {
			jLabelAccountNumber = new JLabel ("AccountNumber:");
		}
		return jLabelAccountNumber;
	}
	private JTextField getJTextFieldAccountNumber () {
		if (jTextFieldAccountNumber == null) {
			jTextFieldAccountNumber = new JTextField ();
		}
		return jTextFieldAccountNumber;
	}
	private JLabel getJLabelCompanyCuitFormatDescription () {
		if (jLabelCompanyCuitFormatDescription == null) {
			jLabelCompanyCuitFormatDescription = new JLabel ("CompanyCuitFormatDescription:");
		}
		return jLabelCompanyCuitFormatDescription;
	}
	
	private JComboBox <String> getJComboBoxCompanyCuitFormatDescription ()
	{
		if (jComboBoxCompanyCuitFormatDescription == null)
		{
			jComboBoxCompanyCuitFormatDescription = new JComboBox <String> ();
		}
		
		return jComboBoxCompanyCuitFormatDescription;
	}
	
	private JLabel getJLabelCompanyAgreementTypeDescription ()
	{
		if (jLabelCompanyAgreementTypeDescription == null)
		{
			jLabelCompanyAgreementTypeDescription = new JLabel ("CompanyAgreementTypeDescription:");
		}
		
		return jLabelCompanyAgreementTypeDescription;
	}
	
	private JComboBox <String> getJComboBoxCompanyAgreementTypeDescription ()
	{
		if (jComboBoxCompanyAgreementTypeDescription == null)
		{
			jComboBoxCompanyAgreementTypeDescription = new JComboBox <String> ();
		}
		
		return jComboBoxCompanyAgreementTypeDescription;
	}
	
	private JLabel getJLabelEmployeeCount ()
	{
		if (jLabelEmployeeCount == null)
		{
			jLabelEmployeeCount = new JLabel ("EmployeeCount:");
		}
		
		return jLabelEmployeeCount;
	}
	
	private JTextField getJTextFieldEmployeeCount ()
	{
		if (jTextFieldEmployeeCount == null)
		{
			jTextFieldEmployeeCount = new JTextField ();
		}
		
		return jTextFieldEmployeeCount;
	}
	
	private JLabel getJLabelStreetAdress ()
	{
		if (jLabelStreetAdress == null)
		{
			jLabelStreetAdress = new JLabel ("StreetAdress:");
		}
		
		return jLabelStreetAdress;
	}
	
	private JTextField getJTextFieldStreetAdress ()
	{
		if (jTextFieldStreetAdress == null)
		{
			jTextFieldStreetAdress = new JTextField ();
			jTextFieldStreetAdress.addCaretListener (new CaretListener ()
			{
				public void caretUpdate (CaretEvent e)
				{
					getJTextFieldAddress ().setText (getJTextFieldStreetAdress ().getText ().toString () + getJTextFieldStreetNumber ().getText ().toString ());
				}
			}
			);
		}
		
		return jTextFieldStreetAdress;
	}
	
	private JLabel getJLabelStreetNumber ()
	{
		if (jLabelStreetNumber == null)
		{
			jLabelStreetNumber = new JLabel ("StreetNumber:");
		}
		
		return jLabelStreetNumber;
	}
	
	private JTextField getJTextFieldStreetNumber ()
	{
		if (jTextFieldStreetNumber == null)
		{
			jTextFieldStreetNumber = new JTextField ();
			jTextFieldStreetNumber.addCaretListener (new CaretListener ()
			{
				public void caretUpdate (CaretEvent e)
				{
					getJTextFieldAddress ().setText (getJTextFieldStreetAdress ().getText ().toString () + getJTextFieldStreetNumber ().getText ().toString ());
				}
			}
			);
		}
		
		return jTextFieldStreetNumber;
	}
	
	private JLabel getJLabelFloor ()
	{
		if (jLabelFloor == null)
		{
			jLabelFloor = new JLabel ("Floor:");
		}
		
		return jLabelFloor;
	}
	
	private JTextField getJTextFieldFloor ()
	{
		if (jTextFieldFloor == null)
		{
			jTextFieldFloor = new JTextField ();
		}
		
		return jTextFieldFloor;
	}
	
	private JLabel getJLabelDpto ()
	{
		if (jLabelDpto == null)
		{
			jLabelDpto = new JLabel ("Dpto:");
		}
		
		return jLabelDpto;
	}
	
	private JTextField getJTextFieldDpto ()
	{
		if (jTextFieldDpto == null)
		{
			jTextFieldDpto = new JTextField ();
		}
		
		return jTextFieldDpto;
	}
	
	private JLabel getJLabelAfipPrimaryActivity ()
	{
		if (jLabelAfipPrimaryActivity == null)
		{
			jLabelAfipPrimaryActivity = new JLabel ("AfipPrimaryActivity:");
		}
		
		return jLabelAfipPrimaryActivity;
	}
	
	private JTextField getJTextFieldAfipPrimaryActivity ()
	{
		if (jTextFieldAfipPrimaryActivity == null)
		{
			jTextFieldAfipPrimaryActivity = new JTextField ();
		}
		
		return jTextFieldAfipPrimaryActivity;
	}
	
	private JLabel getJLabelAfipSecundaryActivity ()
	{
		if (jLabelAfipSecundaryActivity == null)
		{
			jLabelAfipSecundaryActivity = new JLabel ("AfipSecundaryActivity:");
		}
		
		return jLabelAfipSecundaryActivity;
	}
	
	private JTextField getJTextFieldAfipSecundaryActivity ()
	{
		if (jTextFieldAfipSecundaryActivity == null)
		{
			jTextFieldAfipSecundaryActivity = new JTextField ();
		}
		
		return jTextFieldAfipSecundaryActivity;
	}
	
	private JLabel getJLabelMail ()
	{
		if (jLabelMail == null)
		{
			jLabelMail = new JLabel ("Mail:");
		}
		
		return jLabelMail;
	}
	
	private JTextField getJTextFieldMail ()
	{
		if (jTextFieldMail == null)
		{
			jTextFieldMail = new JTextField ();
		}
		
		return jTextFieldMail;
	}
	
	private JLabel getJLabelIvaConditiondenomination ()
	{
		if (jLabelIvaConditiondenomination == null)
		{
			jLabelIvaConditiondenomination = new JLabel ("IvaConditiondenomination:");
		}
		
		return jLabelIvaConditiondenomination;
	}
	
	private JComboBox <String> getJComboBoxIvaConditiondenomination ()
	{
		if (jComboBoxIvaConditiondenomination == null)
		{
			jComboBoxIvaConditiondenomination = new JComboBox <String> ();
		}
		
		return jComboBoxIvaConditiondenomination;
	}
	
	private JLabel getJLabelCompanyTypedenomination ()
	{
		if (jLabelCompanyTypedenomination == null)
		{
			jLabelCompanyTypedenomination = new JLabel ("CompanyTypedenomination:");
		}
		
		return jLabelCompanyTypedenomination;
	}
	
	private JComboBox <String> getJComboBoxCompanyTypedenomination ()
	{
		if (jComboBoxCompanyTypedenomination == null) {
			jComboBoxCompanyTypedenomination = new JComboBox <String> ();
		}
		return jComboBoxCompanyTypedenomination;
	}
	
	private JLabel getJLabelCountryStateDescription ()
	{
		if (jLabelCountryStateDescription == null)
		{
			jLabelCountryStateDescription = new JLabel ("CountryStateDescription:");
		}
		
		return jLabelCountryStateDescription;
	}
	
	private JComboBox <String> getJComboBoxCountryStateDescription ()
	{
		if (jComboBoxCountryStateDescription == null)
		{
			jComboBoxCountryStateDescription = new JComboBox <String> ();
			jComboBoxCountryStateDescription.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxCountryStateDescription ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();
							
							Utilidades.cargarComboBox (getJComboBoxlocalidadName (), true, "Localidad", "localidadName", "IdCountryState = " + Utilidades.devolverAtributoClave ("CountryState", "IdCountryState", "Description = '" + getJComboBoxCountryStateDescription ().getSelectedItem ().toString () + "'").toString ());
							getJComboBoxCountryStateDescription ().setEnabled (true);
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
							
							Utilidades.cargarComboBox (getJComboBoxlocalidadName (), true, "Localidad", "localidadName", "IdCountryState = " + Utilidades.devolverAtributoClave ("CountryState", "IdCountryState", "Description = '" + getJComboBoxCountryStateDescription ().getSelectedItem ().toString () + "'").toString ());
					}
				}
			}
			);
		}
		
		return jComboBoxCountryStateDescription;
	}
	
	private JLabel getJLabellocalidadName ()
	{
		if (jLabellocalidadName == null)
		{
			jLabellocalidadName = new JLabel ("localidadName:");
		}
		
		return jLabellocalidadName;
	}
	
	private JComboBox <String> getJComboBoxlocalidadName ()
	{
		if (jComboBoxlocalidadName == null)
		{
			jComboBoxlocalidadName = new JComboBox <String> ();
		}
		
		return jComboBoxlocalidadName;
	}
	
	private JLabel getJLabelPhoneNumber ()
	{
		if (jLabelPhoneNumber == null)
		{
			jLabelPhoneNumber = new JLabel ("PhoneNumber:");
		}
		
		return jLabelPhoneNumber;
	}
	
	private JTextField getJTextFieldPhoneNumber ()
	{
		if (jTextFieldPhoneNumber == null)
		{
			jTextFieldPhoneNumber = new JTextField ();
		}
		
		return jTextFieldPhoneNumber;
	}
	
	private JLabel getJLabelIdOrganization ()
	{
		if (jLabelIdOrganization == null)
		{
			jLabelIdOrganization = new JLabel ("IdOrganization:");
		}
		
		return jLabelIdOrganization;
	}
	
	private JTextField getJTextFieldIdOrganization ()
	{
		if (jTextFieldIdOrganization == null)
		{
			jTextFieldIdOrganization = new JTextField ();
		}
		
		return jTextFieldIdOrganization;
	}
	
	private JLabel getJLabelcountryName ()
	{
		if (jLabelcountryName == null)
		{
			jLabelcountryName = new JLabel ("countryName:");
		}
		
		return jLabelcountryName;
	}
	
	private JComboBox <String> getJComboBoxcountryName ()
	{
		if (jComboBoxcountryName == null)
		{
			jComboBoxcountryName = new JComboBox <String> ();
			jComboBoxcountryName.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxcountryName ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();
							
							Utilidades.cargarComboBox (getJComboBoxCountryStateDescription (), true, "CountryState", "Description", "IdCountry = " + Utilidades.devolverAtributoClave ("Country", "IdCountry", "countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'").toString ());
							getJComboBoxcountryName ().setEnabled (true);
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
							
							Utilidades.cargarComboBox (getJComboBoxCountryStateDescription (), true, "CountryState", "Description", "IdCountry = " + Utilidades.devolverAtributoClave ("Country", "IdCountry", "countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'").toString ());
					}
				}
			}
			);
		}
		
		return jComboBoxcountryName;
	}
	
	private JLabel getJLabelIsDeleted ()
	{
		if (jLabelIsDeleted == null)
		{
			jLabelIsDeleted = new JLabel ("IsDeleted:");
		}
		
		return jLabelIsDeleted;
	}
	
	private JComboBox <String> getJComboBoxIsDeleted ()
	{
		if (jComboBoxIsDeleted == null)
		{
			jComboBoxIsDeleted = new JComboBox <String> ();
		}
		
		return jComboBoxIsDeleted;
	}
	
	private JLabel getJLabelUsuario_Internet ()
	{
		if (jLabelUsuario_Internet == null)
		{
			jLabelUsuario_Internet = new JLabel ("Usuario_Internet:");
		}
		
		return jLabelUsuario_Internet;
	}
	
	private JTextField getJTextFieldUsuario_Internet ()
	{
		if (jTextFieldUsuario_Internet == null)
		{
			jTextFieldUsuario_Internet = new JTextField ();
		}
		
		return jTextFieldUsuario_Internet;
	}
	
	private JLabel getJLabelClave_Internet ()
	{
		if (jLabelClave_Internet == null)
		{
			jLabelClave_Internet = new JLabel ("Clave_Internet:");
		}
		
		return jLabelClave_Internet;
	}
	
	private JTextField getJTextFieldClave_Internet ()
	{
		if (jTextFieldClave_Internet == null)
		{
			jTextFieldClave_Internet = new JTextField ();
		}
		
		return jTextFieldClave_Internet;
	}
	
	private JPanel getJPanelAtributos ()
	{
		if (jPanelAtributos == null)
		{
			jPanelAtributos = new JPanel ();
			GridBagLayout gbl_jPanelAtributos = new GridBagLayout ();
			gbl_jPanelAtributos.columnWidths = new int [] {184, 340, 212, 359, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			GridBagConstraints gbc_jLabelAccountNumber = new GridBagConstraints ();
			gbc_jLabelAccountNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelAccountNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAccountNumber.gridx = 0;
			gbc_jLabelAccountNumber.gridy = 0;
			jPanelAtributos.add (getJLabelAccountNumber (), gbc_jLabelAccountNumber);
			GridBagConstraints gbc_jTextFieldAccountNumber = new GridBagConstraints ();
			gbc_jTextFieldAccountNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAccountNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldAccountNumber.gridx = 1;
			gbc_jTextFieldAccountNumber.gridy = 0;
			jPanelAtributos.add (getJTextFieldAccountNumber (), gbc_jTextFieldAccountNumber);
			jLabelTradeName = new JLabel ();
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeName.gridx = 2;
			gbc_jLabelTradeName.gridy = 0;
			jPanelAtributos.add (jLabelTradeName, gbc_jLabelTradeName);
			jLabelTradeName.setText ("<html>TradeName (<font color = 'red'>*</font>):</html>");
			GridBagConstraints gbc_jTextFieldTradeName = new GridBagConstraints ();
			gbc_jTextFieldTradeName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeName.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldTradeName.gridx = 3;
			gbc_jTextFieldTradeName.gridy = 0;
			jPanelAtributos.add (getJTextFieldTradeName (), gbc_jTextFieldTradeName);
			jLabelAddress = new JLabel ();
			GridBagConstraints gbc_jLabelAddress = new GridBagConstraints ();
			gbc_jLabelAddress.anchor = GridBagConstraints.EAST;
			gbc_jLabelAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAddress.gridx = 0;
			gbc_jLabelAddress.gridy = 1;
			jPanelAtributos.add (jLabelAddress, gbc_jLabelAddress);
			jLabelAddress.setText ("Address:");
			GridBagConstraints gbc_jTextFieldAddress = new GridBagConstraints ();
			gbc_jTextFieldAddress.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldAddress.gridx = 1;
			gbc_jTextFieldAddress.gridy = 1;
			jPanelAtributos.add (getJTextFieldAddress (), gbc_jTextFieldAddress);
			jLabelCuit = new JLabel ();
			GridBagConstraints gbc_jLabelCuit = new GridBagConstraints ();
			gbc_jLabelCuit.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuit.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCuit.gridx = 2;
			gbc_jLabelCuit.gridy = 1;
			jPanelAtributos.add (jLabelCuit, gbc_jLabelCuit);
			jLabelCuit.setText ("<html>Cuit (<font color = 'red'>*</font>):</html>");
			GridBagConstraints gbc_jTextFieldCuit = new GridBagConstraints ();
			gbc_jTextFieldCuit.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuit.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldCuit.gridx = 3;
			gbc_jTextFieldCuit.gridy = 1;
			jPanelAtributos.add (getJTextFieldCuit (), gbc_jTextFieldCuit);
			GridBagConstraints gbc_jLabelCompanyCuitFormatDescription = new GridBagConstraints ();
			gbc_jLabelCompanyCuitFormatDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyCuitFormatDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyCuitFormatDescription.gridx = 0;
			gbc_jLabelCompanyCuitFormatDescription.gridy = 2;
			jPanelAtributos.add (getJLabelCompanyCuitFormatDescription (), gbc_jLabelCompanyCuitFormatDescription);
			GridBagConstraints gbc_jComboBoxCompanyCuitFormatDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanyCuitFormatDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyCuitFormatDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanyCuitFormatDescription.gridx = 1;
			gbc_jComboBoxCompanyCuitFormatDescription.gridy = 2;
			jPanelAtributos.add (getJComboBoxCompanyCuitFormatDescription (), gbc_jComboBoxCompanyCuitFormatDescription);
			GridBagConstraints gbc_jLabelCompanyAgreementTypeDescription = new GridBagConstraints ();
			gbc_jLabelCompanyAgreementTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyAgreementTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyAgreementTypeDescription.gridx = 2;
			gbc_jLabelCompanyAgreementTypeDescription.gridy = 2;
			jPanelAtributos.add (getJLabelCompanyAgreementTypeDescription (), gbc_jLabelCompanyAgreementTypeDescription);
			GridBagConstraints gbc_jComboBoxCompanyAgreementTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanyAgreementTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyAgreementTypeDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxCompanyAgreementTypeDescription.gridx = 3;
			gbc_jComboBoxCompanyAgreementTypeDescription.gridy = 2;
			jPanelAtributos.add (getJComboBoxCompanyAgreementTypeDescription (), gbc_jComboBoxCompanyAgreementTypeDescription);
			GridBagConstraints gbc_jLabelEmployeeCount = new GridBagConstraints ();
			gbc_jLabelEmployeeCount.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeCount.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeCount.gridx = 0;
			gbc_jLabelEmployeeCount.gridy = 3;
			jPanelAtributos.add (getJLabelEmployeeCount (), gbc_jLabelEmployeeCount);
			GridBagConstraints gbc_jTextFieldEmployeeCount = new GridBagConstraints ();
			gbc_jTextFieldEmployeeCount.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldEmployeeCount.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldEmployeeCount.gridx = 1;
			gbc_jTextFieldEmployeeCount.gridy = 3;
			jPanelAtributos.add (getJTextFieldEmployeeCount (), gbc_jTextFieldEmployeeCount);
			GridBagConstraints gbc_jLabelStreetAdress = new GridBagConstraints ();
			gbc_jLabelStreetAdress.anchor = GridBagConstraints.EAST;
			gbc_jLabelStreetAdress.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelStreetAdress.gridx = 2;
			gbc_jLabelStreetAdress.gridy = 3;
			jPanelAtributos.add (getJLabelStreetAdress (), gbc_jLabelStreetAdress);
			GridBagConstraints gbc_jTextFieldStreetAdress = new GridBagConstraints ();
			gbc_jTextFieldStreetAdress.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldStreetAdress.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldStreetAdress.gridx = 3;
			gbc_jTextFieldStreetAdress.gridy = 3;
			jPanelAtributos.add (getJTextFieldStreetAdress (), gbc_jTextFieldStreetAdress);
			GridBagConstraints gbc_jLabelStreetNumber = new GridBagConstraints ();
			gbc_jLabelStreetNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelStreetNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelStreetNumber.gridx = 0;
			gbc_jLabelStreetNumber.gridy = 4;
			jPanelAtributos.add (getJLabelStreetNumber (), gbc_jLabelStreetNumber);
			GridBagConstraints gbc_jTextFieldStreetNumber = new GridBagConstraints ();
			gbc_jTextFieldStreetNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldStreetNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldStreetNumber.gridx = 1;
			gbc_jTextFieldStreetNumber.gridy = 4;
			jPanelAtributos.add (getJTextFieldStreetNumber (), gbc_jTextFieldStreetNumber);
			GridBagConstraints gbc_jLabelFloor = new GridBagConstraints ();
			gbc_jLabelFloor.anchor = GridBagConstraints.EAST;
			gbc_jLabelFloor.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelFloor.gridx = 2;
			gbc_jLabelFloor.gridy = 4;
			jPanelAtributos.add (getJLabelFloor (), gbc_jLabelFloor);
			GridBagConstraints gbc_jTextFieldFloor = new GridBagConstraints ();
			gbc_jTextFieldFloor.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldFloor.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldFloor.gridx = 3;
			gbc_jTextFieldFloor.gridy = 4;
			jPanelAtributos.add (getJTextFieldFloor (), gbc_jTextFieldFloor);
			GridBagConstraints gbc_jLabelDpto = new GridBagConstraints ();
			gbc_jLabelDpto.anchor = GridBagConstraints.EAST;
			gbc_jLabelDpto.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelDpto.gridx = 0;
			gbc_jLabelDpto.gridy = 5;
			jPanelAtributos.add (getJLabelDpto (), gbc_jLabelDpto);
			GridBagConstraints gbc_jTextFieldDpto = new GridBagConstraints ();
			gbc_jTextFieldDpto.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldDpto.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldDpto.gridx = 1;
			gbc_jTextFieldDpto.gridy = 5;
			jPanelAtributos.add (getJTextFieldDpto (), gbc_jTextFieldDpto);
			GridBagConstraints gbc_jLabelAfipPrimaryActivity = new GridBagConstraints ();
			gbc_jLabelAfipPrimaryActivity.anchor = GridBagConstraints.EAST;
			gbc_jLabelAfipPrimaryActivity.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAfipPrimaryActivity.gridx = 2;
			gbc_jLabelAfipPrimaryActivity.gridy = 5;
			jPanelAtributos.add (getJLabelAfipPrimaryActivity (), gbc_jLabelAfipPrimaryActivity);
			GridBagConstraints gbc_jTextFieldAfipPrimaryActivity = new GridBagConstraints ();
			gbc_jTextFieldAfipPrimaryActivity.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAfipPrimaryActivity.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldAfipPrimaryActivity.gridx = 3;
			gbc_jTextFieldAfipPrimaryActivity.gridy = 5;
			jPanelAtributos.add (getJTextFieldAfipPrimaryActivity (), gbc_jTextFieldAfipPrimaryActivity);
			GridBagConstraints gbc_jLabelAfipSecundaryActivity = new GridBagConstraints ();
			gbc_jLabelAfipSecundaryActivity.anchor = GridBagConstraints.EAST;
			gbc_jLabelAfipSecundaryActivity.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAfipSecundaryActivity.gridx = 0;
			gbc_jLabelAfipSecundaryActivity.gridy = 6;
			jPanelAtributos.add (getJLabelAfipSecundaryActivity (), gbc_jLabelAfipSecundaryActivity);
			GridBagConstraints gbc_jTextFieldAfipSecundaryActivity = new GridBagConstraints ();
			gbc_jTextFieldAfipSecundaryActivity.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAfipSecundaryActivity.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldAfipSecundaryActivity.gridx = 1;
			gbc_jTextFieldAfipSecundaryActivity.gridy = 6;
			jPanelAtributos.add (getJTextFieldAfipSecundaryActivity (), gbc_jTextFieldAfipSecundaryActivity);
			GridBagConstraints gbc_jLabelMail = new GridBagConstraints ();
			gbc_jLabelMail.anchor = GridBagConstraints.EAST;
			gbc_jLabelMail.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelMail.gridx = 2;
			gbc_jLabelMail.gridy = 6;
			jPanelAtributos.add (getJLabelMail (), gbc_jLabelMail);
			GridBagConstraints gbc_jTextFieldMail = new GridBagConstraints ();
			gbc_jTextFieldMail.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldMail.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldMail.gridx = 3;
			gbc_jTextFieldMail.gridy = 6;
			jPanelAtributos.add (getJTextFieldMail (), gbc_jTextFieldMail);
			GridBagConstraints gbc_jLabelIvaConditiondenomination = new GridBagConstraints ();
			gbc_jLabelIvaConditiondenomination.anchor = GridBagConstraints.EAST;
			gbc_jLabelIvaConditiondenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIvaConditiondenomination.gridx = 0;
			gbc_jLabelIvaConditiondenomination.gridy = 7;
			jPanelAtributos.add (getJLabelIvaConditiondenomination (), gbc_jLabelIvaConditiondenomination);
			GridBagConstraints gbc_jComboBoxIvaConditiondenomination = new GridBagConstraints ();
			gbc_jComboBoxIvaConditiondenomination.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIvaConditiondenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxIvaConditiondenomination.gridx = 1;
			gbc_jComboBoxIvaConditiondenomination.gridy = 7;
			jPanelAtributos.add (getJComboBoxIvaConditiondenomination (), gbc_jComboBoxIvaConditiondenomination);
			GridBagConstraints gbc_jLabelCompanyTypedenomination = new GridBagConstraints ();
			gbc_jLabelCompanyTypedenomination.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyTypedenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyTypedenomination.gridx = 2;
			gbc_jLabelCompanyTypedenomination.gridy = 7;
			jPanelAtributos.add (getJLabelCompanyTypedenomination (), gbc_jLabelCompanyTypedenomination);
			GridBagConstraints gbc_jComboBoxCompanyTypedenomination = new GridBagConstraints ();
			gbc_jComboBoxCompanyTypedenomination.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyTypedenomination.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxCompanyTypedenomination.gridx = 3;
			gbc_jComboBoxCompanyTypedenomination.gridy = 7;
			jPanelAtributos.add (getJComboBoxCompanyTypedenomination (), gbc_jComboBoxCompanyTypedenomination);
			GridBagConstraints gbc_jLabelCountryStateDescription = new GridBagConstraints ();
			gbc_jLabelCountryStateDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCountryStateDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCountryStateDescription.gridx = 0;
			gbc_jLabelCountryStateDescription.gridy = 8;
			jPanelAtributos.add (getJLabelCountryStateDescription (), gbc_jLabelCountryStateDescription);
			GridBagConstraints gbc_jComboBoxCountryStateDescription = new GridBagConstraints ();
			gbc_jComboBoxCountryStateDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCountryStateDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCountryStateDescription.gridx = 1;
			gbc_jComboBoxCountryStateDescription.gridy = 8;
			jPanelAtributos.add (getJComboBoxCountryStateDescription (), gbc_jComboBoxCountryStateDescription);
			GridBagConstraints gbc_jLabellocalidadName = new GridBagConstraints ();
			gbc_jLabellocalidadName.anchor = GridBagConstraints.EAST;
			gbc_jLabellocalidadName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabellocalidadName.gridx = 2;
			gbc_jLabellocalidadName.gridy = 8;
			jPanelAtributos.add (getJLabellocalidadName (), gbc_jLabellocalidadName);
			GridBagConstraints gbc_jComboBoxlocalidadName = new GridBagConstraints ();
			gbc_jComboBoxlocalidadName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxlocalidadName.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxlocalidadName.gridx = 3;
			gbc_jComboBoxlocalidadName.gridy = 8;
			jPanelAtributos.add (getJComboBoxlocalidadName (), gbc_jComboBoxlocalidadName);
			GridBagConstraints gbc_jLabelPhoneNumber = new GridBagConstraints ();
			gbc_jLabelPhoneNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelPhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelPhoneNumber.gridx = 0;
			gbc_jLabelPhoneNumber.gridy = 9;
			jPanelAtributos.add (getJLabelPhoneNumber (), gbc_jLabelPhoneNumber);
			GridBagConstraints gbc_jTextFieldPhoneNumber = new GridBagConstraints ();
			gbc_jTextFieldPhoneNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldPhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldPhoneNumber.gridx = 1;
			gbc_jTextFieldPhoneNumber.gridy = 9;
			jPanelAtributos.add (getJTextFieldPhoneNumber (), gbc_jTextFieldPhoneNumber);
			GridBagConstraints gbc_jLabelIdOrganization = new GridBagConstraints ();
			gbc_jLabelIdOrganization.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdOrganization.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdOrganization.gridx = 2;
			gbc_jLabelIdOrganization.gridy = 9;
			jPanelAtributos.add (getJLabelIdOrganization (), gbc_jLabelIdOrganization);
			GridBagConstraints gbc_jTextFieldIdOrganization = new GridBagConstraints ();
			gbc_jTextFieldIdOrganization.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdOrganization.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldIdOrganization.gridx = 3;
			gbc_jTextFieldIdOrganization.gridy = 9;
			jPanelAtributos.add (getJTextFieldIdOrganization (), gbc_jTextFieldIdOrganization);
			GridBagConstraints gbc_jLabelcountryName = new GridBagConstraints ();
			gbc_jLabelcountryName.anchor = GridBagConstraints.EAST;
			gbc_jLabelcountryName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcountryName.gridx = 0;
			gbc_jLabelcountryName.gridy = 10;
			jPanelAtributos.add (getJLabelcountryName (), gbc_jLabelcountryName);
			GridBagConstraints gbc_jComboBoxcountryName = new GridBagConstraints ();
			gbc_jComboBoxcountryName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxcountryName.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxcountryName.gridx = 1;
			gbc_jComboBoxcountryName.gridy = 10;
			jPanelAtributos.add (getJComboBoxcountryName (), gbc_jComboBoxcountryName);
			GridBagConstraints gbc_jLabelIsDeleted = new GridBagConstraints ();
			gbc_jLabelIsDeleted.anchor = GridBagConstraints.EAST;
			gbc_jLabelIsDeleted.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIsDeleted.gridx = 2;
			gbc_jLabelIsDeleted.gridy = 10;
			jPanelAtributos.add (getJLabelIsDeleted (), gbc_jLabelIsDeleted);
			GridBagConstraints gbc_jComboBoxIsDeleted = new GridBagConstraints ();
			gbc_jComboBoxIsDeleted.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIsDeleted.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxIsDeleted.gridx = 3;
			gbc_jComboBoxIsDeleted.gridy = 10;
			jPanelAtributos.add (getJComboBoxIsDeleted (), gbc_jComboBoxIsDeleted);
			GridBagConstraints gbc_jLabelUsuario_Internet = new GridBagConstraints ();
			gbc_jLabelUsuario_Internet.anchor = GridBagConstraints.EAST;
			gbc_jLabelUsuario_Internet.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelUsuario_Internet.gridx = 0;
			gbc_jLabelUsuario_Internet.gridy = 11;
			jPanelAtributos.add (getJLabelUsuario_Internet (), gbc_jLabelUsuario_Internet);
			GridBagConstraints gbc_jTextFieldUsuario_Internet = new GridBagConstraints ();
			gbc_jTextFieldUsuario_Internet.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldUsuario_Internet.insets = new Insets (0, 0, 0, 5);
			gbc_jTextFieldUsuario_Internet.gridx = 1;
			gbc_jTextFieldUsuario_Internet.gridy = 11;
			jPanelAtributos.add (getJTextFieldUsuario_Internet (), gbc_jTextFieldUsuario_Internet);
			GridBagConstraints gbc_jLabelClave_Internet = new GridBagConstraints ();
			gbc_jLabelClave_Internet.anchor = GridBagConstraints.EAST;
			gbc_jLabelClave_Internet.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelClave_Internet.gridx = 2;
			gbc_jLabelClave_Internet.gridy = 11;
			jPanelAtributos.add (getJLabelClave_Internet (), gbc_jLabelClave_Internet);
			GridBagConstraints gbc_jTextFieldClave_Internet = new GridBagConstraints ();
			gbc_jTextFieldClave_Internet.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldClave_Internet.gridx = 3;
			gbc_jTextFieldClave_Internet.gridy = 11;
			jPanelAtributos.add (getJTextFieldClave_Internet (), gbc_jTextFieldClave_Internet);
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