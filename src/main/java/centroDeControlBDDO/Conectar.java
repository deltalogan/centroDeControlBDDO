package centroDeControlBDDO;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class Conectar extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelConectar = null;
	
	private JComboBox <String> jComboBoxDriverManager = null;
	
	private JLabel jLabelConectar = null;
	
	private JPanel jPanelDataSourceName = null;
	
	private JLabel jLabelNombreDelServidor = null;
	
	private JTextField jTextFieldNombreDelServidor = null;
	
	private JLabel jLabelNombreDeLaBaseDeDatos = null;
	
	private JTextField jTextFieldNombreDeLaBaseDeDatos = null;
	
	private JLabel jLabelUsuario = null;
	
	private JTextField jTextFieldUsuario = null;
	
	private JLabel jLabelClave = null;
	
	private JPasswordField jPasswordFieldClave = null;
	
	private JButton jButtonAceptar = null;
	
	private JButton jButtonCancelar = null;
	
	public Conectar ()
	{
		super ();
		initialize ();
	}
	
	private void confirmarCerrar ()
	{
		if (JOptionPane.showConfirmDialog (null, "¿Esta seguro que desea cerrar est\u00e1 ventana?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			
			dispose ();
	}
	
	private void initialize ()
	{
		this.setIconImage (new ImageIcon (ClassLoader.getSystemResource("centroDeControlBDDO/Encode.png")).getImage());
		this.setSize (326, 289);
		this.setContentPane (getJPanelConectar ());
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setResizable (false);
		this.setTitle ("Conectar - CDC BDDO v1.0.0.1");
		this.setLocation ((Toolkit.getDefaultToolkit ().getScreenSize ().width - this.getSize ().width) / 2, (Toolkit.getDefaultToolkit ().getScreenSize ().height - this.getSize ().height) / 2);
		getJComboBoxDriverManager ().addItem ("sun.jdbc.odbc.JdbcOdbcDriver");
		getJComboBoxDriverManager ().addItem ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Utilidades.confirmarCerrar (this);
		Utilidades.metodosAbreviadosAComponentes (getJPanelConectar (), this, Utilidades.tipoDeVentana.CARGA, true);
		
		this.setVisible (true);
	}
	
	private JPanel getJPanelConectar ()
	{
		if (jPanelConectar == null)
		{
			jPanelConectar = new JPanel ();
			GridBagLayout gbl_jPanelConectar = new GridBagLayout ();
			gbl_jPanelConectar.columnWidths = new int [] {320, 0};
			gbl_jPanelConectar.rowHeights = new int [] {60, 181, 0};
			gbl_jPanelConectar.columnWeights = new double [] {1.0, Double.MIN_VALUE};
			gbl_jPanelConectar.rowWeights = new double [] {0.0, 1.0, Double.MIN_VALUE};
			jPanelConectar.setLayout (gbl_jPanelConectar);
			GridBagConstraints gbc_jLabelConectar = new GridBagConstraints ();
			gbc_jLabelConectar.fill = GridBagConstraints.BOTH;
			gbc_jLabelConectar.insets = new Insets (0, 0, 5, 0);
			gbc_jLabelConectar.gridx = 0;
			gbc_jLabelConectar.gridy = 0;
			jPanelConectar.add (getJLabelConectar (), gbc_jLabelConectar);
			GridBagConstraints gbc_jPanelDataSourceName = new GridBagConstraints ();
			gbc_jPanelDataSourceName.fill = GridBagConstraints.BOTH;
			gbc_jPanelDataSourceName.gridx = 0;
			gbc_jPanelDataSourceName.gridy = 1;
			jPanelConectar.add (getJPanelDataSourceName (), gbc_jPanelDataSourceName);
		}
		
		return jPanelConectar;
	}
	
	private JComboBox <String> getJComboBoxDriverManager ()
	{
		if (jComboBoxDriverManager == null)
		{
			jComboBoxDriverManager = new JComboBox <String> ();
		}
		
		return jComboBoxDriverManager;
	}
	
	private JLabel getJLabelConectar ()
	{
		if (jLabelConectar == null)
		{
			jLabelConectar = new JLabel ("");			
			jLabelConectar.setIcon (new ImageIcon (ClassLoader.getSystemResource("centroDeControlBDDO/Conectar.jpg")));
		}
		
		return jLabelConectar;
	}
	
	private JPanel getJPanelDataSourceName ()
	{
		if (jPanelDataSourceName == null)
		{
			jPanelDataSourceName = new JPanel ();
			jPanelDataSourceName.setBorder (BorderFactory.createTitledBorder (null, "Data Source Name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			GridBagLayout gbl_jPanelDataSourceName = new GridBagLayout ();
			gbl_jPanelDataSourceName.columnWidths = new int [] {138, 148, 0};
			gbl_jPanelDataSourceName.rowHeights = new int [] {20, 20, 20, 20, 20, 23, 0};
			gbl_jPanelDataSourceName.columnWeights = new double [] {0.0, 1.0, Double.MIN_VALUE};
			gbl_jPanelDataSourceName.rowWeights = new double [] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			jPanelDataSourceName.setLayout (gbl_jPanelDataSourceName);			
			JLabel jLabelDriverManager = new JLabel ("Driver Manager:");
			GridBagConstraints gbc_jLabelDriverManager = new GridBagConstraints ();
			gbc_jLabelDriverManager.anchor = GridBagConstraints.EAST;
			gbc_jLabelDriverManager.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelDriverManager.gridx = 0;
			gbc_jLabelDriverManager.gridy = 0;
			jPanelDataSourceName.add (jLabelDriverManager, gbc_jLabelDriverManager);
			GridBagConstraints gbc_jComboBoxDriverManager = new GridBagConstraints ();
			gbc_jComboBoxDriverManager.anchor = GridBagConstraints.NORTHWEST;
			gbc_jComboBoxDriverManager.insets = new Insets (0, 0, 5, 0);
			gbc_jComboBoxDriverManager.gridx = 1;
			gbc_jComboBoxDriverManager.gridy = 0;
			jPanelDataSourceName.add (getJComboBoxDriverManager (), gbc_jComboBoxDriverManager);
			GridBagConstraints gbc_jLabelNombreDelServidor = new GridBagConstraints ();
			gbc_jLabelNombreDelServidor.anchor = GridBagConstraints.EAST;
			gbc_jLabelNombreDelServidor.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelNombreDelServidor.gridx = 0;
			gbc_jLabelNombreDelServidor.gridy = 1;
			jPanelDataSourceName.add (getJLabelNombreDelServidor (), gbc_jLabelNombreDelServidor);
			GridBagConstraints gbc_jTextFieldNombreDelServidor = new GridBagConstraints ();
			gbc_jTextFieldNombreDelServidor.anchor = GridBagConstraints.NORTH;
			gbc_jTextFieldNombreDelServidor.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldNombreDelServidor.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldNombreDelServidor.gridx = 1;
			gbc_jTextFieldNombreDelServidor.gridy = 1;
			jPanelDataSourceName.add (getJTextFieldNombreDelServidor (), gbc_jTextFieldNombreDelServidor);
			GridBagConstraints gbc_jLabelNombreDeLaBaseDeDatos = new GridBagConstraints ();
			gbc_jLabelNombreDeLaBaseDeDatos.anchor = GridBagConstraints.WEST;
			gbc_jLabelNombreDeLaBaseDeDatos.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelNombreDeLaBaseDeDatos.gridx = 0;
			gbc_jLabelNombreDeLaBaseDeDatos.gridy = 2;
			jPanelDataSourceName.add (getJLabelNombreDeLaBaseDeDatos (), gbc_jLabelNombreDeLaBaseDeDatos);
			GridBagConstraints gbc_jTextFieldNombreDeLaBaseDeDatos = new GridBagConstraints ();
			gbc_jTextFieldNombreDeLaBaseDeDatos.anchor = GridBagConstraints.NORTH;
			gbc_jTextFieldNombreDeLaBaseDeDatos.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldNombreDeLaBaseDeDatos.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldNombreDeLaBaseDeDatos.gridx = 1;
			gbc_jTextFieldNombreDeLaBaseDeDatos.gridy = 2;
			jPanelDataSourceName.add (getJTextFieldNombreDeLaBaseDeDatos (), gbc_jTextFieldNombreDeLaBaseDeDatos);
			GridBagConstraints gbc_jLabelUsuario = new GridBagConstraints ();
			gbc_jLabelUsuario.anchor = GridBagConstraints.EAST;
			gbc_jLabelUsuario.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelUsuario.gridx = 0;
			gbc_jLabelUsuario.gridy = 3;
			jPanelDataSourceName.add (getJLabelUsuario (), gbc_jLabelUsuario);
			GridBagConstraints gbc_jTextFieldUsuario = new GridBagConstraints ();
			gbc_jTextFieldUsuario.anchor = GridBagConstraints.NORTH;
			gbc_jTextFieldUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldUsuario.insets = new Insets (0, 0, 5, 0);
			gbc_jTextFieldUsuario.gridx = 1;
			gbc_jTextFieldUsuario.gridy = 3;
			jPanelDataSourceName.add (getJTextFieldUsuario (), gbc_jTextFieldUsuario);
			GridBagConstraints gbc_jLabelClave = new GridBagConstraints ();
			gbc_jLabelClave.anchor = GridBagConstraints.EAST;
			gbc_jLabelClave.insets = new Insets (0, 0, 5, 5);
			gbc_jLabelClave.gridx = 0;
			gbc_jLabelClave.gridy = 4;
			jPanelDataSourceName.add (getJLabelClave (), gbc_jLabelClave);
			GridBagConstraints gbc_jPasswordFieldClave = new GridBagConstraints ();
			gbc_jPasswordFieldClave.anchor = GridBagConstraints.NORTH;
			gbc_jPasswordFieldClave.fill = GridBagConstraints.HORIZONTAL;
			gbc_jPasswordFieldClave.insets = new Insets (0, 0, 5, 0);
			gbc_jPasswordFieldClave.gridx = 1;
			gbc_jPasswordFieldClave.gridy = 4;
			jPanelDataSourceName.add (getJPasswordFieldClave (), gbc_jPasswordFieldClave);
			GridBagConstraints gbc_jButtonAceptar = new GridBagConstraints ();
			gbc_jButtonAceptar.anchor = GridBagConstraints.SOUTHWEST;
			gbc_jButtonAceptar.insets = new Insets (0, 0, 0, 5);
			gbc_jButtonAceptar.gridx = 0;
			gbc_jButtonAceptar.gridy = 5;
			jPanelDataSourceName.add (getJButtonAceptar (), gbc_jButtonAceptar);
			GridBagConstraints gbc_jButtonCancelar = new GridBagConstraints ();
			gbc_jButtonCancelar.anchor = GridBagConstraints.SOUTHEAST;
			gbc_jButtonCancelar.gridx = 1;
			gbc_jButtonCancelar.gridy = 5;
			jPanelDataSourceName.add (getJButtonCancelar (), gbc_jButtonCancelar);
		}
		
		return jPanelDataSourceName;
	}
	
	private JLabel getJLabelNombreDelServidor ()
	{
		if (jLabelNombreDelServidor == null)
		{
			jLabelNombreDelServidor = new JLabel ("Nombre del servidor:");
		}
		
		return jLabelNombreDelServidor;
	}
	
	private JTextField getJTextFieldNombreDelServidor ()
	{
		if (jTextFieldNombreDelServidor == null)
		{
			jTextFieldNombreDelServidor = new JTextField ();
		}
		
		return jTextFieldNombreDelServidor;
	}
	
	private JLabel getJLabelNombreDeLaBaseDeDatos ()
	{
		if (jLabelNombreDeLaBaseDeDatos == null)
		{
			jLabelNombreDeLaBaseDeDatos = new JLabel ("Nombre de la base de datos:");
		}
		
		return jLabelNombreDeLaBaseDeDatos;
	}
	
	private JTextField getJTextFieldNombreDeLaBaseDeDatos ()
	{
		if (jTextFieldNombreDeLaBaseDeDatos == null)
		{
			jTextFieldNombreDeLaBaseDeDatos = new JTextField ();
		}
		
		return jTextFieldNombreDeLaBaseDeDatos;
	}
	
	private JLabel getJLabelUsuario ()
	{
		if (jLabelUsuario == null)
		{
			jLabelUsuario = new JLabel ("Usuario:");
		}
		
		return jLabelUsuario;
	}
	
	private JTextField getJTextFieldUsuario ()
	{
		if (jTextFieldUsuario == null)
		{
			jTextFieldUsuario = new JTextField ();
		}
		
		return jTextFieldUsuario;
	}
	
	private JLabel getJLabelClave ()
	{
		if (jLabelClave == null)
		{
			jLabelClave = new JLabel ("Clave:");
		}
		
		return jLabelClave;
	}
	
	private JPasswordField getJPasswordFieldClave ()
	{
		if (jPasswordFieldClave == null)
		{
			jPasswordFieldClave = new JPasswordField ();
		}
		
		return jPasswordFieldClave;
	}
	
	private JButton getJButtonAceptar ()
	{
		if (jButtonAceptar == null)
		{
			jButtonAceptar = new JButton ("Aceptar");
			jButtonAceptar.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					Utilidades.driverManager = getJComboBoxDriverManager ().getSelectedItem ().toString ();
					Utilidades.dataSourceName = getJTextFieldNombreDelServidor ().getText ().toString () + "; databaseName = " + getJTextFieldNombreDeLaBaseDeDatos ().getText ().toString () + "; user = " + getJTextFieldUsuario ().getText ().toString () + "; password = " + new String (getJPasswordFieldClave ().getPassword ());
					
					if (Utilidades.iniciarConexionALaBaseDeDatos ())
					{
						Utilidades.finalizarConexionALaBaseDeDatos ();
						dispose ();
						
						Runnable runnable = new Runnable ()
						{
							public void run ()
							{
								Cargando cargando = new Cargando ();

								new MenuPrincipal ();
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
		
		return jButtonAceptar;
	}
	
	private JButton getJButtonCancelar ()
	{
		if (jButtonCancelar == null)
		{
			jButtonCancelar = new JButton ("Cancelar");
			jButtonCancelar.addActionListener (new ActionListener ()
			{
				public void actionPerformed (ActionEvent e)
				{
					confirmarCerrar ();
				}
			}
			);
		}
		
		return jButtonCancelar;
	}
}