import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegCandidato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textPassword;
	private JTextField textNombre;
	private JTextField textUsuario;
	private JTextField textCarnet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegCandidato frame = new VentanaRegCandidato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegCandidato() {
		
		ArrayList<PartidoPolitico> partidos =  PartidoPolitico.leerPartidosTxt(Archivos.archivoPartidos);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 488, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setBackground(new Color(128, 128, 255));
		contentPane.add(panPrincipal);
		panPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panBotones = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panBotones.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panPrincipal.add(panBotones, BorderLayout.SOUTH);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		panBotones.add(btnRegistrar);
		
		JComboBox comboBoxPartido = new JComboBox();
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCarnet.setText("");
				textCodigo.setText("");
				textNombre.setText("");
				textPassword.setText("");
				textUsuario.setText("");
				comboBoxPartido.setSelectedIndex(0);
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		panBotones.add(btnLimpiar);
		
		JLabel lblTitulo = new JLabel("Registro de Candidato");
		lblTitulo.setBackground(new Color(128, 128, 192));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panPrincipal.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panFormulario = new JPanel();
		panFormulario.setLayout(null);
		panFormulario.setBackground(new Color(128, 128, 192));
		panPrincipal.add(panFormulario, BorderLayout.CENTER);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBackground(Color.WHITE);
		textCodigo.setBounds(145, 10, 265, 31);
		panFormulario.add(textCodigo);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(40, 170, 100, 30);
		panFormulario.add(lblPassword);
		
		JLabel lblCarnet = new JLabel("Carnet:");
		lblCarnet.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarnet.setBounds(40, 90, 100, 30);
		panFormulario.add(lblCarnet);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBackground(Color.WHITE);
		textPassword.setBounds(145, 170, 265, 31);
		panFormulario.add(textPassword);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigo.setBounds(40, 10, 100, 30);
		panFormulario.add(lblCodigo);

		comboBoxPartido.setToolTipText("");
		comboBoxPartido.setMaximumRowCount(10);
		comboBoxPartido.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBoxPartido.setBounds(145, 210, 265, 31);
		panFormulario.add(comboBoxPartido);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(40, 50, 100, 30);
		panFormulario.add(lblNombre);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(40, 130, 100, 30);
		panFormulario.add(lblUsuario);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPartido.setBounds(40, 210, 100, 30);
		panFormulario.add(lblPartido);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBackground(Color.WHITE);
		textNombre.setBounds(145, 50, 265, 31);
		panFormulario.add(textNombre);
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBackground(Color.WHITE);
		textUsuario.setBounds(145, 130, 265, 31);
		panFormulario.add(textUsuario);
		
		textCarnet = new JTextField();
		textCarnet.setColumns(10);
		textCarnet.setBackground(Color.WHITE);
		textCarnet.setBounds(145, 90, 265, 31);
		panFormulario.add(textCarnet);
		
		String partidosModelo[] = new String[partidos.size()];
		for(int i=0; i<partidos.size();i++) {
			partidosModelo[i] = partidos.get(i).toString();
		}
		
		comboBoxPartido.setModel(new DefaultComboBoxModel<String>(partidosModelo));
	}
}
