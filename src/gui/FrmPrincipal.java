package gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmPrincipal extends JFrame{
	private JPanel contentPane;
	public FrmPrincipal() {
		super("Practica POO-2-7");
		iniComponents();
	}
	
	private void iniComponents () {
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane= new JPanel(new BorderLayout());
		setContentPane(contentPane);
		addSur();
		addCenter();
	}
	
	private void addSur(){
		JPanel pnlSur = new JPanel();
		contentPane.add(pnlSur,BorderLayout.SOUTH);
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		pnlSur.add(btnAceptar);
		pnlSur.add(btnCancelar);
	}
	
	private void addCenter() {
		JPanel pnlCenter = new JPanel(new GridLayout(3,2));
		contentPane.add(pnlCenter,BorderLayout.CENTER);
		JLabel lblNombre = new JLabel("Nombre: ");
		pnlCenter.add(lblNombre);
		JTextField txtNombre = new JTextField();
		pnlCenter.add(txtNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		pnlCenter.add(lblApellidos);
		JTextField txtApellidos = new JTextField();
		pnlCenter.add(txtApellidos);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento: ");
		pnlCenter.add(lblFechaNacimiento);
		
		//agregando el panel de la fecha
		
		JPanel pnlFecha = new JPanel();
		pnlCenter.add(pnlFecha);
		JLabel lblDia = new JLabel("DD");
		pnlFecha.add(lblDia);
		JTextField txtDia = new JTextField(5);
		pnlFecha.add(txtDia);
		
		JLabel lblMes = new JLabel("MM");
		pnlFecha.add(lblMes);
		JTextField txtMes = new JTextField(5);
		pnlFecha.add(txtMes);
		
		JLabel lblAnio = new JLabel("AAAA");
		pnlFecha.add(lblAnio);
		JTextField txtAnio = new JTextField(5);
		pnlFecha.add(txtAnio);
	}
	
	
}
