import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Elecciones 2025");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setBackground(new Color(0, 255, 128));
		contentPane.add(panPrincipal, BorderLayout.CENTER);
		panPrincipal.setLayout(new BorderLayout(5, 5));
		
		JLabel lblTitulo = new JLabel("Elecciones 2025");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 22));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panPrincipal.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panMenu = new JPanel();
		panPrincipal.add(panMenu, BorderLayout.CENTER);
		panMenu.setLayout(new GridLayout(1, 3, 5, 0));
		
		JPanel panOpciones1 = new JPanel();
		panMenu.add(panOpciones1);
		panOpciones1.setLayout(new GridLayout(6, 1, 3, 3));
		
		JButton btnRegPartido = new JButton("Registrar Partido");
		btnRegPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegPartido frame = new VentanaRegPartido();
				frame.setVisible(true);
			}
		});
		btnRegPartido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnRegPartido);
		
		JButton btnRegRecinto = new JButton("Registro Recinto");
		btnRegRecinto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegRecinto frame = new VentanaRegRecinto();
				frame.setVisible(true);
			}
		});
		btnRegRecinto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnRegRecinto);
		
		JButton btnRegCandidato = new JButton("Registro Candidato");
		btnRegCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegCandidato frame = new VentanaRegCandidato();
				frame.setVisible(true);
			}
		});
		btnRegCandidato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnRegCandidato);
		
		JButton btnNewButton_3 = new JButton("Registro Votante");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegVotante frame = new VentanaRegVotante();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Modificar Candidato");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaModCandidato frame = new VentanaModCandidato();
				frame.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Modificar Votante");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaModVotante frame = new VentanaModVotante();
				frame.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnNewButton_6);
		
		JPanel panOpciones2 = new JPanel();
		panMenu.add(panOpciones2);
		panOpciones2.setLayout(new GridLayout(6, 1, 3, 3));
		
		JButton btnNewButton_7 = new JButton("Modificar Partido");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VentanaModPartido frame = new VentanaModPartido();
				//frame.setVisible(true);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Modificar Recinto");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaModRecinto frame = new VentanaModRecinto();
				frame.setVisible(true);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Reporte Completo");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRepCompleto frame = new VentanaRepCompleto();
				frame.setVisible(true);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Reporte por Partido");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRepVotante frame = new VentanaRepVotante();
				frame.setVisible(true);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones2.add(btnNewButton_10);
		
		JPanel panEscudo = new JPanel();
		JLabel lblImagen = new JLabel();
		Icon icono = new ImageIcon("BG.jpeg");
		panEscudo.setLayout(new BorderLayout(0, 0));
		lblImagen.setIcon(icono);
		panEscudo.add(lblImagen);
		panMenu.add(panEscudo);
		
		JPanel panVotos = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panVotos.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panPrincipal.add(panVotos, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Registrar Votos");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panVotos.add(btnNewButton);
	}

}
