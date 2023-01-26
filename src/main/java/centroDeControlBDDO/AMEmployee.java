package centroDeControlBDDO;

import java.awt.Cursor;

import java.awt.Dimension;

import java.awt.Frame;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.Insets;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JComboBox;

import javax.swing.JDialog;

import javax.swing.JEditorPane;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextField;

import javax.swing.SwingUtilities;

import javax.swing.border.TitledBorder;

public class AMEmployee extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMEmployee = null;

	private JLabel jLabelIdUser = null;

	private JTextField jTextFieldIdUser = null;

	private JLabel jLabelAccountNumber = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;

	private JTextField jTextFieldAccountNumber = null;
	
	private JLabel jLabelCompanySectionDescription = null;
	
	private JComboBox <String> jComboBoxCompanySectionDescription = null;
	
	private JLabel jLabelCompanySubsidiaryDescription = null;
	
	private JComboBox <String> jComboBoxCompanySubsidiaryDescription = null;
	
	private JLabel jLabelTradeName = null;
	
	private JComboBox <String> jComboBoxTradeName = null;
	
	private JLabel jLabelSheetNumber = null;
	
	private JTextField jTextFieldSheetNumber = null;
	
	private JLabel jLabelCuil = null;
	
	private JTextField jTextFieldCuil = null;
	
	private JLabel jLabelCitizenship = null;
	
	private JTextField jTextFieldCitizenship = null;
	
	private JLabel jLabelCountryStateDescription = null;
	
	private JComboBox <String> jComboBoxCountryStateDescription = null;
	
	private JLabel jLabelEmployeeMarriageStatusTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeMarriageStatusTypeDescription = null;
	
	private JLabel jLabelAddress = null;
	
	private JTextField jTextFieldAddress = null;
	
	private JLabel jLabelLocation = null;
	
	private JTextField jTextFieldLocation = null;
	
	private JCheckBox jCheckBoxBirthdate = null;
	
	private JDatePicker jDatePickerBirthdate = null;
	
	private JLabel jLabelEmployeeSexTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeSexTypeDescription = null;
	
	private JLabel jLabelEmployeeCitizenshipDocTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeCitizenshipDocTypeDescription = null;
	
	private JLabel jLabelCitizenshipDocumentNumber = null;
	
	private JTextField jTextFieldCitizenshipDocumentNumber = null;	
	
	private JCheckBox jCheckBoxDateEntry = null;
	
	private JDatePicker jDatePickerDateEntry = null;
	
	private JCheckBox jCheckBoxDateExit = null;
	
	private JDatePicker jDatePickerDateExit = null;
	
	private JLabel jLabelIdEmployeeAgreementType = null;
	
	private JTextField jTextFieldIdEmployeeAgreementType = null;
	
	private JLabel jLabelIsDeleted = null;
	
	private JComboBox <String> jComboBoxIsDeleted = null;
	
	private JLabel jLabelFirstName = null;
	
	private JTextField jTextFieldFirstName = null;
	
	private JLabel jLabelLastName = null;
	
	private JTextField jTextFieldLastName = null;
	
	private JLabel jLabelCurrentPhoneNumber = null;
	
	private JTextField jTextFieldCurrentPhoneNumber = null;
	
	private JLabel jLabelMobilePhoneNumber = null;
	
	private JTextField jTextFieldMobilePhoneNumber = null;
	
	private JCheckBox jCheckBoxPasswordUser = null;
	
	private JTextField jTextFieldPasswordUser = null;
	
	private JLabel jLabelIdRol = null;
	
	private JTextField jTextFieldIdRol = null;
	
	private JCheckBox jCheckBoxEmail = null;
	
	private JEditorPane jEditorPaneEmail = null;
	
	private JCheckBox jCheckBoxEmployeeKeyDoc = null;
	
	private JEditorPane jEditorPaneEmployeeKeyDoc = null;
	
	private JLabel jLabelIsFirstTime = null;
	
	private JComboBox <String> jComboBoxIsFirstTime = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;
	
	public AMEmployee (Frame owner, String titulo, String idEmployee, String idUser, String accountNumber, String idCompanySection, String idCompanySubsidiary, String tradeName, String sheetNumber, String cuil, String citizenship, String idCountryState, String idEmployeeMarriageStatusType, String address, String location, String birthdate, String idEmployeeSexType, String IdEmployeeCitizenshipDocType, String citizenshipDocumentNumber, String dateEntry, String dateExit, String idEmployeeAgreementType, String isDeleted, String firstName, String lastName, String currentPhoneNumber, String mobilePhoneNumber, String passwordUser, String idRol, String email, String employeeKeyDoc, String isFirstTime)
	{
		super (owner);
		initialize (titulo, idEmployee, idUser, accountNumber, idCompanySection, idCompanySubsidiary, tradeName, sheetNumber, cuil, citizenship, idCountryState, idEmployeeMarriageStatusType, address, location, birthdate, idEmployeeSexType, IdEmployeeCitizenshipDocType, citizenshipDocumentNumber, dateEntry, dateExit, idEmployeeAgreementType, isDeleted, firstName, lastName, currentPhoneNumber, mobilePhoneNumber, passwordUser, idRol, email, employeeKeyDoc, isFirstTime);
	}
	
	private void initialize (String titulo, String idEmployee, String idUser, String accountNumber, String idCompanySection, String idCompanySubsidiary, String tradeName, String sheetNumber, String cuil, String citizenship, String idCountryState, String idEmployeeMarriageStatusType, String address, String location, String birthdate, String idEmployeeSexType, String idEmployeeCitizenshipDocType, String citizenshipDocumentNumber, String dateEntry, String dateExit, String idEmployeeAgreementType, String isDeleted, String firstName, String lastName, String currentPhoneNumber, String mobilePhoneNumber, String passwordUser, String idRol, String email, String employeeKeyDoc, String isFirstTime)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMEmployee ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMEmployee (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMEmployee ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		getJTextFieldIdUser ().setText (idUser);
		getJTextFieldAccountNumber ().setText (accountNumber);		
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "Company, CompanySection, CompanySubsidiary", "TradeName", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany");
		getJTextFieldSheetNumber ().setText (sheetNumber);
		getJTextFieldCuil ().setText (cuil);
		getJTextFieldCitizenship ().setText (citizenship);
		Utilidades.cargarComboBox (getJComboBoxCountryStateDescription (), true, "CountryState", "Description", null);
		getJComboBoxCountryStateDescription ().setSelectedItem (idCountryState);
		Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), true, "EmployeeMarriageStatusType", "Description", null);
		getJComboBoxEmployeeMarriageStatusTypeDescription ().setSelectedItem (idEmployeeMarriageStatusType);
		getJTextFieldAddress ().setText (address);
		getJTextFieldLocation ().setText (location);
		getJCheckBoxBirthdate ().setSelected ((birthdate == null ? "" : birthdate.toString ()).toString ().isEmpty ());
		getJCheckBoxBirthdate ().doClick ();
		getJDatePickerBirthdate ().getJDateInstantPanel ().getModel().setSelected (true);
		
		if (! (birthdate == null ? "" : birthdate.toString ()).toString ().isEmpty ())
			
			try
			{
				getJDatePickerBirthdate ().getJDateInstantPanel ().getModel().setDate (Integer.valueOf (new SimpleDateFormat ("yyyy").format (new SimpleDateFormat ("dd/MM/yyyy").parse (birthdate))), Integer.valueOf (new SimpleDateFormat ("MM").format (new SimpleDateFormat ("dd/MM/yyyy").parse (birthdate))) - 1, Integer.valueOf (new SimpleDateFormat ("dd").format (new SimpleDateFormat ("dd/MM/yyyy").parse (birthdate))));
			}

			catch (ParseException e)
			{
				JOptionPane.showMessageDialog (null, e.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
			}

		Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), true, "EmployeeSexType", "Description", null);
		getJComboBoxEmployeeSexTypeDescription ().setSelectedItem (idEmployeeSexType);
		Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), true, "EmployeeCitizenshipDocType", "Description", null);
		getJComboBoxEmployeeCitizenshipDocTypeDescription ().setSelectedItem (idEmployeeCitizenshipDocType);
		getJTextFieldCitizenshipDocumentNumber ().setText (citizenshipDocumentNumber);
		getJCheckBoxDateEntry ().setSelected ((dateEntry == null ? "" : dateEntry.toString ()).toString ().isEmpty ());
		getJCheckBoxDateEntry ().doClick ();
		getJDatePickerDateEntry ().getJDateInstantPanel ().getModel().setSelected (true);
		
		if (! (dateEntry == null ? "" : dateEntry.toString ()).toString ().isEmpty ())
			
			try
			{
				getJDatePickerDateEntry ().getJDateInstantPanel ().getModel().setDate (Integer.valueOf (new SimpleDateFormat ("yyyy").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateEntry))), Integer.valueOf (new SimpleDateFormat ("MM").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateEntry))) - 1, Integer.valueOf (new SimpleDateFormat ("dd").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateEntry))));
			}

			catch (ParseException e)
			{
				JOptionPane.showMessageDialog (null, e.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
			}
		
		getJCheckBoxDateExit ().setSelected ((dateExit == null ? "" : dateExit.toString ()).toString ().isEmpty ());
		getJCheckBoxDateExit ().doClick ();
		getJDatePickerDateExit ().getJDateInstantPanel ().getModel().setSelected (true);
		
		if (! (dateExit == null ? "" : dateExit.toString ()).toString ().isEmpty ())
			
			try
			{
				getJDatePickerDateExit ().getJDateInstantPanel ().getModel().setDate (Integer.valueOf (new SimpleDateFormat ("yyyy").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateExit))), Integer.valueOf (new SimpleDateFormat ("MM").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateExit))) - 1, Integer.valueOf (new SimpleDateFormat ("dd").format (new SimpleDateFormat ("dd/MM/yyyy").parse (dateExit))));
			}

			catch (ParseException e)
			{
				JOptionPane.showMessageDialog (null, e.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
			}
		
		getJTextFieldIdEmployeeAgreementType ().setText (idEmployeeAgreementType);
		getJTextFieldIdEmployeeAgreementType ().setEditable (false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), true);
		getJComboBoxIsDeleted ().setSelectedItem (isDeleted);
		getJTextFieldFirstName ().setText (firstName);
		getJTextFieldLastName ().setText (lastName);
		getJTextFieldCurrentPhoneNumber ().setText (currentPhoneNumber);
		getJTextFieldMobilePhoneNumber ().setText (mobilePhoneNumber);
		getJCheckBoxPasswordUser ().setSelected ((passwordUser == null ? "" : passwordUser.toString ()).toString ().isEmpty ());
		getJCheckBoxPasswordUser ().doClick ();		
		getJCheckBoxPasswordUser ().setEnabled (false);
		getJTextFieldPasswordUser ().setText (passwordUser);
		getJTextFieldIdRol ().setText (idRol);
		getJTextFieldIdRol ().setEditable (false);
		getJCheckBoxEmail ().setSelected ((email == null ? "" : email.toString ()).toString ().isEmpty ());
		getJCheckBoxEmail ().doClick ();
		getJCheckBoxEmail ().setEnabled (false);
		getJEditorPaneEmail ().setText (email);
		getJEditorPaneEmail ().setEditable (false);		
		getJCheckBoxEmployeeKeyDoc ().setSelected ((employeeKeyDoc == null ? "" : employeeKeyDoc.toString ()).toString ().isEmpty ());
		getJCheckBoxEmployeeKeyDoc ().doClick ();
		getJCheckBoxEmployeeKeyDoc ().setEnabled (false);
		getJEditorPaneEmployeeKeyDoc ().setText (employeeKeyDoc);
		getJEditorPaneEmployeeKeyDoc ().setEditable (false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), true);
		getJComboBoxIsFirstTime ().setSelectedItem (isFirstTime);
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJComboBoxTradeName ().setSelectedItem (tradeName);
			getJComboBoxCompanySectionDescription ().setSelectedItem (idCompanySection);
			getJComboBoxCompanySubsidiaryDescription ().setSelectedItem (idCompanySubsidiary);
			getJCheckBoxBirthdate ().setSelected (birthdate.toString ().isEmpty ());
			getJCheckBoxBirthdate ().doClick ();
			
			if (birthdate.toString ().isEmpty ())
				
				getJDatePickerBirthdate ().getJDateInstantPanel ().getModel().setDate (1980, 0, 1);
			
			getJCheckBoxDateEntry ().setSelected (dateEntry.toString ().isEmpty ());
			getJCheckBoxDateEntry ().doClick ();
			getJCheckBoxDateExit ().setSelected (dateExit.toString ().isEmpty ());
			getJCheckBoxDateExit ().doClick ();
			getJCheckBoxPasswordUser ().setSelected (passwordUser.toString ().isEmpty ());
			getJCheckBoxPasswordUser ().doClick ();
			getJCheckBoxPasswordUser ().setEnabled (true);
			getJTextFieldPasswordUser ().setEditable (! getJCheckBoxPasswordUser ().isSelected ());
			getJCheckBoxEmail ().setSelected (email.toString ().isEmpty ());
			getJCheckBoxEmail ().doClick ();
			getJCheckBoxEmail ().setEnabled (true);
			getJCheckBoxEmployeeKeyDoc ().setSelected (employeeKeyDoc.toString ().isEmpty ());
			getJCheckBoxEmployeeKeyDoc ().doClick ();
			getJCheckBoxEmployeeKeyDoc ().setEnabled (true);			
			getJButtonAceptar ().setToolTipText (idEmployee);			
		}
		
		this.setVisible (true);		
	}
	
	private JPanel getJPanelAMEmployee ()
	{
		if (jPanelAMEmployee == null)
		{
			jPanelAMEmployee = new JPanel ();
			GridBagLayout gbl_jPanelAMEmployee = new GridBagLayout ();
			gbl_jPanelAMEmployee.columnWidths = new int [] {871, 0};
			gbl_jPanelAMEmployee.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMEmployee.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMEmployee.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMEmployee.setLayout (gbl_jPanelAMEmployee);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMEmployee.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMEmployee.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMEmployee;
	}
	
	private JTextField getJTextFieldIdUser ()
	{
		if (jTextFieldIdUser == null)
		{
			jTextFieldIdUser = new JTextField ();
		}
		
		return jTextFieldIdUser;
	}
	
	private JTextField getJTextFieldAccountNumber ()
	{
		if (jTextFieldAccountNumber == null)
		{
			jTextFieldAccountNumber = new JTextField ();
		}
		
		return jTextFieldAccountNumber;
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
					if (! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ())
					{
						Runnable runnable = new Runnable ()
						{
							public void run ()
							{
								getJButtonAceptar ().setEnabled (false);
								setEnabled (false);
								setCursor (new Cursor (Cursor.WAIT_CURSOR));
															
								Cargando cargando = new Cargando ();
								
								String idEmployeeByIdUser = Utilidades.devolverAtributoClave ("Employee, CompanySection, CompanySubsidiary, Company", "IdEmployee", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUser ().getText ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String idEmployeeByCuil = Utilidades.devolverAtributoClave ("Employee, CompanySection, CompanySubsidiary, Company", "IdEmployee", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Cuil = '" + getJTextFieldCuil ().getText ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
								
								String idEmployee = (getJButtonAceptar ().getToolTipText () == null ? "0" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();

								String idCompanySection = Utilidades.devolverAtributoClave ("Company, CompanySection", "IdCompanySection", "Company.IdCompany = CompanySection.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "' AND Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String accountNumber = (getJTextFieldAccountNumber ().getText ().toString ().isEmpty () ? "0" : getJTextFieldAccountNumber ().getText ().toString ()).toString ();
								
								String idCompanySubsidiary = Utilidades.devolverAtributoClave ("Company, CompanySubsidiary", "IdCompanySubsidiary", "Company.IdCompany = CompanySubsidiary.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "' AND Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String sheetNumber = (getJTextFieldSheetNumber ().getText ().toString ().isEmpty () ? "0" : getJTextFieldSheetNumber ().getText ().toString ()).toString ();
								
								String cuil = (getJTextFieldCuil ().getText ().toString ().isEmpty () ? "0" : getJTextFieldCuil ().getText ().toString ()).toString ();
								
								String idCountryState = Utilidades.devolverAtributoClave ("CountryState", "IdCountryState", "Description = '" + getJComboBoxCountryStateDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String idEmployeeMarriageStatus = Utilidades.devolverAtributoClave ("EmployeeMarriageStatusType", "IdEmployeeMarriageStatus", "Description = '" + getJComboBoxEmployeeMarriageStatusTypeDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String birthdate = Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (DATE, '" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getYear () + "'";
								
								String idEmployeeSexType = Utilidades.devolverAtributoClave ("EmployeeSexType", "IdEmployeeSexType", "Description = '" + getJComboBoxEmployeeSexTypeDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String idEmployeeCitizenshipDocType = Utilidades.devolverAtributoClave ("EmployeeCitizenshipDocType", "IdEmployeeCitizenshipDocType", "Description = '" + getJComboBoxEmployeeCitizenshipDocTypeDescription ().getSelectedItem ().toString () + "'").toString ();
								
								String citizenshipDocumentNumber = (getJTextFieldCitizenshipDocumentNumber ().getText ().toString ().isEmpty () ? "0" : getJTextFieldCitizenshipDocumentNumber ().getText ().toString ()).toString ();
								
								String dateEntry = Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (DATE, '" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getYear () + "'";

								String dateExit = Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (DATE, '" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getYear () + "'";
								
								String employeeAgreementType = (getJTextFieldIdEmployeeAgreementType ().getText ().toString ().isEmpty () ? "0" : getJTextFieldIdEmployeeAgreementType ().getText ().toString ()).toString ();
								
								String isDeleted = (getJComboBoxIsDeleted ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();
								
								String passwordUser = (getJCheckBoxPasswordUser ().isSelected () ? "26beb9ec71df05090c39556ec9d5968b4060afdb" : getJTextFieldPasswordUser ().getText ().toString ()).toString ();
								
								String rol = (getJTextFieldIdRol ().getText ().toString ().isEmpty () ? "0" : getJTextFieldIdRol ().getText ().toString ()).toString ();
								
								String email = (getJCheckBoxEmail ().isSelected () ? "Y78lSqJ9z7yL+Vi01Mj/xFLVbnxM4yPzU2p4XotS/BeTwo7nXM8F6IWvdcK4m6Hgx8liAebkZxwQy3vMoObbyXx6nRDl709j8eq+Rykz6KavloxYVKcNJM6kOcNnVof8WPkM6+Woi/2MmHz58hxE4vclRkwLPxCdnC0lurW+SgI=" : getJEditorPaneEmail ().getText ().toString ()).toString ();
								
								String isFirstTime = (getJComboBoxIsFirstTime ().getSelectedItem ().toString ().equals ("Verdadero") ? "1" : "0").toString ();

								if (getTitle ().toString ().equals ("Agregar")
								?
								(idEmployeeByIdUser.equals ("0") && idEmployeeByCuil.equals ("0"))
								://si es modificar
									(idEmployee.equals (idEmployeeByIdUser) && idEmployee.equals (idEmployeeByCuil))
									?
									(! idEmployeeByIdUser.equals ("0") && ! idEmployeeByCuil.equals ("0"))
									:
										(idEmployeeByIdUser.equals ("0") && idEmployeeByCuil.equals ("0"))
										||
								        ((! idEmployeeByIdUser.equals ("0") && idEmployeeByIdUser.equals (idEmployee) && idEmployeeByCuil.equals ("0"))
										||
										(idEmployeeByIdUser.equals ("0") && (! idEmployeeByCuil.equals ("0") && idEmployeeByCuil.equals (idEmployee))))
								)					
								{
									if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
									{
										if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO Employee (IdUser, AccountNumber, IdCompanySection, IdCompanySubsidiary, SheetNumber, Cuil, Citizenship, IdCountryState, IdEmployeeMarriageStatusType, Address, Location, Birthdate, IdEmployeeSexType, IdEmployeeCitizenshipDocType, CitizenshipDocumentNumber, DateEntry, DateExit, IdEmployeeAgreementType, IsDeleted, FirstName, LastName, CurrentPhoneNumber, MobilePhoneNumber, PasswordUser, IdRol, Email, EmployeeKeyDoc, IsFirstTime) VALUES ('" + getJTextFieldIdUser ().getText ().toString () + "', " + accountNumber + ", " + idCompanySection + ", " + idCompanySubsidiary + ", " + sheetNumber + ", " + cuil + ", '" + getJTextFieldCitizenship ().getText ().toString () + "', " + idCountryState + ", " + idEmployeeMarriageStatus + ", '" + getJTextFieldAddress ().getText ().toString () + "', '" + getJTextFieldLocation ().getText ().toString () + (getJCheckBoxBirthdate ().isSelected () ? "', " + (birthdate) + ", " : "', NULL, ") + idEmployeeSexType + ", " + idEmployeeCitizenshipDocType + ", " + citizenshipDocumentNumber + (getJCheckBoxDateEntry ().isSelected () ? ", " + (dateEntry) + (getJCheckBoxDateExit ().isSelected () ? ", " : ", ") : (getJCheckBoxDateExit ().isSelected () ? ", NULL, " : ", NULL, ")) + (getJCheckBoxDateExit ().isSelected () ? (dateExit + "'") + ", " : "NULL, ") + employeeAgreementType + ", " + isDeleted + ", '" + getJTextFieldFirstName ().getText ().toString () + "', '" + getJTextFieldLastName ().getText ().toString () + "', '" + getJTextFieldCurrentPhoneNumber ().getText ().toString () + "', '" + getJTextFieldMobilePhoneNumber ().getText ().toString () + "', '" + passwordUser + "', " + rol + ", '" + email + "', '" + getJEditorPaneEmployeeKeyDoc ().getText ().toString () + "', " + isFirstTime + ")" : "UPDATE Employee SET IdUser = '" + getJTextFieldIdUser ().getText ().toString () + "', AccountNumber = " + accountNumber + ", IdCompanySection = " + idCompanySection + ", IdCompanySubsidiary = " + idCompanySubsidiary + ", SheetNumber = " + sheetNumber + ", Cuil = " + cuil + ", Citizenship = '" + getJTextFieldCitizenship ().getText ().toString () + "', IdCountryState = " + idCountryState + ", IdEmployeeMarriageStatusType = " + idEmployeeMarriageStatus + ", Address = '" + getJTextFieldAddress ().getText ().toString () + "', Location = '" + getJTextFieldLocation ().getText ().toString () + "', Birthdate = " + (getJCheckBoxBirthdate ().isSelected () ? (birthdate) : "NULL") + ", IdEmployeeSexType = " + idEmployeeSexType + ", IdEmployeeCitizenshipDocType = " + idEmployeeCitizenshipDocType + ", CitizenshipDocumentNumber = " + citizenshipDocumentNumber + ", DateEntry = " + (getJCheckBoxDateEntry ().isSelected () ? (dateEntry) : "NULL") + ", DateExit = " + (getJCheckBoxDateExit ().isSelected () ? (dateExit) : "NULL") + ", IdEmployeeAgreementType = " + employeeAgreementType + ", IsDeleted = " + isDeleted + ", FirstName = '" + getJTextFieldFirstName ().getText ().toString () + "', LastName = '" + getJTextFieldLastName ().getText ().toString () + "', CurrentPhoneNumber = '" + getJTextFieldCurrentPhoneNumber ().getText ().toString () + "', MobilePhoneNumber = '" + getJTextFieldMobilePhoneNumber ().getText ().toString () + "', PasswordUser = '" + passwordUser + "', IdRol = " + rol + ", Email = '" + email + "', EmployeeKeyDoc = '" + getJEditorPaneEmployeeKeyDoc ().getText ().toString () + "', IsFirstTime = " + isFirstTime + " WHERE IdEmployee = " + idEmployee))
										{
											Utilidades.finalizarTransaccionALaBaseDeDatos ();
											JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);
													
											if (getTitle ().toString ().equals ("Agregar"))
											{
												getJTextFieldIdUser ().setText ("");
												getJTextFieldAccountNumber ().setText ("");
												getJTextFieldSheetNumber ().setText ("");
												getJTextFieldCuil ().setText ("");
												getJTextFieldCitizenship ().setText ("ARGENTINA");
												getJComboBoxCountryStateDescription ().setSelectedItem ("CORDOBA");
												getJComboBoxEmployeeMarriageStatusTypeDescription ().setSelectedItem ("Soltero/a");
												getJTextFieldAddress ().setText ("");
												getJTextFieldLocation ().setText ("");
												
												if (! getJCheckBoxBirthdate ().isSelected ())
															
													getJCheckBoxBirthdate ().doClick ();
												
												getJDatePickerBirthdate ().getJDateInstantPanel ().getModel().setSelected (true);
												getJDatePickerBirthdate ().getJDateInstantPanel ().getModel().setDate (1980, 0, 1);
												getJComboBoxEmployeeSexTypeDescription ().setSelectedItem ("Hombre");
												getJComboBoxEmployeeCitizenshipDocTypeDescription ().setSelectedItem ("DNI");
												getJTextFieldCitizenshipDocumentNumber ().setText ("");
												
												if (! getJCheckBoxDateEntry ().isSelected ())
															
													getJCheckBoxDateEntry ().doClick ();
												
												getJDatePickerDateEntry ().getJDateInstantPanel ().getModel().setSelected (true);
												getJDatePickerDateEntry ().getJDateInstantPanel ().getModel().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
												
												if (! getJCheckBoxDateExit ().isSelected ())
															
													getJCheckBoxDateExit ().doClick ();										
														
												getJDatePickerDateExit ().getJDateInstantPanel ().getModel().setSelected (true);
												getJDatePickerDateExit ().getJDateInstantPanel ().getModel().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
												getJComboBoxIsDeleted ().setSelectedItem ("Falso");
												getJTextFieldFirstName ().setText ("");
												getJTextFieldLastName ().setText ("");
												getJTextFieldCurrentPhoneNumber ().setText ("");
												getJTextFieldMobilePhoneNumber ().setText ("");
												getJComboBoxIsFirstTime ().setSelectedItem ("Falso");
												getJTextFieldIdUser ().requestFocus ();
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

									JOptionPane.showMessageDialog (null, (! idEmployeeByIdUser.equals ("0") && idEmployeeByCuil.equals ("0")) ? "El empleado " + getJTextFieldIdUser ().getText ().toString () + ", ya est\u00e1 asignado a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + "." : (idEmployeeByIdUser.equals ("0") && ! idEmployeeByCuil.equals ("0")) ? "El C.U.I.L. " + getJTextFieldCuil ().getText ().toString () + ", ya est\u00e1 asignado a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + "." : "El empleado " + getJTextFieldIdUser ().getText ().toString () + " y C.U.I.L. " + getJTextFieldCuil ().getText ().toString () + ", ya est\u00e1 asignado a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);

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
						
						JOptionPane.showMessageDialog (null, 
						! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "El campo PasswordUser es requerido."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "El campo LastName es requerido."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos LastName y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "El campo FirstName es requerido."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos FirstName y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos FirstName y LastName son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos FirstName, LastName y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "El campo Cuil es requerido."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil y LastName son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil, LastName y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil y FirstName son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil, FirstName y PasswordUser son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil, FirstName y LastName son requeridos."
						: ! getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos Cuil, FirstName, LastName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "El campo IdUser es requerido."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser y LastName son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, LastName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser y FirstName son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, FirstName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, FirstName y LastName son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && ! getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, FirstName, LastName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser y Cuil son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil y LastName son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && ! getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil, LastName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil y FirstName son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && ! getJTextFieldLastName ().getText ().toString ().isEmpty () && getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil, FirstName y PasswordUser son requeridos."
						: getJTextFieldIdUser ().getText ().toString ().isEmpty () && getJTextFieldCuil ().getText ().toString ().isEmpty () && getJTextFieldFirstName ().getText ().toString ().isEmpty () && getJTextFieldLastName ().getText ().toString ().isEmpty () && ! getJTextFieldPasswordUser ().getText ().toString ().isEmpty ()
						? "Los campos IdUser, Cuil, FirstName y LastName son requeridos."
						: "Los campos IdUser, Cuil, FirstName, LastName y PasswordUser son requeridos.", getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
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
	
	private JLabel getJLabelCompanySectionDescription ()
	{
		if (jLabelCompanySectionDescription == null)
		{
			jLabelCompanySectionDescription = new JLabel ("CompanySectionDescription:");
		}
		
		return jLabelCompanySectionDescription;
	}
	
	private JComboBox <String> getJComboBoxCompanySectionDescription ()
	{
		if (jComboBoxCompanySectionDescription == null)
		{
			jComboBoxCompanySectionDescription = new JComboBox <String> ();
		}
		
		return jComboBoxCompanySectionDescription;
	}
	
	private JLabel getJLabelCompanySubsidiaryDescription ()
	{
		if (jLabelCompanySubsidiaryDescription == null)
		{
			jLabelCompanySubsidiaryDescription = new JLabel ("CompanySubsidiaryDescription:");
		}
		
		return jLabelCompanySubsidiaryDescription;
	}
	
	private JComboBox <String> getJComboBoxCompanySubsidiaryDescription ()
	{
		if (jComboBoxCompanySubsidiaryDescription == null)
		{
			jComboBoxCompanySubsidiaryDescription = new JComboBox <String> ();
		}
		
		return jComboBoxCompanySubsidiaryDescription;
	}
	
	private JLabel getJLabelTradeName ()
	{
		if (jLabelTradeName == null)
		{
			jLabelTradeName = new JLabel ("TradeName:");
		}
		
		return jLabelTradeName;
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
							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), true, "Company, CompanySection, CompanySubsidiary", "CompanySection.Description", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
							Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), true, "Company, CompanySection, CompanySubsidiary", "CompanySubsidiary.Description", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
							cargando.dispose ();
						}
					};

					if (e.getStateChange () == ItemEvent.SELECTED)
					{
						if (SwingUtilities.isEventDispatchThread ())

							new Thread (runnable).start ();

						else
						{
							Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), true, "Company, CompanySection, CompanySubsidiary", "CompanySection.Description", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
							Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), true, "Company, CompanySection, CompanySubsidiary", "CompanySubsidiary.Description", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
						}
					}
				}
			}
			);
		}
		
		return jComboBoxTradeName;
	}
	
	private JLabel getJLabelSheetNumber ()
	{
		if (jLabelSheetNumber == null)
		{
			jLabelSheetNumber = new JLabel ("SheetNumber:");
		}
		
		return jLabelSheetNumber;
	}
	
	private JTextField getJTextFieldSheetNumber ()
	{
		if (jTextFieldSheetNumber == null)
		{
			jTextFieldSheetNumber = new JTextField ();
		}
		
		return jTextFieldSheetNumber;
	}
	
	private JLabel getJLabelCuil ()
	{
		if (jLabelCuil == null)
		{
			jLabelCuil = new JLabel ("<html>Cuil (<font color='red'>*</font>):</html>");
		}
		
		return jLabelCuil;
	}
	
	private JTextField getJTextFieldCuil ()
	{
		if (jTextFieldCuil == null)
		{
			jTextFieldCuil = new JTextField ();
		}
		
		return jTextFieldCuil;
	}
	
	private JLabel getJLabelCitizenship ()
	{
		if (jLabelCitizenship == null)
		{
			jLabelCitizenship = new JLabel ("Citizenship:");
		}
		
		return jLabelCitizenship;
	}
	
	private JTextField getJTextFieldCitizenship ()
	{
		if (jTextFieldCitizenship == null)
		{
			jTextFieldCitizenship = new JTextField ();
		}
		
		return jTextFieldCitizenship;
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
		}
		
		return jComboBoxCountryStateDescription;
	}
	
	private JLabel getJLabelEmployeeMarriageStatusTypeDescription ()
	{
		if (jLabelEmployeeMarriageStatusTypeDescription == null)
		{
			jLabelEmployeeMarriageStatusTypeDescription = new JLabel ("EmployeeMarriageStatusTypeDescription:");
		}
		
		return jLabelEmployeeMarriageStatusTypeDescription;
	}
	
	private JComboBox <String> getJComboBoxEmployeeMarriageStatusTypeDescription ()
	{
		if (jComboBoxEmployeeMarriageStatusTypeDescription == null)
		{
			jComboBoxEmployeeMarriageStatusTypeDescription = new JComboBox <String> ();
		}
		
		return jComboBoxEmployeeMarriageStatusTypeDescription;
	}
	
	private JLabel getJLabelAddress ()
	{
		if (jLabelAddress == null)
		{
			jLabelAddress = new JLabel ("Address:");
		}
		
		return jLabelAddress;
	}
	
	private JTextField getJTextFieldAddress ()
	{
		if (jTextFieldAddress == null)
		{
			jTextFieldAddress = new JTextField ();
		}
		
		return jTextFieldAddress;
	}
	
	private JLabel getJLabelLocation ()
	{
		if (jLabelLocation == null)
		{
			jLabelLocation = new JLabel ("Location:");
		}
		
		return jLabelLocation;
	}
	
	private JTextField getJTextFieldLocation ()
	{
		if (jTextFieldLocation == null)
		{
			jTextFieldLocation = new JTextField ();
		}
		
		return jTextFieldLocation;
	}
	
	private JCheckBox getJCheckBoxBirthdate ()
	{
		if (jCheckBoxBirthdate == null)
		{
			jCheckBoxBirthdate = new JCheckBox ("Birthdate:");
			jCheckBoxBirthdate.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					getJDatePickerBirthdate ().setEnabled (getJCheckBoxBirthdate ().isSelected ());
				}
			}
			);
		}
		
		return jCheckBoxBirthdate;
	}
	
	private JDatePicker getJDatePickerBirthdate ()
	{
		if (jDatePickerBirthdate == null)
		{
			jDatePickerBirthdate = new JDatePicker ();
			jDatePickerBirthdate.setShowYearButtons (true);
			jDatePickerBirthdate.setTextEditable (false);
		}
		
		return jDatePickerBirthdate;
	}
	
	private JLabel getJLabelEmployeeSexTypeDescription ()
	{
		if (jLabelEmployeeSexTypeDescription == null)
		{
			jLabelEmployeeSexTypeDescription = new JLabel ("EmployeeSexTypeDescription:");
		}
		
		return jLabelEmployeeSexTypeDescription;
	}
	
	private JComboBox <String> getJComboBoxEmployeeSexTypeDescription ()
	{
		if (jComboBoxEmployeeSexTypeDescription == null)
		{
			jComboBoxEmployeeSexTypeDescription = new JComboBox <String> ();
		}
		
		return jComboBoxEmployeeSexTypeDescription;
	}
	
	private JLabel getJLabelEmployeeCitizenshipDocTypeDescription ()
	{
		if (jLabelEmployeeCitizenshipDocTypeDescription == null)
		{
			jLabelEmployeeCitizenshipDocTypeDescription = new JLabel ("EmployeeCitizenshipDocTypeDescription:");
		}
		
		return jLabelEmployeeCitizenshipDocTypeDescription;
	}
	
	private JComboBox <String> getJComboBoxEmployeeCitizenshipDocTypeDescription ()
	{
		if (jComboBoxEmployeeCitizenshipDocTypeDescription == null)
		{
			jComboBoxEmployeeCitizenshipDocTypeDescription = new JComboBox <String> ();
		}
		
		return jComboBoxEmployeeCitizenshipDocTypeDescription;
	}
	
	private JLabel getJLabelCitizenshipDocumentNumber ()
	{
		if (jLabelCitizenshipDocumentNumber == null)
		{
			jLabelCitizenshipDocumentNumber = new JLabel ("CitizenshipDocumentNumber:");
		}
		
		return jLabelCitizenshipDocumentNumber;
	}
	
	private JTextField getJTextFieldCitizenshipDocumentNumber ()
	{
		if (jTextFieldCitizenshipDocumentNumber == null)		
		{
			jTextFieldCitizenshipDocumentNumber = new JTextField ();
		}
		
		return jTextFieldCitizenshipDocumentNumber;
	}
	
	private JCheckBox getJCheckBoxDateEntry ()
	{
		if (jCheckBoxDateEntry == null)
		{
			jCheckBoxDateEntry = new JCheckBox ("DateEntry:");
			jCheckBoxDateEntry.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					getJDatePickerDateEntry ().setEnabled (getJCheckBoxDateEntry ().isSelected ());
				}
			}
			);
		}
		
		return jCheckBoxDateEntry;
	}
	
	private JDatePicker getJDatePickerDateEntry ()
	{
		if (jDatePickerDateEntry == null)
		{
			jDatePickerDateEntry = new JDatePicker ();
			jDatePickerDateEntry.setShowYearButtons (true);
			jDatePickerDateEntry.setTextEditable (false);
		}
		
		return jDatePickerDateEntry;
	}
	
	private JCheckBox getJCheckBoxDateExit ()
	{
		if (jCheckBoxDateExit == null)
		{
			jCheckBoxDateExit = new JCheckBox ("DateExit:");
			jCheckBoxDateExit.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					getJDatePickerDateExit ().setEnabled (getJCheckBoxDateExit ().isSelected ());
				}
			}
			);
		}
		
		return jCheckBoxDateExit;
	}
	
	private JDatePicker getJDatePickerDateExit ()
	{
		if (jDatePickerDateExit == null)
		{
			jDatePickerDateExit = new JDatePicker ();
			jDatePickerDateExit.setShowYearButtons (true);
			jDatePickerDateExit.setTextEditable (false);
		}
		
		return jDatePickerDateExit;
	}
	
	private JLabel getJLabelIdEmployeeAgreementType ()
	{
		if (jLabelIdEmployeeAgreementType == null)
		{
			jLabelIdEmployeeAgreementType = new JLabel ("IdEmployeeAgreementType:");
		}
		
		return jLabelIdEmployeeAgreementType;
	}
	
	private JTextField getJTextFieldIdEmployeeAgreementType ()
	{
		if (jTextFieldIdEmployeeAgreementType == null)
		{
			jTextFieldIdEmployeeAgreementType = new JTextField ();
		}
		
		return jTextFieldIdEmployeeAgreementType;
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
	
	private JLabel getJLabelFirstName ()
	{
		if (jLabelFirstName == null)
		{
			jLabelFirstName = new JLabel ("<html>FirstName (<font color='red'>*</font>):</html>");
		}
		
		return jLabelFirstName;
	}
	
	private JTextField getJTextFieldFirstName ()
	{
		if (jTextFieldFirstName == null)
		{
			jTextFieldFirstName = new JTextField ();
		}
		
		return jTextFieldFirstName;
	}
	
	private JLabel getJLabelLastName ()
	{
		if (jLabelLastName == null)
		{
			jLabelLastName = new JLabel ("<html>LastName (<font color='red'>*</font>):</html>");
		}
		
		return jLabelLastName;
	}
	
	private JTextField getJTextFieldLastName ()
	{
		if (jTextFieldLastName == null)
		{
			jTextFieldLastName = new JTextField ();
		}
		
		return jTextFieldLastName;
	}
	
	private JLabel getJLabelCurrentPhoneNumber ()
	{
		if (jLabelCurrentPhoneNumber == null)
		{
			jLabelCurrentPhoneNumber = new JLabel ("CurrentPhoneNumber:");
		}
		
		return jLabelCurrentPhoneNumber;
	}
	
	private JTextField getJTextFieldCurrentPhoneNumber ()
	{
		if (jTextFieldCurrentPhoneNumber == null)
		{
			jTextFieldCurrentPhoneNumber = new JTextField ();
		}
		
		return jTextFieldCurrentPhoneNumber;
	}
	
	private JLabel getJLabelMobilePhoneNumber ()
	{
		if (jLabelMobilePhoneNumber == null)
		{
			jLabelMobilePhoneNumber = new JLabel ("MobilePhoneNumber:");
		}
		
		return jLabelMobilePhoneNumber;
	}
	
	private JTextField getJTextFieldMobilePhoneNumber ()
	{
		if (jTextFieldMobilePhoneNumber == null)
		{
			jTextFieldMobilePhoneNumber = new JTextField ();
		}
		
		return jTextFieldMobilePhoneNumber;
	}
	
	private JCheckBox getJCheckBoxPasswordUser ()
	{
		if (jCheckBoxPasswordUser == null)
		{
			jCheckBoxPasswordUser = new JCheckBox ("<html>PasswordUser (<font color='red'>*</font>):</html>");
			jCheckBoxPasswordUser.addActionListener(new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					if (getJCheckBoxPasswordUser ().isSelected ())

						getJTextFieldPasswordUser ().setText ("PASsword015*");

					else

						getJTextFieldPasswordUser ().setText (Utilidades.devolverAtributoClave ("Employee", "PasswordUser", "IdEmployee = " + getJButtonAceptar ().getToolTipText ()));

					getJTextFieldPasswordUser ().setEditable (! getJCheckBoxPasswordUser ().isSelected ());
				}
			}
			);
		}
		
		return jCheckBoxPasswordUser;
	}
	
	private JTextField getJTextFieldPasswordUser ()
	{
		if (jTextFieldPasswordUser == null)
		{
			jTextFieldPasswordUser = new JTextField ();
		}
		
		return jTextFieldPasswordUser;
	}
	
	private JLabel getJLabelIdRol ()
	{
		if (jLabelIdRol == null)
		{
			jLabelIdRol = new JLabel ("IdRol:");
		}
		
		return jLabelIdRol;
	}
	
	private JTextField getJTextFieldIdRol ()
	{
		if (jTextFieldIdRol == null)
		{
			jTextFieldIdRol = new JTextField ();
		}
		
		return jTextFieldIdRol;
	}
	
	private JCheckBox getJCheckBoxEmail ()
	{
		if (jCheckBoxEmail == null)
		{
			jCheckBoxEmail = new JCheckBox ("Email:");
			jCheckBoxEmail.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					if (getJCheckBoxEmail ().isSelected ())
						
						getJEditorPaneEmail ().setText ("EmailPrueba@EmailPrueba.com.ar");
					
					else
						
						getJEditorPaneEmail ().setText (Utilidades.devolverAtributoClave ("Employee", "Email", "IdEmployee = " + getJButtonAceptar ().getToolTipText ()));
				}
			}
			);
		}
		
		return jCheckBoxEmail;
	}
	
	private JEditorPane getJEditorPaneEmail ()
	{
		if (jEditorPaneEmail == null)
		{
			jEditorPaneEmail = new JEditorPane ();
		}
		
		return jEditorPaneEmail;
	}
	
	private JCheckBox getJCheckBoxEmployeeKeyDoc ()
	{
		if (jCheckBoxEmployeeKeyDoc == null)
		{
			jCheckBoxEmployeeKeyDoc = new JCheckBox ("EmployeeKeyDoc:");
			jCheckBoxEmployeeKeyDoc.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					if (getJCheckBoxEmployeeKeyDoc ().isSelected ())
						
						getJEditorPaneEmployeeKeyDoc ().setText ("AUN/FdiHrRdyvQ8jusHccna0RMqc/8l5XFP8p1jPFxZ6EwfFXxN6NpbdWSLbKQRKDNgRabKQRplVTw7hGxD2ZEBueCrOMtHZKYEkncVD/W37JN4Gy0AVs4QC7Ar1wV7tXljx02bCTe9MYoVWwgPa4KfBCF6aX2JS36A3BaniQOU=");
					
					else
						
						getJEditorPaneEmployeeKeyDoc ().setText (Utilidades.devolverAtributoClave ("Employee", "EmployeeKeyDoc", "IdEmployee = " + getJButtonAceptar ().getToolTipText ()));
				}
			}
			);
		}
		
		return jCheckBoxEmployeeKeyDoc;
	}
	
	private JEditorPane getJEditorPaneEmployeeKeyDoc ()
	{
		if (jEditorPaneEmployeeKeyDoc == null)
		{
			jEditorPaneEmployeeKeyDoc = new JEditorPane ();
		}
		
		return jEditorPaneEmployeeKeyDoc;
	}
	
	private JLabel getJLabelIsFirstTime ()
	{
		if (jLabelIsFirstTime == null)
		{
			jLabelIsFirstTime = new JLabel ("IsFirstTime:");
		}
		
		return jLabelIsFirstTime;
	}
	
	private JComboBox <String> getJComboBoxIsFirstTime ()
	{
		if (jComboBoxIsFirstTime == null)
		{
			jComboBoxIsFirstTime = new JComboBox <String> ();
		}
		
		return jComboBoxIsFirstTime;
	}
	
	private JPanel getJPanelAtributos ()
	{
		if (jPanelAtributos == null)
		{
			jPanelAtributos = new JPanel ();
			GridBagLayout gbl_jPanelAtributos = new GridBagLayout ();
			gbl_jPanelAtributos.columnWidths = new int [] {233, 492, 238, 433, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 22, 22, 22, 22, 25, 22, 25, 22, 22, 22, 25, 25, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			jLabelIdUser = new JLabel ();
			GridBagConstraints gbc_jLabelIdUser = new GridBagConstraints ();
			gbc_jLabelIdUser.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdUser.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdUser.gridx = 0;
			gbc_jLabelIdUser.gridy = 0;
			jPanelAtributos.add (jLabelIdUser, gbc_jLabelIdUser);
			jLabelIdUser.setText ("<html>IdUser (<font color = 'red'>*</font>):</html>");
			GridBagConstraints gbc_jTextFieldIdUser = new GridBagConstraints ();
			gbc_jTextFieldIdUser.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdUser.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldIdUser.gridx = 1;
			gbc_jTextFieldIdUser.gridy = 0;
			jPanelAtributos.add (getJTextFieldIdUser (), gbc_jTextFieldIdUser);
			jLabelAccountNumber = new JLabel ();
			GridBagConstraints gbc_jLabelAccountNumber = new GridBagConstraints ();
			gbc_jLabelAccountNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelAccountNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAccountNumber.gridx = 2;
			gbc_jLabelAccountNumber.gridy = 0;
			jPanelAtributos.add (jLabelAccountNumber, gbc_jLabelAccountNumber);
			jLabelAccountNumber.setText ("AccountNumber:");
			GridBagConstraints gbc_jTextFieldAccountNumber = new GridBagConstraints ();
			gbc_jTextFieldAccountNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAccountNumber.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldAccountNumber.gridx = 3;
			gbc_jTextFieldAccountNumber.gridy = 0;
			jPanelAtributos.add (getJTextFieldAccountNumber (), gbc_jTextFieldAccountNumber);
			GridBagConstraints gbc_jLabelCompanySectionDescription = new GridBagConstraints ();
			gbc_jLabelCompanySectionDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySectionDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySectionDescription.gridx = 0;
			gbc_jLabelCompanySectionDescription.gridy = 1;
			jPanelAtributos.add (getJLabelCompanySectionDescription (), gbc_jLabelCompanySectionDescription);
			GridBagConstraints gbc_jComboBoxCompanySectionDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanySectionDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanySectionDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanySectionDescription.gridx = 1;
			gbc_jComboBoxCompanySectionDescription.gridy = 1;
			jPanelAtributos.add (getJComboBoxCompanySectionDescription (), gbc_jComboBoxCompanySectionDescription);
			GridBagConstraints gbc_jLabelCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jLabelCompanySubsidiaryDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySubsidiaryDescription.gridx = 2;
			gbc_jLabelCompanySubsidiaryDescription.gridy = 1;
			jPanelAtributos.add (getJLabelCompanySubsidiaryDescription (), gbc_jLabelCompanySubsidiaryDescription);
			GridBagConstraints gbc_jComboBoxCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanySubsidiaryDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxCompanySubsidiaryDescription.gridx = 3;
			gbc_jComboBoxCompanySubsidiaryDescription.gridy = 1;
			jPanelAtributos.add (getJComboBoxCompanySubsidiaryDescription (), gbc_jComboBoxCompanySubsidiaryDescription);
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeName.gridx = 0;
			gbc_jLabelTradeName.gridy = 2;
			jPanelAtributos.add (getJLabelTradeName (), gbc_jLabelTradeName);
			GridBagConstraints gbc_jComboBoxTradeName = new GridBagConstraints ();
			gbc_jComboBoxTradeName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTradeName.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxTradeName.gridx = 1;
			gbc_jComboBoxTradeName.gridy = 2;
			jPanelAtributos.add (getJComboBoxTradeName (), gbc_jComboBoxTradeName);
			GridBagConstraints gbc_jLabelSheetNumber = new GridBagConstraints ();
			gbc_jLabelSheetNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelSheetNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelSheetNumber.gridx = 2;
			gbc_jLabelSheetNumber.gridy = 2;
			jPanelAtributos.add (getJLabelSheetNumber (), gbc_jLabelSheetNumber);
			GridBagConstraints gbc_jTextFieldSheetNumber = new GridBagConstraints ();
			gbc_jTextFieldSheetNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldSheetNumber.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldSheetNumber.gridx = 3;
			gbc_jTextFieldSheetNumber.gridy = 2;
			jPanelAtributos.add (getJTextFieldSheetNumber (), gbc_jTextFieldSheetNumber);
			GridBagConstraints gbc_jLabelCuil = new GridBagConstraints ();
			gbc_jLabelCuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCuil.gridx = 0;
			gbc_jLabelCuil.gridy = 3;
			jPanelAtributos.add (getJLabelCuil (), gbc_jLabelCuil);
			GridBagConstraints gbc_jTextFieldCuil = new GridBagConstraints ();
			gbc_jTextFieldCuil.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuil.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldCuil.gridx = 1;
			gbc_jTextFieldCuil.gridy = 3;
			jPanelAtributos.add (getJTextFieldCuil (), gbc_jTextFieldCuil);
			GridBagConstraints gbc_jLabelCitizenship = new GridBagConstraints ();
			gbc_jLabelCitizenship.anchor = GridBagConstraints.EAST;
			gbc_jLabelCitizenship.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCitizenship.gridx = 2;
			gbc_jLabelCitizenship.gridy = 3;
			jPanelAtributos.add (getJLabelCitizenship (), gbc_jLabelCitizenship);
			GridBagConstraints gbc_jTextFieldCitizenship = new GridBagConstraints ();
			gbc_jTextFieldCitizenship.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCitizenship.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldCitizenship.gridx = 3;
			gbc_jTextFieldCitizenship.gridy = 3;
			jPanelAtributos.add (getJTextFieldCitizenship (), gbc_jTextFieldCitizenship);
			GridBagConstraints gbc_jLabelCountryStateDescription = new GridBagConstraints ();
			gbc_jLabelCountryStateDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCountryStateDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCountryStateDescription.gridx = 0;
			gbc_jLabelCountryStateDescription.gridy = 4;
			jPanelAtributos.add (getJLabelCountryStateDescription (), gbc_jLabelCountryStateDescription);
			GridBagConstraints gbc_jComboBoxCountryStateDescription = new GridBagConstraints ();
			gbc_jComboBoxCountryStateDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCountryStateDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCountryStateDescription.gridx = 1;
			gbc_jComboBoxCountryStateDescription.gridy = 4;
			jPanelAtributos.add (getJComboBoxCountryStateDescription (), gbc_jComboBoxCountryStateDescription);
			GridBagConstraints gbc_jLabelEmployeeMarriageStatusTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeMarriageStatusTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeMarriageStatusTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeMarriageStatusTypeDescription.gridx = 2;
			gbc_jLabelEmployeeMarriageStatusTypeDescription.gridy = 4;
			jPanelAtributos.add (getJLabelEmployeeMarriageStatusTypeDescription (), gbc_jLabelEmployeeMarriageStatusTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeMarriageStatusTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.gridx = 3;
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.gridy = 4;
			jPanelAtributos.add (getJComboBoxEmployeeMarriageStatusTypeDescription (), gbc_jComboBoxEmployeeMarriageStatusTypeDescription);
			GridBagConstraints gbc_jLabelAddress = new GridBagConstraints ();
			gbc_jLabelAddress.anchor = GridBagConstraints.EAST;
			gbc_jLabelAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAddress.gridx = 0;
			gbc_jLabelAddress.gridy = 5;
			jPanelAtributos.add (getJLabelAddress (), gbc_jLabelAddress);
			GridBagConstraints gbc_jTextFieldAddress = new GridBagConstraints ();
			gbc_jTextFieldAddress.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldAddress.gridx = 1;
			gbc_jTextFieldAddress.gridy = 5;
			jPanelAtributos.add (getJTextFieldAddress (), gbc_jTextFieldAddress);
			GridBagConstraints gbc_jLabelLocation = new GridBagConstraints ();
			gbc_jLabelLocation.anchor = GridBagConstraints.EAST;
			gbc_jLabelLocation.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelLocation.gridx = 2;
			gbc_jLabelLocation.gridy = 5;
			jPanelAtributos.add (getJLabelLocation (), gbc_jLabelLocation);
			GridBagConstraints gbc_jTextFieldLocation = new GridBagConstraints ();
			gbc_jTextFieldLocation.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldLocation.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldLocation.gridx = 3;
			gbc_jTextFieldLocation.gridy = 5;
			jPanelAtributos.add (getJTextFieldLocation (), gbc_jTextFieldLocation);
			GridBagConstraints gbc_jCheckBoxBirthdate = new GridBagConstraints ();
			gbc_jCheckBoxBirthdate.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxBirthdate.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxBirthdate.gridx = 0;
			gbc_jCheckBoxBirthdate.gridy = 6;
			jPanelAtributos.add (getJCheckBoxBirthdate (), gbc_jCheckBoxBirthdate);
			GridBagConstraints gbc_jDatePickerBirthdate = new GridBagConstraints ();
			gbc_jDatePickerBirthdate.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerBirthdate.insets = new Insets (0, 0, 5, 5);
			gbc_jDatePickerBirthdate.gridx = 1;
			gbc_jDatePickerBirthdate.gridy = 6;
			jPanelAtributos.add (getJDatePickerBirthdate (), gbc_jDatePickerBirthdate);
			GridBagConstraints gbc_jLabelEmployeeSexTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeSexTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeSexTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeSexTypeDescription.gridx = 2;
			gbc_jLabelEmployeeSexTypeDescription.gridy = 6;
			jPanelAtributos.add (getJLabelEmployeeSexTypeDescription (), gbc_jLabelEmployeeSexTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeSexTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeSexTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEmployeeSexTypeDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxEmployeeSexTypeDescription.gridx = 3;
			gbc_jComboBoxEmployeeSexTypeDescription.gridy = 6;
			jPanelAtributos.add (getJComboBoxEmployeeSexTypeDescription (), gbc_jComboBoxEmployeeSexTypeDescription);
			GridBagConstraints gbc_jLabelEmployeeCitizenshipDocTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.gridx = 0;
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.gridy = 7;
			jPanelAtributos.add (getJLabelEmployeeCitizenshipDocTypeDescription (), gbc_jLabelEmployeeCitizenshipDocTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeCitizenshipDocTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.gridx = 1;
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.gridy = 7;
			jPanelAtributos.add (getJComboBoxEmployeeCitizenshipDocTypeDescription (), gbc_jComboBoxEmployeeCitizenshipDocTypeDescription);
			GridBagConstraints gbc_jLabelCitizenshipDocumentNumber = new GridBagConstraints ();
			gbc_jLabelCitizenshipDocumentNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelCitizenshipDocumentNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCitizenshipDocumentNumber.gridx = 2;
			gbc_jLabelCitizenshipDocumentNumber.gridy = 7;
			jPanelAtributos.add (getJLabelCitizenshipDocumentNumber (), gbc_jLabelCitizenshipDocumentNumber);
			GridBagConstraints gbc_jTextFieldCitizenshipDocumentNumber = new GridBagConstraints ();
			gbc_jTextFieldCitizenshipDocumentNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCitizenshipDocumentNumber.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldCitizenshipDocumentNumber.gridx = 3;
			gbc_jTextFieldCitizenshipDocumentNumber.gridy = 7;
			jPanelAtributos.add (getJTextFieldCitizenshipDocumentNumber (), gbc_jTextFieldCitizenshipDocumentNumber);
			GridBagConstraints gbc_jCheckBoxDateEntry = new GridBagConstraints ();
			gbc_jCheckBoxDateEntry.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxDateEntry.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxDateEntry.gridx = 0;
			gbc_jCheckBoxDateEntry.gridy = 8;
			jPanelAtributos.add (getJCheckBoxDateEntry (), gbc_jCheckBoxDateEntry);
			GridBagConstraints gbc_jDatePickerDateEntry = new GridBagConstraints ();
			gbc_jDatePickerDateEntry.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerDateEntry.insets = new Insets (0, 0, 5, 5);
			gbc_jDatePickerDateEntry.gridx = 1;
			gbc_jDatePickerDateEntry.gridy = 8;
			jPanelAtributos.add (getJDatePickerDateEntry (), gbc_jDatePickerDateEntry);
			GridBagConstraints gbc_jCheckBoxDateExit = new GridBagConstraints ();
			gbc_jCheckBoxDateExit.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxDateExit.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxDateExit.gridx = 2;
			gbc_jCheckBoxDateExit.gridy = 8;
			jPanelAtributos.add (getJCheckBoxDateExit (), gbc_jCheckBoxDateExit);
			GridBagConstraints gbc_jDatePickerDateExit = new GridBagConstraints ();
			gbc_jDatePickerDateExit.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerDateExit.insets = new Insets (0, 0, 5, 0);
			gbc_jDatePickerDateExit.gridx = 3;
			gbc_jDatePickerDateExit.gridy = 8;
			jPanelAtributos.add (getJDatePickerDateExit (), gbc_jDatePickerDateExit);
			GridBagConstraints gbc_jLabelIdEmployeeAgreementType = new GridBagConstraints ();
			gbc_jLabelIdEmployeeAgreementType.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdEmployeeAgreementType.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdEmployeeAgreementType.gridx = 0;
			gbc_jLabelIdEmployeeAgreementType.gridy = 9;
			jPanelAtributos.add (getJLabelIdEmployeeAgreementType (), gbc_jLabelIdEmployeeAgreementType);
			GridBagConstraints gbc_jTextFieldIdEmployeeAgreementType = new GridBagConstraints ();
			gbc_jTextFieldIdEmployeeAgreementType.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdEmployeeAgreementType.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldIdEmployeeAgreementType.gridx = 1;
			gbc_jTextFieldIdEmployeeAgreementType.gridy = 9;
			jPanelAtributos.add (getJTextFieldIdEmployeeAgreementType (), gbc_jTextFieldIdEmployeeAgreementType);
			GridBagConstraints gbc_jLabelIsDeleted = new GridBagConstraints ();
			gbc_jLabelIsDeleted.anchor = GridBagConstraints.EAST;
			gbc_jLabelIsDeleted.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIsDeleted.gridx = 2;
			gbc_jLabelIsDeleted.gridy = 9;
			jPanelAtributos.add (getJLabelIsDeleted (), gbc_jLabelIsDeleted);
			GridBagConstraints gbc_jComboBoxIsDeleted = new GridBagConstraints ();
			gbc_jComboBoxIsDeleted.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIsDeleted.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxIsDeleted.gridx = 3;
			gbc_jComboBoxIsDeleted.gridy = 9;
			jPanelAtributos.add (getJComboBoxIsDeleted (), gbc_jComboBoxIsDeleted);
			GridBagConstraints gbc_jLabelFirstName = new GridBagConstraints ();
			gbc_jLabelFirstName.anchor = GridBagConstraints.EAST;
			gbc_jLabelFirstName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelFirstName.gridx = 0;
			gbc_jLabelFirstName.gridy = 10;
			jPanelAtributos.add (getJLabelFirstName (), gbc_jLabelFirstName);
			GridBagConstraints gbc_jTextFieldFirstName = new GridBagConstraints ();
			gbc_jTextFieldFirstName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldFirstName.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldFirstName.gridx = 1;
			gbc_jTextFieldFirstName.gridy = 10;
			jPanelAtributos.add (getJTextFieldFirstName (), gbc_jTextFieldFirstName);
			GridBagConstraints gbc_jLabelLastName = new GridBagConstraints ();
			gbc_jLabelLastName.anchor = GridBagConstraints.EAST;
			gbc_jLabelLastName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelLastName.gridx = 2;
			gbc_jLabelLastName.gridy = 10;
			jPanelAtributos.add (getJLabelLastName (), gbc_jLabelLastName);
			GridBagConstraints gbc_jTextFieldLastName = new GridBagConstraints ();
			gbc_jTextFieldLastName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldLastName.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldLastName.gridx = 3;
			gbc_jTextFieldLastName.gridy = 10;
			jPanelAtributos.add (getJTextFieldLastName (), gbc_jTextFieldLastName);
			GridBagConstraints gbc_jLabelCurrentPhoneNumber = new GridBagConstraints ();
			gbc_jLabelCurrentPhoneNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelCurrentPhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCurrentPhoneNumber.gridx = 0;
			gbc_jLabelCurrentPhoneNumber.gridy = 11;
			jPanelAtributos.add (getJLabelCurrentPhoneNumber (), gbc_jLabelCurrentPhoneNumber);
			GridBagConstraints gbc_jTextFieldCurrentPhoneNumber = new GridBagConstraints ();
			gbc_jTextFieldCurrentPhoneNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCurrentPhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldCurrentPhoneNumber.gridx = 1;
			gbc_jTextFieldCurrentPhoneNumber.gridy = 11;
			jPanelAtributos.add (getJTextFieldCurrentPhoneNumber (), gbc_jTextFieldCurrentPhoneNumber);
			GridBagConstraints gbc_jLabelMobilePhoneNumber = new GridBagConstraints ();
			gbc_jLabelMobilePhoneNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelMobilePhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelMobilePhoneNumber.gridx = 2;
			gbc_jLabelMobilePhoneNumber.gridy = 11;
			jPanelAtributos.add (getJLabelMobilePhoneNumber (), gbc_jLabelMobilePhoneNumber);
			GridBagConstraints gbc_jTextFieldMobilePhoneNumber = new GridBagConstraints ();
			gbc_jTextFieldMobilePhoneNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldMobilePhoneNumber.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldMobilePhoneNumber.gridx = 3;
			gbc_jTextFieldMobilePhoneNumber.gridy = 11;
			jPanelAtributos.add (getJTextFieldMobilePhoneNumber (), gbc_jTextFieldMobilePhoneNumber);
			GridBagConstraints gbc_jCheckBoxPasswordUser = new GridBagConstraints ();
			gbc_jCheckBoxPasswordUser.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxPasswordUser.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxPasswordUser.gridx = 0;
			gbc_jCheckBoxPasswordUser.gridy = 12;
			jPanelAtributos.add (getJCheckBoxPasswordUser (), gbc_jCheckBoxPasswordUser);
			GridBagConstraints gbc_jTextFieldPasswordUser = new GridBagConstraints ();
			gbc_jTextFieldPasswordUser.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldPasswordUser.insets = new Insets (0, 0, 5, 5);
			gbc_jTextFieldPasswordUser.gridx = 1;
			gbc_jTextFieldPasswordUser.gridy = 12;
			jPanelAtributos.add (getJTextFieldPasswordUser (), gbc_jTextFieldPasswordUser);
			GridBagConstraints gbc_jLabelIdRol = new GridBagConstraints ();
			gbc_jLabelIdRol.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdRol.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdRol.gridx = 2;
			gbc_jLabelIdRol.gridy = 12;
			jPanelAtributos.add (getJLabelIdRol (), gbc_jLabelIdRol);
			GridBagConstraints gbc_jTextFieldIdRol = new GridBagConstraints ();
			gbc_jTextFieldIdRol.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdRol.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldIdRol.gridx = 3;
			gbc_jTextFieldIdRol.gridy = 12;
			jPanelAtributos.add (getJTextFieldIdRol (), gbc_jTextFieldIdRol);
			GridBagConstraints gbc_jCheckBoxEmail = new GridBagConstraints ();
			gbc_jCheckBoxEmail.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxEmail.gridx = 0;
			gbc_jCheckBoxEmail.gridy = 13;
			jPanelAtributos.add (getJCheckBoxEmail (), gbc_jCheckBoxEmail);
			GridBagConstraints gbc_jEditorPaneEmail = new GridBagConstraints ();
			gbc_jEditorPaneEmail.fill = GridBagConstraints.HORIZONTAL;
			gbc_jEditorPaneEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jEditorPaneEmail.gridx = 1;
			gbc_jEditorPaneEmail.gridy = 13;
			jPanelAtributos.add (getJEditorPaneEmail (), gbc_jEditorPaneEmail);
			GridBagConstraints gbc_jCheckBoxEmployeeKeyDoc = new GridBagConstraints ();
			gbc_jCheckBoxEmployeeKeyDoc.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxEmployeeKeyDoc.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxEmployeeKeyDoc.gridx = 2;
			gbc_jCheckBoxEmployeeKeyDoc.gridy = 13;
			jPanelAtributos.add (getJCheckBoxEmployeeKeyDoc (), gbc_jCheckBoxEmployeeKeyDoc);
			GridBagConstraints gbc_jEditorPaneEmployeeKeyDoc = new GridBagConstraints ();
			gbc_jEditorPaneEmployeeKeyDoc.fill = GridBagConstraints.HORIZONTAL;
			gbc_jEditorPaneEmployeeKeyDoc.insets = new Insets (0, 0, 5, 0);
			gbc_jEditorPaneEmployeeKeyDoc.gridx = 3;
			gbc_jEditorPaneEmployeeKeyDoc.gridy = 13;
			jPanelAtributos.add (getJEditorPaneEmployeeKeyDoc (), gbc_jEditorPaneEmployeeKeyDoc);
			GridBagConstraints gbc_jLabelIsFirstTime = new GridBagConstraints ();
			gbc_jLabelIsFirstTime.anchor = GridBagConstraints.EAST;
			gbc_jLabelIsFirstTime.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelIsFirstTime.gridx = 0;
			gbc_jLabelIsFirstTime.gridy = 14;
			jPanelAtributos.add (getJLabelIsFirstTime (), gbc_jLabelIsFirstTime);
			GridBagConstraints gbc_jComboBoxIsFirstTime = new GridBagConstraints ();
			gbc_jComboBoxIsFirstTime.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIsFirstTime.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxIsFirstTime.gridx = 1;
			gbc_jComboBoxIsFirstTime.gridy = 14;
			jPanelAtributos.add (getJComboBoxIsFirstTime (), gbc_jComboBoxIsFirstTime);
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