package centroDeControlBDDO;

import java.awt.Cursor;

import java.awt.Dimension;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.Insets;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.lang.reflect.InvocationTargetException;

import java.util.Calendar;

import java.util.GregorianCalendar;

import javax.swing.BorderFactory;

import javax.swing.ButtonGroup;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JMenuItem;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JPopupMenu;

import javax.swing.JRadioButton;

import javax.swing.JScrollPane;

import javax.swing.JTabbedPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.SwingUtilities;

import javax.swing.UIManager;

import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.border.TitledBorder;

public class MenuPrincipal extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelMenuPrincipal = null;

	private JTabbedPane jTabbedPaneMenuPrincipal = null;

	private JPanel jPanelCompany = null;

	private JScrollPane jScrollPaneCompany = null;

	private JTable jTableCompany = null;

	private JPopupMenu jPopupMenuCompany = null;

	private JMenuItem jMenuItemAgregarCompany = null;

	private JMenuItem jMenuItemEliminarCompany = null;

	private JMenuItem jMenuItemModificarCompany = null;

	private JPanel jPanelFiltrosCompany = null;
	
	private JLabel jLabelTradeNameCompany = null;
	
	private JTextField jTextFieldTradeNameCompany;
	
	private TextAutoCompleter textAutoCompleterTradeNameCompany = null;
	
	private JLabel jLabelAddressCompany = null;
	
	private JTextField jTextFieldAddressCompany = null;
	
	private TextAutoCompleter textAutoCompleterAddressCompany = null;
	
	private JLabel jLabelCuitCompany = null;
	
	private JTextField jTextFieldCuitCompany = null;
	
	private TextAutoCompleter textAutoCompleterCuitCompany = null;
	
	private JButton jButtonAplicarCompany = null;

	private JPanel jPanelABMCompany = null;

	private JButton jButtonAgregarCompany = null;

	private JButton jButtonEliminarCompany = null;

	private JButton jButtonModificarCompany = null;

	private JPanel jPanelCompanySection = null;

	private JScrollPane jScrollPaneCompanySection = null;

	private JTable jTableCompanySection = null;

	private JPopupMenu jPopupMenuCompanySection = null;

	private JMenuItem jMenuItemAgregarCompanySection = null;

	private JMenuItem jMenuItemEliminarCompanySection = null;

	private JMenuItem jMenuItemModificarCompanySection = null;

	private JPanel jPanelFiltrosCompanySection = null;

	private JLabel jLabelDescriptionCompanySection = null;

	private JComboBox <String> jComboBoxDescriptionCompanySection = null;

	private JLabel jLabelTradeNameCompanySection = null;
	
	private JTextField jTextFieldTradeNameCompanySection = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameCompanySection = null;

	private JLabel jLabelCuitCompanySection = null;
	
	private JTextField jTextFieldCuitCompanySection = null;
	
	private JLabel jLabelDescriptionCompanySubsidiaryCompanySection = null;
	
	private JComboBox <String> jComboBoxDescriptionCompanySubsidiaryCompanySection = null;
	
	private TextAutoCompleter textAutoCompleterCuitCompanySection = null;

	private JButton jButtonAplicarCompanySection = null;

	private JPanel jPanelABMCompanySection = null;

	private JButton jButtonAgregarCompanySection = null;

	private JButton jButtonEliminarCompanySection = null;

	private JButton jButtonModificarCompanySection = null;

	private JPanel jPanelCompanySubsidiary = null;

	private JScrollPane jScrollPaneCompanySubsidiary = null;

	private JTable jTableCompanySubsidiary = null;

	private JPopupMenu jPopupMenuCompanySubsidiary = null;

	private JMenuItem jMenuItemAgregarCompanySubsidiary = null;

	private JMenuItem jMenuItemEliminarCompanySubsidiary = null;

	private JMenuItem jMenuItemModificarCompanySubsidiary = null;

	private JPanel jPanelFiltrosCompanySubsidiary = null;

	private JLabel jLabelDescriptionCompanySubsidiary = null;

	private JComboBox <String> jComboBoxDescriptionCompanySubsidiary = null;

	private JLabel jLabelTradeNameCompanySubsidiary = null;
	
	private JTextField jTextFieldTradeNameCompanySubsidiary = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameCompanySubsidiary = null;

	private JLabel jLabelNumeroDeAR = null;
	
	private JTextField jTextFieldNumeroDeAR = null;
	
	private TextAutoCompleter textAutoCompleterNumeroDeAR = null;

	private JButton jButtonAplicarCompanySubsidiary = null;

	private JPanel jPanelABMCompanySubsidiary = null;

	private JButton jButtonAgregarCompanySubsidiary = null;

	private JButton jButtonEliminarCompanySubsidiary = null;

	private JButton jButtonModificarCompanySubsidiary = null;
	
	private JRadioButton jRadioButtonSystemLookAndFeel = null;

	private JComboBox <String> jComboBoxSystemLookAndFeel = null;
	
	private JRadioButton jRadioButtonTattooLookAndFeel = null;
	
	private JComboBox <String> jComboBoxTattooLookAndFeel = null;
	
	private JLabel jLabelTheme = null;
	
	private JComboBox <String> jComboBoxTheme = null;
	
	private ButtonGroup buttonGroupLookAndFeel = null;
	
	private JPanel jPanelConfigurations = null;

	private JScrollPane jScrollPaneConfigurations = null;

	private JTable jTableConfigurations = null;

	private JPopupMenu jPopupMenuConfigurations = null;

	private JMenuItem jMenuItemAgregarConfigurations = null;

	private JMenuItem jMenuItemEliminarConfigurations = null;

	private JMenuItem jMenuItemModificarConfigurations = null;

	private JPanel jPanelFiltrosConfigurations = null;

	private JLabel jLabelTradeNameConfigurations = null;
	
	private JTextField jTextFieldTradeNameConfigurations = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameConfigurations = null;

	private JButton jButtonAplicarConfigurations = null;

	private JPanel jPanelABMConfigurations = null;

	private JButton jButtonAgregarConfigurations = null;

	private JButton jButtonEliminarConfigurations = null;

	private JButton jButtonModificarConfigurations = null;

	private JPanel jPanelEmployee = null;

	private JScrollPane jScrollPaneEmployee = null;

	private JTable jTableEmployee = null;

	private JPopupMenu jPopupMenuEmployee = null;

	private JMenuItem jMenuItemAgregarEmployee = null;

	private JMenuItem jMenuItemEliminarEmployee = null;

	private JMenuItem jMenuItemModificarEmployee = null;

	private JPanel jPanelFiltrosEmployee = null;

	private JLabel jLabelIdUserEmployee = null;
	
	private JTextField jTextFieldIdUserEmployee = null;
	
	private TextAutoCompleter textAutoCompleterIdUserEmployee = null;

	private JLabel jLabelAccountNumberEmployee = null;
	
	private JTextField jTextFieldAccountNumberEmployee = null;
	
	private TextAutoCompleter textAutoCompleterAccountNumberEmployee = null;

	private JButton jButtonAplicarEmployee = null;

	private JPanel jPanelABMEmployee = null;

	private JButton jButtonAgregarEmployee = null;

	private JButton jButtonEliminarEmployee = null;

	private JButton jButtonModificarEmployee = null;

	private JPanel jPanelRolesEmpleados = null;

	private JScrollPane jScrollPaneRolesEmpleados = null;

	private JTable jTableRolesEmpleados = null;

	private JPopupMenu jPopupMenuRolesEmpleados = null;

	private JMenuItem jMenuItemAgregarRolesEmpleados = null;

	private JMenuItem jMenuItemEliminarRolesEmpleados = null;

	private JMenuItem jMenuItemModificarRolesEmpleados = null;

	private JPanel jPanelFiltrosRolesEmpleados = null;
	
	private JLabel jLabelNombre = null;

	private JComboBox <String> jComboBoxNombre = null;

	private JButton jButtonAplicarRolesEmpleados = null;

	private JPanel jPanelABMRolesEmpleados = null;

	private JButton jButtonAgregarRolesEmpleados = null;

	private JButton jButtonEliminarRolesEmpleados = null;

	private JButton jButtonModificarRolesEmpleados = null;

	private JPanel jPanelSettingsKeystore = null;

	private JScrollPane jScrollPaneSettingsKeystore = null;

	private JTable jTableSettingsKeystore = null;

	private JPopupMenu jPopupMenuSettingsKeystore = null;

	private JMenuItem jMenuItemAgregarSettingsKeystore = null;

	private JMenuItem jMenuItemEliminarSettingsKeystore = null;

	private JMenuItem jMenuItemModificarSettingsKeystore = null;

	private JPanel jPanelFiltrosSettingsKeystore = null;

	private JLabel jLabelcuil = null;
	
	private JTextField jTextFieldcuil = null;
	
	private TextAutoCompleter textAutoCompletercuil = null;

	private JButton jButtonAplicarSettingsKeystore = null;

	private JPanel jPanelABMSettingsKeystore = null;

	private JButton jButtonAgregarSettingsKeystore = null;

	private JButton jButtonEliminarSettingsKeystore = null;

	private JButton jButtonModificarSettingsKeystore = null;
	
	private JLabel jLabelEnableProtesto = null;
	
	private JComboBox <String> jComboBoxEnableProtesto = null;
	
	private JLabel jLabelTienePCR = null;
	
	private JComboBox <String> jComboBoxTienePCR = null;
	
	private JLabel jLabelesPCRCloud = null;
	
	private JComboBox <String> jComboBoxesPCRCloud = null;

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
	
	private JLabel jLabelCompanyCuitFormatDescription = null;
	
	private JComboBox <String> jComboBoxCompanyCuitFormatDescription = null;
	
	private JLabel jLabelCompanyAgreementTypeDescription = null;
	
	private JComboBox <String> jComboBoxCompanyAgreementTypeDescription = null;
	
	private JLabel jLabelIvaConditiondenomination = null;
	
	private JComboBox <String> jComboBoxIvaConditiondenomination = null;
	
	private JLabel jLabelCompanyTypedenomination = null;
	
	private JComboBox <String> jComboBoxCompanyTypedenomination = null;
	
	private JLabel jLabelCountryStateDescriptionCompany = null;
	
	private JComboBox <String> jComboBoxCountryStateDescription = null;
	
	private JLabel jLabellocalidadName = null;
	
	private JComboBox <String> jComboBoxlocalidadName = null;
	
	private JLabel jLabelcountryName = null;
	
	private JComboBox <String> jComboBoxcountryName = null;

	private JLabel jLabelIdUserRolesEmpleados = null;
	
	private JTextField jTextFieldIdUserRolesEmpleados = null;
	
	private TextAutoCompleter textAutoCompleterIdUserRolesEmpleados = null;

	private JLabel jLabelTradeNameRolesEmpleados = null;
	
	private JTextField jTextFieldTradeNameRolesEmpleados = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameRolesEmpleados = null;
	
	private JLabel jLabelisDeleteKs = null;
	
	private JComboBox <String> jComboBoxisDeleteKs = null;
	
	private JLabel jLabelisResetPasswordKs = null;
	
	private JComboBox <String> jComboBoxisResetPasswordKs = null;

	private JLabel jLabelTradeNameSettingsKeystore = null;
	
	private JTextField jTextFieldTradeNameSettingsKeystore = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameSettingsKeystore = null;
	
	private JLabel jLabelDescriptionCompanySectionEmployee = null;
	
	private JComboBox <String> jComboBoxDescriptionCompanySectionEmployee = null;
	
	private JLabel jLabelDescriptionCompanySubsidiaryEmployee = null;
	
	private JComboBox <String> jComboBoxDescriptionCompanySubsidiaryEmployee = null;

	private JLabel jLabelTradeNameEmployee = null;
	
	private JTextField jTextFieldTradeNameEmployee = null;
	
	private TextAutoCompleter textAutoCompleterTradeNameEmployee = null;
	
	private JLabel jLabelCuil = null;
	
	private JTextField jTextFieldCuil = null;

	private TextAutoCompleter textAutoCompleterCuil = null;
	
	private JLabel jLabelCitizenship = null;
	
	private JComboBox <String> jComboBoxCitizenship = null;
	
	private JLabel jLabelCountryStateDescriptionEmployee = null;
	
	private JComboBox <String> jComboBoxCountryStateDescriptionEmployee = null;
	
	private JLabel jLabelEmployeeMarriageStatusTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeMarriageStatusTypeDescription = null;
	
	private JLabel jLabelAddress = null;
	
	private JComboBox <String> jComboBoxAddress = null;
	
	private JLabel jLabelLocation = null;
	
	private JComboBox <String> jComboBoxLocation = null;
	
	private JDatePicker jDatePickerBirthdate = null;
	
	private JCheckBox jCheckBoxBirthdate = null;
	
	private JLabel jLabelEmployeeSexTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeSexTypeDescription = null;
	
	private JLabel jLabelEmployeeCitizenshipDocTypeDescription = null;
	
	private JComboBox <String> jComboBoxEmployeeCitizenshipDocTypeDescription = null;
	
	private JLabel jLabelCitizenshipDocumentNumber = null;
	
	private JTextField jTextFieldCitizenshipDocumentNumber = null;
	
	private TextAutoCompleter textAutoCompleterCitizenshipDocumentNumber = null;
	
	private JDatePicker jDatePickerDateEntry = null;
	
	private JCheckBox jCheckBoxDateEntry = null;
	
	private JDatePicker jDatePickerDateExit = null;
	
	private JCheckBox jCheckBoxDateExit = null;
	
	private JLabel jLabelIsDeleted = null;
	
	private JComboBox <String> jComboBoxIsDeleted = null;

	private JLabel jLabelFirstName = null;
	
	private JTextField jTextFieldFirstName = null;
	
	private TextAutoCompleter textAutoCompleterFirstName = null;

	private JLabel jLabelLastName = null;
	
	private JTextField jTextFieldLastName = null;
	
	private TextAutoCompleter textAutoCompleterLastName = null;

	private JLabel jLabelCurrentPhoneNumber = null;
	
	private JTextField jTextFieldCurrentPhoneNumber = null;
	
	private TextAutoCompleter textAutoCompleterCurrentPhoneNumber = null;

	private JLabel jLabelMobilePhoneNumber = null;
	
	private JTextField jTextFieldMobilePhoneNumber = null;
	
	private TextAutoCompleter textAutoCompleterMobilePhoneNumber = null;
	
	private JLabel jLabelIsFirstTime = null;
	
	private JComboBox <String> jComboBoxIsFirstTime = null;
	
	private JPanel jPanelLookAndFeel = null;
	
	private JScrollPane jScrollPaneFiltrosCompany = null;
	
	private JScrollPane jScrollPaneFiltrosCompanySection = null;
	
	private JScrollPane jScrollPaneFiltrosCompanySubsidiary = null;
	
	private JScrollPane jScrollPaneFiltrosConfigurations = null;
	
	private JScrollPane jScrollPaneFiltrosSettingKeystore = null;
	
	private JScrollPane jScrollPaneFiltrosEmployee = null;
	
	private JScrollPane jScrollPaneFiltrosRolesEmpleados = null;
	
	private JScrollPane jScrollPaneABMCompany = null;
	
	private JScrollPane jScrollPaneABMCompanySection = null;
	
	private JScrollPane jScrollPaneABMCompanySubsidiary = null;
	
	private JScrollPane jScrollPaneABMConfigurations = null;
	
	private JScrollPane jScrollPaneABMRolesEmpleados = null;
	
	private JScrollPane jScrollPaneABMSettingsKeystore = null;
	
	private JScrollPane jScrollPaneABMEmployee = null;
	
	public MenuPrincipal ()
	{
		super ();
		initialize ();
	}
	
	private void initialize ()
	{
		String [] dataSourceName = null;
		
		int parametro = 0;
		
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.1), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.18));
		this.setMinimumSize (new Dimension (640, 480));
		this.setContentPane (getJPanelMenuPrincipal ());
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setTitle ("Men\u00fa Principal - CDC BDDO");
		
		dataSourceName = Utilidades.dataSourceName.toString ().split (";");
		
		for (parametro = 0; parametro < dataSourceName.length - 1; parametro ++)
		
			this.setTitle (this.getTitle ().toString () + " - " + dataSourceName [parametro].toString ().trim ());
		
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.confirmarCerrar (this);
		Utilidades.metodosAbreviadosAComponentes (getJPanelMenuPrincipal (), this, Utilidades.tipoDeVentana.ABM, true);
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAddressCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarComboBox (getJComboBoxCompanyCuitFormatDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarComboBox (getJComboBoxCompanyAgreementTypeDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarComboBox (getJComboBoxIvaConditiondenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		Utilidades.cargarComboBox (getJComboBoxCompanyTypedenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		getJLabellocalidadName ().setEnabled (false);
		getJComboBoxlocalidadName ().setEnabled (false);
		Utilidades.cargarComboBox (getJComboBoxcountryName (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
		getJButtonAplicarCompany ().doClick ();

		Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
		Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiaryCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySubsidiary.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");		
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySection (), "CompanySection, CompanySubsidiary, Company", "TradeName", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
		getJButtonAplicarCompanySection ().doClick ();

		Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterNumeroDeAR (), "CompanySubsidiary, Company", "IdAr", "CompanySubsidiary.IdCompany = Company.IdCompany");
		getJButtonAplicarCompanySubsidiary ().doClick ();

		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameConfigurations (), "CONFIGURATIONS, Company", "TradeName", "CONFIGURATIONS.IdCompany = Company.IdCompany");
		Utilidades.cargarComboBoxBoolean (getJComboBoxEnableProtesto (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxTienePCR (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxesPCRCloud (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarEmail (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxreenviarEmail (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarGeneracionClaves (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxbloquearFechaPrevia (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxenviarFirmadoEmpleador (), false);
		getJButtonAplicarConfigurations ().doClick ();

		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");		
		Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		getJCheckBoxBirthdate ().setSelected (true);
		getJCheckBoxBirthdate ().doClick ();
		getJCheckBoxBirthdate ().setSelected (false);
		getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
		getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
		Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		getJCheckBoxDateEntry ().setSelected (true);
		getJCheckBoxDateEntry ().doClick ();
		getJCheckBoxDateEntry ().setSelected (false);
		getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
		getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
		getJCheckBoxDateExit ().setSelected (true);
		getJCheckBoxDateExit ().doClick ();
		getJCheckBoxDateExit ().setSelected (false);
		getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
		getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
		Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
		Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
		getJButtonAplicarEmployee ().doClick ();

		Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
		getJButtonAplicarRolesEmpleados ().doClick ();

		Utilidades.cargarTextAutoCompleter (getTextAutoCompletercuil (), "SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
		Utilidades.cargarComboBoxBoolean (getJComboBoxisDeleteKs (), false);
		Utilidades.cargarComboBoxBoolean (getJComboBoxisResetPasswordKs (), false);
		Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameSettingsKeystore (), "SETTINGSKEYSTORE, Company", "TradeName", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
		getJButtonAplicarSettingsKeystore ().doClick ();		
		Utilidades.cargarComboBoxLookAndFeels (getJComboBoxSystemLookAndFeel ());
		
		try
		{
			getJComboBoxSystemLookAndFeel ().setSelectedItem (Class.forName (UIManager.getSystemLookAndFeelClassName ().toString ()).getSimpleName ().replaceAll ("LookAndFeel", "").toString ());
		}

		catch (ClassNotFoundException e1)
		{
			JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
		}
		
		Utilidades.cargarComboBoxLookAndFeelsJTattoo (getJComboBoxTattooLookAndFeel (), getJComboBoxTheme (), getTitle ().toString ());
		getJComboBoxTattooLookAndFeel ().setSelectedItem (Constants.LAF_NAMES [Constants.LAF_AERO]);
		getJComboBoxTheme ().setSelectedItem ("Default");
		getJRadioButtonSystemLookAndFeel ().setSelected (true);
		getJRadioButtonSystemLookAndFeel ().doClick ();
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelMenuPrincipal ()
	{
		if (jPanelMenuPrincipal == null)
		{
			jPanelMenuPrincipal = new JPanel ();
			jPanelMenuPrincipal.setBorder (BorderFactory.createTitledBorder (null, getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			GridBagLayout gbl_jPanelMenuPrincipal = new GridBagLayout ();
			gbl_jPanelMenuPrincipal.columnWidths = new int [] {1100, 0};
			gbl_jPanelMenuPrincipal.rowHeights = new int [] {523, 44, 0};
			gbl_jPanelMenuPrincipal.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelMenuPrincipal.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelMenuPrincipal.setLayout (gbl_jPanelMenuPrincipal);
			GridBagConstraints gbc_jTabbedPaneMenuPrincipal = new GridBagConstraints ();
			gbc_jTabbedPaneMenuPrincipal.fill = GridBagConstraints.BOTH;
			gbc_jTabbedPaneMenuPrincipal.insets = new Insets (0, 0, 5, 0);
			gbc_jTabbedPaneMenuPrincipal.gridx = 0;
			gbc_jTabbedPaneMenuPrincipal.gridy = 0;
			jPanelMenuPrincipal.add (getJTabbedPaneMenuPrincipal (), gbc_jTabbedPaneMenuPrincipal);
			GridBagConstraints gbc_jPanelLookAndFeel = new GridBagConstraints ();
			gbc_jPanelLookAndFeel.fill = GridBagConstraints.BOTH;
			gbc_jPanelLookAndFeel.gridx = 0;
			gbc_jPanelLookAndFeel.gridy = 1;
			jPanelMenuPrincipal.add (getJPanelLookAndFeel (), gbc_jPanelLookAndFeel);
		}
		
		return jPanelMenuPrincipal;
	}
	
	private JTabbedPane getJTabbedPaneMenuPrincipal ()
	{
		if (jTabbedPaneMenuPrincipal == null)
		{
			jTabbedPaneMenuPrincipal = new JTabbedPane ();
			jTabbedPaneMenuPrincipal.addTab ("Company", null, getJPanelCompany (), null);
			jTabbedPaneMenuPrincipal.addTab ("CompanySubsidiary", null, getJPanelCompanySubsidiary (), null);
			jTabbedPaneMenuPrincipal.addTab ("CompanySection", null, getJPanelCompanySection (), null);
			jTabbedPaneMenuPrincipal.addTab ("Configurations", null, getJPanelConfigurations (), null);
			jTabbedPaneMenuPrincipal.addTab ("Employee", null, getJPanelEmployee (), null);			
			jTabbedPaneMenuPrincipal.addTab ("RolesEmpleados", null, getJPanelRolesEmpleados (), null);
			jTabbedPaneMenuPrincipal.addTab ("SettingsKeystore", null, getJPanelSettingsKeystore (), null);
		}
		
		return jTabbedPaneMenuPrincipal;
	}
	
	private JPanel getJPanelCompany ()
	{
		if (jPanelCompany == null)
		{
			jPanelCompany = new JPanel ();
			GridBagLayout gbl_jPanelCompany = new GridBagLayout ();
			gbl_jPanelCompany.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelCompany.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelCompany.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelCompany.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelCompany.setLayout (gbl_jPanelCompany);
			GridBagConstraints gbc_jScrollPaneCompany = new GridBagConstraints ();
			gbc_jScrollPaneCompany.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneCompany.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneCompany.gridx = 0;
			gbc_jScrollPaneCompany.gridy = 0;
			jPanelCompany.add (getJScrollPaneCompany (), gbc_jScrollPaneCompany);
			GridBagConstraints gbc_jScrollPaneABMCompany = new GridBagConstraints ();
			gbc_jScrollPaneABMCompany.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMCompany.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMCompany.gridx = 1;
			gbc_jScrollPaneABMCompany.gridy = 0;
			jPanelCompany.add (getJScrollPaneABMCompany (), gbc_jScrollPaneABMCompany);
			GridBagConstraints gbc_jScrollPaneFiltrosCompany = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosCompany.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosCompany.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosCompany.gridx = 0;
			gbc_jScrollPaneFiltrosCompany.gridy = 1;
			jPanelCompany.add (getJScrollPaneFiltrosCompany (), gbc_jScrollPaneFiltrosCompany);
			GridBagConstraints gbc_jButtonAplicarCompany = new GridBagConstraints ();
			gbc_jButtonAplicarCompany.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarCompany.gridx = 1;
			gbc_jButtonAplicarCompany.gridy = 1;
			jPanelCompany.add (getJButtonAplicarCompany (), gbc_jButtonAplicarCompany);
		}
		
		return jPanelCompany;
	}
	
	private JScrollPane getJScrollPaneCompany ()
	{
		if (jScrollPaneCompany == null)
		{
			jScrollPaneCompany = new JScrollPane ();
			jScrollPaneCompany.setViewportView (getJTableCompany ());
			jScrollPaneCompany.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompany ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompany ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneCompany;
	}
	
	private JTable getJTableCompany ()
	{
		if (jTableCompany == null)
		{
			jTableCompany = new JTable ();
			jTableCompany.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompany ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompany ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableCompany;
	}
	
	private JPopupMenu getJPopupMenuCompany ()
	{
		if (jPopupMenuCompany == null)
		{
			jPopupMenuCompany = new JPopupMenu ();
			jPopupMenuCompany.add (getJMenuItemAgregarCompany ());
			jPopupMenuCompany.add (getJMenuItemEliminarCompany ());
			jPopupMenuCompany.add (getJMenuItemModificarCompany ());
		}
		
		return jPopupMenuCompany;
	}
	
	private JMenuItem getJMenuItemAgregarCompany ()
	{
		if (jMenuItemAgregarCompany == null)
		{
			jMenuItemAgregarCompany = new JMenuItem ();
			jMenuItemAgregarCompany.setText ("Agregar");
			jMenuItemAgregarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarCompany ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarCompany;
	}
	
	private JMenuItem getJMenuItemEliminarCompany ()
	{
		if (jMenuItemEliminarCompany == null)
		{
			jMenuItemEliminarCompany = new JMenuItem ();
			jMenuItemEliminarCompany.setText ("Eliminar");
			jMenuItemEliminarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarCompany ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarCompany;
	}
	
	private JMenuItem getJMenuItemModificarCompany ()
	{
		if (jMenuItemModificarCompany == null)
		{
			jMenuItemModificarCompany = new JMenuItem ();
			jMenuItemModificarCompany.setText ("Modificar");
			jMenuItemModificarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarCompany ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarCompany;
	}
	
	private JPanel getJPanelFiltrosCompany ()
	{
		if (jPanelFiltrosCompany == null)
		{
			jPanelFiltrosCompany = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosCompany = new GridBagLayout ();
			gbl_jPanelFiltrosCompany.columnWidths = new int [] {155, 28, 179, 28, 129, 28, 0};
			gbl_jPanelFiltrosCompany.rowHeights = new int [] {20, 20, 20, 20, 0};
			gbl_jPanelFiltrosCompany.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosCompany.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelFiltrosCompany.setLayout (gbl_jPanelFiltrosCompany);
			jLabelTradeNameCompany = new JLabel ();
			jLabelTradeNameCompany.setText ("TradeName:");
			GridBagConstraints gbc_jLabelTradeNameCompany = new GridBagConstraints ();
			gbc_jLabelTradeNameCompany.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameCompany.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeNameCompany.gridx = 0;
			gbc_jLabelTradeNameCompany.gridy = 0;
			jPanelFiltrosCompany.add (jLabelTradeNameCompany, gbc_jLabelTradeNameCompany);
			GridBagConstraints gbc_jTextFieldTradeNameCompany = new GridBagConstraints();
			gbc_jTextFieldTradeNameCompany.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldTradeNameCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameCompany.gridx = 1;
			gbc_jTextFieldTradeNameCompany.gridy = 0;
			jPanelFiltrosCompany.add(getJTextFieldTradeNameCompany(), gbc_jTextFieldTradeNameCompany);
			jLabelAddressCompany = new JLabel ();
			jLabelAddressCompany.setText ("Address:");
			GridBagConstraints gbc_jLabelAddressCompany = new GridBagConstraints ();
			gbc_jLabelAddressCompany.anchor = GridBagConstraints.EAST;
			gbc_jLabelAddressCompany.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAddressCompany.gridx = 2;
			gbc_jLabelAddressCompany.gridy = 0;
			jPanelFiltrosCompany.add (jLabelAddressCompany, gbc_jLabelAddressCompany);
			GridBagConstraints gbc_jTextFieldAddressCompany = new GridBagConstraints();
			gbc_jTextFieldAddressCompany.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldAddressCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAddressCompany.gridx = 3;
			gbc_jTextFieldAddressCompany.gridy = 0;
			jPanelFiltrosCompany.add(getJTextFieldAddressCompany(), gbc_jTextFieldAddressCompany);
			jLabelCuitCompany = new JLabel ();
			jLabelCuitCompany.setText ("Cuit:");
			GridBagConstraints gbc_jLabelCuitCompany = new GridBagConstraints ();
			gbc_jLabelCuitCompany.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuitCompany.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCuitCompany.gridx = 4;
			gbc_jLabelCuitCompany.gridy = 0;
			jPanelFiltrosCompany.add (jLabelCuitCompany, gbc_jLabelCuitCompany);
			GridBagConstraints gbc_jTextFieldCuitCompany = new GridBagConstraints();
			gbc_jTextFieldCuitCompany.insets = new Insets(0, 0, 5, 0);
			gbc_jTextFieldCuitCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuitCompany.gridx = 5;
			gbc_jTextFieldCuitCompany.gridy = 0;
			jPanelFiltrosCompany.add(getJTextFieldCuitCompany(), gbc_jTextFieldCuitCompany);
			GridBagConstraints gbc_jLabelCompanyCuitFormatDescription = new GridBagConstraints ();
			gbc_jLabelCompanyCuitFormatDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyCuitFormatDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyCuitFormatDescription.gridx = 0;
			gbc_jLabelCompanyCuitFormatDescription.gridy = 1;
			jPanelFiltrosCompany.add (getJLabelCompanyCuitFormatDescription (), gbc_jLabelCompanyCuitFormatDescription);
			GridBagConstraints gbc_jComboBoxCompanyCuitFormatDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanyCuitFormatDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyCuitFormatDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanyCuitFormatDescription.gridx = 1;
			gbc_jComboBoxCompanyCuitFormatDescription.gridy = 1;
			jPanelFiltrosCompany.add (getJComboBoxCompanyCuitFormatDescription (), gbc_jComboBoxCompanyCuitFormatDescription);
			GridBagConstraints gbc_jLabelCompanyAgreementTypeDescription = new GridBagConstraints ();
			gbc_jLabelCompanyAgreementTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyAgreementTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyAgreementTypeDescription.gridx = 2;
			gbc_jLabelCompanyAgreementTypeDescription.gridy = 1;
			jPanelFiltrosCompany.add (getJLabelCompanyAgreementTypeDescription (), gbc_jLabelCompanyAgreementTypeDescription);
			GridBagConstraints gbc_jComboBoxCompanyAgreementTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanyAgreementTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyAgreementTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanyAgreementTypeDescription.gridx = 3;
			gbc_jComboBoxCompanyAgreementTypeDescription.gridy = 1;
			jPanelFiltrosCompany.add (getJComboBoxCompanyAgreementTypeDescription (), gbc_jComboBoxCompanyAgreementTypeDescription);
			GridBagConstraints gbc_jLabelIvaConditiondenomination = new GridBagConstraints ();
			gbc_jLabelIvaConditiondenomination.anchor = GridBagConstraints.EAST;
			gbc_jLabelIvaConditiondenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIvaConditiondenomination.gridx = 4;
			gbc_jLabelIvaConditiondenomination.gridy = 1;
			jPanelFiltrosCompany.add (getJLabelIvaConditiondenomination (), gbc_jLabelIvaConditiondenomination);
			GridBagConstraints gbc_jComboBoxIvaConditiondenomination = new GridBagConstraints ();
			gbc_jComboBoxIvaConditiondenomination.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIvaConditiondenomination.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxIvaConditiondenomination.gridx = 5;
			gbc_jComboBoxIvaConditiondenomination.gridy = 1;
			jPanelFiltrosCompany.add (getJComboBoxIvaConditiondenomination (), gbc_jComboBoxIvaConditiondenomination);
			GridBagConstraints gbc_jLabelCompanyTypedenomination = new GridBagConstraints ();
			gbc_jLabelCompanyTypedenomination.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanyTypedenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanyTypedenomination.gridx = 0;
			gbc_jLabelCompanyTypedenomination.gridy = 2;
			jPanelFiltrosCompany.add (getJLabelCompanyTypedenomination (), gbc_jLabelCompanyTypedenomination);
			GridBagConstraints gbc_jComboBoxCompanyTypedenomination = new GridBagConstraints ();
			gbc_jComboBoxCompanyTypedenomination.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCompanyTypedenomination.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanyTypedenomination.gridx = 1;
			gbc_jComboBoxCompanyTypedenomination.gridy = 2;
			jPanelFiltrosCompany.add (getJComboBoxCompanyTypedenomination (), gbc_jComboBoxCompanyTypedenomination);
			GridBagConstraints gbc_jLabelCountryStateDescriptionCompany = new GridBagConstraints ();
			gbc_jLabelCountryStateDescriptionCompany.anchor = GridBagConstraints.EAST;
			gbc_jLabelCountryStateDescriptionCompany.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCountryStateDescriptionCompany.gridx = 2;
			gbc_jLabelCountryStateDescriptionCompany.gridy = 2;
			jPanelFiltrosCompany.add (getJLabelCountryStateDescriptionCompany (), gbc_jLabelCountryStateDescriptionCompany);
			GridBagConstraints gbc_jComboBoxCountryStateDescription = new GridBagConstraints ();
			gbc_jComboBoxCountryStateDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxCountryStateDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCountryStateDescription.gridx = 3;
			gbc_jComboBoxCountryStateDescription.gridy = 2;
			jPanelFiltrosCompany.add (getJComboBoxCountryStateDescription (), gbc_jComboBoxCountryStateDescription);
			GridBagConstraints gbc_jLabellocalidadName = new GridBagConstraints ();
			gbc_jLabellocalidadName.anchor = GridBagConstraints.EAST;
			gbc_jLabellocalidadName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabellocalidadName.gridx = 4;
			gbc_jLabellocalidadName.gridy = 2;
			jPanelFiltrosCompany.add (getJLabellocalidadName (), gbc_jLabellocalidadName);
			GridBagConstraints gbc_jComboBoxlocalidadName = new GridBagConstraints ();
			gbc_jComboBoxlocalidadName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxlocalidadName.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxlocalidadName.gridx = 5;
			gbc_jComboBoxlocalidadName.gridy = 2;
			jPanelFiltrosCompany.add (getJComboBoxlocalidadName (), gbc_jComboBoxlocalidadName);
			GridBagConstraints gbc_jLabelcountryName = new GridBagConstraints ();
			gbc_jLabelcountryName.anchor = GridBagConstraints.EAST;
			gbc_jLabelcountryName.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelcountryName.gridx = 0;
			gbc_jLabelcountryName.gridy = 3;
			jPanelFiltrosCompany.add (getJLabelcountryName (), gbc_jLabelcountryName);
			GridBagConstraints gbc_jComboBoxcountryName = new GridBagConstraints ();
			gbc_jComboBoxcountryName.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxcountryName.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxcountryName.gridx = 1;
			gbc_jComboBoxcountryName.gridy = 3;
			jPanelFiltrosCompany.add (getJComboBoxcountryName (), gbc_jComboBoxcountryName);
		}
		
		return jPanelFiltrosCompany;
	}
	
	private JTextField getJTextFieldTradeNameCompany ()
	{
		if (jTextFieldTradeNameCompany == null)
		{
			jTextFieldTradeNameCompany = new JTextField ();
			jTextFieldTradeNameCompany.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameCompany ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAddressCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldAddressCompany ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldCuitCompany ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanyCuitFormatDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyAgreementTypeDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxIvaConditiondenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyTypedenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxcountryName (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJButtonAplicarCompany ().doClick ();
									getJTextFieldTradeNameCompany ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameCompany ().itemExists (getJTextFieldTradeNameCompany ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJTextFieldAddressCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJTextFieldCuitCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxCompanyCuitFormatDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxIvaConditiondenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxCompanyTypedenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxcountryName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxCountryStateDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CountryState.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJComboBoxlocalidadName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "localidadName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
									getJButtonAplicarCompany ().doClick ();
									getJTextFieldTradeNameCompany ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameCompany;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameCompany ()
	{
		if (textAutoCompleterTradeNameCompany == null)
		{
			textAutoCompleterTradeNameCompany = new TextAutoCompleter (getJTextFieldTradeNameCompany (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();
							
							getJTextFieldAddressCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJTextFieldCuitCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxCompanyCuitFormatDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxIvaConditiondenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxCompanyTypedenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxcountryName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxCountryStateDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CountryState.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));
							getJComboBoxlocalidadName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "localidadName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"));							
							getJButtonAplicarCompany ().doClick ();
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
		
		return textAutoCompleterTradeNameCompany;
	}
	
	private JTextField getJTextFieldAddressCompany ()
	{
		if (jTextFieldAddressCompany == null)
		{
			jTextFieldAddressCompany = new JTextField ();
			jTextFieldAddressCompany.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldAddressCompany ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldAddressCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldTradeNameCompany ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAddressCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldCuitCompany ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanyCuitFormatDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyAgreementTypeDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxIvaConditiondenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyTypedenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxcountryName (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJButtonAplicarCompany ().doClick ();
									getJTextFieldAddressCompany ().setEnabled (true);
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
						
						else if (getTextAutoCompleterAddressCompany ().itemExists (getJTextFieldAddressCompany ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldAddressCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarCompany ().doClick ();
									getJTextFieldAddressCompany ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldAddressCompany;
	}
	
	private TextAutoCompleter getTextAutoCompleterAddressCompany ()
	{
		if (textAutoCompleterAddressCompany == null)
		{
			textAutoCompleterAddressCompany = new TextAutoCompleter (getJTextFieldAddressCompany ());
			textAutoCompleterAddressCompany = new TextAutoCompleter (getJTextFieldAddressCompany (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarCompany ().doClick ();
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
		
		return textAutoCompleterAddressCompany;
	}
	
	private JTextField getJTextFieldCuitCompany ()
	{
		if (jTextFieldCuitCompany == null)
		{
			jTextFieldCuitCompany = new JTextField ();
			jTextFieldCuitCompany.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldCuitCompany ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuitCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldTradeNameCompany ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAddressCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJTextFieldAddressCompany ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Cuit", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyCuitFormatDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyAgreementTypeDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxIvaConditiondenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxCompanyTypedenomination (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									Utilidades.cargarComboBox (getJComboBoxcountryName (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");
									getJButtonAplicarCompany ().doClick ();
									getJTextFieldCuitCompany ().setEnabled (true);
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
						
						else if (getTextAutoCompleterCuitCompany ().itemExists (getJTextFieldCuitCompany ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuitCompany ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJTextFieldTradeNameCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJTextFieldAddressCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxCompanyCuitFormatDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxIvaConditiondenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxCompanyTypedenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxcountryName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxCountryStateDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CountryState.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJComboBoxlocalidadName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "localidadName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
									getJButtonAplicarCompany ().doClick ();
									getJTextFieldCuitCompany ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldCuitCompany;
	}
	
	private TextAutoCompleter getTextAutoCompleterCuitCompany ()
	{
		if (textAutoCompleterCuitCompany == null)
		{
			textAutoCompleterCuitCompany = new TextAutoCompleter (getJTextFieldCuitCompany ());
			textAutoCompleterCuitCompany = new TextAutoCompleter (getJTextFieldCuitCompany (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJTextFieldTradeNameCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "TradeName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJTextFieldAddressCompany ().setText (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "Address", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxCompanyCuitFormatDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyCuitFormat.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxCompanyAgreementTypeDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CompanyAgreementType.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxIvaConditiondenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IvaCondition.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxCompanyTypedenomination ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "OrganizationType.denomination", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxcountryName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "countryName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxCountryStateDescription ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CountryState.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJComboBoxlocalidadName ().setSelectedItem (Utilidades.devolverAtributoClave ("Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "localidadName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ()));
							getJButtonAplicarCompany ().doClick ();
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
		
		return textAutoCompleterCuitCompany;
	}
	
	private JButton getJButtonAplicarCompany ()
	{
		if (jButtonAplicarCompany == null)
		{
			jButtonAplicarCompany = new JButton ();
			jButtonAplicarCompany.setText ("Aplicar");
			jButtonAplicarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarCompany ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
							{
								if (Utilidades.ejecutarSentenciaDeSqlUpdate ("UPDATE Company SET IdCompanyAgreementType = 1"))
							
									Utilidades.finalizarTransaccionALaBaseDeDatos ();
						
								Utilidades.finalizarConexionALaBaseDeDatos ();						
							}

							getJButtonAplicarCompany ().setToolTipText ("Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry");

							if (! getJTextFieldTradeNameCompany ().getText ().toString ().isEmpty ())
						
								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameCompany ().getText ().toString () + "'"); 

							if (! getJTextFieldAddressCompany ().getText ().toString ().isEmpty ())
						
								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND Address = '" + getJTextFieldAddressCompany ().getText ().toString () + "'");

							if (! getJTextFieldCuitCompany ().getText ().toString ().isEmpty ())
						
								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND Cuit = " + getJTextFieldCuitCompany ().getText ().toString ());

							if (getJComboBoxCompanyCuitFormatDescription ().getSelectedIndex () > 0)
						
								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND CompanyCuitFormat.Description = '" + getJComboBoxCompanyCuitFormatDescription ().getSelectedItem ().toString () + "'");

							if (getJComboBoxCompanyAgreementTypeDescription ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND CompanyAgreementType.Description = '" + getJComboBoxCompanyAgreementTypeDescription ().getSelectedItem ().toString () + "'");

							if (getJComboBoxIvaConditiondenomination ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND IvaCondition.denomination = '" + getJComboBoxIvaConditiondenomination ().getSelectedItem ().toString () + "'");

							if (getJComboBoxCompanyTypedenomination ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND OrganizationType.denomination = '" + getJComboBoxCompanyTypedenomination ().getSelectedItem ().toString () + "'");

							if (getJComboBoxCountryStateDescription ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND CountryState.Description = '" + getJComboBoxCountryStateDescription ().getSelectedItem ().toString () + "'");

							if (getJComboBoxlocalidadName ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND Localidad.localidadName = '" + getJComboBoxlocalidadName ().getSelectedItem ().toString () + "'");

							if (getJComboBoxcountryName ().getSelectedIndex () > 0)

								getJButtonAplicarCompany ().setToolTipText (getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString () + " AND Country.countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'");

							Utilidades.cargarTable (getJTableCompany (), "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "IdCompany, AccountNumber, TradeName, Address, Cuit, CompanyCuitFormat.Description AS CompanyCuitFormatDescription, CompanyAgreementType.Description AS CompanyAgreementTypeDescription, EmployeeCount, StreetAdress, StreetNumber, Floor, Dpto, AfipPrimaryActivity, AfipSecundaryActivity, Mail, IvaCondition.denomination AS IvaConditiondenomination, OrganizationType.denomination AS CompanyTypedenomination, CountryState.Description AS CountryStateDescription, Localidad.localidadName, PhoneNumber, IdOrganization, Country.countryName, CASE WHEN IsDeleted = 1 THEN 'Verdadero' ELSE 'Falso' END AS IsDeleted, Usuario_Internet, Clave_Internet", getJButtonAplicarCompany ().getToolTipText () == null ? "" : getJButtonAplicarCompany ().getToolTipText ().toString (), "IdCompany");
							getJTableCompany ().requestFocus ();
							getJButtonAplicarCompany ().setToolTipText (null);
							getJPanelCompany ().setBorder (BorderFactory.createTitledBorder (null, "Company - Cantidad de registros: " + getJTableCompany ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarCompany ().setEnabled (getJTableCompany ().getRowCount () > 0);
							getJMenuItemEliminarCompany ().setEnabled (getJTableCompany ().getRowCount () > 0);
							getJButtonModificarCompany ().setEnabled (getJTableCompany ().getRowCount () > 0);
							getJMenuItemModificarCompany ().setEnabled (getJTableCompany ().getRowCount () > 0);
							getJButtonAplicarCompany ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())
											
						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarCompany;
	}
	
	private JPanel getJPanelABMCompany ()
	{
		if (jPanelABMCompany == null)
		{
			jPanelABMCompany = new JPanel ();			
			GridBagLayout gbl_jPanelABMCompany = new GridBagLayout ();
			gbl_jPanelABMCompany.columnWidths = new int [] {75, 0};
			gbl_jPanelABMCompany.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMCompany.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMCompany.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMCompany.setLayout (gbl_jPanelABMCompany);
			GridBagConstraints gbc_jButtonAgregarCompany = new GridBagConstraints ();
			gbc_jButtonAgregarCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarCompany.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarCompany.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarCompany.gridx = 0;
			gbc_jButtonAgregarCompany.gridy = 0;
			jPanelABMCompany.add (getJButtonAgregarCompany (), gbc_jButtonAgregarCompany);
			GridBagConstraints gbc_jButtonEliminarCompany = new GridBagConstraints ();
			gbc_jButtonEliminarCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarCompany.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarCompany.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarCompany.gridx = 0;
			gbc_jButtonEliminarCompany.gridy = 1;
			jPanelABMCompany.add (getJButtonEliminarCompany (), gbc_jButtonEliminarCompany);
			GridBagConstraints gbc_jButtonModificarCompany = new GridBagConstraints ();
			gbc_jButtonModificarCompany.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarCompany.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarCompany.gridx = 0;
			gbc_jButtonModificarCompany.gridy = 2;
			jPanelABMCompany.add (getJButtonModificarCompany (), gbc_jButtonModificarCompany);
		}
		
		return jPanelABMCompany;
	}
	
	private JButton getJButtonAgregarCompany ()
	{
		if (jButtonAgregarCompany == null)
		{
			jButtonAgregarCompany = new JButton ();
			jButtonAgregarCompany.setText ("Agregar");			
			jButtonAgregarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarCompany ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));
														
							Cargando cargando = new Cargando ();

							new AMCompany (null, getJButtonAgregarCompany ().getText ().toString (), null, "1", null, null, null, "Normal", "Indeterminado", "1000", "DomicilioPrueba", "1", null, null, "620900", null, "EmailPrueba@EmailPrueba.com.ar", "Responsable Inscripto", "S.A. - Sociedad An\u00f3nima", "CORDOBA", "CORDOBA                                 ", "1", "EMP", "Argentina", "Falso", null, null);
							getJButtonAplicarCompany ().doClick ();
							getJButtonAgregarCompany ().setEnabled (true);
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
		
		return jButtonAgregarCompany;
	}
	
	private JButton getJButtonEliminarCompany ()
	{
		if (jButtonEliminarCompany == null)
		{
			jButtonEliminarCompany = new JButton ();
			jButtonEliminarCompany.setText ("Eliminar");
			jButtonEliminarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar la empresa " + getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 2).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("Company", "IdCompany = " + getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 0).toString ()))								
							{	
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonAplicarCompany ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarCompany;
	}
	
	private JButton getJButtonModificarCompany ()
	{
		if (jButtonModificarCompany == null)
		{
			jButtonModificarCompany = new JButton ();
			jButtonModificarCompany.setText ("Modificar");
			jButtonModificarCompany.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarCompany ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));
														
							Cargando cargando = new Cargando ();

							new AMCompany (null, getJButtonModificarCompany ().getText ().toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 0).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 1).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 2).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 3).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 4).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 5).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 6).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 7).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 8).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 9).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 10).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 11).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 12).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 13).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 14).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 15).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 16).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 17).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 18).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 19).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 20).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 21).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 22).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 23).toString (), getJTableCompany ().getValueAt (getJTableCompany ().getSelectedRow (), 24).toString ());							
							getJButtonAplicarCompany ().doClick ();
							getJButtonModificarCompany ().setEnabled (true);
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
		
		return jButtonModificarCompany;
	}
	
	private JPanel getJPanelCompanySection ()
	{
		if (jPanelCompanySection == null)
		{
			jPanelCompanySection = new JPanel ();
			GridBagLayout gbl_jPanelCompanySection = new GridBagLayout ();
			gbl_jPanelCompanySection.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelCompanySection.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelCompanySection.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelCompanySection.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelCompanySection.setLayout (gbl_jPanelCompanySection);
			GridBagConstraints gbc_jScrollPaneCompanySection = new GridBagConstraints ();
			gbc_jScrollPaneCompanySection.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneCompanySection.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneCompanySection.gridx = 0;
			gbc_jScrollPaneCompanySection.gridy = 0;
			jPanelCompanySection.add (getJScrollPaneCompanySection (), gbc_jScrollPaneCompanySection);
			GridBagConstraints gbc_jScrollPaneABMCompanySection = new GridBagConstraints ();
			gbc_jScrollPaneABMCompanySection.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMCompanySection.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMCompanySection.gridx = 1;
			gbc_jScrollPaneABMCompanySection.gridy = 0;
			jPanelCompanySection.add (getJScrollPaneABMCompanySection (), gbc_jScrollPaneABMCompanySection);
			GridBagConstraints gbc_jScrollPaneFiltrosCompanySection = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosCompanySection.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosCompanySection.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosCompanySection.gridx = 0;
			gbc_jScrollPaneFiltrosCompanySection.gridy = 1;
			jPanelCompanySection.add (getJScrollPaneFiltrosCompanySection (), gbc_jScrollPaneFiltrosCompanySection);
			GridBagConstraints gbc_jButtonAplicarCompanySection = new GridBagConstraints ();
			gbc_jButtonAplicarCompanySection.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarCompanySection.gridx = 1;
			gbc_jButtonAplicarCompanySection.gridy = 1;
			jPanelCompanySection.add (getJButtonAplicarCompanySection (), gbc_jButtonAplicarCompanySection);
		}
		
		return jPanelCompanySection;
	}
	
	private JScrollPane getJScrollPaneCompanySection ()
	{
		if (jScrollPaneCompanySection == null)
		{
			jScrollPaneCompanySection = new JScrollPane ();
			jScrollPaneCompanySection.setViewportView (getJTableCompanySection ());
			jScrollPaneCompanySection.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySection ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySection ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneCompanySection;
	}
	
	private JTable getJTableCompanySection ()
	{
		if (jTableCompanySection == null)
		{
			jTableCompanySection = new JTable ();
			jTableCompanySection.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySection ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySection ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableCompanySection;
	}
	
	private JPopupMenu getJPopupMenuCompanySection ()
	{
		if (jPopupMenuCompanySection == null)
		{
			jPopupMenuCompanySection = new JPopupMenu ();
			jPopupMenuCompanySection.add (getJMenuItemAgregarCompanySection ());
			jPopupMenuCompanySection.add (getJMenuItemEliminarCompanySection ());
			jPopupMenuCompanySection.add (getJMenuItemModificarCompanySection ());
		}
		
		return jPopupMenuCompanySection;
	}
	
	private JMenuItem getJMenuItemAgregarCompanySection ()
	{
		if (jMenuItemAgregarCompanySection == null)
		{
			jMenuItemAgregarCompanySection = new JMenuItem ();
			jMenuItemAgregarCompanySection.setText ("Agregar");
			jMenuItemAgregarCompanySection.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarCompanySection ().doClick ();					
				}
			}
			);
		}
		
		return jMenuItemAgregarCompanySection;
	}
	
	private JMenuItem getJMenuItemEliminarCompanySection ()
	{
		if (jMenuItemEliminarCompanySection == null)
		{
			jMenuItemEliminarCompanySection = new JMenuItem ();
			jMenuItemEliminarCompanySection.setText ("Eliminar");
			jMenuItemEliminarCompanySection.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarCompanySection ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarCompanySection;
	}
	
	private JMenuItem getJMenuItemModificarCompanySection ()
	{
		if (jMenuItemModificarCompanySection == null)
		{
			jMenuItemModificarCompanySection = new JMenuItem ();
			jMenuItemModificarCompanySection.setText ("Modificar");
			jMenuItemModificarCompanySection.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarCompanySection ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarCompanySection;
	}
	
	private JPanel getJPanelFiltrosCompanySection ()
	{
		if (jPanelFiltrosCompanySection == null)
		{
			jPanelFiltrosCompanySection = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosCompanySection = new GridBagLayout ();
			gbl_jPanelFiltrosCompanySection.columnWidths = new int [] {57, 28, 59, 28, 23, 28, 0};
			gbl_jPanelFiltrosCompanySection.rowHeights = new int [] {20, 0, 0};
			gbl_jPanelFiltrosCompanySection.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosCompanySection.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelFiltrosCompanySection.setLayout (gbl_jPanelFiltrosCompanySection);
			GridBagConstraints gbc_jLabelDescriptionCompanySection = new GridBagConstraints();
			gbc_jLabelDescriptionCompanySection.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelDescriptionCompanySection.anchor = GridBagConstraints.EAST;
			gbc_jLabelDescriptionCompanySection.gridx = 0;
			gbc_jLabelDescriptionCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add(getJLabelDescriptionCompanySection(), gbc_jLabelDescriptionCompanySection);
			GridBagConstraints gbc_jComboBoxDescriptionCompanySection = new GridBagConstraints ();
			gbc_jComboBoxDescriptionCompanySection.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxDescriptionCompanySection.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxDescriptionCompanySection.gridx = 1;
			gbc_jComboBoxDescriptionCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add (getJComboBoxDescriptionCompanySection (), gbc_jComboBoxDescriptionCompanySection);
			GridBagConstraints gbc_jLabelDescriptionCompanySubsidiaryCompanySection = new GridBagConstraints();
			gbc_jLabelDescriptionCompanySubsidiaryCompanySection.anchor = GridBagConstraints.EAST;
			gbc_jLabelDescriptionCompanySubsidiaryCompanySection.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelDescriptionCompanySubsidiaryCompanySection.gridx = 2;
			gbc_jLabelDescriptionCompanySubsidiaryCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add(getJLabelDescriptionCompanySubsidiaryCompanySection(), gbc_jLabelDescriptionCompanySubsidiaryCompanySection);
			GridBagConstraints gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection = new GridBagConstraints();
			gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection.gridx = 3;
			gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add(getJComboBoxDescriptionCompanySubsidiaryCompanySection(), gbc_jComboBoxDescriptionCompanySubsidiaryCompanySection);
			jLabelTradeNameCompanySection = new JLabel ();
			jLabelTradeNameCompanySection.setText ("TradeName:");
			GridBagConstraints gbc_jLabelTradeNameCompanySection = new GridBagConstraints ();
			gbc_jLabelTradeNameCompanySection.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameCompanySection.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelTradeNameCompanySection.gridx = 4;
			gbc_jLabelTradeNameCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add (jLabelTradeNameCompanySection, gbc_jLabelTradeNameCompanySection);
			GridBagConstraints gbc_jTextFieldTradeNameCompanySection = new GridBagConstraints();
			gbc_jTextFieldTradeNameCompanySection.insets = new Insets(0, 0, 5, 0);
			gbc_jTextFieldTradeNameCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameCompanySection.gridx = 5;
			gbc_jTextFieldTradeNameCompanySection.gridy = 0;
			jPanelFiltrosCompanySection.add(getJTextFieldTradeNameCompanySection(), gbc_jTextFieldTradeNameCompanySection);
			GridBagConstraints gbc_jLabelCuitCompanySection = new GridBagConstraints();
			gbc_jLabelCuitCompanySection.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuitCompanySection.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelCuitCompanySection.gridx = 0;
			gbc_jLabelCuitCompanySection.gridy = 1;
			jPanelFiltrosCompanySection.add(getJLabelCuitCompanySection(), gbc_jLabelCuitCompanySection);
			GridBagConstraints gbc_jTextFieldCuitCompanySection = new GridBagConstraints();
			gbc_jTextFieldCuitCompanySection.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldCuitCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuitCompanySection.gridx = 1;
			gbc_jTextFieldCuitCompanySection.gridy = 1;
			jPanelFiltrosCompanySection.add(getJTextFieldCuitCompanySection(), gbc_jTextFieldCuitCompanySection);
		}
		
		return jPanelFiltrosCompanySection;
	}
	
	private JLabel getJLabelDescriptionCompanySection ()
	{
		if (jLabelDescriptionCompanySection == null)
		{
			jLabelDescriptionCompanySection = new JLabel ();
			jLabelDescriptionCompanySection.setText ("CompanySection Description:");
		}
		
		return jLabelDescriptionCompanySection;
	}
	
	private JComboBox <String> getJComboBoxDescriptionCompanySection ()
	{
		if (jComboBoxDescriptionCompanySection == null)
		{
			jComboBoxDescriptionCompanySection = new JComboBox <String> ();
		}
		
		return jComboBoxDescriptionCompanySection;
	}
	
	private JLabel getJLabelDescriptionCompanySubsidiaryCompanySection ()
	{
		if (jLabelDescriptionCompanySubsidiaryCompanySection == null)
		{
			jLabelDescriptionCompanySubsidiaryCompanySection = new JLabel ();
			jLabelDescriptionCompanySubsidiaryCompanySection.setText ("CompanySubsidiary Description:");
		}
		
		return jLabelDescriptionCompanySubsidiaryCompanySection;
	}
	
	private JComboBox <String> getJComboBoxDescriptionCompanySubsidiaryCompanySection ()
	{
		if (jComboBoxDescriptionCompanySubsidiaryCompanySection == null)
		{
			jComboBoxDescriptionCompanySubsidiaryCompanySection = new JComboBox <String> ();
			jComboBoxDescriptionCompanySubsidiaryCompanySection.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxDescriptionCompanySubsidiaryCompanySection ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							if (getJComboBoxDescriptionCompanySubsidiaryCompanySection ().getSelectedIndex () > 0)
							{
								Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySubsidiary.Description = '" + getJComboBoxDescriptionCompanySubsidiaryCompanySection ().getSelectedItem ().toString () + "'");
								getJLabelDescriptionCompanySection ().setEnabled (true);
								getJComboBoxDescriptionCompanySection ().setEnabled (true);
							}

							else
							{
								getJComboBoxDescriptionCompanySection ().removeAllItems ();
								getJLabelDescriptionCompanySection ().setEnabled (false);
								getJComboBoxDescriptionCompanySection ().setEnabled (false);
							}

							getJComboBoxDescriptionCompanySubsidiaryCompanySection ().setEnabled (true);
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

							try
							{
								SwingUtilities.invokeAndWait (runnable);
							}

							catch (InvocationTargetException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}

							catch (InterruptedException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}
					}
				}
			}
			);
		}
		
		return jComboBoxDescriptionCompanySubsidiaryCompanySection;
	}
	
	private JTextField getJTextFieldTradeNameCompanySection ()
	{
		if (jTextFieldTradeNameCompanySection == null)
		{
			jTextFieldTradeNameCompanySection = new JTextField ();
			jTextFieldTradeNameCompanySection.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameCompanySection ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompanySection ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiaryCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySubsidiary.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");		
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySection (), "CompanySection, CompanySubsidiary, Company", "TradeName", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									getJTextFieldCuitCompanySection ().setText ("");
									getJButtonAplicarCompanySection ().doClick ();
									getJTextFieldTradeNameCompanySection ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameCompanySection ().itemExists (getJTextFieldTradeNameCompanySection ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompanySection ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiaryCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySubsidiary.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
									getJTextFieldCuitCompanySection ().setText (Utilidades.devolverAtributoClave ("CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'"));
									getJButtonAplicarCompanySection ().doClick ();
									getJTextFieldTradeNameCompanySection ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameCompanySection;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameCompanySection ()
	{
		if (textAutoCompleterTradeNameCompanySection == null)
		{
			textAutoCompleterTradeNameCompanySection = new TextAutoCompleter (getJTextFieldTradeNameCompanySection (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
							Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiaryCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySubsidiary.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
							getJTextFieldCuitCompanySection ().setText (Utilidades.devolverAtributoClave ("CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'"));
							getJButtonAplicarCompanySection ().doClick ();
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
		
		return textAutoCompleterTradeNameCompanySection;
	}
	
	private JLabel getJLabelCuitCompanySection ()
	{
		if (jLabelCuitCompanySection == null)
		{
			jLabelCuitCompanySection = new JLabel ();
			jLabelCuitCompanySection.setText ("Cuit:");
		}
		
		return jLabelCuitCompanySection;
	}
	
	private JTextField getJTextFieldCuitCompanySection ()
	{
		if (jTextFieldCuitCompanySection == null)
		{
			jTextFieldCuitCompanySection = new JTextField ();
			jTextFieldCuitCompanySection.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldCuitCompanySection ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuitCompanySection ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiaryCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySubsidiary.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySection (), "CompanySection, CompanySubsidiary, Company", "TradeName", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									getJTextFieldTradeNameCompanySection ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
									getJButtonAplicarCompanySection ().doClick ();
									getJTextFieldCuitCompanySection ().setEnabled (true);
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
						
						else if (getTextAutoCompleterCuitCompanySection ().itemExists (getJTextFieldCuitCompanySection ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuitCompanySection ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ());
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ());
									getJTextFieldTradeNameCompanySection ().setText (Utilidades.devolverAtributoClave ("CompanySection, CompanySubsidiary, Company", "TradeName", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ()));
									getJButtonAplicarCompanySection ().doClick ();
									getJTextFieldCuitCompanySection ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldCuitCompanySection;
	}
	
	private TextAutoCompleter getTextAutoCompleterCuitCompanySection ()
	{
		if (textAutoCompleterCuitCompanySection == null)
		{
			textAutoCompleterCuitCompanySection = new TextAutoCompleter (getJTextFieldCuitCompanySection (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySection (), false, "CompanySection, CompanySubsidiary, Company", "CompanySection.Description", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ());
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuitCompanySection (), "CompanySection, CompanySubsidiary, Company", "CompanySection.cuit", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ());
							getJTextFieldTradeNameCompanySection ().setText (Utilidades.devolverAtributoClave ("CompanySection, CompanySubsidiary, Company", "TradeName", "CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ()));
							getJButtonAplicarCompanySection ().doClick ();
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
		
		return textAutoCompleterCuitCompanySection;
	}

	private JButton getJButtonAplicarCompanySection ()
	{
		if (jButtonAplicarCompanySection == null)
		{
			jButtonAplicarCompanySection = new JButton ();
			jButtonAplicarCompanySection.setText ("Aplicar");
			jButtonAplicarCompanySection.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarCompanySection ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarCompanySection ().setToolTipText ("CompanySection.IdCompany = Company.IdCompany AND CompanySection.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary");
													 
							if (getJComboBoxDescriptionCompanySection ().getSelectedIndex () > 0)
														
								getJButtonAplicarCompanySection ().setToolTipText (getJButtonAplicarCompanySection ().getToolTipText () == null ? "" : getJButtonAplicarCompanySection ().getToolTipText ().toString () + " AND CompanySection.Description = '" + getJComboBoxDescriptionCompanySection ().getSelectedItem ().toString () + "'");
							
							if (getJComboBoxDescriptionCompanySubsidiaryCompanySection ().getSelectedIndex () > 0)
								
								getJButtonAplicarCompanySection ().setToolTipText (getJButtonAplicarCompanySection ().getToolTipText () == null ? "" : getJButtonAplicarCompanySection ().getToolTipText ().toString () + " AND CompanySubsidiary.Description = '" + getJComboBoxDescriptionCompanySubsidiaryCompanySection ().getSelectedItem ().toString () + "'");
													
							if (! getJTextFieldTradeNameCompanySection ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarCompanySection ().setToolTipText (getJButtonAplicarCompanySection ().getToolTipText () == null ? "" : getJButtonAplicarCompanySection ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameCompanySection ().getText ().toString () + "'");
													
							if (! getJTextFieldCuitCompanySection ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarCompanySection ().setToolTipText (getJButtonAplicarCompanySection ().getToolTipText () == null ? "" : getJButtonAplicarCompanySection ().getToolTipText ().toString () + " AND CompanySection.cuit = " + getJTextFieldCuitCompanySection ().getText ().toString ());
													
							Utilidades.cargarTable (getJTableCompanySection (), "CompanySection, CompanySubsidiary, Company", "IdCompanySection, CompanySection.Description AS CompanySectionDescription, CompanySubsidiary.Description AS CompanySubsidiaryDescription, TradeName, CompanySection.cuit AS cuit", getJButtonAplicarCompanySection ().getToolTipText () == null ? "" : getJButtonAplicarCompanySection ().getToolTipText ().toString (), "IdCompanySection");
							getJTableCompanySection ().requestFocus ();
							getJButtonAplicarCompanySection ().setToolTipText (null);
							getJPanelCompanySection ().setBorder (BorderFactory.createTitledBorder (null, "CompanySection - Cantidad de registros: " + getJTableCompanySection ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarCompanySection ().setEnabled (getJTableCompanySection ().getRowCount () > 0);
							getJMenuItemEliminarCompanySection ().setEnabled (getJTableCompanySection ().getRowCount () > 0);
							getJButtonModificarCompanySection ().setEnabled (getJTableCompanySection ().getRowCount () > 0);
							getJMenuItemModificarCompanySection ().setEnabled (getJTableCompanySection ().getRowCount () > 0);
							getJButtonAplicarCompanySection ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())
						
						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarCompanySection;
	}
	
	private JPanel getJPanelABMCompanySection ()
	{
		if (jPanelABMCompanySection == null)
		{
			jPanelABMCompanySection = new JPanel ();
			GridBagLayout gbl_jPanelABMCompanySection = new GridBagLayout ();
			gbl_jPanelABMCompanySection.columnWidths = new int [] {75, 0};
			gbl_jPanelABMCompanySection.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMCompanySection.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMCompanySection.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMCompanySection.setLayout (gbl_jPanelABMCompanySection);
			GridBagConstraints gbc_jButtonAgregarCompanySection = new GridBagConstraints ();
			gbc_jButtonAgregarCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarCompanySection.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarCompanySection.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarCompanySection.gridx = 0;
			gbc_jButtonAgregarCompanySection.gridy = 0;
			jPanelABMCompanySection.add (getJButtonAgregarCompanySection (), gbc_jButtonAgregarCompanySection);
			GridBagConstraints gbc_jButtonEliminarCompanySection = new GridBagConstraints ();
			gbc_jButtonEliminarCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarCompanySection.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarCompanySection.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarCompanySection.gridx = 0;
			gbc_jButtonEliminarCompanySection.gridy = 1;
			jPanelABMCompanySection.add (getJButtonEliminarCompanySection (), gbc_jButtonEliminarCompanySection);
			GridBagConstraints gbc_jButtonModificarCompanySection = new GridBagConstraints ();
			gbc_jButtonModificarCompanySection.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarCompanySection.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarCompanySection.gridx = 0;
			gbc_jButtonModificarCompanySection.gridy = 2;
			jPanelABMCompanySection.add (getJButtonModificarCompanySection (), gbc_jButtonModificarCompanySection);
		}
		
		return jPanelABMCompanySection;
	}
	
	private JButton getJButtonAgregarCompanySection ()
	{
		if (jButtonAgregarCompanySection == null)
		{
			jButtonAgregarCompanySection = new JButton ();
			jButtonAgregarCompanySection.setText ("Agregar");
			jButtonAgregarCompanySection.addActionListener (new ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarCompanySection ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMCompanySection (null, getJButtonAgregarCompanySection ().getText ().toString (), null, null, null, null, null);
							getJButtonAplicarCompanySection ().doClick ();
							getJButtonAgregarCompanySection ().setEnabled (true);
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
		
		return jButtonAgregarCompanySection;
	}
	
	private JButton getJButtonEliminarCompanySection ()
	{
		if (jButtonEliminarCompanySection == null)
		{
			jButtonEliminarCompanySection = new JButton ();
			jButtonEliminarCompanySection.setText ("Eliminar");
			jButtonEliminarCompanySection.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar la secci\u00f3n " + getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 1).toString () + ", de la empresa " + getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 2).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("CompanySection", "IdCompanySection = " + getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 0).toString ()))								
							{	
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonAplicarCompanySection ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarCompanySection;
	}
	
	private JButton getJButtonModificarCompanySection ()
	{
		if (jButtonModificarCompanySection == null)
		{
			jButtonModificarCompanySection = new JButton ();
			jButtonModificarCompanySection.setText ("Modificar");
			jButtonModificarCompanySection.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarCompanySection ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMCompanySection (null, getJButtonModificarCompanySection ().getText ().toString (), getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 0).toString (), getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 1).toString (), getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 2).toString (), getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 3).toString (), getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 4) == null ? "" : getJTableCompanySection ().getValueAt (getJTableCompanySection ().getSelectedRow (), 4).toString ());
							getJButtonAplicarCompanySection ().doClick ();
							getJButtonModificarCompanySection ().setEnabled (true);
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
		
		return jButtonModificarCompanySection;
	}
	
	private JPanel getJPanelCompanySubsidiary ()
	{
		if (jPanelCompanySubsidiary == null)
		{
			jPanelCompanySubsidiary = new JPanel ();
			GridBagLayout gbl_jPanelCompanySubsidiary = new GridBagLayout ();
			gbl_jPanelCompanySubsidiary.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelCompanySubsidiary.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelCompanySubsidiary.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelCompanySubsidiary.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelCompanySubsidiary.setLayout (gbl_jPanelCompanySubsidiary);
			GridBagConstraints gbc_jScrollPaneCompanySubsidiary = new GridBagConstraints ();
			gbc_jScrollPaneCompanySubsidiary.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneCompanySubsidiary.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneCompanySubsidiary.gridx = 0;
			gbc_jScrollPaneCompanySubsidiary.gridy = 0;
			jPanelCompanySubsidiary.add (getJScrollPaneCompanySubsidiary (), gbc_jScrollPaneCompanySubsidiary);
			GridBagConstraints gbc_jScrollPaneABMCompanySubsidiary = new GridBagConstraints ();
			gbc_jScrollPaneABMCompanySubsidiary.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMCompanySubsidiary.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMCompanySubsidiary.gridx = 1;
			gbc_jScrollPaneABMCompanySubsidiary.gridy = 0;
			jPanelCompanySubsidiary.add (getJScrollPaneABMCompanySubsidiary (), gbc_jScrollPaneABMCompanySubsidiary);
			GridBagConstraints gbc_jScrollPaneFiltrosCompanySubsidiary = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosCompanySubsidiary.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosCompanySubsidiary.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosCompanySubsidiary.gridx = 0;
			gbc_jScrollPaneFiltrosCompanySubsidiary.gridy = 1;
			jPanelCompanySubsidiary.add (getJScrollPaneFiltrosCompanySubsidiary (), gbc_jScrollPaneFiltrosCompanySubsidiary);
			GridBagConstraints gbc_jButtonAplicarCompanySubsidiary = new GridBagConstraints ();
			gbc_jButtonAplicarCompanySubsidiary.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarCompanySubsidiary.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarCompanySubsidiary.gridx = 1;
			gbc_jButtonAplicarCompanySubsidiary.gridy = 1;
			jPanelCompanySubsidiary.add (getJButtonAplicarCompanySubsidiary (), gbc_jButtonAplicarCompanySubsidiary);
		}
		
		return jPanelCompanySubsidiary;
	}
	
	private JScrollPane getJScrollPaneCompanySubsidiary ()
	{
		if (jScrollPaneCompanySubsidiary == null)
		{
			jScrollPaneCompanySubsidiary = new JScrollPane ();
			jScrollPaneCompanySubsidiary.setViewportView (getJTableCompanySubsidiary ());
			jScrollPaneCompanySubsidiary.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySubsidiary ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySubsidiary ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneCompanySubsidiary;
	}
	
	private JTable getJTableCompanySubsidiary ()
	{
		if (jTableCompanySubsidiary == null)
		{
			jTableCompanySubsidiary = new JTable ();
			jTableCompanySubsidiary.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySubsidiary ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuCompanySubsidiary ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableCompanySubsidiary;
	}
	
	private JPopupMenu getJPopupMenuCompanySubsidiary ()
	{
		if (jPopupMenuCompanySubsidiary == null)
		{
			jPopupMenuCompanySubsidiary = new JPopupMenu ();
			jPopupMenuCompanySubsidiary.add (getJMenuItemAgregarCompanySubsidiary ());
			jPopupMenuCompanySubsidiary.add (getJMenuItemEliminarCompanySubsidiary ());
			jPopupMenuCompanySubsidiary.add (getJMenuItemModificarCompanySubsidiary ());
		}
		
		return jPopupMenuCompanySubsidiary;
	}
	
	private JMenuItem getJMenuItemAgregarCompanySubsidiary ()
	{
		if (jMenuItemAgregarCompanySubsidiary == null)
		{
			jMenuItemAgregarCompanySubsidiary = new JMenuItem ();
			jMenuItemAgregarCompanySubsidiary.setText ("Agregar");
			jMenuItemAgregarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarCompanySubsidiary ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarCompanySubsidiary;
	}
	
	private JMenuItem getJMenuItemEliminarCompanySubsidiary ()
	{
		if (jMenuItemEliminarCompanySubsidiary == null)
		{
			jMenuItemEliminarCompanySubsidiary = new JMenuItem ();
			jMenuItemEliminarCompanySubsidiary.setText ("Eliminar");
			jMenuItemEliminarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarCompanySubsidiary ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarCompanySubsidiary;
	}
	
	private JMenuItem getJMenuItemModificarCompanySubsidiary ()
	{
		if (jMenuItemModificarCompanySubsidiary == null)
		{
			jMenuItemModificarCompanySubsidiary = new JMenuItem ();
			jMenuItemModificarCompanySubsidiary.setText ("Modificar");
			jMenuItemModificarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarCompanySubsidiary ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarCompanySubsidiary;
	}
	
	private JPanel getJPanelFiltrosCompanySubsidiary ()
	{
		if (jPanelFiltrosCompanySubsidiary == null)
		{
			jPanelFiltrosCompanySubsidiary = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosCompanySubsidiary = new GridBagLayout ();
			gbl_jPanelFiltrosCompanySubsidiary.columnWidths = new int [] {57, 28, 59, 28, 81, 28, 0};
			gbl_jPanelFiltrosCompanySubsidiary.rowHeights = new int [] {20, 0};
			gbl_jPanelFiltrosCompanySubsidiary.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosCompanySubsidiary.rowWeights = new double [] {0.0, Double.MIN_VALUE};
			jPanelFiltrosCompanySubsidiary.setLayout (gbl_jPanelFiltrosCompanySubsidiary);
			jLabelDescriptionCompanySubsidiary = new JLabel ();
			jLabelDescriptionCompanySubsidiary.setText ("Description:");
			GridBagConstraints gbc_jLabelDescriptionCompanySubsidiary = new GridBagConstraints ();
			gbc_jLabelDescriptionCompanySubsidiary.anchor = GridBagConstraints.EAST;
			gbc_jLabelDescriptionCompanySubsidiary.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelDescriptionCompanySubsidiary.gridx = 0;
			gbc_jLabelDescriptionCompanySubsidiary.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add (jLabelDescriptionCompanySubsidiary, gbc_jLabelDescriptionCompanySubsidiary);
			GridBagConstraints gbc_jComboBoxDescriptionCompanySubsidiary = new GridBagConstraints ();
			gbc_jComboBoxDescriptionCompanySubsidiary.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxDescriptionCompanySubsidiary.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxDescriptionCompanySubsidiary.gridx = 1;
			gbc_jComboBoxDescriptionCompanySubsidiary.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add (getJComboBoxDescriptionCompanySubsidiary (), gbc_jComboBoxDescriptionCompanySubsidiary);
			jLabelTradeNameCompanySubsidiary = new JLabel ();
			jLabelTradeNameCompanySubsidiary.setText ("TradeName:");
			GridBagConstraints gbc_jLabelTradeNameCompanySubsidiary = new GridBagConstraints ();
			gbc_jLabelTradeNameCompanySubsidiary.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameCompanySubsidiary.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelTradeNameCompanySubsidiary.gridx = 2;
			gbc_jLabelTradeNameCompanySubsidiary.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add (jLabelTradeNameCompanySubsidiary, gbc_jLabelTradeNameCompanySubsidiary);
			GridBagConstraints gbc_jTextFieldTradeNameCompanySubsidiary = new GridBagConstraints();
			gbc_jTextFieldTradeNameCompanySubsidiary.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldTradeNameCompanySubsidiary.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameCompanySubsidiary.gridx = 3;
			gbc_jTextFieldTradeNameCompanySubsidiary.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add(getJTextFieldTradeNameCompanySubsidiary(), gbc_jTextFieldTradeNameCompanySubsidiary);
			jLabelNumeroDeAR = new JLabel ();
			jLabelNumeroDeAR.setText ("N\u00FAmero de A.R.:");
			GridBagConstraints gbc_jLabelNumeroDeAR = new GridBagConstraints ();
			gbc_jLabelNumeroDeAR.anchor = GridBagConstraints.EAST;
			gbc_jLabelNumeroDeAR.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelNumeroDeAR.gridx = 4;
			gbc_jLabelNumeroDeAR.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add (jLabelNumeroDeAR, gbc_jLabelNumeroDeAR);
			GridBagConstraints gbc_jTextFieldNumeroDeAR = new GridBagConstraints();
			gbc_jTextFieldNumeroDeAR.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldNumeroDeAR.gridx = 5;
			gbc_jTextFieldNumeroDeAR.gridy = 0;
			jPanelFiltrosCompanySubsidiary.add(getJTextFieldNumeroDeAR(), gbc_jTextFieldNumeroDeAR);
		}
		
		return jPanelFiltrosCompanySubsidiary;
	}
	
	private JComboBox <String> getJComboBoxDescriptionCompanySubsidiary ()
	{
		if (jComboBoxDescriptionCompanySubsidiary == null)
		{
			jComboBoxDescriptionCompanySubsidiary = new JComboBox <String> ();
		}
		
		return jComboBoxDescriptionCompanySubsidiary;
	}
	
	private JTextField getJTextFieldTradeNameCompanySubsidiary ()
	{
		if (jTextFieldTradeNameCompanySubsidiary == null)
		{
			jTextFieldTradeNameCompanySubsidiary = new JTextField ();
			jTextFieldTradeNameCompanySubsidiary.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameCompanySubsidiary ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompanySubsidiary ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterNumeroDeAR (), "CompanySubsidiary, Company", "IdAr", "CompanySubsidiary.IdCompany = Company.IdCompany");
									getJTextFieldNumeroDeAR ().setText ("");
									getJButtonAplicarCompanySubsidiary ().doClick ();
									getJTextFieldTradeNameCompanySubsidiary ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameCompanySubsidiary ().itemExists (getJTextFieldTradeNameCompanySubsidiary ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameCompanySubsidiary ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'");
									getJTextFieldNumeroDeAR ().setText (Utilidades.devolverAtributoClave ("CompanySubsidiary, Company", "IdAr", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'"));
									getJButtonAplicarCompanySubsidiary ().doClick ();
									getJTextFieldTradeNameCompanySubsidiary ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameCompanySubsidiary;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameCompanySubsidiary ()
	{
		if (textAutoCompleterTradeNameCompanySubsidiary == null)
		{
			textAutoCompleterTradeNameCompanySubsidiary = new TextAutoCompleter (getJTextFieldTradeNameCompanySubsidiary (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();
							
							Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'");
							getJTextFieldNumeroDeAR ().setText (Utilidades.devolverAtributoClave ("CompanySubsidiary, Company", "IdAr", "CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'"));
							getJButtonAplicarCompanySubsidiary ().doClick ();
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
		
		return textAutoCompleterTradeNameCompanySubsidiary;
	}
	
	private JTextField getJTextFieldNumeroDeAR ()
	{
		if (jTextFieldNumeroDeAR == null)
		{
			jTextFieldNumeroDeAR = new JTextField ();
			jTextFieldNumeroDeAR.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldNumeroDeAR ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldNumeroDeAR ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany");
									getJTextFieldTradeNameCompanySubsidiary ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterNumeroDeAR (), "CompanySubsidiary, Company", "IdAr", "CompanySubsidiary.IdCompany = Company.IdCompany");
									getJButtonAplicarCompanySubsidiary ().doClick ();
									getJTextFieldNumeroDeAR ().setEnabled (true);
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
						
						else if (getTextAutoCompleterNumeroDeAR ().itemExists (getJTextFieldNumeroDeAR ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldNumeroDeAR ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND IdAr = " + getJTextFieldNumeroDeAR ().getText ().toString ());
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany AND IdAr = " + getJTextFieldNumeroDeAR ().getText ().toString ());
									getJButtonAplicarCompanySubsidiary ().doClick ();
									getJTextFieldNumeroDeAR ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldNumeroDeAR;
	}
	
	private TextAutoCompleter getTextAutoCompleterNumeroDeAR ()
	{
		if (textAutoCompleterNumeroDeAR == null)
		{
			textAutoCompleterNumeroDeAR = new TextAutoCompleter (getJTextFieldNumeroDeAR (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxDescriptionCompanySubsidiary (), false, "CompanySubsidiary, Company", "Description", "CompanySubsidiary.IdCompany = Company.IdCompany AND IdAr = " + getJTextFieldNumeroDeAR ().getText ().toString ());
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameCompanySubsidiary (), "CompanySubsidiary, Company", "TradeName", "CompanySubsidiary.IdCompany = Company.IdCompany AND IdAr = " + getJTextFieldNumeroDeAR ().getText ().toString ());
							getJButtonAplicarCompanySubsidiary ().doClick ();
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
		
		return textAutoCompleterNumeroDeAR;
	}
	
	private JButton getJButtonAplicarCompanySubsidiary ()
	{
		if (jButtonAplicarCompanySubsidiary == null)
		{
			jButtonAplicarCompanySubsidiary = new JButton ();
			jButtonAplicarCompanySubsidiary.setText ("Aplicar");
			jButtonAplicarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarCompanySubsidiary ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarCompanySubsidiary ().setToolTipText ("CompanySubsidiary.IdCompany = Company.IdCompany");
													
							if (getJComboBoxDescriptionCompanySubsidiary ().getSelectedIndex () > 0)
														
								getJButtonAplicarCompanySubsidiary ().setToolTipText (getJButtonAplicarCompanySubsidiary ().getToolTipText () == null ? "" : getJButtonAplicarCompanySubsidiary ().getToolTipText ().toString () + " AND Description = '" + getJComboBoxDescriptionCompanySubsidiary ().getSelectedItem ().toString () + "'");
													
							if (! getJTextFieldTradeNameCompanySubsidiary ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarCompanySubsidiary ().setToolTipText (getJButtonAplicarCompanySubsidiary ().getToolTipText () == null ? "" : getJButtonAplicarCompanySubsidiary ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameCompanySubsidiary ().getText ().toString () + "'");
													
							if (! getJTextFieldNumeroDeAR ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarCompanySubsidiary ().setToolTipText (getJButtonAplicarCompanySubsidiary ().getToolTipText () == null ? "" : getJButtonAplicarCompanySubsidiary ().getToolTipText ().toString () + " AND IdAr = " + (getJTextFieldNumeroDeAR ().getText ().toString ().isEmpty () ? "0" : getJTextFieldNumeroDeAR ().getText ().toString ()));
													
							Utilidades.cargarTable (getJTableCompanySubsidiary (), "CompanySubsidiary, Company", "IdCompanySubsidiary, Description, TradeName, IdAr", getJButtonAplicarCompanySubsidiary ().getToolTipText () == null ? "" : getJButtonAplicarCompanySubsidiary ().getToolTipText ().toString (), "IdCompanySubsidiary");
							getJTableCompanySubsidiary ().requestFocus ();
							getJComboBoxDescriptionCompanySubsidiary ().setToolTipText (null);
							getJPanelCompanySubsidiary ().setBorder (BorderFactory.createTitledBorder (null, "CompanySubsidiary - Cantidad de registros: " + getJTableCompanySubsidiary ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarCompanySubsidiary ().setEnabled (getJTableCompanySubsidiary ().getRowCount () > 0);
							getJMenuItemEliminarCompanySubsidiary ().setEnabled (getJTableCompanySubsidiary ().getRowCount () > 0);
							getJButtonModificarCompanySubsidiary ().setEnabled (getJTableCompanySubsidiary ().getRowCount () > 0);
							getJMenuItemModificarCompanySubsidiary ().setEnabled (getJTableCompanySubsidiary ().getRowCount () > 0);
							getJButtonAplicarCompanySubsidiary ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())
						
						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarCompanySubsidiary;
	}
	
	private JPanel getJPanelABMCompanySubsidiary ()
	{
		if (jPanelABMCompanySubsidiary == null)
		{
			jPanelABMCompanySubsidiary = new JPanel ();
			GridBagLayout gbl_jPanelABMCompanySubsidiary = new GridBagLayout ();
			gbl_jPanelABMCompanySubsidiary.columnWidths = new int [] {75, 0};
			gbl_jPanelABMCompanySubsidiary.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMCompanySubsidiary.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMCompanySubsidiary.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMCompanySubsidiary.setLayout (gbl_jPanelABMCompanySubsidiary);
			GridBagConstraints gbc_jButtonAgregarCompanySubsidiary = new GridBagConstraints ();
			gbc_jButtonAgregarCompanySubsidiary.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarCompanySubsidiary.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarCompanySubsidiary.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarCompanySubsidiary.gridx = 0;
			gbc_jButtonAgregarCompanySubsidiary.gridy = 0;
			jPanelABMCompanySubsidiary.add (getJButtonAgregarCompanySubsidiary (), gbc_jButtonAgregarCompanySubsidiary);
			GridBagConstraints gbc_jButtonEliminarCompanySubsidiary = new GridBagConstraints ();
			gbc_jButtonEliminarCompanySubsidiary.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarCompanySubsidiary.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarCompanySubsidiary.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarCompanySubsidiary.gridx = 0;
			gbc_jButtonEliminarCompanySubsidiary.gridy = 1;
			jPanelABMCompanySubsidiary.add (getJButtonEliminarCompanySubsidiary (), gbc_jButtonEliminarCompanySubsidiary);
			GridBagConstraints gbc_jButtonModificarCompanySubsidiary = new GridBagConstraints ();
			gbc_jButtonModificarCompanySubsidiary.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarCompanySubsidiary.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarCompanySubsidiary.gridx = 0;
			gbc_jButtonModificarCompanySubsidiary.gridy = 2;
			jPanelABMCompanySubsidiary.add (getJButtonModificarCompanySubsidiary (), gbc_jButtonModificarCompanySubsidiary);
		}
		
		return jPanelABMCompanySubsidiary;
	}
	
	private JButton getJButtonAgregarCompanySubsidiary ()
	{
		if (jButtonAgregarCompanySubsidiary == null)
		{
			jButtonAgregarCompanySubsidiary = new JButton ();
			jButtonAgregarCompanySubsidiary.setText ("Agregar");
			jButtonAgregarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarCompanySubsidiary ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMCompanySubsidiary (null, getJButtonAgregarCompanySubsidiary ().getText ().toString (), null, null, null, null);
							getJButtonAplicarCompanySubsidiary ().doClick ();
							getJButtonAgregarCompanySubsidiary ().setEnabled (true);
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
		
		return jButtonAgregarCompanySubsidiary;
	}
	
	private JButton getJButtonEliminarCompanySubsidiary ()
	{
		if (jButtonEliminarCompanySubsidiary == null)
		{
			jButtonEliminarCompanySubsidiary = new JButton ();
			jButtonEliminarCompanySubsidiary.setText ("Eliminar");
			jButtonEliminarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar la sucursal " + getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 1).toString () + ", de la empresa " + getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 2).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("CompanySubsidiary", "IdCompanySubsidiary = " + getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 0).toString ()))
							{	
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonAplicarCompanySubsidiary ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarCompanySubsidiary;
	}
	
	private JButton getJButtonModificarCompanySubsidiary ()
	{
		if (jButtonModificarCompanySubsidiary == null)
		{
			jButtonModificarCompanySubsidiary = new JButton ();
			jButtonModificarCompanySubsidiary.setText ("Modificar");
			jButtonModificarCompanySubsidiary.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarCompanySubsidiary ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMCompanySubsidiary (null, getJButtonModificarCompanySubsidiary ().getText ().toString (), getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 0) == null ? "" : getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 0).toString (), getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 1) == null ? "" : getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 1).toString (), getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 2) == null ? "" : getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 2).toString (), getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 3) == null ? "" : getJTableCompanySubsidiary ().getValueAt (getJTableCompanySubsidiary ().getSelectedRow (), 3).toString ());
							getJButtonAplicarCompanySubsidiary ().doClick ();
							getJButtonModificarCompanySubsidiary ().setEnabled (true);
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
		
		return jButtonModificarCompanySubsidiary;
	}
	
	private JPanel getJPanelConfigurations ()
	{
		if (jPanelConfigurations == null)
		{
			jPanelConfigurations = new JPanel ();
			GridBagLayout gbl_jPanelConfigurations = new GridBagLayout ();
			gbl_jPanelConfigurations.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelConfigurations.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelConfigurations.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelConfigurations.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelConfigurations.setLayout (gbl_jPanelConfigurations);
			GridBagConstraints gbc_jScrollPaneConfigurations = new GridBagConstraints ();
			gbc_jScrollPaneConfigurations.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneConfigurations.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneConfigurations.gridx = 0;
			gbc_jScrollPaneConfigurations.gridy = 0;
			jPanelConfigurations.add (getJScrollPaneConfigurations (), gbc_jScrollPaneConfigurations);
			GridBagConstraints gbc_jScrollPaneABMConfigurations = new GridBagConstraints ();
			gbc_jScrollPaneABMConfigurations.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMConfigurations.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMConfigurations.gridx = 1;
			gbc_jScrollPaneABMConfigurations.gridy = 0;
			jPanelConfigurations.add (getJScrollPaneABMConfigurations (), gbc_jScrollPaneABMConfigurations);
			GridBagConstraints gbc_jScrollPaneFiltrosConfigurations = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosConfigurations.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosConfigurations.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosConfigurations.gridx = 0;
			gbc_jScrollPaneFiltrosConfigurations.gridy = 1;
			jPanelConfigurations.add (getJScrollPaneFiltrosConfigurations (), gbc_jScrollPaneFiltrosConfigurations);
			GridBagConstraints gbc_jButtonAplicarConfigurations = new GridBagConstraints ();
			gbc_jButtonAplicarConfigurations.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarConfigurations.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarConfigurations.gridx = 1;
			gbc_jButtonAplicarConfigurations.gridy = 1;
			jPanelConfigurations.add (getJButtonAplicarConfigurations (), gbc_jButtonAplicarConfigurations);
		}
		
		return jPanelConfigurations;
	}
	
	private JRadioButton getJRadioButtonSystemLookAndFeel ()
	{
		if (jRadioButtonSystemLookAndFeel == null)
		{
			jRadioButtonSystemLookAndFeel = new JRadioButton ("System Look And Feel:");
			jRadioButtonSystemLookAndFeel.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					try
					{
						UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName ().toString ());
					}

					catch (ClassNotFoundException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (InstantiationException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (IllegalAccessException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (UnsupportedLookAndFeelException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					getJComboBoxSystemLookAndFeel ().setEnabled (getJRadioButtonSystemLookAndFeel ().isSelected ());
					//getJComboBoxSystemLookAndFeel ().setSelectedItem (getJComboBoxSystemLookAndFeel () == null ? "" : getJComboBoxSystemLookAndFeel ().getSelectedItem ().toString ());
					getJComboBoxTattooLookAndFeel ().setEnabled (! getJRadioButtonSystemLookAndFeel ().isSelected ());
					//getJComboBoxTattooLookAndFeel ().setSelectedItem (getJComboBoxTattooLookAndFeel () == null ? "" : getJComboBoxTattooLookAndFeel ().getSelectedItem ().toString ());
					getJLabelTheme ().setEnabled (! getJRadioButtonSystemLookAndFeel ().isSelected ());
					getJComboBoxTheme ().setEnabled (! getJRadioButtonSystemLookAndFeel ().isSelected ());
					//getJComboBoxTheme ().setSelectedItem (getJComboBoxTheme () == null ? "" : getJComboBoxTheme ().getSelectedItem ().toString ());
				}
			}
			);
			
			getButtonGroupLookAndFeel ().add (jRadioButtonSystemLookAndFeel);
		}
		
		return jRadioButtonSystemLookAndFeel;
	}
	
	private JComboBox <String> getJComboBoxSystemLookAndFeel ()
	{
		if (jComboBoxSystemLookAndFeel == null)
		{
			jComboBoxSystemLookAndFeel = new JComboBox <String> ();
		}
		
		return jComboBoxSystemLookAndFeel;
	}
	
	private JRadioButton getJRadioButtonTattooLookAndFeel ()
	{
		if (jRadioButtonTattooLookAndFeel == null)
		{
			jRadioButtonTattooLookAndFeel = new JRadioButton ("Tattoo Look And Feel");
			jRadioButtonTattooLookAndFeel.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					try
					{
						UIManager.setLookAndFeel ("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
						//com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme ("Default");
					}

					catch (ClassNotFoundException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (InstantiationException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (IllegalAccessException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}

					catch (UnsupportedLookAndFeelException e1)
					{
						JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
					}
					
					getJComboBoxTattooLookAndFeel ().setEnabled (getJRadioButtonTattooLookAndFeel ().isSelected ());
					getJLabelTheme ().setEnabled (getJRadioButtonTattooLookAndFeel ().isSelected ());
					getJComboBoxTheme ().setEnabled (getJRadioButtonTattooLookAndFeel ().isSelected ());
					getJComboBoxSystemLookAndFeel ().setEnabled (! getJRadioButtonTattooLookAndFeel ().isSelected ());
				}
			}
			);
			
			getButtonGroupLookAndFeel ().add (jRadioButtonTattooLookAndFeel);
		}
		
		return jRadioButtonTattooLookAndFeel;
	}
	
	private JComboBox <String> getJComboBoxTattooLookAndFeel ()
	{
		if (jComboBoxTattooLookAndFeel == null)
		{
			jComboBoxTattooLookAndFeel = new JComboBox <String> ();
		}
		
		return jComboBoxTattooLookAndFeel;
	}
	
	private JLabel getJLabelTheme ()
	{
		if (jLabelTheme == null)
		{
			jLabelTheme = new JLabel ("Theme:");
		}
		
		return jLabelTheme;
	}
	
	private JComboBox <String> getJComboBoxTheme ()
	{
		if (jComboBoxTheme == null)
		{
			jComboBoxTheme = new JComboBox <String> ();
		}
		
		return jComboBoxTheme;
	}
	
	private ButtonGroup getButtonGroupLookAndFeel ()
	{
		if (buttonGroupLookAndFeel == null)
		{
			buttonGroupLookAndFeel = new ButtonGroup ();
		}
		
		return buttonGroupLookAndFeel;
	}
	
	private JScrollPane getJScrollPaneConfigurations ()
	{
		if (jScrollPaneConfigurations == null)
		{
			jScrollPaneConfigurations = new JScrollPane ();
			jScrollPaneConfigurations.setViewportView (getJTableConfigurations ());
			jScrollPaneConfigurations.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuConfigurations ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuConfigurations ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneConfigurations;
	}
	
	private JTable getJTableConfigurations ()
	{
		if (jTableConfigurations == null)
		{
			jTableConfigurations = new JTable ();
			jTableConfigurations.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuConfigurations ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuConfigurations ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableConfigurations;
	}

	private JPopupMenu getJPopupMenuConfigurations ()
	{
		if (jPopupMenuConfigurations == null)
		{
			jPopupMenuConfigurations = new JPopupMenu ();
			jPopupMenuConfigurations.add (getJMenuItemAgregarConfigurations ());
			jPopupMenuConfigurations.add (getJMenuItemEliminarConfigurations ());
			jPopupMenuConfigurations.add (getJMenuItemModificarConfigurations ());
		}
		
		return jPopupMenuConfigurations;
	}
	
	private JMenuItem getJMenuItemAgregarConfigurations ()
	{
		if (jMenuItemAgregarConfigurations == null)
		{
			jMenuItemAgregarConfigurations = new JMenuItem ();
			jMenuItemAgregarConfigurations.setText ("Agregar");
			jMenuItemAgregarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarConfigurations ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarConfigurations;
	}
	
	private JMenuItem getJMenuItemEliminarConfigurations ()
	{
		if (jMenuItemEliminarConfigurations == null)
		{
			jMenuItemEliminarConfigurations = new JMenuItem ();
			jMenuItemEliminarConfigurations.setText ("Eliminar");
			jMenuItemEliminarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarConfigurations ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarConfigurations;
	}
	
	private JMenuItem getJMenuItemModificarConfigurations ()
	{
		if (jMenuItemModificarConfigurations == null)
		{
			jMenuItemModificarConfigurations = new JMenuItem ();
			jMenuItemModificarConfigurations.setText ("Modificar");
			jMenuItemModificarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarConfigurations ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarConfigurations;
	}
	
	private JPanel getJPanelFiltrosConfigurations ()
	{
		if (jPanelFiltrosConfigurations == null)
		{
			jPanelFiltrosConfigurations = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosConfigurations = new GridBagLayout ();
			gbl_jPanelFiltrosConfigurations.columnWidths = new int [] {59, 28, 77, 28, 50, 28, 0};
			gbl_jPanelFiltrosConfigurations.rowHeights = new int [] {20, 0, 0, 0};
			gbl_jPanelFiltrosConfigurations.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosConfigurations.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelFiltrosConfigurations.setLayout (gbl_jPanelFiltrosConfigurations);
			jLabelTradeNameConfigurations = new JLabel ();
			jLabelTradeNameConfigurations.setText ("TradeName:");
			GridBagConstraints gbc_jLabelTradeNameConfigurations = new GridBagConstraints ();
			gbc_jLabelTradeNameConfigurations.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameConfigurations.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeNameConfigurations.gridx = 0;
			gbc_jLabelTradeNameConfigurations.gridy = 0;
			jPanelFiltrosConfigurations.add (jLabelTradeNameConfigurations, gbc_jLabelTradeNameConfigurations);
			GridBagConstraints gbc_jTextFieldTradeNameConfigurations = new GridBagConstraints();
			gbc_jTextFieldTradeNameConfigurations.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldTradeNameConfigurations.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameConfigurations.gridx = 1;
			gbc_jTextFieldTradeNameConfigurations.gridy = 0;
			jPanelFiltrosConfigurations.add(getJTextFieldTradeNameConfigurations(), gbc_jTextFieldTradeNameConfigurations);
			GridBagConstraints gbc_jLabelEnableProtesto = new GridBagConstraints ();
			gbc_jLabelEnableProtesto.anchor = GridBagConstraints.EAST;
			gbc_jLabelEnableProtesto.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEnableProtesto.gridx = 2;
			gbc_jLabelEnableProtesto.gridy = 0;
			jPanelFiltrosConfigurations.add (getJLabelEnableProtesto (), gbc_jLabelEnableProtesto);
			GridBagConstraints gbc_jComboBoxEnableProtesto = new GridBagConstraints ();
			gbc_jComboBoxEnableProtesto.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxEnableProtesto.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxEnableProtesto.gridx = 3;
			gbc_jComboBoxEnableProtesto.gridy = 0;
			jPanelFiltrosConfigurations.add (getJComboBoxEnableProtesto (), gbc_jComboBoxEnableProtesto);
			GridBagConstraints gbc_jLabelTienePCR = new GridBagConstraints ();
			gbc_jLabelTienePCR.anchor = GridBagConstraints.EAST;
			gbc_jLabelTienePCR.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTienePCR.gridx = 4;
			gbc_jLabelTienePCR.gridy = 0;
			jPanelFiltrosConfigurations.add (getJLabelTienePCR (), gbc_jLabelTienePCR);
			GridBagConstraints gbc_jComboBoxTienePCR = new GridBagConstraints ();
			gbc_jComboBoxTienePCR.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxTienePCR.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxTienePCR.gridx = 5;
			gbc_jComboBoxTienePCR.gridy = 0;
			jPanelFiltrosConfigurations.add (getJComboBoxTienePCR (), gbc_jComboBoxTienePCR);
			GridBagConstraints gbc_jLabelesPCRCloud = new GridBagConstraints();
			gbc_jLabelesPCRCloud.anchor = GridBagConstraints.EAST;
			gbc_jLabelesPCRCloud.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelesPCRCloud.gridx = 0;
			gbc_jLabelesPCRCloud.gridy = 1;
			jPanelFiltrosConfigurations.add(getJLabelesPCRCloud(), gbc_jLabelesPCRCloud);
			GridBagConstraints gbc_jComboBoxesPCRCloud = new GridBagConstraints();
			gbc_jComboBoxesPCRCloud.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxesPCRCloud.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxesPCRCloud.gridx = 1;
			gbc_jComboBoxesPCRCloud.gridy = 1;
			jPanelFiltrosConfigurations.add(getJComboBoxesPCRCloud(), gbc_jComboBoxesPCRCloud);
			GridBagConstraints gbc_jLabelenviarEmail = new GridBagConstraints ();
			gbc_jLabelenviarEmail.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelenviarEmail.gridx = 2;
			gbc_jLabelenviarEmail.gridy = 1;
			jPanelFiltrosConfigurations.add (getJLabelenviarEmail (), gbc_jLabelenviarEmail);
			GridBagConstraints gbc_jComboBoxenviarEmail = new GridBagConstraints ();
			gbc_jComboBoxenviarEmail.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxenviarEmail.gridx = 3;
			gbc_jComboBoxenviarEmail.gridy = 1;
			jPanelFiltrosConfigurations.add (getJComboBoxenviarEmail (), gbc_jComboBoxenviarEmail);
			GridBagConstraints gbc_jLabelreenviarEmail = new GridBagConstraints ();
			gbc_jLabelreenviarEmail.anchor = GridBagConstraints.EAST;
			gbc_jLabelreenviarEmail.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelreenviarEmail.gridx = 4;
			gbc_jLabelreenviarEmail.gridy = 1;
			jPanelFiltrosConfigurations.add (getJLabelreenviarEmail (), gbc_jLabelreenviarEmail);
			GridBagConstraints gbc_jComboBoxreenviarEmail = new GridBagConstraints ();
			gbc_jComboBoxreenviarEmail.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxreenviarEmail.insets = new Insets(0, 0, 5, 0);
			gbc_jComboBoxreenviarEmail.gridx = 5;
			gbc_jComboBoxreenviarEmail.gridy = 1;
			jPanelFiltrosConfigurations.add (getJComboBoxreenviarEmail (), gbc_jComboBoxreenviarEmail);
			GridBagConstraints gbc_jLabelenviarGeneracionClaves = new GridBagConstraints ();
			gbc_jLabelenviarGeneracionClaves.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarGeneracionClaves.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelenviarGeneracionClaves.gridx = 0;
			gbc_jLabelenviarGeneracionClaves.gridy = 2;
			jPanelFiltrosConfigurations.add (getJLabelenviarGeneracionClaves (), gbc_jLabelenviarGeneracionClaves);
			GridBagConstraints gbc_jComboBoxenviarGeneracionClaves = new GridBagConstraints ();
			gbc_jComboBoxenviarGeneracionClaves.insets = new Insets(0, 0, 0, 5);
			gbc_jComboBoxenviarGeneracionClaves.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarGeneracionClaves.gridx = 1;
			gbc_jComboBoxenviarGeneracionClaves.gridy = 2;
			jPanelFiltrosConfigurations.add (getJComboBoxenviarGeneracionClaves (), gbc_jComboBoxenviarGeneracionClaves);
			GridBagConstraints gbc_jLabelbloquearFechaPrevia = new GridBagConstraints ();
			gbc_jLabelbloquearFechaPrevia.anchor = GridBagConstraints.EAST;
			gbc_jLabelbloquearFechaPrevia.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelbloquearFechaPrevia.gridx = 2;
			gbc_jLabelbloquearFechaPrevia.gridy = 2;
			jPanelFiltrosConfigurations.add (getJLabelbloquearFechaPrevia (), gbc_jLabelbloquearFechaPrevia);
			GridBagConstraints gbc_jComboBoxbloquearFechaPrevia = new GridBagConstraints ();
			gbc_jComboBoxbloquearFechaPrevia.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxbloquearFechaPrevia.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxbloquearFechaPrevia.gridx = 3;
			gbc_jComboBoxbloquearFechaPrevia.gridy = 2;
			jPanelFiltrosConfigurations.add (getJComboBoxbloquearFechaPrevia (), gbc_jComboBoxbloquearFechaPrevia);
			GridBagConstraints gbc_jLabelenviarFirmadoEmpleador = new GridBagConstraints ();
			gbc_jLabelenviarFirmadoEmpleador.anchor = GridBagConstraints.EAST;
			gbc_jLabelenviarFirmadoEmpleador.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelenviarFirmadoEmpleador.gridx = 4;
			gbc_jLabelenviarFirmadoEmpleador.gridy = 2;
			jPanelFiltrosConfigurations.add (getJLabelenviarFirmadoEmpleador (), gbc_jLabelenviarFirmadoEmpleador);
			GridBagConstraints gbc_jComboBoxenviarFirmadoEmpleador = new GridBagConstraints ();
			gbc_jComboBoxenviarFirmadoEmpleador.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxenviarFirmadoEmpleador.gridx = 5;
			gbc_jComboBoxenviarFirmadoEmpleador.gridy = 2;
			jPanelFiltrosConfigurations.add (getJComboBoxenviarFirmadoEmpleador (), gbc_jComboBoxenviarFirmadoEmpleador);
		}
		
		return jPanelFiltrosConfigurations;
	}
	
	private JTextField getJTextFieldTradeNameConfigurations ()
	{
		if (jTextFieldTradeNameConfigurations == null)
		{
			jTextFieldTradeNameConfigurations = new JTextField ();
			jTextFieldTradeNameConfigurations.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameConfigurations ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameConfigurations ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameConfigurations (), "CONFIGURATIONS, Company", "TradeName", "CONFIGURATIONS.IdCompany = Company.IdCompany");
									Utilidades.cargarComboBoxBoolean (getJComboBoxEnableProtesto (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxTienePCR (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxesPCRCloud (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxenviarEmail (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxreenviarEmail (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxenviarGeneracionClaves (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxbloquearFechaPrevia (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxenviarFirmadoEmpleador (), false);
									getJButtonAplicarConfigurations ().doClick ();
									getJTextFieldTradeNameConfigurations ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameConfigurations ().itemExists (getJTextFieldTradeNameConfigurations ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameConfigurations ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJComboBoxEnableProtesto ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "EnableProtesto", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ().equals ("1") ? "Verdadero" : "Falso");
									getJComboBoxTienePCR ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "TienePCR", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ().equals ("1") ? "Verdadero" : "Falso");
									getJComboBoxesPCRCloud ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "esPCRCloud", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJComboBoxenviarEmail ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarEmail", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJComboBoxreenviarEmail ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "reenviarEmail", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJComboBoxenviarGeneracionClaves ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarGeneracionClaves", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJComboBoxbloquearFechaPrevia ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "bloquearFechaPrevia", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJComboBoxenviarFirmadoEmpleador ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarFirmadoEmpleador", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
									getJButtonAplicarConfigurations ().doClick ();
									getJTextFieldTradeNameConfigurations ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameConfigurations;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameConfigurations ()
	{
		if (textAutoCompleterTradeNameConfigurations == null)
		{
			textAutoCompleterTradeNameConfigurations = new TextAutoCompleter (getJTextFieldTradeNameConfigurations (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJComboBoxEnableProtesto ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "EnableProtesto", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ().equals ("1") ? "Verdadero" : "Falso");
							getJComboBoxTienePCR ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "TienePCR", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ().equals ("1") ? "Verdadero" : "Falso");
							getJComboBoxesPCRCloud ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "esPCRCloud", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJComboBoxenviarEmail ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarEmail", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJComboBoxreenviarEmail ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "reenviarEmail", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJComboBoxenviarGeneracionClaves ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarGeneracionClaves", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJComboBoxbloquearFechaPrevia ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "bloquearFechaPrevia", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJComboBoxenviarFirmadoEmpleador ().setSelectedItem (Utilidades.devolverAtributoClave ("CONFIGURATIONS, Company, CompanySection, CompanySubsidiary", "enviarFirmadoEmpleador", "CONFIGURATIONS.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'").toString ());
							getJButtonAplicarConfigurations ().doClick ();
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
		
		return textAutoCompleterTradeNameConfigurations;
	}
	
	private JButton getJButtonAplicarConfigurations ()
	{
		if (jButtonAplicarConfigurations == null)
		{
			jButtonAplicarConfigurations = new JButton ();
			jButtonAplicarConfigurations.setText ("Aplicar");
			jButtonAplicarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarConfigurations ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarConfigurations ().setToolTipText ("CONFIGURATIONS.IdCompany = Company.IdCompany");

							if (! getJTextFieldTradeNameConfigurations ().getText ().toString ().isEmpty ())

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND CONFIGURATIONS.IdCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJTextFieldTradeNameConfigurations ().getText ().toString () + "'"));

							if (getJComboBoxEnableProtesto ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (EnableProtesto " + (getJComboBoxEnableProtesto ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR EnableProtesto = 0)"));

							if (getJComboBoxTienePCR ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (TienePCR " + (getJComboBoxTienePCR ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR TienePCR = 0)"));
							
							if (getJComboBoxesPCRCloud ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (esPCRCloud " + (getJComboBoxesPCRCloud ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR esPCRCloud = 0)"));

							if (getJComboBoxenviarEmail ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (enviarEmail " + (getJComboBoxenviarEmail ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR enviarEmail = 0)"));

							if (getJComboBoxreenviarEmail ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (reenviarEmail " + (getJComboBoxreenviarEmail ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR reenviarEmail = 0)"));

							if (getJComboBoxenviarGeneracionClaves ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (enviarGeneracionClaves " + (getJComboBoxenviarGeneracionClaves ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR enviarGeneracionClaves = 0)"));

							if (getJComboBoxbloquearFechaPrevia ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (bloquearFechaPrevia " + (getJComboBoxbloquearFechaPrevia ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR bloquearFechaPrevia = 0)"));

							if (getJComboBoxenviarFirmadoEmpleador ().getSelectedIndex () > 0)

								getJButtonAplicarConfigurations ().setToolTipText (getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " AND (enviarFirmadoEmpleador " + (getJComboBoxenviarFirmadoEmpleador ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR enviarFirmadoEmpleador = 0)"));

							Utilidades.cargarTable (getJTableConfigurations (), "CONFIGURATIONS, Company", "IdConfiguration, TradeName, cantidad_intentos, passwordLengthMin, passwordLengthMax, characterUpperCase, characterLowerCase, characterSpecial, characterNumeric, daysExpiration, differentsPasswords, CASE WHEN EnableProtesto = 1 THEN 'Verdadero' ELSE 'Falso' END AS EnableProtesto, EmailOR, CASE WHEN TienePCR = 1 THEN 'Verdadero' ELSE 'Falso' END AS TienePCR, CASE WHEN esPCRCloud = 1 THEN 'Verdadero' ELSE 'Falso' END AS esPCRCloud, URLPCR, CASE WHEN enviarEmail = 1 THEN 'Verdadero' ELSE 'Falso' END AS enviarEmail, CASE WHEN reenviarEmail = 1 THEN 'Verdadero' ELSE 'Falso' END AS reenviarEmail, CASE WHEN enviarGeneracionClaves = 1 THEN 'Verdadero' ELSE 'Falso' END AS enviarGeneracionClaves, CASE WHEN bloquearFechaPrevia = 1 THEN 'Verdadero' ELSE 'Falso' END AS bloquearFechaPrevia, CASE WHEN enviarFirmadoEmpleador = 1 THEN 'Verdadero' ELSE 'Falso' END AS enviarFirmadoEmpleador", getJButtonAplicarConfigurations ().getToolTipText () == null ? "" : getJButtonAplicarConfigurations ().getToolTipText ().toString (), "IdConfiguration"); //, getJButtonAplicarConfigurations ().getToolTipText () == null ? " GROUP BY IdConfiguration, TradeName, cantidad_intentos, passwordLengthMin, passwordLengthMax, characterUpperCase, characterLowerCase, characterSpecial, characterNumeric, daysExpiration, differentsPasswords, EnableProtesto, EmailOR, TienePCR, esPCRCloud, URLPCR, enviarEmail, reenviarEmail, enviarGeneracionClaves, bloquearFechaPrevia, enviarFirmadoEmpleador" : getJButtonAplicarConfigurations ().getToolTipText ().toString () + " GROUP BY IdConfiguration, TradeName, cantidad_intentos, passwordLengthMin, passwordLengthMax, characterUpperCase, characterLowerCase, characterSpecial, characterNumeric, daysExpiration, differentsPasswords, EnableProtesto, EmailOR, TienePCR, esPCRCloud, URLPCR, enviarEmail, reenviarEmail, enviarGeneracionClaves, bloquearFechaPrevia, enviarFirmadoEmpleador", "IdConfiguration");
							getJTableConfigurations ().requestFocus ();
							getJButtonAplicarConfigurations ().setToolTipText (null);
							getJPanelConfigurations ().setBorder (BorderFactory.createTitledBorder (null, "Configurations - Cantidad de registros: " + getJTableConfigurations ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarConfigurations ().setEnabled (getJTableConfigurations ().getRowCount () > 0);
							getJMenuItemEliminarConfigurations ().setEnabled (getJTableConfigurations ().getRowCount () > 0);
							getJButtonModificarConfigurations ().setEnabled (getJTableConfigurations ().getRowCount () > 0);
							getJMenuItemModificarConfigurations ().setEnabled (getJTableConfigurations ().getRowCount () > 0);
							getJButtonAplicarConfigurations ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())
						
						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarConfigurations;
	}
	
	private JPanel getJPanelABMConfigurations ()
	{
		if (jPanelABMConfigurations == null)
		{
			jPanelABMConfigurations = new JPanel ();
			GridBagLayout gbl_jPanelABMConfigurations = new GridBagLayout ();
			gbl_jPanelABMConfigurations.columnWidths = new int [] {75, 0};
			gbl_jPanelABMConfigurations.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMConfigurations.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMConfigurations.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMConfigurations.setLayout (gbl_jPanelABMConfigurations);
			GridBagConstraints gbc_jButtonAgregarConfigurations = new GridBagConstraints ();
			gbc_jButtonAgregarConfigurations.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarConfigurations.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarConfigurations.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarConfigurations.gridx = 0;
			gbc_jButtonAgregarConfigurations.gridy = 0;
			jPanelABMConfigurations.add (getJButtonAgregarConfigurations (), gbc_jButtonAgregarConfigurations);
			GridBagConstraints gbc_jButtonEliminarConfigurations = new GridBagConstraints ();
			gbc_jButtonEliminarConfigurations.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarConfigurations.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarConfigurations.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarConfigurations.gridx = 0;
			gbc_jButtonEliminarConfigurations.gridy = 1;
			jPanelABMConfigurations.add (getJButtonEliminarConfigurations (), gbc_jButtonEliminarConfigurations);
			GridBagConstraints gbc_jButtonModificarConfigurations = new GridBagConstraints ();
			gbc_jButtonModificarConfigurations.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarConfigurations.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarConfigurations.gridx = 0;
			gbc_jButtonModificarConfigurations.gridy = 2;
			jPanelABMConfigurations.add (getJButtonModificarConfigurations (), gbc_jButtonModificarConfigurations);
		}
		
		return jPanelABMConfigurations;
	}
	
	private JButton getJButtonAgregarConfigurations ()
	{
		if (jButtonAgregarConfigurations == null)
		{
			jButtonAgregarConfigurations = new JButton ();
			jButtonAgregarConfigurations.setText ("Agregar");
			jButtonAgregarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarConfigurations ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMConfigurations (null, getJButtonAgregarConfigurations ().getText ().toString (), null, null, "5", "0", "8", "3", "2", "1", "2", "1", "10", "Verdadero", null, "Falso", "Falso", null, "Verdadero", "Verdadero", "Verdadero", "Verdadero", "Verdadero");
							getJButtonAplicarConfigurations ().doClick ();
							getJButtonAgregarConfigurations ().setEnabled (true);
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
		
		return jButtonAgregarConfigurations;
	}
	
	private JButton getJButtonEliminarConfigurations ()
	{
		if (jButtonEliminarConfigurations == null)
		{
			jButtonEliminarConfigurations = new JButton ();
			jButtonEliminarConfigurations.setText ("Eliminar");
			jButtonEliminarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar la configuraci\u00f3n para la empresa " + getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 1).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("Configurations", "IdConfiguration = " + getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 0).toString ()))
							{
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonAplicarConfigurations ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarConfigurations;
	}
	
	private JButton getJButtonModificarConfigurations ()
	{
		if (jButtonModificarConfigurations == null)
		{
			jButtonModificarConfigurations = new JButton ();
			jButtonModificarConfigurations.setText ("Modificar");
			jButtonModificarConfigurations.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarConfigurations ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMConfigurations (null, getJButtonModificarConfigurations ().getText ().toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 0).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 1).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 2).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 3).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 4).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 5).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 6).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 7).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 8).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 9).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 10).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 11).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 12).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 13).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 14).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 15).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 16).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 17).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 18).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 19).toString (), getJTableConfigurations ().getValueAt (getJTableConfigurations ().getSelectedRow (), 20).toString ());
							getJButtonAplicarConfigurations ().doClick ();
							getJButtonModificarConfigurations ().setEnabled (true);
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
		
		return jButtonModificarConfigurations;
	}
	
	private JPanel getJPanelEmployee ()
	{
		if (jPanelEmployee == null)
		{
			jPanelEmployee = new JPanel ();
			GridBagLayout gbl_jPanelEmployee = new GridBagLayout ();
			gbl_jPanelEmployee.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelEmployee.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelEmployee.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelEmployee.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelEmployee.setLayout (gbl_jPanelEmployee);
			GridBagConstraints gbc_jScrollPaneEmployee = new GridBagConstraints ();
			gbc_jScrollPaneEmployee.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneEmployee.gridx = 0;
			gbc_jScrollPaneEmployee.gridy = 0;
			jPanelEmployee.add (getJScrollPaneEmployee (), gbc_jScrollPaneEmployee);
			GridBagConstraints gbc_jScrollPaneABMEmployee = new GridBagConstraints ();
			gbc_jScrollPaneABMEmployee.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMEmployee.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMEmployee.gridx = 1;
			gbc_jScrollPaneABMEmployee.gridy = 0;
			jPanelEmployee.add (getJScrollPaneABMEmployee (), gbc_jScrollPaneABMEmployee);
			GridBagConstraints gbc_jScrollPaneFiltrosEmployee = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosEmployee.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosEmployee.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosEmployee.gridx = 0;
			gbc_jScrollPaneFiltrosEmployee.gridy = 1;
			jPanelEmployee.add (getJScrollPaneFiltrosEmployee (), gbc_jScrollPaneFiltrosEmployee);
			GridBagConstraints gbc_jButtonAplicarEmployee = new GridBagConstraints ();
			gbc_jButtonAplicarEmployee.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarEmployee.gridx = 1;
			gbc_jButtonAplicarEmployee.gridy = 1;
			jPanelEmployee.add (getJButtonAplicarEmployee (), gbc_jButtonAplicarEmployee);
		}
		
		return jPanelEmployee;
	}
	
	private JScrollPane getJScrollPaneEmployee ()
	{
		if (jScrollPaneEmployee == null)
		{
			jScrollPaneEmployee = new JScrollPane ();
			jScrollPaneEmployee.setViewportView (getJTableEmployee ());
			jScrollPaneEmployee.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuEmployee ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuEmployee ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneEmployee;
	}
	
	private JTable getJTableEmployee ()
	{
		if (jTableEmployee == null)
		{
			jTableEmployee = new JTable ();
			jTableEmployee.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuEmployee ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuEmployee ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableEmployee;
	}

	private JPopupMenu getJPopupMenuEmployee ()
	{
		if (jPopupMenuEmployee == null)
		{
			jPopupMenuEmployee = new JPopupMenu ();
			jPopupMenuEmployee.add (getJMenuItemAgregarEmployee ());
			jPopupMenuEmployee.add (getJMenuItemEliminarEmployee ());
			jPopupMenuEmployee.add (getJMenuItemModificarEmployee ());
		}
		
		return jPopupMenuEmployee;
	}
	
	private JMenuItem getJMenuItemAgregarEmployee ()
	{
		if (jMenuItemAgregarEmployee == null)
		{
			jMenuItemAgregarEmployee = new JMenuItem ();
			jMenuItemAgregarEmployee.setText ("Agregar");
			jMenuItemAgregarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarEmployee ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarEmployee;
	}
	
	private JMenuItem getJMenuItemEliminarEmployee ()
	{
		if (jMenuItemEliminarEmployee == null)
		{
			jMenuItemEliminarEmployee = new JMenuItem ();
			jMenuItemEliminarEmployee.setText ("Eliminar");
			jMenuItemEliminarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarEmployee ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarEmployee;
	}
	
	private JMenuItem getJMenuItemModificarEmployee ()
	{
		if (jMenuItemModificarEmployee == null)
		{
			jMenuItemModificarEmployee = new JMenuItem ();
			jMenuItemModificarEmployee.setText ("Modificar");
			jMenuItemModificarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarEmployee ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarEmployee;
	}
	
	private JPanel getJPanelFiltrosEmployee ()
	{
		if (jPanelFiltrosEmployee == null)
		{
			jPanelFiltrosEmployee = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosEmployee = new GridBagLayout ();
			gbl_jPanelFiltrosEmployee.columnWidths = new int [] {196, 92, 200, 92, 145, 92, 0};
			gbl_jPanelFiltrosEmployee.rowHeights = new int [] {20, 20, 20, 23, 23, 23, 20, 20, 0};
			gbl_jPanelFiltrosEmployee.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosEmployee.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelFiltrosEmployee.setLayout (gbl_jPanelFiltrosEmployee);
			jLabelIdUserEmployee = new JLabel ();
			jLabelIdUserEmployee.setText ("IdUser:");
			GridBagConstraints gbc_jLabelIdUserEmployee = new GridBagConstraints ();
			gbc_jLabelIdUserEmployee.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdUserEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdUserEmployee.gridx = 0;
			gbc_jLabelIdUserEmployee.gridy = 0;
			jPanelFiltrosEmployee.add (jLabelIdUserEmployee, gbc_jLabelIdUserEmployee);
			GridBagConstraints gbc_jTextFieldIdUserEmployee = new GridBagConstraints();
			gbc_jTextFieldIdUserEmployee.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldIdUserEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdUserEmployee.gridx = 1;
			gbc_jTextFieldIdUserEmployee.gridy = 0;
			jPanelFiltrosEmployee.add(getJTextFieldIdUserEmployee(), gbc_jTextFieldIdUserEmployee);
			jLabelAccountNumberEmployee = new JLabel ();
			jLabelAccountNumberEmployee.setText ("AccountNumber:");
			GridBagConstraints gbc_jLabelAccountNumberEmployee = new GridBagConstraints ();
			gbc_jLabelAccountNumberEmployee.anchor = GridBagConstraints.EAST;
			gbc_jLabelAccountNumberEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAccountNumberEmployee.gridx = 2;
			gbc_jLabelAccountNumberEmployee.gridy = 0;
			jPanelFiltrosEmployee.add (jLabelAccountNumberEmployee, gbc_jLabelAccountNumberEmployee);
			GridBagConstraints gbc_jTextFieldAccountNumberEmployee = new GridBagConstraints();
			gbc_jTextFieldAccountNumberEmployee.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldAccountNumberEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAccountNumberEmployee.gridx = 3;
			gbc_jTextFieldAccountNumberEmployee.gridy = 0;
			jPanelFiltrosEmployee.add(getJTextFieldAccountNumberEmployee(), gbc_jTextFieldAccountNumberEmployee);
			GridBagConstraints gbc_jLabelCompanySectionDescription = new GridBagConstraints ();
			gbc_jLabelCompanySectionDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySectionDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySectionDescription.gridx = 4;
			gbc_jLabelCompanySectionDescription.gridy = 0;
			jPanelFiltrosEmployee.add (getJLabelCompanySectionDescription (), gbc_jLabelCompanySectionDescription);
			GridBagConstraints gbc_jComboBoxCompanySectionDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanySectionDescription.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxCompanySectionDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxCompanySectionDescription.gridx = 5;
			gbc_jComboBoxCompanySectionDescription.gridy = 0;
			jPanelFiltrosEmployee.add (getJComboBoxCompanySectionDescription (), gbc_jComboBoxCompanySectionDescription);
			GridBagConstraints gbc_jLabelCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jLabelCompanySubsidiaryDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCompanySubsidiaryDescription.gridx = 0;
			gbc_jLabelCompanySubsidiaryDescription.gridy = 1;
			jPanelFiltrosEmployee.add (getJLabelCompanySubsidiaryDescription (), gbc_jLabelCompanySubsidiaryDescription);
			GridBagConstraints gbc_jComboBoxCompanySubsidiaryDescription = new GridBagConstraints ();
			gbc_jComboBoxCompanySubsidiaryDescription.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxCompanySubsidiaryDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCompanySubsidiaryDescription.gridx = 1;
			gbc_jComboBoxCompanySubsidiaryDescription.gridy = 1;
			jPanelFiltrosEmployee.add (getJComboBoxCompanySubsidiaryDescription (), gbc_jComboBoxCompanySubsidiaryDescription);
			GridBagConstraints gbc_jLabelTradeNameEmployee = new GridBagConstraints ();
			gbc_jLabelTradeNameEmployee.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelTradeNameEmployee.gridx = 2;
			gbc_jLabelTradeNameEmployee.gridy = 1;
			jPanelFiltrosEmployee.add (getJLabelTradeNameEmployee (), gbc_jLabelTradeNameEmployee);
			GridBagConstraints gbc_jTextFieldTradeNameEmployee = new GridBagConstraints();
			gbc_jTextFieldTradeNameEmployee.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldTradeNameEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameEmployee.gridx = 3;
			gbc_jTextFieldTradeNameEmployee.gridy = 1;
			jPanelFiltrosEmployee.add(getJTextFieldTradeNameEmployee(), gbc_jTextFieldTradeNameEmployee);
			GridBagConstraints gbc_jLabelCuil = new GridBagConstraints ();
			gbc_jLabelCuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelCuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCuil.gridx = 4;
			gbc_jLabelCuil.gridy = 1;
			jPanelFiltrosEmployee.add (getJLabelCuil (), gbc_jLabelCuil);
			GridBagConstraints gbc_jTextFieldCuil = new GridBagConstraints();
			gbc_jTextFieldCuil.insets = new Insets(0, 0, 5, 0);
			gbc_jTextFieldCuil.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCuil.gridx = 5;
			gbc_jTextFieldCuil.gridy = 1;
			jPanelFiltrosEmployee.add(getJTextFieldCuil(), gbc_jTextFieldCuil);
			GridBagConstraints gbc_jLabelCitizenship = new GridBagConstraints ();
			gbc_jLabelCitizenship.anchor = GridBagConstraints.EAST;
			gbc_jLabelCitizenship.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCitizenship.gridx = 0;
			gbc_jLabelCitizenship.gridy = 2;
			jPanelFiltrosEmployee.add (getJLabelCitizenship (), gbc_jLabelCitizenship);
			GridBagConstraints gbc_jComboBoxCitizenship = new GridBagConstraints ();
			gbc_jComboBoxCitizenship.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxCitizenship.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCitizenship.gridx = 1;
			gbc_jComboBoxCitizenship.gridy = 2;
			jPanelFiltrosEmployee.add (getJComboBoxCitizenship (), gbc_jComboBoxCitizenship);
			GridBagConstraints gbc_jLabelCountryStateDescriptionEmployee = new GridBagConstraints ();
			gbc_jLabelCountryStateDescriptionEmployee.anchor = GridBagConstraints.EAST;
			gbc_jLabelCountryStateDescriptionEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCountryStateDescriptionEmployee.gridx = 2;
			gbc_jLabelCountryStateDescriptionEmployee.gridy = 2;
			jPanelFiltrosEmployee.add (getJLabelCountryStateDescriptionEmployee (), gbc_jLabelCountryStateDescriptionEmployee);
			GridBagConstraints gbc_jComboBoxCountryStateDescriptionEmployee = new GridBagConstraints ();
			gbc_jComboBoxCountryStateDescriptionEmployee.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxCountryStateDescriptionEmployee.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxCountryStateDescriptionEmployee.gridx = 3;
			gbc_jComboBoxCountryStateDescriptionEmployee.gridy = 2;
			jPanelFiltrosEmployee.add (getJComboBoxCountryStateDescriptionEmployee (), gbc_jComboBoxCountryStateDescriptionEmployee);
			GridBagConstraints gbc_jLabelEmployeeMarriageStatusTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeMarriageStatusTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeMarriageStatusTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeMarriageStatusTypeDescription.gridx = 4;
			gbc_jLabelEmployeeMarriageStatusTypeDescription.gridy = 2;
			jPanelFiltrosEmployee.add (getJLabelEmployeeMarriageStatusTypeDescription (), gbc_jLabelEmployeeMarriageStatusTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeMarriageStatusTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.gridx = 5;
			gbc_jComboBoxEmployeeMarriageStatusTypeDescription.gridy = 2;
			jPanelFiltrosEmployee.add (getJComboBoxEmployeeMarriageStatusTypeDescription (), gbc_jComboBoxEmployeeMarriageStatusTypeDescription);
			GridBagConstraints gbc_jLabelAddress = new GridBagConstraints ();
			gbc_jLabelAddress.anchor = GridBagConstraints.EAST;
			gbc_jLabelAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelAddress.gridx = 0;
			gbc_jLabelAddress.gridy = 3;
			jPanelFiltrosEmployee.add (getJLabelAddress (), gbc_jLabelAddress);
			GridBagConstraints gbc_jComboBoxAddress = new GridBagConstraints ();
			gbc_jComboBoxAddress.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxAddress.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxAddress.gridx = 1;
			gbc_jComboBoxAddress.gridy = 3;
			jPanelFiltrosEmployee.add (getJComboBoxAddress (), gbc_jComboBoxAddress);
			GridBagConstraints gbc_jLabelLocation = new GridBagConstraints ();
			gbc_jLabelLocation.anchor = GridBagConstraints.EAST;
			gbc_jLabelLocation.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelLocation.gridx = 2;
			gbc_jLabelLocation.gridy = 3;
			jPanelFiltrosEmployee.add (getJLabelLocation (), gbc_jLabelLocation);
			GridBagConstraints gbc_jComboBoxLocation = new GridBagConstraints ();
			gbc_jComboBoxLocation.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxLocation.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxLocation.gridx = 3;
			gbc_jComboBoxLocation.gridy = 3;
			jPanelFiltrosEmployee.add (getJComboBoxLocation (), gbc_jComboBoxLocation);
			GridBagConstraints gbc_jCheckBoxBirthdate = new GridBagConstraints ();
			gbc_jCheckBoxBirthdate.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxBirthdate.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxBirthdate.gridx = 4;
			gbc_jCheckBoxBirthdate.gridy = 3;
			jPanelFiltrosEmployee.add (getJCheckBoxBirthdate (), gbc_jCheckBoxBirthdate);
			GridBagConstraints gbc_jDatePickerBirthdate = new GridBagConstraints ();
			gbc_jDatePickerBirthdate.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerBirthdate.insets = new Insets (0, 0, 5, 0);
			gbc_jDatePickerBirthdate.gridx = 5;
			gbc_jDatePickerBirthdate.gridy = 3;
			jPanelFiltrosEmployee.add (getJDatePickerBirthdate (), gbc_jDatePickerBirthdate);
			GridBagConstraints gbc_jLabelEmployeeSexTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeSexTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeSexTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeSexTypeDescription.gridx = 0;
			gbc_jLabelEmployeeSexTypeDescription.gridy = 4;
			jPanelFiltrosEmployee.add (getJLabelEmployeeSexTypeDescription (), gbc_jLabelEmployeeSexTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeSexTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeSexTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEmployeeSexTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxEmployeeSexTypeDescription.gridx = 1;
			gbc_jComboBoxEmployeeSexTypeDescription.gridy = 4;
			jPanelFiltrosEmployee.add (getJComboBoxEmployeeSexTypeDescription (), gbc_jComboBoxEmployeeSexTypeDescription);
			GridBagConstraints gbc_jLabelEmployeeCitizenshipDocTypeDescription = new GridBagConstraints ();
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.anchor = GridBagConstraints.EAST;
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.gridx = 2;
			gbc_jLabelEmployeeCitizenshipDocTypeDescription.gridy = 4;
			jPanelFiltrosEmployee.add (getJLabelEmployeeCitizenshipDocTypeDescription (), gbc_jLabelEmployeeCitizenshipDocTypeDescription);
			GridBagConstraints gbc_jComboBoxEmployeeCitizenshipDocTypeDescription = new GridBagConstraints ();
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.gridx = 3;
			gbc_jComboBoxEmployeeCitizenshipDocTypeDescription.gridy = 4;
			jPanelFiltrosEmployee.add (getJComboBoxEmployeeCitizenshipDocTypeDescription (), gbc_jComboBoxEmployeeCitizenshipDocTypeDescription);
			GridBagConstraints gbc_jLabelCitizenshipDocumentNumber = new GridBagConstraints ();
			gbc_jLabelCitizenshipDocumentNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelCitizenshipDocumentNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCitizenshipDocumentNumber.gridx = 4;
			gbc_jLabelCitizenshipDocumentNumber.gridy = 4;
			jPanelFiltrosEmployee.add (getJLabelCitizenshipDocumentNumber (), gbc_jLabelCitizenshipDocumentNumber);
			GridBagConstraints gbc_jTextFieldCitizenshipDocumentNumber = new GridBagConstraints();
			gbc_jTextFieldCitizenshipDocumentNumber.insets = new Insets(0, 0, 5, 0);
			gbc_jTextFieldCitizenshipDocumentNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCitizenshipDocumentNumber.gridx = 5;
			gbc_jTextFieldCitizenshipDocumentNumber.gridy = 4;
			jPanelFiltrosEmployee.add(getJTextFieldCitizenshipDocumentNumber(), gbc_jTextFieldCitizenshipDocumentNumber);
			GridBagConstraints gbc_jCheckBoxDateEntry = new GridBagConstraints ();
			gbc_jCheckBoxDateEntry.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxDateEntry.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxDateEntry.gridx = 0;
			gbc_jCheckBoxDateEntry.gridy = 5;
			jPanelFiltrosEmployee.add (getJCheckBoxDateEntry (), gbc_jCheckBoxDateEntry);
			GridBagConstraints gbc_jDatePickerDateEntry = new GridBagConstraints ();
			gbc_jDatePickerDateEntry.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerDateEntry.insets = new Insets (0, 0, 5, 5);
			gbc_jDatePickerDateEntry.gridx = 1;
			gbc_jDatePickerDateEntry.gridy = 5;
			jPanelFiltrosEmployee.add (getJDatePickerDateEntry (), gbc_jDatePickerDateEntry);
			GridBagConstraints gbc_jCheckBoxDateExit = new GridBagConstraints ();
			gbc_jCheckBoxDateExit.anchor = GridBagConstraints.EAST;
			gbc_jCheckBoxDateExit.insets = new Insets (0, 0, 5, 5);
			gbc_jCheckBoxDateExit.gridx = 2;
			gbc_jCheckBoxDateExit.gridy = 5;
			jPanelFiltrosEmployee.add (getJCheckBoxDateExit (), gbc_jCheckBoxDateExit);
			GridBagConstraints gbc_jDatePickerDateExit = new GridBagConstraints ();
			gbc_jDatePickerDateExit.anchor = GridBagConstraints.WEST;
			gbc_jDatePickerDateExit.insets = new Insets (0, 0, 5, 5);
			gbc_jDatePickerDateExit.gridx = 3;
			gbc_jDatePickerDateExit.gridy = 5;
			jPanelFiltrosEmployee.add (getJDatePickerDateExit (), gbc_jDatePickerDateExit);
			GridBagConstraints gbc_jLabelIsDeleted = new GridBagConstraints ();
			gbc_jLabelIsDeleted.anchor = GridBagConstraints.EAST;
			gbc_jLabelIsDeleted.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIsDeleted.gridx = 4;
			gbc_jLabelIsDeleted.gridy = 5;
			jPanelFiltrosEmployee.add (getJLabelIsDeleted (), gbc_jLabelIsDeleted);
			GridBagConstraints gbc_jComboBoxIsDeleted = new GridBagConstraints ();
			gbc_jComboBoxIsDeleted.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIsDeleted.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxIsDeleted.gridx = 5;
			gbc_jComboBoxIsDeleted.gridy = 5;
			jPanelFiltrosEmployee.add (getJComboBoxIsDeleted (), gbc_jComboBoxIsDeleted);
			GridBagConstraints gbc_jLabelFirstName = new GridBagConstraints ();
			gbc_jLabelFirstName.anchor = GridBagConstraints.EAST;
			gbc_jLabelFirstName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelFirstName.gridx = 0;
			gbc_jLabelFirstName.gridy = 6;
			jPanelFiltrosEmployee.add (getJLabelFirstName (), gbc_jLabelFirstName);
			GridBagConstraints gbc_jTextFieldFirstName = new GridBagConstraints();
			gbc_jTextFieldFirstName.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldFirstName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldFirstName.gridx = 1;
			gbc_jTextFieldFirstName.gridy = 6;
			jPanelFiltrosEmployee.add(getJTextFieldFirstName(), gbc_jTextFieldFirstName);
			GridBagConstraints gbc_jLabelLastName = new GridBagConstraints ();
			gbc_jLabelLastName.anchor = GridBagConstraints.EAST;
			gbc_jLabelLastName.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelLastName.gridx = 2;
			gbc_jLabelLastName.gridy = 6;
			jPanelFiltrosEmployee.add (getJLabelLastName (), gbc_jLabelLastName);
			GridBagConstraints gbc_jTextFieldLastName = new GridBagConstraints();
			gbc_jTextFieldLastName.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldLastName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldLastName.gridx = 3;
			gbc_jTextFieldLastName.gridy = 6;
			jPanelFiltrosEmployee.add(getJTextFieldLastName(), gbc_jTextFieldLastName);
			GridBagConstraints gbc_jLabelCurrentPhoneNumber = new GridBagConstraints ();
			gbc_jLabelCurrentPhoneNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelCurrentPhoneNumber.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelCurrentPhoneNumber.gridx = 4;
			gbc_jLabelCurrentPhoneNumber.gridy = 6;
			jPanelFiltrosEmployee.add (getJLabelCurrentPhoneNumber (), gbc_jLabelCurrentPhoneNumber);
			GridBagConstraints gbc_jTextFieldCurrentPhoneNumber = new GridBagConstraints();
			gbc_jTextFieldCurrentPhoneNumber.insets = new Insets(0, 0, 5, 0);
			gbc_jTextFieldCurrentPhoneNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCurrentPhoneNumber.gridx = 5;
			gbc_jTextFieldCurrentPhoneNumber.gridy = 6;
			jPanelFiltrosEmployee.add(getJTextFieldCurrentPhoneNumber(), gbc_jTextFieldCurrentPhoneNumber);
			GridBagConstraints gbc_jLabelMobilePhoneNumber = new GridBagConstraints ();
			gbc_jLabelMobilePhoneNumber.anchor = GridBagConstraints.EAST;
			gbc_jLabelMobilePhoneNumber.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelMobilePhoneNumber.gridx = 0;
			gbc_jLabelMobilePhoneNumber.gridy = 7;
			jPanelFiltrosEmployee.add (getJLabelMobilePhoneNumber (), gbc_jLabelMobilePhoneNumber);
			GridBagConstraints gbc_jTextFieldMobilePhoneNumber = new GridBagConstraints();
			gbc_jTextFieldMobilePhoneNumber.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldMobilePhoneNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldMobilePhoneNumber.gridx = 1;
			gbc_jTextFieldMobilePhoneNumber.gridy = 7;
			jPanelFiltrosEmployee.add(getJTextFieldMobilePhoneNumber(), gbc_jTextFieldMobilePhoneNumber);
			GridBagConstraints gbc_jLabelIsFirstTime = new GridBagConstraints ();
			gbc_jLabelIsFirstTime.anchor = GridBagConstraints.EAST;
			gbc_jLabelIsFirstTime.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelIsFirstTime.gridx = 2;
			gbc_jLabelIsFirstTime.gridy = 7;
			jPanelFiltrosEmployee.add (getJLabelIsFirstTime (), gbc_jLabelIsFirstTime);
			GridBagConstraints gbc_jComboBoxIsFirstTime = new GridBagConstraints ();
			gbc_jComboBoxIsFirstTime.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxIsFirstTime.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxIsFirstTime.gridx = 3;
			gbc_jComboBoxIsFirstTime.gridy = 7;
			jPanelFiltrosEmployee.add (getJComboBoxIsFirstTime (), gbc_jComboBoxIsFirstTime);
		}
		
		return jPanelFiltrosEmployee;
	}
	
	private JTextField getJTextFieldIdUserEmployee ()
	{
		if (jTextFieldIdUserEmployee == null)
		{
			jTextFieldIdUserEmployee = new JTextField ();
			jTextFieldIdUserEmployee.addKeyListener (new KeyAdapter()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldIdUserEmployee ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldIdUserEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldIdUserEmployee ().setEnabled (true);
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
						
						else if (getTextAutoCompleterIdUserEmployee ().itemExists (getJTextFieldIdUserEmployee ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldIdUserEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldIdUserEmployee ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldIdUserEmployee;
	}
	
	private TextAutoCompleter getTextAutoCompleterIdUserEmployee ()
	{
		if (textAutoCompleterIdUserEmployee == null)
		{
			textAutoCompleterIdUserEmployee = new TextAutoCompleter (getJTextFieldIdUserEmployee (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterIdUserEmployee;
	}
	
	private JTextField getJTextFieldAccountNumberEmployee ()
	{
		if (jTextFieldAccountNumberEmployee == null)
		{
			jTextFieldAccountNumberEmployee = new JTextField ();
			jTextFieldAccountNumberEmployee.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldAccountNumberEmployee ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldAccountNumberEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldAccountNumberEmployee ().setEnabled (true);
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
						
						else if (getTextAutoCompleterAccountNumberEmployee ().itemExists (getJTextFieldAccountNumberEmployee ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldAccountNumberEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldAccountNumberEmployee ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldAccountNumberEmployee;
	}
	
	private TextAutoCompleter getTextAutoCompleterAccountNumberEmployee ()
	{
		if (textAutoCompleterAccountNumberEmployee == null)
		{
			textAutoCompleterAccountNumberEmployee = new TextAutoCompleter (getJTextFieldAccountNumberEmployee (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterAccountNumberEmployee;
	}
	
	private JButton getJButtonAplicarEmployee ()
	{
		if (jButtonAplicarEmployee == null)
		{
			jButtonAplicarEmployee = new JButton ();
			jButtonAplicarEmployee.setText ("Aplicar");
			jButtonAplicarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarEmployee ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().setToolTipText ("Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
													
							if (! getJTextFieldIdUserEmployee ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND IdUser = '" + getJTextFieldIdUserEmployee ().getText ().toString () + "'");
													
							if (! getJTextFieldAccountNumberEmployee ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Employee.AccountNumber = " + (getJTextFieldAccountNumberEmployee ().getText ().toString ().isEmpty () ? "0" : getJTextFieldAccountNumberEmployee ().getText ().toString ()));
													
							if (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'");
													
							if (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
													
							if (! getJTextFieldCuil ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Cuil = '" + getJTextFieldCuil ().getText ().toString () + "'");
													
							if (getJComboBoxCitizenship ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Citizenship = '" + getJComboBoxCitizenship ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxCountryStateDescriptionEmployee ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND CountryState.Description = '" + getJComboBoxCountryStateDescriptionEmployee ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxEmployeeMarriageStatusTypeDescription ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND EmployeeMarriageStatusType.Description = '" + getJComboBoxEmployeeMarriageStatusTypeDescription ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxAddress ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Employee.Address = '" + getJComboBoxAddress ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxLocation ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Location = '" + getJComboBoxLocation ().getSelectedItem ().toString () + "'");
													
							if (getJCheckBoxBirthdate ().isSelected ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND Birthdate = " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? " CONVERT (DATE, '" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().getYear () + "'"));
													
							if (getJComboBoxEmployeeSexTypeDescription ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND EmployeeSexType.Description = '" + getJComboBoxEmployeeSexTypeDescription ().getSelectedItem ().toString () + "'");
													
							if (getJComboBoxEmployeeCitizenshipDocTypeDescription ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND EmployeeCitizenshipDocType.Description = '" + getJComboBoxEmployeeCitizenshipDocTypeDescription ().getSelectedItem ().toString () + "'");
													
							if (! getJTextFieldCitizenshipDocumentNumber ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND CitizenshipDocumentNumber = " + getJTextFieldCitizenshipDocumentNumber ().getText ().toString ());
													
							if (getJCheckBoxDateEntry ().isSelected ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND DateEntry = " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? " CONVERT (DATE, '" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().getYear () + "'"));
													
							if (getJCheckBoxDateExit ().isSelected ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND DateExit = " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? " CONVERT (DATE, '" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getYear () + "', 103)" : "'" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () < 10 ? "0" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay () : getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getDay ()) + "/" + ((getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) < 10 ? "0" + (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1) : (getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getMonth () + 1)) + "/" + getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().getYear () + "'"));
													
							if (getJComboBoxIsDeleted ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND (Employee.IsDeleted " + (getJComboBoxIsDeleted ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR Employee.IsDeleted = 0)"));
													
							if (! getJTextFieldFirstName ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND FirstName = '" + getJTextFieldFirstName ().getText ().toString () + "'");
													
							if (! getJTextFieldLastName ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND LastName = '" + getJTextFieldLastName ().getText ().toString () + "'");
													
							if (! getJTextFieldCurrentPhoneNumber ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND CurrentPhoneNumber = '" + getJTextFieldCurrentPhoneNumber ().getText ().toString () + "'");
													
							if (! getJTextFieldMobilePhoneNumber ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND MobilePhoneNumber = '" + getJTextFieldMobilePhoneNumber ().getText ().toString () + "'");
													
							if (getJComboBoxIsFirstTime ().getSelectedIndex () > 0)
														
								getJButtonAplicarEmployee ().setToolTipText (getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString () + " AND (IsFirstTime " + (getJComboBoxIsFirstTime ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR IsFirstTime = 0)"));
													
							Utilidades.cargarTable (getJTableEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdEmployee, IdUser, Employee.AccountNumber AS EmployeeAccountNumber, CompanySection.Description AS CompanySectionDescription, CompanySubsidiary.Description AS CompanySubsidiaryDescription, TradeName, SheetNumber, Cuil, Citizenship, CountryState.Description AS CountryStateDescription, EmployeeMarriageStatusType.Description AS EmployeeMarriageStatusTypeDescription, Employee.Address, Location, " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (CHAR, Birthdate, 103)" : "Birthdate") + " AS Birthdate, EmployeeSexType.Description AS EmployeeSexTypeDescription, EmployeeCitizenshipDocType.Description AS EmployeeCitizenshipDocTypeDescription, CitizenshipDocumentNumber, " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (CHAR, DateEntry, 103)" : "DateEntry") + " AS DateEntry, " + (Utilidades.driverManager.toString ().equals ("com.microsoft.sqlserver.jdbc.SQLServerDriver") ? "CONVERT (CHAR, DateExit, 103)" : "DateExit") + " AS DateExit, IdEmployeeAgreementType, CASE WHEN Employee.IsDeleted = 1 THEN 'Verdadero' ELSE 'Falso' END AS EmployeeIsDeleted, FirstName, LastName, CurrentPhoneNumber, MobilePhoneNumber, PasswordUser, IdRol, Email, EmployeeKeyDoc, CASE WHEN IsFirstTime = 1 THEN 'Verdadero' ELSE 'Falso' END AS IsFirstTime", getJButtonAplicarEmployee ().getToolTipText () == null ? "" : getJButtonAplicarEmployee ().getToolTipText ().toString (), "IdEmployee");
							getJTableEmployee ().requestFocus ();
							getJButtonAplicarEmployee ().setToolTipText (null);
							getJPanelEmployee ().setBorder (BorderFactory.createTitledBorder (null, "Employee - Cantidad de registros: " + getJTableEmployee ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarEmployee ().setEnabled (getJTableEmployee ().getRowCount () > 0);
							getJMenuItemEliminarEmployee ().setEnabled (getJTableEmployee ().getRowCount () > 0);
							getJButtonModificarEmployee ().setEnabled (getJTableEmployee ().getRowCount () > 0);
							getJMenuItemModificarEmployee ().setEnabled (getJTableEmployee ().getRowCount () > 0);
							getJButtonAplicarEmployee ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())

						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarEmployee;
	}
	
	private JPanel getJPanelABMEmployee ()
	{
		if (jPanelABMEmployee == null)
		{
			jPanelABMEmployee = new JPanel ();
			GridBagLayout gbl_jPanelABMEmployee = new GridBagLayout ();
			gbl_jPanelABMEmployee.columnWidths = new int [] {75, 0};
			gbl_jPanelABMEmployee.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMEmployee.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMEmployee.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMEmployee.setLayout (gbl_jPanelABMEmployee);
			GridBagConstraints gbc_jButtonAgregarEmployee = new GridBagConstraints ();
			gbc_jButtonAgregarEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarEmployee.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarEmployee.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarEmployee.gridx = 0;
			gbc_jButtonAgregarEmployee.gridy = 0;
			jPanelABMEmployee.add (getJButtonAgregarEmployee (), gbc_jButtonAgregarEmployee);
			GridBagConstraints gbc_jButtonEliminarEmployee = new GridBagConstraints ();
			gbc_jButtonEliminarEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarEmployee.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarEmployee.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarEmployee.gridx = 0;
			gbc_jButtonEliminarEmployee.gridy = 1;
			jPanelABMEmployee.add (getJButtonEliminarEmployee (), gbc_jButtonEliminarEmployee);
			GridBagConstraints gbc_jButtonModificarEmployee = new GridBagConstraints ();
			gbc_jButtonModificarEmployee.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarEmployee.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarEmployee.gridx = 0;
			gbc_jButtonModificarEmployee.gridy = 2;
			jPanelABMEmployee.add (getJButtonModificarEmployee (), gbc_jButtonModificarEmployee);
		}
		
		return jPanelABMEmployee;
	}
	
	private JButton getJButtonAgregarEmployee ()
	{
		if (jButtonAgregarEmployee == null)
		{
			jButtonAgregarEmployee = new JButton ();
			jButtonAgregarEmployee.setText ("Agregar");
			jButtonAgregarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarEmployee ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMEmployee (null, getJButtonAgregarEmployee ().getText ().toString (), null, null, null, null, null, null, null, null, "ARGENTINA", "CORDOBA", "Soltero/a", null, null, "01/01/1980", "Hombre", "DNI", null, ((new GregorianCalendar ().get (Calendar.DATE) < 10 ? "0" + new GregorianCalendar ().get (Calendar.DATE) : new GregorianCalendar ().get (Calendar.DATE)) + "/" + ((new GregorianCalendar ().get (Calendar.MONTH) + 1) < 10 ? "0" + (new GregorianCalendar ().get (Calendar.MONTH) + 1) : (new GregorianCalendar ().get (Calendar.MONTH) + 1)) + "/" + new GregorianCalendar ().get (Calendar.YEAR)).toString (), null, "-1", "Falso", null, null, null, null, "PASsword015*", "-1", "EmailPueba@EmailPueba.com.ar", "AUN/FdiHrRdyvQ8jusHccna0RMqc/8l5XFP8p1jPFxZ6EwfFXxN6NpbdWSLbKQRKDNgRabKQRplVTw7hGxD2ZEBueCrOMtHZKYEkncVD/W37JN4Gy0AVs4QC7Ar1wV7tXljx02bCTe9MYoVWwgPa4KfBCF6aX2JS36A3BaniQOU=", "Falso");
							getJButtonAplicarEmployee ().doClick ();
							getJButtonAgregarEmployee ().setEnabled (true);
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
		
		return jButtonAgregarEmployee;
	}
	
	private JButton getJButtonEliminarEmployee ()
	{
		if (jButtonEliminarEmployee == null)
		{
			jButtonEliminarEmployee = new JButton ();
			jButtonEliminarEmployee.setText ("Eliminar");
			jButtonEliminarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar el empleado " + getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 1).toString () + ", de la empresa " + getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 5).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("Employee", "IdEmployee = " + getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 0).toString ()))
							{
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonAplicarEmployee ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarEmployee;
	}
	
	private JButton getJButtonModificarEmployee ()
	{
		if (jButtonModificarEmployee == null)
		{
			jButtonModificarEmployee = new JButton ();
			jButtonModificarEmployee.setText ("Modificar");
			jButtonModificarEmployee.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarEmployee ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMEmployee (null, getJButtonModificarEmployee ().getText ().toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 0).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 1).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 2).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 3).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 4).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 5).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 6).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 7).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 8).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 9).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 10).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 11).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 12).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 13).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 14).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 15).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 16).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 17).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 18).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 19).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 20).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 21).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 22).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 23).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 24).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 25).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 26).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 27).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 28).toString (), getJTableEmployee ().getValueAt (getJTableEmployee ().getSelectedRow (), 29).toString ());							
							getJButtonAplicarEmployee ().doClick ();
							getJButtonModificarEmployee ().setEnabled (true);
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
		
		return jButtonModificarEmployee;
	}
	
	private JPanel getJPanelRolesEmpleados ()
	{
		if (jPanelRolesEmpleados == null)
		{
			jPanelRolesEmpleados = new JPanel ();
			GridBagLayout gbl_jPanelRolesEmpleados = new GridBagLayout ();
			gbl_jPanelRolesEmpleados.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelRolesEmpleados.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelRolesEmpleados.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelRolesEmpleados.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelRolesEmpleados.setLayout (gbl_jPanelRolesEmpleados);
			GridBagConstraints gbc_jScrollPaneRolesEmpleados = new GridBagConstraints ();
			gbc_jScrollPaneRolesEmpleados.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneRolesEmpleados.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneRolesEmpleados.gridx = 0;
			gbc_jScrollPaneRolesEmpleados.gridy = 0;
			jPanelRolesEmpleados.add (getJScrollPaneRolesEmpleados (), gbc_jScrollPaneRolesEmpleados);
			GridBagConstraints gbc_jScrollPaneABMRolesEmpleados = new GridBagConstraints ();
			gbc_jScrollPaneABMRolesEmpleados.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMRolesEmpleados.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMRolesEmpleados.gridx = 1;
			gbc_jScrollPaneABMRolesEmpleados.gridy = 0;
			jPanelRolesEmpleados.add (getJScrollPaneABMRolesEmpleados (), gbc_jScrollPaneABMRolesEmpleados);
			GridBagConstraints gbc_jScrollPaneFiltrosRolesEmpleados = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosRolesEmpleados.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosRolesEmpleados.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosRolesEmpleados.gridx = 0;
			gbc_jScrollPaneFiltrosRolesEmpleados.gridy = 1;
			jPanelRolesEmpleados.add (getJScrollPaneFiltrosRolesEmpleados (), gbc_jScrollPaneFiltrosRolesEmpleados);
			GridBagConstraints gbc_jButtonAplicarRolesEmpleados = new GridBagConstraints ();
			gbc_jButtonAplicarRolesEmpleados.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarRolesEmpleados.gridx = 1;
			gbc_jButtonAplicarRolesEmpleados.gridy = 1;
			jPanelRolesEmpleados.add (getJButtonAplicarRolesEmpleados (), gbc_jButtonAplicarRolesEmpleados);
		}
		
		return jPanelRolesEmpleados;
	}
	
	private JScrollPane getJScrollPaneRolesEmpleados ()
	{
		if (jScrollPaneRolesEmpleados == null)
		{
			jScrollPaneRolesEmpleados = new JScrollPane ();
			jScrollPaneRolesEmpleados.setViewportView (getJTableRolesEmpleados ());
			jScrollPaneRolesEmpleados.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuRolesEmpleados ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuRolesEmpleados ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneRolesEmpleados;
	}
	
	private JTable getJTableRolesEmpleados ()
	{
		if (jTableRolesEmpleados == null)
		{
			jTableRolesEmpleados = new JTable ();
			jTableRolesEmpleados.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuRolesEmpleados ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuRolesEmpleados ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableRolesEmpleados;
	}

	private JPopupMenu getJPopupMenuRolesEmpleados ()
	{
		if (jPopupMenuRolesEmpleados == null)
		{
			jPopupMenuRolesEmpleados = new JPopupMenu ();
			jPopupMenuRolesEmpleados.add (getJMenuItemAgregarRolesEmpleados ());
			jPopupMenuRolesEmpleados.add (getJMenuItemEliminarRolesEmpleados ());
			jPopupMenuRolesEmpleados.add (getJMenuItemModificarRolesEmpleados ());
		}
		
		return jPopupMenuRolesEmpleados;
	}
	
	private JMenuItem getJMenuItemAgregarRolesEmpleados ()
	{
		if (jMenuItemAgregarRolesEmpleados == null)
		{
			jMenuItemAgregarRolesEmpleados = new JMenuItem ();
			jMenuItemAgregarRolesEmpleados.setText ("Agregar");
			jMenuItemAgregarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarRolesEmpleados ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarRolesEmpleados;
	}
	
	private JMenuItem getJMenuItemEliminarRolesEmpleados ()
	{
		if (jMenuItemEliminarRolesEmpleados == null)
		{
			jMenuItemEliminarRolesEmpleados = new JMenuItem ();
			jMenuItemEliminarRolesEmpleados.setText ("Eliminar");
			jMenuItemEliminarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarRolesEmpleados ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarRolesEmpleados;
	}
	
	private JMenuItem getJMenuItemModificarRolesEmpleados ()
	{
		if (jMenuItemModificarRolesEmpleados == null)
		{
			jMenuItemModificarRolesEmpleados = new JMenuItem ();
			jMenuItemModificarRolesEmpleados.setText ("Modificar");
			jMenuItemModificarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarRolesEmpleados ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarRolesEmpleados;
	}
	
	private JPanel getJPanelFiltrosRolesEmpleados ()
	{
		if (jPanelFiltrosRolesEmpleados == null)
		{
			jPanelFiltrosRolesEmpleados = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosRolesEmpleados = new GridBagLayout ();
			gbl_jPanelFiltrosRolesEmpleados.columnWidths = new int [] {41, 28, 36, 28, 0, 0, 0};
			gbl_jPanelFiltrosRolesEmpleados.rowHeights = new int [] {20, 0};
			gbl_jPanelFiltrosRolesEmpleados.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosRolesEmpleados.rowWeights = new double [] {0.0, Double.MIN_VALUE};
			jPanelFiltrosRolesEmpleados.setLayout (gbl_jPanelFiltrosRolesEmpleados);
			jLabelNombre = new JLabel ();
			jLabelNombre.setText ("Nombre:");
			GridBagConstraints gbc_jLabelNombre = new GridBagConstraints ();
			gbc_jLabelNombre.anchor = GridBagConstraints.EAST;
			gbc_jLabelNombre.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelNombre.gridx = 0;
			gbc_jLabelNombre.gridy = 0;
			jPanelFiltrosRolesEmpleados.add (jLabelNombre, gbc_jLabelNombre);
			GridBagConstraints gbc_jComboBoxNombre = new GridBagConstraints ();
			gbc_jComboBoxNombre.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxNombre.insets = new Insets (0, 0, 0, 5);
			gbc_jComboBoxNombre.gridx = 1;
			gbc_jComboBoxNombre.gridy = 0;
			jPanelFiltrosRolesEmpleados.add (getJComboBoxNombre (), gbc_jComboBoxNombre);
			GridBagConstraints gbc_jLabelIdUserRolesEmpleados = new GridBagConstraints ();
			gbc_jLabelIdUserRolesEmpleados.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdUserRolesEmpleados.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelIdUserRolesEmpleados.gridx = 2;
			gbc_jLabelIdUserRolesEmpleados.gridy = 0;
			jPanelFiltrosRolesEmpleados.add (getJLabelIdUserRolesEmpleados (), gbc_jLabelIdUserRolesEmpleados);
			GridBagConstraints gbc_jTextFieldIdUserRolesEmpleados = new GridBagConstraints();
			gbc_jTextFieldIdUserRolesEmpleados.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldIdUserRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldIdUserRolesEmpleados.gridx = 3;
			gbc_jTextFieldIdUserRolesEmpleados.gridy = 0;
			jPanelFiltrosRolesEmpleados.add(getJTextFieldIdUserRolesEmpleados(), gbc_jTextFieldIdUserRolesEmpleados);
			GridBagConstraints gbc_jLabelTradeNameRolesEmpleados = new GridBagConstraints ();
			gbc_jLabelTradeNameRolesEmpleados.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelTradeNameRolesEmpleados.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameRolesEmpleados.gridx = 4;
			gbc_jLabelTradeNameRolesEmpleados.gridy = 0;
			jPanelFiltrosRolesEmpleados.add (getJLabelTradeNameRolesEmpleados (), gbc_jLabelTradeNameRolesEmpleados);
			GridBagConstraints gbc_jTextFieldTradeNameRolesEmpleados = new GridBagConstraints();
			gbc_jTextFieldTradeNameRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameRolesEmpleados.gridx = 5;
			gbc_jTextFieldTradeNameRolesEmpleados.gridy = 0;
			jPanelFiltrosRolesEmpleados.add(getJTextFieldTradeNameRolesEmpleados(), gbc_jTextFieldTradeNameRolesEmpleados);
		}
		
		return jPanelFiltrosRolesEmpleados;
	}
	
	private JComboBox <String> getJComboBoxNombre ()
	{
		if (jComboBoxNombre == null)
		{
			jComboBoxNombre = new JComboBox <String> ();
		}
		
		return jComboBoxNombre;
	}
	
	private JButton getJButtonAplicarRolesEmpleados ()
	{
		if (jButtonAplicarRolesEmpleados == null)
		{
			jButtonAplicarRolesEmpleados = new JButton ();
			jButtonAplicarRolesEmpleados.setText ("Aplicar");
			jButtonAplicarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarRolesEmpleados ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarRolesEmpleados ().setToolTipText ("RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
													
							if (getJComboBoxNombre ().getSelectedIndex () > 0)
														
								getJButtonAplicarRolesEmpleados ().setToolTipText (getJButtonAplicarRolesEmpleados ().getToolTipText () == null ? "" : getJButtonAplicarRolesEmpleados ().getToolTipText ().toString () + " AND RolesEmpleados.idrol = " + Utilidades.devolverAtributoClave ("Rol", "IdRol", "Nombre = '" + getJComboBoxNombre ().getSelectedItem ().toString () + "'")); 
													
							if (! getJTextFieldIdUserRolesEmpleados ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarRolesEmpleados ().setToolTipText (getJButtonAplicarRolesEmpleados ().getToolTipText () == null ? "" : getJButtonAplicarRolesEmpleados ().getToolTipText ().toString () + " AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
													
							if (! getJTextFieldTradeNameRolesEmpleados ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarRolesEmpleados ().setToolTipText (getJButtonAplicarRolesEmpleados ().getToolTipText () == null ? "" : getJButtonAplicarRolesEmpleados ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
													
							Utilidades.cargarTable (getJTableRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre, IdUser, hashcert, TradeName", getJButtonAplicarRolesEmpleados ().getToolTipText () == null ? "" : getJButtonAplicarRolesEmpleados ().getToolTipText ().toString (), "IdUser, Nombre, TradeName");
							getJTableRolesEmpleados ().requestFocus ();
							getJButtonAplicarRolesEmpleados ().setToolTipText (null);
							getJPanelRolesEmpleados ().setBorder (BorderFactory.createTitledBorder (null, "RolesEmpleados - Cantidad de registros: " + getJTableRolesEmpleados ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarRolesEmpleados ().setEnabled (getJTableRolesEmpleados ().getRowCount () > 0);
							getJMenuItemEliminarRolesEmpleados ().setEnabled (getJTableRolesEmpleados ().getRowCount () > 0);
							getJButtonModificarRolesEmpleados ().setEnabled (getJTableRolesEmpleados ().getRowCount () > 0);
							getJMenuItemModificarRolesEmpleados ().setEnabled (getJTableRolesEmpleados ().getRowCount () > 0);
							getJButtonAplicarRolesEmpleados ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())

						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarRolesEmpleados;
	}
	
	private JPanel getJPanelABMRolesEmpleados ()
	{
		if (jPanelABMRolesEmpleados == null)
		{
			jPanelABMRolesEmpleados = new JPanel ();
			GridBagLayout gbl_jPanelABMRolesEmpleados = new GridBagLayout ();
			gbl_jPanelABMRolesEmpleados.columnWidths = new int [] {75, 0};
			gbl_jPanelABMRolesEmpleados.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMRolesEmpleados.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMRolesEmpleados.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMRolesEmpleados.setLayout (gbl_jPanelABMRolesEmpleados);
			GridBagConstraints gbc_jButtonAgregarRolesEmpleados = new GridBagConstraints ();
			gbc_jButtonAgregarRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarRolesEmpleados.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarRolesEmpleados.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarRolesEmpleados.gridx = 0;
			gbc_jButtonAgregarRolesEmpleados.gridy = 0;
			jPanelABMRolesEmpleados.add (getJButtonAgregarRolesEmpleados (), gbc_jButtonAgregarRolesEmpleados);
			GridBagConstraints gbc_jButtonEliminarRolesEmpleados = new GridBagConstraints ();
			gbc_jButtonEliminarRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarRolesEmpleados.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarRolesEmpleados.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarRolesEmpleados.gridx = 0;
			gbc_jButtonEliminarRolesEmpleados.gridy = 1;
			jPanelABMRolesEmpleados.add (getJButtonEliminarRolesEmpleados (), gbc_jButtonEliminarRolesEmpleados);
			GridBagConstraints gbc_jButtonModificarRolesEmpleados = new GridBagConstraints ();
			gbc_jButtonModificarRolesEmpleados.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarRolesEmpleados.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarRolesEmpleados.gridx = 0;
			gbc_jButtonModificarRolesEmpleados.gridy = 2;
			jPanelABMRolesEmpleados.add (getJButtonModificarRolesEmpleados (), gbc_jButtonModificarRolesEmpleados);
		}
		
		return jPanelABMRolesEmpleados;
	}
	
	private JButton getJButtonAgregarRolesEmpleados ()
	{
		if (jButtonAgregarRolesEmpleados == null)
		{
			jButtonAgregarRolesEmpleados = new JButton ();
			jButtonAgregarRolesEmpleados.setText ("Agregar");
			jButtonAgregarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarRolesEmpleados ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMRolesEmpleados (null, getJButtonAgregarRolesEmpleados ().getText ().toString (), null, null, null, null);
							getJButtonAplicarRolesEmpleados ().doClick ();
							getJButtonAgregarRolesEmpleados ().setEnabled (true);
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
		
		return jButtonAgregarRolesEmpleados;
	}
	
	private JButton getJButtonEliminarRolesEmpleados ()
	{
		if (jButtonEliminarRolesEmpleados == null)
		{
			jButtonEliminarRolesEmpleados = new JButton ();
			jButtonEliminarRolesEmpleados.setText ("Eliminar");
			jButtonEliminarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar el rol " + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 0).toString () + " para el usuario " + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 1).toString () + ", de la empresa " + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 3).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						getJButtonEliminarRolesEmpleados ().setToolTipText ("idrol = " + Utilidades.devolverAtributoClave ("Rol", "IdRol", "Nombre = '" + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 0).toString () + "'") + " AND idemployee = " + Utilidades.devolverAtributoClave ("Employee, CompanySection, CompanySubsidiary, Company", "IdEmployee", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 3).toString () + "'") + " AND CompanySubsidiary.IdCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 3).toString () + "'") + " AND IdUser = '" + getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 1).toString () + "'"));
						
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("RolesEmpleados", getJButtonEliminarRolesEmpleados ().getToolTipText ()))
							{
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonEliminarRolesEmpleados ().setToolTipText (null);
						getJButtonAplicarRolesEmpleados ().doClick ();						
					}
				}
			}
			);
		}
		
		return jButtonEliminarRolesEmpleados;
	}
	
	private JButton getJButtonModificarRolesEmpleados ()
	{
		if (jButtonModificarRolesEmpleados == null)
		{
			jButtonModificarRolesEmpleados = new JButton ();
			jButtonModificarRolesEmpleados.setText ("Modificar");
			jButtonModificarRolesEmpleados.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarRolesEmpleados ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMRolesEmpleados (null, getJButtonModificarRolesEmpleados ().getText ().toString (), getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 0).toString (), getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 1).toString (), getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 2).toString (), getJTableRolesEmpleados ().getValueAt (getJTableRolesEmpleados ().getSelectedRow (), 3).toString ());
							getJButtonAplicarRolesEmpleados ().doClick ();
							getJButtonModificarRolesEmpleados ().setEnabled (true);
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
		
		return jButtonModificarRolesEmpleados;
	}
	
	private JPanel getJPanelSettingsKeystore ()
	{
		if (jPanelSettingsKeystore == null)
		{
			jPanelSettingsKeystore = new JPanel ();
			GridBagLayout gbl_jPanelSettingsKeystore = new GridBagLayout ();
			gbl_jPanelSettingsKeystore.columnWidths = new int [] {982, 128, 0};
			gbl_jPanelSettingsKeystore.rowHeights = new int [] {249, 267, 0};
			gbl_jPanelSettingsKeystore.columnWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelSettingsKeystore.rowWeights = new double [] {1.0, 1.0, Double.MIN_VALUE};
			jPanelSettingsKeystore.setLayout (gbl_jPanelSettingsKeystore);
			GridBagConstraints gbc_jScrollPaneSettingsKeystore = new GridBagConstraints ();
			gbc_jScrollPaneSettingsKeystore.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneSettingsKeystore.insets = new Insets (0, 0, 5, 5);
			gbc_jScrollPaneSettingsKeystore.gridx = 0;
			gbc_jScrollPaneSettingsKeystore.gridy = 0;
			jPanelSettingsKeystore.add (getJScrollPaneSettingsKeystore (), gbc_jScrollPaneSettingsKeystore);
			GridBagConstraints gbc_jScrollPaneABMSettingsKeystore = new GridBagConstraints ();
			gbc_jScrollPaneABMSettingsKeystore.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneABMSettingsKeystore.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneABMSettingsKeystore.gridx = 1;
			gbc_jScrollPaneABMSettingsKeystore.gridy = 0;
			jPanelSettingsKeystore.add (getJScrollPaneABMSettingsKeystore (), gbc_jScrollPaneABMSettingsKeystore);
			GridBagConstraints gbc_jScrollPaneFiltrosSettingKeystore = new GridBagConstraints ();
			gbc_jScrollPaneFiltrosSettingKeystore.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneFiltrosSettingKeystore.insets = new Insets (0, 0, 0, 5);
			gbc_jScrollPaneFiltrosSettingKeystore.gridx = 0;
			gbc_jScrollPaneFiltrosSettingKeystore.gridy = 1;
			jPanelSettingsKeystore.add (getJScrollPaneFiltrosSettingKeystore (), gbc_jScrollPaneFiltrosSettingKeystore);
			GridBagConstraints gbc_jButtonAplicarSettingsKeystore = new GridBagConstraints ();
			gbc_jButtonAplicarSettingsKeystore.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAplicarSettingsKeystore.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAplicarSettingsKeystore.gridx = 1;
			gbc_jButtonAplicarSettingsKeystore.gridy = 1;
			jPanelSettingsKeystore.add (getJButtonAplicarSettingsKeystore (), gbc_jButtonAplicarSettingsKeystore);
		}
		
		return jPanelSettingsKeystore;
	}
	
	private JScrollPane getJScrollPaneSettingsKeystore ()
	{
		if (jScrollPaneSettingsKeystore == null)
		{
			jScrollPaneSettingsKeystore = new JScrollPane ();
			jScrollPaneSettingsKeystore.setViewportView (getJTableSettingsKeystore ());
			jScrollPaneSettingsKeystore.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuSettingsKeystore ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuSettingsKeystore ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jScrollPaneSettingsKeystore;
	}
	
	private JTable getJTableSettingsKeystore ()
	{
		if (jTableSettingsKeystore == null)
		{
			jTableSettingsKeystore = new JTable ();
			jTableSettingsKeystore.addMouseListener (new java.awt.event.MouseAdapter ()
			{
				public void mouseReleased (java.awt.event.MouseEvent e)
				{ 
					if (e.isPopupTrigger ())
						
						getJPopupMenuSettingsKeystore ().show (e.getComponent (), e.getX (), e.getY ());
				}
				
				public void mousePressed (java.awt.event.MouseEvent e)
				{
					if (e.isPopupTrigger ())
						
						getJPopupMenuSettingsKeystore ().show (e.getComponent (), e.getX (), e.getY ());
				}
			}
			);
		}
		
		return jTableSettingsKeystore;
	}

	private JPopupMenu getJPopupMenuSettingsKeystore ()
	{
		if (jPopupMenuSettingsKeystore == null)
		{
			jPopupMenuSettingsKeystore = new JPopupMenu ();
			jPopupMenuSettingsKeystore.add (getJMenuItemAgregarSettingsKeystore ());
			jPopupMenuSettingsKeystore.add (getJMenuItemEliminarSettingsKeystore ());
			jPopupMenuSettingsKeystore.add (getJMenuItemModificarSettingsKeystore ());
		}
		
		return jPopupMenuSettingsKeystore;
	}
	
	private JMenuItem getJMenuItemAgregarSettingsKeystore ()
	{
		if (jMenuItemAgregarSettingsKeystore == null)
		{
			jMenuItemAgregarSettingsKeystore = new JMenuItem ();
			jMenuItemAgregarSettingsKeystore.setText ("Agregar");
			jMenuItemAgregarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonAgregarSettingsKeystore ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemAgregarSettingsKeystore;
	}
	
	private JMenuItem getJMenuItemEliminarSettingsKeystore ()
	{
		if (jMenuItemEliminarSettingsKeystore == null)
		{
			jMenuItemEliminarSettingsKeystore = new JMenuItem ();
			jMenuItemEliminarSettingsKeystore.setText ("Eliminar");
			jMenuItemEliminarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonEliminarSettingsKeystore ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemEliminarSettingsKeystore;
	}
	
	private JMenuItem getJMenuItemModificarSettingsKeystore ()
	{
		if (jMenuItemModificarSettingsKeystore == null)
		{
			jMenuItemModificarSettingsKeystore = new JMenuItem ();
			jMenuItemModificarSettingsKeystore.setText ("Modificar");
			jMenuItemModificarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					getJButtonModificarSettingsKeystore ().doClick ();
				}
			}
			);
		}
		
		return jMenuItemModificarSettingsKeystore;
	}
	
	private JPanel getJPanelFiltrosSettingsKeystore ()
	{
		if (jPanelFiltrosSettingsKeystore == null)
		{
			jPanelFiltrosSettingsKeystore = new JPanel ();
			GridBagLayout gbl_jPanelFiltrosSettingsKeystore = new GridBagLayout ();
			gbl_jPanelFiltrosSettingsKeystore.columnWidths = new int [] {59, 28, 53, 28, 96, 28, 0};
			gbl_jPanelFiltrosSettingsKeystore.rowHeights = new int [] {20, 20, 0};
			gbl_jPanelFiltrosSettingsKeystore.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelFiltrosSettingsKeystore.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelFiltrosSettingsKeystore.setLayout (gbl_jPanelFiltrosSettingsKeystore);
			GridBagConstraints gbc_jLabelcuil = new GridBagConstraints ();
			gbc_jLabelcuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelcuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcuil.gridx = 0;
			gbc_jLabelcuil.gridy = 0;
			gbc_jLabelcuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelcuil.gridx = 0;
			gbc_jLabelcuil.gridy = 0;
			gbc_jLabelcuil.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelcuil.anchor = GridBagConstraints.EAST;
			gbc_jLabelcuil.gridx = 0;
			gbc_jLabelcuil.gridy = 0;
			jPanelFiltrosSettingsKeystore.add (getJLabelcuil (), gbc_jLabelcuil);
			GridBagConstraints gbc_jTextFieldcuil = new GridBagConstraints();
			gbc_jTextFieldcuil.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldcuil.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldcuil.gridx = 1;
			gbc_jTextFieldcuil.gridy = 0;
			jPanelFiltrosSettingsKeystore.add(getJTextFieldcuil(), gbc_jTextFieldcuil);
			GridBagConstraints gbc_jLabelisDeleteKs = new GridBagConstraints ();
			gbc_jLabelisDeleteKs.anchor = GridBagConstraints.EAST;
			gbc_jLabelisDeleteKs.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelisDeleteKs.gridx = 2;
			gbc_jLabelisDeleteKs.gridy = 0;
			jPanelFiltrosSettingsKeystore.add (getJLabelisDeleteKs (), gbc_jLabelisDeleteKs);
			GridBagConstraints gbc_jComboBoxisDeleteKs = new GridBagConstraints ();
			gbc_jComboBoxisDeleteKs.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxisDeleteKs.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxisDeleteKs.gridx = 3;
			gbc_jComboBoxisDeleteKs.gridy = 0;
			jPanelFiltrosSettingsKeystore.add (getJComboBoxisDeleteKs (), gbc_jComboBoxisDeleteKs);
			GridBagConstraints gbc_jLabelisResetPasswordKs = new GridBagConstraints ();
			gbc_jLabelisResetPasswordKs.anchor = GridBagConstraints.EAST;
			gbc_jLabelisResetPasswordKs.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelisResetPasswordKs.gridx = 4;
			gbc_jLabelisResetPasswordKs.gridy = 0;
			jPanelFiltrosSettingsKeystore.add (getJLabelisResetPasswordKs (), gbc_jLabelisResetPasswordKs);
			GridBagConstraints gbc_jComboBoxisResetPasswordKs = new GridBagConstraints ();
			gbc_jComboBoxisResetPasswordKs.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxisResetPasswordKs.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxisResetPasswordKs.gridx = 5;
			gbc_jComboBoxisResetPasswordKs.gridy = 0;
			jPanelFiltrosSettingsKeystore.add (getJComboBoxisResetPasswordKs (), gbc_jComboBoxisResetPasswordKs);
			GridBagConstraints gbc_jLabelTradeNameSettingsKeystore = new GridBagConstraints ();
			gbc_jLabelTradeNameSettingsKeystore.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeNameSettingsKeystore.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelTradeNameSettingsKeystore.gridx = 0;
			gbc_jLabelTradeNameSettingsKeystore.gridy = 1;
			jPanelFiltrosSettingsKeystore.add (getJLabelTradeNameSettingsKeystore (), gbc_jLabelTradeNameSettingsKeystore);
			GridBagConstraints gbc_jTextFieldTradeNameSettingsKeystore = new GridBagConstraints();
			gbc_jTextFieldTradeNameSettingsKeystore.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldTradeNameSettingsKeystore.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldTradeNameSettingsKeystore.gridx = 1;
			gbc_jTextFieldTradeNameSettingsKeystore.gridy = 1;
			jPanelFiltrosSettingsKeystore.add(getJTextFieldTradeNameSettingsKeystore(), gbc_jTextFieldTradeNameSettingsKeystore);
		}
		
		return jPanelFiltrosSettingsKeystore;
	}
	
	private JButton getJButtonAplicarSettingsKeystore ()
	{
		if (jButtonAplicarSettingsKeystore == null)
		{
			jButtonAplicarSettingsKeystore = new JButton ();
			jButtonAplicarSettingsKeystore.setText ("Aplicar");
			jButtonAplicarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAplicarSettingsKeystore ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarSettingsKeystore ().setToolTipText ("SETTINGSKEYSTORE.idCompany = Company.IdCompany");
													
							if (! getJTextFieldcuil ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarSettingsKeystore ().setToolTipText (getJButtonAplicarSettingsKeystore ().getToolTipText () == null ? "" : getJButtonAplicarSettingsKeystore ().getToolTipText ().toString () + " AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'");
														
							if (getJComboBoxisDeleteKs ().getSelectedIndex () > 0)
														
								getJButtonAplicarSettingsKeystore ().setToolTipText (getJButtonAplicarSettingsKeystore ().getToolTipText () == null ? "" : getJButtonAplicarSettingsKeystore ().getToolTipText ().toString () + " AND (isDeleteKs " + (getJComboBoxisDeleteKs ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR isDeleteKs = 0)"));
													
							if (getJComboBoxisResetPasswordKs ().getSelectedIndex () > 0)
														
								getJButtonAplicarSettingsKeystore ().setToolTipText (getJButtonAplicarSettingsKeystore ().getToolTipText () == null ? "" : getJButtonAplicarSettingsKeystore ().getToolTipText ().toString () + " AND (isResetPasswordKs " + (getJComboBoxisResetPasswordKs ().getSelectedItem ().toString ().equals ("Verdadero") ? "= 1)" : "IS NULL OR isResetPasswordKs = 0)"));
													
							if (! getJTextFieldTradeNameSettingsKeystore ().getText ().toString ().isEmpty ())
														
								getJButtonAplicarSettingsKeystore ().setToolTipText (getJButtonAplicarSettingsKeystore ().getToolTipText () == null ? "" : getJButtonAplicarSettingsKeystore ().getToolTipText ().toString () + " AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'");
													
							Utilidades.cargarTable (getJTableSettingsKeystore (), "SETTINGSKEYSTORE, Company", "cuil, CASE WHEN isDeleteKs = 1 THEN 'Verdadero' ELSE 'Falso' END AS isDeleteKs, CASE WHEN isResetPasswordKs = 1 THEN 'Verdadero' ELSE 'Falso' END AS isResetPasswordKs, TradeName", getJButtonAplicarSettingsKeystore ().getToolTipText () == null ? "" : getJButtonAplicarSettingsKeystore ().getToolTipText ().toString (), "cuil");
							getJTableSettingsKeystore ().requestFocus ();
							getJButtonAplicarSettingsKeystore ().setToolTipText (null);
							getJPanelSettingsKeystore ().setBorder (BorderFactory.createTitledBorder (null, "SettingsKeystore - Cantidad de registros: " + getJTableSettingsKeystore ().getRowCount (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
							getJButtonEliminarSettingsKeystore ().setEnabled (getJTableSettingsKeystore ().getRowCount () > 0);
							getJMenuItemEliminarSettingsKeystore ().setEnabled (getJTableSettingsKeystore ().getRowCount () > 0);
							getJButtonModificarSettingsKeystore ().setEnabled (getJTableSettingsKeystore ().getRowCount () > 0);
							getJMenuItemModificarSettingsKeystore ().setEnabled (getJTableSettingsKeystore ().getRowCount () > 0);
							getJButtonAplicarSettingsKeystore ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())

						new Thread (runnable).start ();

					else

						try
						{
							SwingUtilities.invokeAndWait (runnable);
						}

						catch (InvocationTargetException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}

						catch (InterruptedException e1)
						{
							JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
						}
				}
			}
			);
		}
		
		return jButtonAplicarSettingsKeystore;
	}
	
	private JPanel getJPanelABMSettingsKeystore ()
	{
		if (jPanelABMSettingsKeystore == null)
		{
			jPanelABMSettingsKeystore = new JPanel ();
			GridBagLayout gbl_jPanelABMSettingsKeystore = new GridBagLayout ();
			gbl_jPanelABMSettingsKeystore.columnWidths = new int [] {75, 0};
			gbl_jPanelABMSettingsKeystore.rowHeights = new int [] {23, 23, 23, 0};
			gbl_jPanelABMSettingsKeystore.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelABMSettingsKeystore.rowWeights = new double [] {0.0, 0.0, 0.0, Double.MIN_VALUE};
			jPanelABMSettingsKeystore.setLayout (gbl_jPanelABMSettingsKeystore);
			GridBagConstraints gbc_jButtonAgregarSettingsKeystore = new GridBagConstraints ();
			gbc_jButtonAgregarSettingsKeystore.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonAgregarSettingsKeystore.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonAgregarSettingsKeystore.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonAgregarSettingsKeystore.gridx = 0;
			gbc_jButtonAgregarSettingsKeystore.gridy = 0;
			jPanelABMSettingsKeystore.add (getJButtonAgregarSettingsKeystore (), gbc_jButtonAgregarSettingsKeystore);
			GridBagConstraints gbc_jButtonEliminarSettingsKeystore = new GridBagConstraints ();
			gbc_jButtonEliminarSettingsKeystore.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonEliminarSettingsKeystore.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonEliminarSettingsKeystore.insets = new Insets (0, 0, 5, 0);
			gbc_jButtonEliminarSettingsKeystore.gridx = 0;
			gbc_jButtonEliminarSettingsKeystore.gridy = 1;
			jPanelABMSettingsKeystore.add (getJButtonEliminarSettingsKeystore (), gbc_jButtonEliminarSettingsKeystore);
			GridBagConstraints gbc_jButtonModificarSettingsKeystore = new GridBagConstraints ();
			gbc_jButtonModificarSettingsKeystore.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonModificarSettingsKeystore.anchor = GridBagConstraints.SOUTH;
			gbc_jButtonModificarSettingsKeystore.gridx = 0;
			gbc_jButtonModificarSettingsKeystore.gridy = 2;
			jPanelABMSettingsKeystore.add (getJButtonModificarSettingsKeystore (), gbc_jButtonModificarSettingsKeystore);
		}
		
		return jPanelABMSettingsKeystore;
	}
	
	private JButton getJButtonAgregarSettingsKeystore ()
	{
		if (jButtonAgregarSettingsKeystore == null)
		{
			jButtonAgregarSettingsKeystore = new JButton ();
			jButtonAgregarSettingsKeystore.setText ("Agregar");
			jButtonAgregarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonAgregarSettingsKeystore ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMSettingsKeystore (null, getJButtonAgregarSettingsKeystore ().getText ().toString (), null, null, null, null);
							getJButtonAplicarSettingsKeystore ().doClick ();
							getJButtonAgregarSettingsKeystore ().setEnabled (true);
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
		
		return jButtonAgregarSettingsKeystore;
	}
	
	private JButton getJButtonEliminarSettingsKeystore ()
	{
		if (jButtonEliminarSettingsKeystore == null)
		{
			jButtonEliminarSettingsKeystore = new JButton ();
			jButtonEliminarSettingsKeystore.setText ("Eliminar");
			jButtonEliminarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					if (JOptionPane.showConfirmDialog (null, "�Esta seguro que desea eliminar el SettingsKeystore para el C.U.I.L. " + getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 0).toString () + ", de la empresa " + getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 3).toString () + "?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					{
						getJButtonEliminarSettingsKeystore ().setToolTipText ("cuil = '" + getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 0).toString () + "' AND idCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 3).toString () + "'"));
						
						if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
						{
							if (Utilidades.eliminarAtributo ("SETTINGSKEYSTORE", getJButtonEliminarSettingsKeystore ().getToolTipText ().toString ()))
							{
								Utilidades.finalizarTransaccionALaBaseDeDatos ();
								JOptionPane.showMessageDialog (null, "Registro eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
							}
							
							Utilidades.finalizarConexionALaBaseDeDatos ();
						}
						
						getJButtonEliminarSettingsKeystore ().setToolTipText (null);
						getJButtonAplicarSettingsKeystore ().doClick ();
					}
				}
			}
			);
		}
		
		return jButtonEliminarSettingsKeystore;
	}
	
	private JButton getJButtonModificarSettingsKeystore ()
	{
		if (jButtonModificarSettingsKeystore == null)
		{
			jButtonModificarSettingsKeystore = new JButton ();
			jButtonModificarSettingsKeystore.setText ("Modificar");
			jButtonModificarSettingsKeystore.addActionListener (new java.awt.event.ActionListener ()
			{
				public void actionPerformed (java.awt.event.ActionEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJButtonModificarSettingsKeystore ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							new AMSettingsKeystore (null, getJButtonModificarSettingsKeystore ().getText ().toString (), getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 0).toString (), getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 1).toString (), getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 2).toString (), getJTableSettingsKeystore ().getValueAt (getJTableSettingsKeystore ().getSelectedRow (), 3).toString ());
							getJButtonAplicarSettingsKeystore ().doClick ();
							getJButtonModificarSettingsKeystore ().setEnabled (true);
							setEnabled (true);
							setCursor (new Cursor (Cursor.DEFAULT_CURSOR));
							cargando.dispose ();
						}
					};

					if (SwingUtilities.isEventDispatchThread ())

						new Thread (runnable).start ();
				}
			}
			);
		}
		
		return jButtonModificarSettingsKeystore;
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
			jComboBoxenviarEmail = new JComboBox  <String> ();
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
			jComboBoxreenviarEmail = new JComboBox  <String> ();
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
			jComboBoxenviarGeneracionClaves = new JComboBox  <String> ();
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
	
	private JComboBox <String> getJComboBoxbloquearFechaPrevia ()
	{
		if (jComboBoxbloquearFechaPrevia == null)
		{
			jComboBoxbloquearFechaPrevia = new JComboBox  <String> ();
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
			jComboBoxenviarFirmadoEmpleador = new JComboBox  <String> ();
		}
		
		return jComboBoxenviarFirmadoEmpleador;
	}
	
	private JLabel getJLabelCompanyCuitFormatDescription ()
	{
		if (jLabelCompanyCuitFormatDescription == null)
		{
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
		if (jComboBoxCompanyTypedenomination == null)
		{
			jComboBoxCompanyTypedenomination = new JComboBox <String> ();
		}
		
		return jComboBoxCompanyTypedenomination;
	}
	
	private JLabel getJLabelCountryStateDescriptionCompany ()
	{
		if (jLabelCountryStateDescriptionCompany == null)
		{
			jLabelCountryStateDescriptionCompany = new JLabel ("CountryStateDescription:");
		}
		
		return jLabelCountryStateDescriptionCompany;
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

							if (getJComboBoxCountryStateDescription ().getSelectedIndex () > 0)
							{
								Utilidades.cargarComboBox (getJComboBoxlocalidadName (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "localidadName", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'");
								getJLabellocalidadName ().setEnabled (true);
								getJComboBoxlocalidadName ().setEnabled (true);
							}

							else
							{
								getJComboBoxlocalidadName ().removeAllItems ();
								getJLabellocalidadName ().setEnabled (false);
								getJComboBoxlocalidadName ().setEnabled (false);
							}

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

							try
							{
								SwingUtilities.invokeAndWait (runnable);
							}

							catch (InvocationTargetException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}

							catch (InterruptedException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}
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

							if (getJComboBoxcountryName ().getSelectedIndex () > 0)
							{
								Utilidades.cargarComboBox (getJComboBoxCountryStateDescription (), false, "Company, CompanyCuitFormat, CompanyAgreementType, IvaCondition, OrganizationType, CountryState, Localidad, Country", "CountryState.Description", "Company.IdCompanyCuitFormat = CompanyCuitFormat.IdCompanyCuitFormat AND Company.IdCompanyAgreementType = CompanyAgreementType.IdCompanyAgreementType AND Company.IdIvaCondition = IvaCondition.IdCondition AND Company.IdCompanyType = OrganizationType.IdEmpTipo AND Company.IdProv = CountryState.IdCountryState AND Company.IdLoca = Localidad.IdLocalidad AND Company.IdPais = Country.IdCountry AND countryName = '" + getJComboBoxcountryName ().getSelectedItem ().toString () + "'");
								getJLabelCountryStateDescriptionCompany ().setEnabled (true);
								getJComboBoxCountryStateDescription ().setEnabled (true);
							}

							else
							{
								if (getJComboBoxCountryStateDescription ().getSelectedIndex () > 0)
								{
									getJComboBoxlocalidadName ().removeAllItems ();
									getJLabellocalidadName ().setEnabled (false);
									getJComboBoxlocalidadName ().setEnabled (false);
								}
																
								getJComboBoxCountryStateDescription ().removeAllItems ();
								getJLabelCountryStateDescriptionCompany ().setEnabled (false);
								getJComboBoxCountryStateDescription ().setEnabled (false);
							}

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

							try
							{
								SwingUtilities.invokeAndWait (runnable);
							}

							catch (InvocationTargetException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}

							catch (InterruptedException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}
					}
				}
			}
			);
		}
		
		return jComboBoxcountryName;
	}
	
	private JLabel getJLabelIdUserRolesEmpleados ()
	{
		if (jLabelIdUserRolesEmpleados == null)
		{
			jLabelIdUserRolesEmpleados = new JLabel ("IdUser:");
		}
		return jLabelIdUserRolesEmpleados;
	}
	
	private JTextField getJTextFieldIdUserRolesEmpleados ()
	{
		if (jTextFieldIdUserRolesEmpleados == null)
		{
			jTextFieldIdUserRolesEmpleados = new JTextField ();
			jTextFieldIdUserRolesEmpleados.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldIdUserRolesEmpleados ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldIdUserRolesEmpleados ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									getJTextFieldTradeNameRolesEmpleados ().setText ("");
									getJButtonAplicarRolesEmpleados ().doClick ();
									getJTextFieldIdUserRolesEmpleados ().setEnabled (true);
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
						
						else if (getTextAutoCompleterIdUserRolesEmpleados ().itemExists (getJTextFieldIdUserRolesEmpleados ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldIdUserRolesEmpleados ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
									getJButtonAplicarRolesEmpleados ().doClick ();
									getJTextFieldIdUserRolesEmpleados ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldIdUserRolesEmpleados;
	}
	
	private TextAutoCompleter getTextAutoCompleterIdUserRolesEmpleados ()
	{
		if (textAutoCompleterIdUserRolesEmpleados == null)
		{
			textAutoCompleterIdUserRolesEmpleados = new TextAutoCompleter (getJTextFieldIdUserRolesEmpleados (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + getJTextFieldIdUserRolesEmpleados ().getText ().toString () + "'");
							getJButtonAplicarRolesEmpleados ().doClick ();
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
		
		return textAutoCompleterIdUserRolesEmpleados;
	}
	
	private JLabel getJLabelTradeNameRolesEmpleados ()
	{
		if (jLabelTradeNameRolesEmpleados == null)
		{
			jLabelTradeNameRolesEmpleados = new JLabel ("TradeName:");
		}
		
		return jLabelTradeNameRolesEmpleados;
	}
	
	private JTextField getJTextFieldTradeNameRolesEmpleados ()
	{
		if (jTextFieldTradeNameRolesEmpleados == null)
		{
			jTextFieldTradeNameRolesEmpleados = new JTextField ();
			jTextFieldTradeNameRolesEmpleados.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameRolesEmpleados ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameRolesEmpleados ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									getJTextFieldIdUserRolesEmpleados ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany");
									getJButtonAplicarRolesEmpleados ().doClick ();
									getJTextFieldTradeNameRolesEmpleados ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameRolesEmpleados ().itemExists (getJTextFieldTradeNameRolesEmpleados ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameRolesEmpleados ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
									getJButtonAplicarRolesEmpleados ().doClick ();
									getJTextFieldTradeNameRolesEmpleados ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameRolesEmpleados;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameRolesEmpleados ()
	{
		if (textAutoCompleterTradeNameRolesEmpleados == null)
		{
			textAutoCompleterTradeNameRolesEmpleados = new TextAutoCompleter (getJTextFieldTradeNameRolesEmpleados (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxNombre (), false, "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "Nombre", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameRolesEmpleados (), "RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "TradeName", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameRolesEmpleados ().getText ().toString () + "'");
							getJButtonAplicarRolesEmpleados ().doClick ();
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
		
		return textAutoCompleterTradeNameRolesEmpleados;
	}
	
	private JLabel getJLabelcuil ()
	{
		if (jLabelcuil == null)
		{
			jLabelcuil = new JLabel ("cuil:");
		}

		return jLabelcuil;
	}
	
	private JTextField getJTextFieldcuil ()
	{
		if (jTextFieldcuil == null)
		{
			jTextFieldcuil = new JTextField ();
			jTextFieldcuil.addKeyListener(new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldcuil ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldcuil ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompletercuil (), "SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
									Utilidades.cargarComboBoxBoolean (getJComboBoxisDeleteKs (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxisResetPasswordKs (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameSettingsKeystore (), "SETTINGSKEYSTORE, Company", "TradeName", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
									getJTextFieldTradeNameSettingsKeystore ().setText ("");
									getJButtonAplicarSettingsKeystore ().doClick ();
									getJTextFieldcuil ().setEnabled (true);
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
						
						else if (getTextAutoCompletercuil ().itemExists (getJTextFieldcuil ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJLabelcuil ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJComboBoxisDeleteKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isDeleteKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
									getJComboBoxisResetPasswordKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isResetPasswordKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
									getJTextFieldTradeNameSettingsKeystore ().setText (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "TradeName", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
									getJButtonAplicarSettingsKeystore ().doClick ();
									getJLabelcuil ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldcuil;
	}
	
	private TextAutoCompleter getTextAutoCompletercuil ()
	{
		if (textAutoCompletercuil == null)
		{
			textAutoCompletercuil = new TextAutoCompleter (getJTextFieldcuil (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJComboBoxisDeleteKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isDeleteKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
							getJComboBoxisResetPasswordKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isResetPasswordKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
							getJTextFieldTradeNameSettingsKeystore ().setText (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "TradeName", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND cuil = '" + getJTextFieldcuil ().getText ().toString () + "'"));
							getJButtonAplicarSettingsKeystore ().doClick ();
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
		
		return textAutoCompletercuil;
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
	
	private JLabel getJLabelTradeNameSettingsKeystore ()
	{
		if (jLabelTradeNameSettingsKeystore == null)
		{
			jLabelTradeNameSettingsKeystore = new JLabel ("TradeName:");
		}
		
		return jLabelTradeNameSettingsKeystore;
	}
	
	private JTextField getJTextFieldTradeNameSettingsKeystore ()
	{
		if (jTextFieldTradeNameSettingsKeystore == null)
		{
			jTextFieldTradeNameSettingsKeystore = new JTextField ();
			jTextFieldTradeNameSettingsKeystore.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed(KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameSettingsKeystore ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameSettingsKeystore ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompletercuil (), "SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
									getJTextFieldcuil ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxisDeleteKs (), false);
									Utilidades.cargarComboBoxBoolean (getJComboBoxisResetPasswordKs (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameSettingsKeystore (), "SETTINGSKEYSTORE, Company", "TradeName", "SETTINGSKEYSTORE.idCompany = Company.IdCompany");
									getJButtonAplicarSettingsKeystore ().doClick ();
									getJTextFieldTradeNameSettingsKeystore ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameSettingsKeystore ().itemExists (getJTextFieldTradeNameSettingsKeystore ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameSettingsKeystore ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompletercuil (), "SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'");
									getJTextFieldcuil ().setText (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
									getJComboBoxisDeleteKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isDeleteKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
									getJComboBoxisResetPasswordKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isResetPasswordKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
									getJButtonAplicarSettingsKeystore ().doClick ();
									getJTextFieldTradeNameSettingsKeystore ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameSettingsKeystore;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameSettingsKeystore ()
	{
		if (textAutoCompleterTradeNameSettingsKeystore == null)
		{
			textAutoCompleterTradeNameSettingsKeystore = new TextAutoCompleter (getJTextFieldTradeNameSettingsKeystore (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarTextAutoCompleter (getTextAutoCompletercuil (), "SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'");
							getJTextFieldcuil ().setText (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "cuil", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
							getJComboBoxisDeleteKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isDeleteKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
							getJComboBoxisResetPasswordKs ().setSelectedItem (Utilidades.devolverAtributoClave ("SETTINGSKEYSTORE, Company", "isResetPasswordKs", "SETTINGSKEYSTORE.idCompany = Company.IdCompany AND TradeName = '" + getJTextFieldTradeNameSettingsKeystore ().getText ().toString () + "'"));
							getJButtonAplicarSettingsKeystore ().doClick ();
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
		
		return textAutoCompleterTradeNameSettingsKeystore;
	}
	
	private JLabel getJLabelCompanySectionDescription ()
	{
		if (jLabelDescriptionCompanySectionEmployee == null)
		{
			jLabelDescriptionCompanySectionEmployee = new JLabel ("CompanySectionDescription:");
		}
		
		return jLabelDescriptionCompanySectionEmployee;
	}
	
	private JComboBox <String> getJComboBoxCompanySectionDescription ()
	{
		if (jComboBoxDescriptionCompanySectionEmployee == null)
		{
			jComboBoxDescriptionCompanySectionEmployee = new JComboBox <String> ();
			jComboBoxDescriptionCompanySectionEmployee.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxCompanySectionDescription ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							if (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0)
							{
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
							}

							else
							{
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0 ? " AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
							}

							getJComboBoxCompanySectionDescription ().setEnabled (true);
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

							try
							{
								SwingUtilities.invokeAndWait (runnable);
							}

							catch (InvocationTargetException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}

							catch (InterruptedException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}
					}
				}
			}
			);
		}
		
		return jComboBoxDescriptionCompanySectionEmployee;
	}
	
	private JLabel getJLabelCompanySubsidiaryDescription ()
	{
		if (jLabelDescriptionCompanySubsidiaryEmployee == null)
		{
			jLabelDescriptionCompanySubsidiaryEmployee = new JLabel ("CompanySubsidiaryDescription:");
		}
		
		return jLabelDescriptionCompanySubsidiaryEmployee;
	}
	
	private JComboBox <String> getJComboBoxCompanySubsidiaryDescription ()
	{
		if (jComboBoxDescriptionCompanySubsidiaryEmployee == null)
		{
			jComboBoxDescriptionCompanySubsidiaryEmployee = new JComboBox <String> ();
			jComboBoxDescriptionCompanySubsidiaryEmployee.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							getJComboBoxCompanySubsidiaryDescription ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							if (getJComboBoxCompanySubsidiaryDescription ().getSelectedIndex () > 0)
							{
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND CompanySubsidiary.Description = '" + getJComboBoxCompanySubsidiaryDescription ().getSelectedItem ().toString () + "'" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
							}

							else
							{
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
								Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType" + (getJComboBoxCompanySectionDescription ().getSelectedIndex () > 0 ? " AND CompanySection.Description = '" + getJComboBoxCompanySectionDescription ().getSelectedItem ().toString () + "'" : "") + (! getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty () ? " AND Tradename = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'" : ""));
							}

							getJComboBoxCompanySubsidiaryDescription ().setEnabled (true);
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

							try
							{
								SwingUtilities.invokeAndWait (runnable);
							}

							catch (InvocationTargetException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}

							catch (InterruptedException e1)
							{
								JOptionPane.showMessageDialog (null, e1.getMessage ().toString (), getTitle ().toString (), JOptionPane.ERROR_MESSAGE);
							}
					}
				}
			}
			);
		}
		
		return jComboBoxDescriptionCompanySubsidiaryEmployee;
	}
	
	private JLabel getJLabelTradeNameEmployee ()
	{
		if (jLabelTradeNameEmployee == null)
		{
			jLabelTradeNameEmployee = new JLabel ("TradeName:");
		}

		return jLabelTradeNameEmployee;
	}
	
	private JTextField getJTextFieldTradeNameEmployee ()
	{
		if (jTextFieldTradeNameEmployee == null)
		{
			jTextFieldTradeNameEmployee = new JTextField ();
			jTextFieldTradeNameEmployee.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed(KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldTradeNameEmployee ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldTradeNameEmployee ().setEnabled (true);
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
						
						else if (getTextAutoCompleterTradeNameEmployee ().itemExists (getJTextFieldTradeNameEmployee ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldTradeNameEmployee ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber AS EmployeeAccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description AS CompanySectionDescription", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description AS CompanySubsidiaryDescription", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");							
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee", "Citizenship", null);
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee", "Address", null);
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee", "Location", null);							
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldTradeNameEmployee ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldTradeNameEmployee;
	}
	
	private TextAutoCompleter getTextAutoCompleterTradeNameEmployee ()
	{
		if (textAutoCompleterTradeNameEmployee == null)
		{
			textAutoCompleterTradeNameEmployee = new TextAutoCompleter (getJTextFieldTradeNameEmployee (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber AS EmployeeAccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
							Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description AS CompanySectionDescription", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");
							Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description AS CompanySubsidiaryDescription", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType AND TradeName = '" + getJTextFieldTradeNameEmployee ().getText ().toString () + "'");							
							Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
							Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee", "Citizenship", null);
							Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee", "Address", null);
							Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee", "Location", null);							
							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterTradeNameEmployee;
	}
	
	private JLabel getJLabelCuil ()
	{
		if (jLabelCuil == null)
		{
			jLabelCuil = new JLabel ("Cuil:");
		}
		
		return jLabelCuil;
	}
	
	private JTextField getJTextFieldCuil ()
	{
		if (jTextFieldCuil == null)
		{
			jTextFieldCuil = new JTextField ();
			jTextFieldCuil.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldCuil ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuil ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCuil ().setEnabled (true);
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
						
						else if (getTextAutoCompleterCuil ().itemExists (getJTextFieldCuil ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCuil ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCuil ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldCuil;
	}
	
	private TextAutoCompleter getTextAutoCompleterCuil ()
	{
		if (textAutoCompleterCuil == null)
		{
			textAutoCompleterCuil = new TextAutoCompleter (getJTextFieldCuil (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterCuil;
	}
	
	private JLabel getJLabelCitizenship ()
	{
		if (jLabelCitizenship == null)
		{
			jLabelCitizenship = new JLabel ("Citizenship:");
		}
		
		return jLabelCitizenship;
	}
	
	private JComboBox <String> getJComboBoxCitizenship ()
	{
		if (jComboBoxCitizenship == null)
		{
			jComboBoxCitizenship = new JComboBox <String> ();
		}
		
		return jComboBoxCitizenship;
	}
	
	private JLabel getJLabelCountryStateDescriptionEmployee ()
	{
		if (jLabelCountryStateDescriptionEmployee == null)
		{
			jLabelCountryStateDescriptionEmployee = new JLabel ("CountryStateDescription:");
		}
		
		return jLabelCountryStateDescriptionEmployee;
	}
	
	private JComboBox <String> getJComboBoxCountryStateDescriptionEmployee ()
	{
		if (jComboBoxCountryStateDescriptionEmployee == null)
		{
			jComboBoxCountryStateDescriptionEmployee = new JComboBox <String> ();
		}
		
		return jComboBoxCountryStateDescriptionEmployee;
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
	
	private JComboBox <String> getJComboBoxAddress ()
	{
		if (jComboBoxAddress == null)
		{
			jComboBoxAddress = new JComboBox <String> ();
		}
		
		return jComboBoxAddress;
	}
	private JLabel getJLabelLocation ()
	{
		if (jLabelLocation == null)
		{
			jLabelLocation = new JLabel ("Location:");
		}
		
		return jLabelLocation;
	}
	
	private JComboBox <String> getJComboBoxLocation ()
	{
		if (jComboBoxLocation == null)
		{
			jComboBoxLocation = new JComboBox <String> ();
		}
		
		return jComboBoxLocation;
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
			jTextFieldCitizenshipDocumentNumber.addKeyListener(new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldCitizenshipDocumentNumber ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCitizenshipDocumentNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCitizenshipDocumentNumber ().setEnabled (true);
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
						
						else if (getTextAutoCompleterCitizenshipDocumentNumber ().itemExists (getJTextFieldCitizenshipDocumentNumber ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCitizenshipDocumentNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCitizenshipDocumentNumber ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldCitizenshipDocumentNumber;
	}
	
	private TextAutoCompleter getTextAutoCompleterCitizenshipDocumentNumber ()
	{
		if (textAutoCompleterCitizenshipDocumentNumber == null)
		{
			textAutoCompleterCitizenshipDocumentNumber = new TextAutoCompleter (getJTextFieldCitizenshipDocumentNumber (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterCitizenshipDocumentNumber;
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
			jLabelFirstName = new JLabel ("FirstName:");
		}
		
		return jLabelFirstName;
	}
	
	private JTextField getJTextFieldFirstName ()
	{
		if (jTextFieldFirstName == null)
		{
			jTextFieldFirstName = new JTextField ();
			jTextFieldFirstName.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldFirstName ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldFirstName ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldFirstName ().setEnabled (true);
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
						
						else if (getTextAutoCompleterFirstName ().itemExists (getJTextFieldFirstName ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldFirstName ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldFirstName ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldFirstName;
	}
	
	private TextAutoCompleter getTextAutoCompleterFirstName ()
	{
		if (textAutoCompleterFirstName == null)
		{
			textAutoCompleterFirstName = new TextAutoCompleter (getJTextFieldFirstName (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterFirstName;
	}
	
	private JLabel getJLabelLastName ()
	{
		if (jLabelLastName == null)
		{
			jLabelLastName = new JLabel ("LastName:");
		}
		
		return jLabelLastName;
	}
	
	private JTextField getJTextFieldCurrentPhoneNumber ()
	{
		if (jTextFieldCurrentPhoneNumber == null)
		{
			jTextFieldCurrentPhoneNumber = new JTextField ();
			jTextFieldCurrentPhoneNumber.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldCurrentPhoneNumber ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCurrentPhoneNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCurrentPhoneNumber ().setEnabled (true);
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
						
						else if (getTextAutoCompleterCurrentPhoneNumber ().itemExists (getJTextFieldCurrentPhoneNumber ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldCurrentPhoneNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldCurrentPhoneNumber ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldCurrentPhoneNumber;
	}
	
	private TextAutoCompleter getTextAutoCompleterCurrentPhoneNumber ()
	{
		if (textAutoCompleterCurrentPhoneNumber == null)
		{
			textAutoCompleterCurrentPhoneNumber = new TextAutoCompleter (getJTextFieldCurrentPhoneNumber (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterCurrentPhoneNumber;
	}
	
	private JTextField getJTextFieldLastName ()
	{
		if (jTextFieldLastName == null)
		{
			jTextFieldLastName = new JTextField ();
			jTextFieldLastName.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldLastName ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldLastName ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldMobilePhoneNumber ().setText ("");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldLastName ().setEnabled (true);
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
						
						else if (getTextAutoCompleterLastName ().itemExists (getJTextFieldLastName ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldLastName ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldLastName ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldLastName;
	}
	
	private TextAutoCompleter getTextAutoCompleterLastName ()
	{
		if (textAutoCompleterLastName == null)
		{
			textAutoCompleterLastName = new TextAutoCompleter (getJTextFieldLastName (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterLastName;
	}
	
	private JLabel getJLabelCurrentPhoneNumber ()
	{
		if (jLabelCurrentPhoneNumber == null)
		{
			jLabelCurrentPhoneNumber = new JLabel ("CurrentPhoneNumber:");
		}
		
		return jLabelCurrentPhoneNumber;
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
			jTextFieldMobilePhoneNumber.addKeyListener (new KeyAdapter ()
			{
				public void keyPressed (KeyEvent e)
				{
					if (e.getKeyCode () == KeyEvent.VK_ENTER)
						
						if (getJTextFieldMobilePhoneNumber ().getText ().toString ().isEmpty ())
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldMobilePhoneNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterIdUserEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldIdUserEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterAccountNumberEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.AccountNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldAccountNumberEmployee ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterTradeNameEmployee (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "TradeName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldTradeNameEmployee ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCompanySectionDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySection.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCompanySubsidiaryDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CompanySubsidiary.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCuil (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Cuil", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCuil ().setText ("");
									Utilidades.cargarComboBox (getJComboBoxCitizenship (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Citizenship", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxCountryStateDescriptionEmployee (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CountryState.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeMarriageStatusTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeMarriageStatusType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxAddress (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Employee.Address", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxLocation (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "Location", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJCheckBoxBirthdate ().setSelected (true);
									getJCheckBoxBirthdate ().doClick ();
									getJCheckBoxBirthdate ().setSelected (false);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerBirthdate ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBox (getJComboBoxEmployeeSexTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeSexType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBox (getJComboBoxEmployeeCitizenshipDocTypeDescription (), false, "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "EmployeeCitizenshipDocType.Description", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCitizenshipDocumentNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CitizenshipDocumentNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCitizenshipDocumentNumber ().setText ("");
									getJCheckBoxDateEntry ().setSelected (true);
									getJCheckBoxDateEntry ().doClick ();
									getJCheckBoxDateEntry ().setSelected (false);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateEntry ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									getJCheckBoxDateExit ().setSelected (true);
									getJCheckBoxDateExit ().doClick ();
									getJCheckBoxDateExit ().setSelected (false);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setSelected (true);
									getJDatePickerDateExit ().getJDateInstantPanel ().getModel ().setDate (Integer.valueOf (new GregorianCalendar ().get (Calendar.YEAR)), Integer.valueOf (new GregorianCalendar ().get (Calendar.MONTH)), Integer.valueOf (new GregorianCalendar ().get (Calendar.DATE)));
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsDeleted (), false);
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterFirstName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "FirstName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldFirstName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterLastName (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "LastName", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldLastName ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterCurrentPhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "CurrentPhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									getJTextFieldCurrentPhoneNumber ().setText ("");
									Utilidades.cargarTextAutoCompleter (getTextAutoCompleterMobilePhoneNumber (), "Employee, CompanySection, CompanySubsidiary, Company, CountryState, EmployeeMarriageStatusType, EmployeeSexType, EmployeeCitizenshipDocType", "MobilePhoneNumber", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Employee.IdCountryState = CountryState.IdCountryState AND Employee.IdEmployeeMarriageStatusType = EmployeeMarriageStatusType.IdEmployeeMarriageStatus AND Employee.IdEmployeeSexType = EmployeeSexType.IdEmployeeSexType AND Employee.IdEmployeeCitizenshipDocType = EmployeeCitizenshipDocType.IdEmployeeCitizenshipDocType");
									Utilidades.cargarComboBoxBoolean (getJComboBoxIsFirstTime (), false);
									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldMobilePhoneNumber ().setEnabled (true);
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
						
						else if (getTextAutoCompleterMobilePhoneNumber ().itemExists (getJTextFieldMobilePhoneNumber ().getText ().toString ()))
						{
							Runnable runnable = new Runnable ()
							{
								public void run ()
								{
									getJTextFieldMobilePhoneNumber ().setEnabled (false);
									setEnabled (false);
									setCursor (new Cursor (Cursor.WAIT_CURSOR));

									Cargando cargando = new Cargando ();

									getJButtonAplicarEmployee ().doClick ();
									getJTextFieldMobilePhoneNumber ().setEnabled (true);
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
			}
			);
		}
		
		return jTextFieldMobilePhoneNumber;
	}
	
	private TextAutoCompleter getTextAutoCompleterMobilePhoneNumber ()
	{
		if (textAutoCompleterMobilePhoneNumber == null)
		{
			textAutoCompleterMobilePhoneNumber = new TextAutoCompleter (getJTextFieldMobilePhoneNumber (), new AutoCompleterCallback ()
			{
				public void callback (Object arg0)
				{
					Runnable runnable = new Runnable ()
					{
						public void run ()
						{
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							getJButtonAplicarEmployee ().doClick ();
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
		
		return textAutoCompleterMobilePhoneNumber;
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
	
	private JPanel getJPanelLookAndFeel ()
	{
		if (jPanelLookAndFeel == null)
		{
			jPanelLookAndFeel = new JPanel ();
			jPanelLookAndFeel.setBorder (BorderFactory.createTitledBorder (null, "Look And Feel", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			GridBagLayout gbl_jPanelLookAndFeel = new GridBagLayout();
			gbl_jPanelLookAndFeel.columnWidths = new int[]{135, 28, 127, 28, 36, 28, 0};
			gbl_jPanelLookAndFeel.rowHeights = new int[]{23, 0};
			gbl_jPanelLookAndFeel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_jPanelLookAndFeel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			jPanelLookAndFeel.setLayout(gbl_jPanelLookAndFeel);
			GridBagConstraints gbc_jRadioButtonSystemLookAndFeel = new GridBagConstraints();
			gbc_jRadioButtonSystemLookAndFeel.anchor = GridBagConstraints.NORTHWEST;
			gbc_jRadioButtonSystemLookAndFeel.insets = new Insets(0, 0, 0, 5);
			gbc_jRadioButtonSystemLookAndFeel.gridx = 0;
			gbc_jRadioButtonSystemLookAndFeel.gridy = 0;
			jPanelLookAndFeel.add (getJRadioButtonSystemLookAndFeel (), gbc_jRadioButtonSystemLookAndFeel);
			GridBagConstraints gbc_jComboBoxSystemLookAndFeel = new GridBagConstraints();
			gbc_jComboBoxSystemLookAndFeel.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxSystemLookAndFeel.insets = new Insets(0, 0, 0, 5);
			gbc_jComboBoxSystemLookAndFeel.gridx = 1;
			gbc_jComboBoxSystemLookAndFeel.gridy = 0;
			jPanelLookAndFeel.add (getJComboBoxSystemLookAndFeel (), gbc_jComboBoxSystemLookAndFeel);
			GridBagConstraints gbc_jRadioButtonTattooLookAndFeel = new GridBagConstraints();
			gbc_jRadioButtonTattooLookAndFeel.anchor = GridBagConstraints.NORTHWEST;
			gbc_jRadioButtonTattooLookAndFeel.insets = new Insets(0, 0, 0, 5);
			gbc_jRadioButtonTattooLookAndFeel.gridx = 2;
			gbc_jRadioButtonTattooLookAndFeel.gridy = 0;
			jPanelLookAndFeel.add(getJRadioButtonTattooLookAndFeel(), gbc_jRadioButtonTattooLookAndFeel);
			GridBagConstraints gbc_jComboBoxTattooLookAndFeel = new GridBagConstraints();
			gbc_jComboBoxTattooLookAndFeel.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTattooLookAndFeel.insets = new Insets(0, 0, 0, 5);
			gbc_jComboBoxTattooLookAndFeel.gridx = 3;
			gbc_jComboBoxTattooLookAndFeel.gridy = 0;
			jPanelLookAndFeel.add(getJComboBoxTattooLookAndFeel(), gbc_jComboBoxTattooLookAndFeel);
			GridBagConstraints gbc_jLabelTheme = new GridBagConstraints();
			gbc_jLabelTheme.anchor = GridBagConstraints.WEST;
			gbc_jLabelTheme.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelTheme.gridx = 4;
			gbc_jLabelTheme.gridy = 0;
			jPanelLookAndFeel.add(getJLabelTheme(), gbc_jLabelTheme);
			GridBagConstraints gbc_jComboBoxTheme = new GridBagConstraints();
			gbc_jComboBoxTheme.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxTheme.gridx = 5;
			gbc_jComboBoxTheme.gridy = 0;
			jPanelLookAndFeel.add(getJComboBoxTheme(), gbc_jComboBoxTheme);
		}
		
		return jPanelLookAndFeel;
	}
	
	private JScrollPane getJScrollPaneFiltrosCompany ()
	{
		if (jScrollPaneFiltrosCompany == null)
		{
			jScrollPaneFiltrosCompany = new JScrollPane ();
			jScrollPaneFiltrosCompany.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosCompany.setViewportView (getJPanelFiltrosCompany ());
		}
		
		return jScrollPaneFiltrosCompany;
	}
	
	private JScrollPane getJScrollPaneFiltrosCompanySection ()
	{
		if (jScrollPaneFiltrosCompanySection == null)
		{
			jScrollPaneFiltrosCompanySection = new JScrollPane ();
			jScrollPaneFiltrosCompanySection.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosCompanySection.setViewportView (getJPanelFiltrosCompanySection ());
		}
		
		return jScrollPaneFiltrosCompanySection;
	}
	
	private JScrollPane getJScrollPaneFiltrosCompanySubsidiary ()
	{
		if (jScrollPaneFiltrosCompanySubsidiary == null)
		{
			jScrollPaneFiltrosCompanySubsidiary = new JScrollPane ();
			jScrollPaneFiltrosCompanySubsidiary.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosCompanySubsidiary.setViewportView (getJPanelFiltrosCompanySubsidiary ());
		}
		
		return jScrollPaneFiltrosCompanySubsidiary;
	}
	
	private JScrollPane getJScrollPaneFiltrosConfigurations ()
	{
		if (jScrollPaneFiltrosConfigurations == null)
		{
			jScrollPaneFiltrosConfigurations = new JScrollPane ();
			jScrollPaneFiltrosConfigurations.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosConfigurations.setViewportView (getJPanelFiltrosConfigurations ());
		}
		
		return jScrollPaneFiltrosConfigurations;
	}
	
	private JScrollPane getJScrollPaneFiltrosSettingKeystore ()
	{
		if (jScrollPaneFiltrosSettingKeystore == null)
		{
			jScrollPaneFiltrosSettingKeystore = new JScrollPane ();
			jScrollPaneFiltrosSettingKeystore.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosSettingKeystore.setViewportView (getJPanelFiltrosSettingsKeystore ());
		}
		
		return jScrollPaneFiltrosSettingKeystore;
	}
	
	private JScrollPane getJScrollPaneFiltrosEmployee ()
	{
		if (jScrollPaneFiltrosEmployee == null)
		{
			jScrollPaneFiltrosEmployee = new JScrollPane ();
			jScrollPaneFiltrosEmployee.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosEmployee.setViewportView (getJPanelFiltrosEmployee ());
		}
		
		return jScrollPaneFiltrosEmployee;
	}
	
	private JScrollPane getJScrollPaneFiltrosRolesEmpleados ()
	{
		if (jScrollPaneFiltrosRolesEmpleados == null)
		{
			jScrollPaneFiltrosRolesEmpleados = new JScrollPane ();
			jScrollPaneFiltrosRolesEmpleados.setViewportBorder (BorderFactory.createTitledBorder (null, "Filtros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneFiltrosRolesEmpleados.setViewportView (getJPanelFiltrosRolesEmpleados ());
		}
		
		return jScrollPaneFiltrosRolesEmpleados;
	}
	
	private JScrollPane getJScrollPaneABMCompany ()
	{
		if (jScrollPaneABMCompany == null)
		{
			jScrollPaneABMCompany = new JScrollPane ();
			jScrollPaneABMCompany.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMCompany.setViewportView (getJPanelABMCompany ());
		}
		
		return jScrollPaneABMCompany;
	}
	
	private JScrollPane getJScrollPaneABMCompanySection ()
	{
		if (jScrollPaneABMCompanySection == null)
		{
			jScrollPaneABMCompanySection = new JScrollPane ();
			jScrollPaneABMCompanySection.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMCompanySection.setViewportView (getJPanelABMCompanySection ());
		}
		
		return jScrollPaneABMCompanySection;
	}
	
	private JScrollPane getJScrollPaneABMCompanySubsidiary ()
	{
		if (jScrollPaneABMCompanySubsidiary == null)
		{
			jScrollPaneABMCompanySubsidiary = new JScrollPane ();
			jScrollPaneABMCompanySubsidiary.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMCompanySubsidiary.setViewportView (getJPanelABMCompanySubsidiary ());
		}
		
		return jScrollPaneABMCompanySubsidiary;
	}
	
	private JScrollPane getJScrollPaneABMConfigurations ()
	{
		if (jScrollPaneABMConfigurations == null)
		{
			jScrollPaneABMConfigurations = new JScrollPane ();
			jScrollPaneABMConfigurations.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMConfigurations.setViewportView (getJPanelABMConfigurations ());
		}
		
		return jScrollPaneABMConfigurations;
	}
	
	private JScrollPane getJScrollPaneABMRolesEmpleados ()
	{
		if (jScrollPaneABMRolesEmpleados == null)
		{
			jScrollPaneABMRolesEmpleados = new JScrollPane ();
			jScrollPaneABMRolesEmpleados.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMRolesEmpleados.setViewportView (getJPanelABMRolesEmpleados ());
		}
		
		return jScrollPaneABMRolesEmpleados;
	}
	
	private JScrollPane getJScrollPaneABMSettingsKeystore ()
	{
		if (jScrollPaneABMSettingsKeystore == null)
		{
			jScrollPaneABMSettingsKeystore = new JScrollPane ();
			jScrollPaneABMSettingsKeystore.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMSettingsKeystore.setViewportView (getJPanelABMSettingsKeystore ());
		}
		
		return jScrollPaneABMSettingsKeystore;
	}
	
	private JScrollPane getJScrollPaneABMEmployee ()
	{
		if (jScrollPaneABMEmployee == null)
		{
			jScrollPaneABMEmployee = new JScrollPane ();
			jScrollPaneABMEmployee.setViewportBorder (BorderFactory.createTitledBorder (null, "ABM", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jScrollPaneABMEmployee.setViewportView (getJPanelABMEmployee ());
		}
		
		return jScrollPaneABMEmployee;
	}
}