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

public class AMRolesEmpleados extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelAMRolesEmpleados = null;

	private JLabel jLabelNombre = null;

	private JButton jButtonAceptar = null;

	private JButton jButtonCancelar = null;
	
	private JComboBox <String> jComboBoxNombre = null;
	
	private JLabel jLabelIdUser = null;
	
	private JComboBox<String> jComboBoxIdUser = null;
	
	private JLabel jLabelhashcert;
	
	private JTextField jTextFieldhashcert = null;
	
	private JLabel jLabelTradeName = null;
	
	private JComboBox <String> jComboBoxTradeName = null;
	
	private JPanel jPanelAtributos = null;
	
	private JPanel jPanelAC = null;
	
	private JScrollPane jScrollPaneAtributos = null;
	
	public AMRolesEmpleados (Frame owner, String titulo, String idrol, String idemployee, String hashcert, String tradeName)
	{
		super (owner);
		initialize (titulo, idrol, idemployee, hashcert, tradeName);
	}
	
	private void initialize (String titulo, String idrol, String idemployee, String hashcert, String tradeName)
	{
		this.setIconImage (new ImageIcon (getClass ().getResource ("/Encode.png")).getImage ());
		this.setSize ((int) (Toolkit.getDefaultToolkit ().getScreenSize ().width / 1.26), (int) (Toolkit.getDefaultToolkit ().getScreenSize ().height / 1.34));
		this.setMinimumSize (new Dimension (320, 240));
		this.setModal (true);
		this.setContentPane (getJPanelAMRolesEmpleados ());
		this.setTitle (titulo);
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		Utilidades.metodosAbreviadosAComponentes (getJPanelAMRolesEmpleados (), this, Utilidades.tipoDeVentana.CARGA, false);
		getJPanelAMRolesEmpleados ().setBorder (BorderFactory.createTitledBorder (null, this.getTitle ().toString (), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		Utilidades.cargarComboBox (getJComboBoxNombre (), true, "Rol", "Nombre", null);		
		Utilidades.cargarComboBox (getJComboBoxTradeName (), true, "Company, CompanySection, CompanySubsidiary, Employee", "TradeName", "Company.IdCompany = CompanySection.IdCompany AND Company.IdCompany = CompanySubsidiary.IdCompany AND CompanySection.IdCompanySection = Employee.IdCompanySection AND CompanySubsidiary.IdCompanySubsidiary = Employee.IdCompanySubsidiary");
		
		if (this.getTitle ().toString ().equals ("Modificar"))
		{
			getJComboBoxNombre ().setSelectedItem (idrol);
			getJComboBoxTradeName ().setSelectedItem (tradeName);
			getJComboBoxIdUser ().setSelectedItem (idemployee);
			getJTextFieldhashcert ().setText (hashcert);
			getJButtonAceptar ().setToolTipText ("idrol = " + Utilidades.devolverAtributoClave ("Rol", "IdRol", "Nombre = '" + idrol + "'") + " AND idemployee = " + Utilidades.devolverAtributoClave ("Employee, CompanySection, CompanySubsidiary, Company", "IdEmployee", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND IdUser = '" + idemployee + "' AND TradeName = '" + tradeName + "'"));
		}
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelAMRolesEmpleados ()
	{
		if (jPanelAMRolesEmpleados == null)
		{
			jPanelAMRolesEmpleados = new JPanel ();
			GridBagLayout gbl_jPanelAMRolesEmpleados = new GridBagLayout ();
			gbl_jPanelAMRolesEmpleados.columnWidths = new int [] {871, 0};
			gbl_jPanelAMRolesEmpleados.rowHeights = new int [] {1, 33, 0};
			gbl_jPanelAMRolesEmpleados.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelAMRolesEmpleados.rowWeights = new double [] {1.0, 0.0, Double.MIN_VALUE};
			jPanelAMRolesEmpleados.setLayout (gbl_jPanelAMRolesEmpleados);
			GridBagConstraints gbc_jScrollPaneAtributos = new GridBagConstraints ();
			gbc_jScrollPaneAtributos.fill = GridBagConstraints.BOTH;
			gbc_jScrollPaneAtributos.insets = new Insets (0, 0, 5, 0);
			gbc_jScrollPaneAtributos.gridx = 0;
			gbc_jScrollPaneAtributos.gridy = 0;
			jPanelAMRolesEmpleados.add (getJScrollPaneAtributos (), gbc_jScrollPaneAtributos);
			GridBagConstraints gbc_jPanelAC = new GridBagConstraints ();
			gbc_jPanelAC.fill = GridBagConstraints.BOTH;
			gbc_jPanelAC.gridx = 0;
			gbc_jPanelAC.gridy = 1;
			jPanelAMRolesEmpleados.add (getJPanelAC (), gbc_jPanelAC);
		}
		
		return jPanelAMRolesEmpleados;
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
							
							String rolesEmpleadosidemployee = Utilidades.devolverAtributoClave ("RolesEmpleados, Rol, Employee, CompanySection, CompanySubsidiary, Company", "RolesEmpleados.idemployee", "RolesEmpleados.idrol = Rol.IdRol AND RolesEmpleados.idemployee = Employee.IdEmployee AND Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND Nombre = '" + getJComboBoxNombre ().getSelectedItem ().toString () + "' AND IdUser = '" + getJComboBoxIdUser ().getSelectedItem ().toString () + "' AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'").toString ();
							
							String idRolesEmpleados = (getJButtonAceptar ().getToolTipText () == null ? "" : getJButtonAceptar ().getToolTipText ().toString ()).toString ();
							
							String idRol = Utilidades.devolverAtributoClave ("Rol", "IdRol", "Nombre = '" + getJComboBoxNombre ().getSelectedItem ().toString () + "'").toString ();

							String idEmployee = Utilidades.devolverAtributoClave ("Employee, CompanySection, CompanySubsidiary, Company", "IdEmployee", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'") + " AND CompanySubsidiary.IdCompany = " + Utilidades.devolverAtributoClave ("Company", "IdCompany", "TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'") + " AND IdUser = '" + getJComboBoxIdUser ().getSelectedItem ().toString () + "'").toString ();
							
							if (getTitle ().toString ().equals ("Agregar")
							?
							rolesEmpleadosidemployee.equals ("0")
							:
							idRolesEmpleados.equals ("idrol = " + idRol + " AND idemployee = " + idEmployee)
							?
							! rolesEmpleadosidemployee.equals ("0")
							:
							rolesEmpleadosidemployee.equals ("0")
							)					
							{
								if (Utilidades.iniciarConexionALaBaseDeDatos () && Utilidades.iniciarTransaccionALaBaseDeDatos ())
								{
									if (Utilidades.ejecutarSentenciaDeSqlUpdate (getTitle ().toString ().equals ("Agregar") ? "INSERT INTO RolesEmpleados (idrol, idemployee, hashcert) VALUES (" + idRol + ", " + idEmployee + ", '" + getJTextFieldhashcert ().getText ().toString () + "')" : "UPDATE RolesEmpleados SET idrol = " + idRol + ", idemployee = " + idEmployee + ", hashcert = '" + getJTextFieldhashcert ().getText ().toString () + "' WHERE " + idRolesEmpleados))
									{	
										Utilidades.finalizarTransaccionALaBaseDeDatos ();
										JOptionPane.showMessageDialog (null, getTitle ().toString ().equals ("Agregar") ? "Registro agregado correctamente." : "Registro modificado correctamente.", getTitle ().toString (), JOptionPane.INFORMATION_MESSAGE);
												
										if (getTitle ().toString ().equals ("Agregar"))
										{
											getJTextFieldhashcert ().setText (null);
											getJComboBoxNombre ().requestFocus();
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

								JOptionPane.showMessageDialog (null, "El rol " + getJComboBoxNombre ().getSelectedItem ().toString () + " para el usuario " + getJComboBoxIdUser ().getSelectedItem ().toString () + ", ya est\u00e1 asignado a la empresa " + getJComboBoxTradeName ().getSelectedItem ().toString () + ".", getTitle ().toString () , JOptionPane.ERROR_MESSAGE);

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
	
	private JComboBox <String> getJComboBoxNombre ()
	{
		if (jComboBoxNombre == null)
		{
			jComboBoxNombre = new JComboBox <String> ();
			jComboBoxNombre.addItemListener (new ItemListener ()
			{
				public void itemStateChanged (ItemEvent e)
				{
					if (e.getStateChange () == ItemEvent.SELECTED)
						
						getJTextFieldhashcert ().setEditable (getJComboBoxNombre ().getSelectedItem ().toString ().contains ("Empleado"));
				}
			}
			);
		}
		
		return jComboBoxNombre;
	}
	
	private JLabel getJLabelIdUser ()
	{
		if (jLabelIdUser == null)
		{
			jLabelIdUser = new JLabel ("IdUser:");
		}
		
		return jLabelIdUser;
	}
	
	private JComboBox <String> getJComboBoxIdUser ()
	{
		if (jComboBoxIdUser == null)
		{
			jComboBoxIdUser = new JComboBox <String> ();
		}
		
		return jComboBoxIdUser;
	}
	
	private JLabel getJLabelhashcert ()
	{
		if (jLabelhashcert == null)
		{
			jLabelhashcert = new JLabel ("hashcert:");
		}
		
		return jLabelhashcert;
	}
	
	private JTextField getJTextFieldhashcert ()
	{
		if (jTextFieldhashcert == null)
		{
			jTextFieldhashcert = new JTextField ();
		}
		
		return jTextFieldhashcert;
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
							getJComboBoxTradeName ().setEnabled (false);
							setEnabled (false);
							setCursor (new Cursor (Cursor.WAIT_CURSOR));

							Cargando cargando = new Cargando ();

							Utilidades.cargarComboBox (getJComboBoxIdUser (), true, "Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
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

							Utilidades.cargarComboBox (getJComboBoxIdUser (), true, "Employee, CompanySection, CompanySubsidiary, Company", "IdUser", "Employee.IdCompanySection = CompanySection.IdCompanySection AND Employee.IdCompanySubsidiary = CompanySubsidiary.IdCompanySubsidiary AND CompanySection.IdCompany = Company.IdCompany AND CompanySubsidiary.IdCompany = Company.IdCompany AND TradeName = '" + getJComboBoxTradeName ().getSelectedItem ().toString () + "'");
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
			gbl_jPanelAtributos.columnWidths = new int [] {54, 467, 72, 31, 0};
			gbl_jPanelAtributos.rowHeights = new int [] {22, 22, 0};
			gbl_jPanelAtributos.columnWeights = new double [] {1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelAtributos.rowWeights = new double [] {0.0, 0.0, Double.MIN_VALUE};
			jPanelAtributos.setLayout (gbl_jPanelAtributos);
			jLabelNombre = new JLabel ();
			GridBagConstraints gbc_jLabelNombre = new GridBagConstraints ();
			gbc_jLabelNombre.anchor = GridBagConstraints.EAST;
			gbc_jLabelNombre.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelNombre.gridx = 0;
			gbc_jLabelNombre.gridy = 0;
			jPanelAtributos.add (jLabelNombre, gbc_jLabelNombre);
			jLabelNombre.setText ("Nombre:");
			GridBagConstraints gbc_jComboBoxNombre = new GridBagConstraints ();
			gbc_jComboBoxNombre.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxNombre.insets = new Insets (0, 0, 5, 5);
			gbc_jComboBoxNombre.gridx = 1;
			gbc_jComboBoxNombre.gridy = 0;
			jPanelAtributos.add (getJComboBoxNombre (), gbc_jComboBoxNombre);
			GridBagConstraints gbc_jLabelIdUser = new GridBagConstraints ();
			gbc_jLabelIdUser.anchor = GridBagConstraints.EAST;
			gbc_jLabelIdUser.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelIdUser.gridx = 2;
			gbc_jLabelIdUser.gridy = 0;
			jPanelAtributos.add (getJLabelIdUser (), gbc_jLabelIdUser);
			GridBagConstraints gbc_jComboBoxIdUser = new GridBagConstraints ();
			gbc_jComboBoxIdUser.anchor = GridBagConstraints.WEST;
			gbc_jComboBoxIdUser.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxIdUser.gridx = 3;
			gbc_jComboBoxIdUser.gridy = 0;
			jPanelAtributos.add (getJComboBoxIdUser (), gbc_jComboBoxIdUser);
			GridBagConstraints gbc_jLabelhashcert = new GridBagConstraints ();
			gbc_jLabelhashcert.anchor = GridBagConstraints.EAST;
			gbc_jLabelhashcert.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelhashcert.gridx = 0;
			gbc_jLabelhashcert.gridy = 1;
			jPanelAtributos.add (getJLabelhashcert (), gbc_jLabelhashcert);
			GridBagConstraints gbc_jTextFieldhashcert = new GridBagConstraints ();
			gbc_jTextFieldhashcert.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldhashcert.insets = new Insets (0, 0, 0, 5);
			gbc_jTextFieldhashcert.gridx = 1;
			gbc_jTextFieldhashcert.gridy = 1;
			jPanelAtributos.add (getJTextFieldhashcert (), gbc_jTextFieldhashcert);
			GridBagConstraints gbc_jLabelTradeName = new GridBagConstraints ();
			gbc_jLabelTradeName.anchor = GridBagConstraints.EAST;
			gbc_jLabelTradeName.insets = new Insets (0, 0, 0, 5);
			gbc_jLabelTradeName.gridx = 2;
			gbc_jLabelTradeName.gridy = 1;
			jPanelAtributos.add (getJLabelTradeName (), gbc_jLabelTradeName);
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