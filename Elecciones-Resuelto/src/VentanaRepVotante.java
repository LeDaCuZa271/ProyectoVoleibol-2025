import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class VentanaRepVotante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepVotante frame = new VentanaRepVotante();
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
	public VentanaRepVotante() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 656, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setBackground(new Color(128, 128, 255));
		contentPane.add(panPrincipal);
		panPrincipal.setLayout(new BorderLayout(5, 5));
		
		JLabel lblTitulo = new JLabel("Votantes por Ciudad");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panPrincipal.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panBotones = new JPanel();
		panBotones.setBackground(new Color(128, 128, 192));
		FlowLayout fl_panBotones = (FlowLayout) panBotones.getLayout();
		fl_panBotones.setAlignment(FlowLayout.RIGHT);
		panPrincipal.add(panBotones, BorderLayout.SOUTH);
		
		JButton btnModCandidato = new JButton("Modificar Votante");
		btnModCandidato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panBotones.add(btnModCandidato);
		
		JButton btnMostrar = new JButton("Mostrar Todo");
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panBotones.add(btnMostrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panBotones.add(btnEliminar);
		
		JPanel panIzquierda = new JPanel();
		panIzquierda.setBackground(new Color(128, 128, 192));
		panPrincipal.add(panIzquierda, BorderLayout.WEST);
		panIzquierda.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panIzquierda.add(lblCiudad, BorderLayout.NORTH);
		
		JList listCiudad = new JList();
		panIzquierda.add(listCiudad);
		
		JPanel panBanderas = new JPanel();
		panIzquierda.add(panBanderas, BorderLayout.SOUTH);
		panBanderas.setLayout(new BorderLayout(0, 0));
		
		JButton btnMostrarCiudad = new JButton("Mostrar");
		btnMostrarCiudad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panBanderas.add(btnMostrarCiudad, BorderLayout.NORTH);
		
		JLabel lblImagen = new JLabel("Imagen");
		panBanderas.add(lblImagen, BorderLayout.SOUTH);
		
		JPanel panCentro = new JPanel();
		panPrincipal.add(panCentro, BorderLayout.CENTER);
		panCentro.setLayout(new BorderLayout(0, 0));
		
		JList listVotantes = new JList();
		panCentro.add(listVotantes);
		
		JLabel lblVotantes = new JLabel("Votantes por Ciudad");
		lblVotantes.setBackground(new Color(128, 128, 192));
		lblVotantes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblVotantes.setHorizontalAlignment(SwingConstants.CENTER);
		panCentro.add(lblVotantes, BorderLayout.NORTH);
	}

}
