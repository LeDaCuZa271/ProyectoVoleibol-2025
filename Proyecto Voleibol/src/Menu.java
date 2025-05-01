import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("ASOCIACIÓN DE VOLEIBOL");
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
		
		JLabel lblTitulo = new JLabel("ASOCIACIÓN DE VOLEIBOL");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 22));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panPrincipal.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panMenu = new JPanel();
		panPrincipal.add(panMenu, BorderLayout.CENTER);
		panMenu.setLayout(new GridLayout(1, 2, 5, 0));
		
		JPanel panOpciones1 = new JPanel();
		panMenu.add(panOpciones1);
		panOpciones1.setLayout(new GridLayout(6, 1, 3, 3));
		
		JButton btnRegEquipo = new JButton("Registrar Equipo");
		btnRegEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro_Equipo frame = new Registro_Equipo();
				frame.setVisible(true);
			}
		});
		btnRegEquipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnRegEquipo);
		
		JButton btnPartido = new JButton("Iniciar Partido");
		btnPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana_Partido frame = new Ventana_Partido();
				frame.setVisible(true);
			}
		});
		btnPartido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnPartido);
		
		JButton btnHistorial = new JButton("Mostrar Historial");
		btnHistorial .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Historial frame = new Historial();
				frame.setVisible(true);
			}
		});
		btnHistorial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panOpciones1.add(btnHistorial);
		
		
		
		JPanel panOpciones2 = new JPanel();
		panMenu.add(panOpciones2);
		panOpciones2.setLayout(new GridLayout(6, 1, 3, 3));
		
		
		
		JPanel panVotos = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panVotos.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panPrincipal.add(panVotos, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Registrar Votos");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panVotos.add(btnNewButton);
	}

}