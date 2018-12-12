package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BotonesMensaje extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -354266418433037653L;
	private JPanel contentPane;
	private JButton btnAdios;
	private JButton btnHola;
	private JButton btnKaixo;
	private JButton btnAgur;
	private JLabel lblmensaje;
	private JTextField txtMensaje;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmGuardar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensaje frame = new BotonesMensaje();
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
	public BotonesMensaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardarr");
		mnArchivo.add(mntmGuardar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Boton = new JPanel();
		contentPane.add(Boton, BorderLayout.CENTER);
		
	 btnHola = new JButton("Hola");
		btnHola.addActionListener(this);
		Boton.setLayout(new GridLayout(2, 2, 0, 0));
		Boton.add(btnHola);
		
		btnAdios = new JButton("Adios");
		btnAdios.addActionListener(this);
		Boton.add(btnAdios);
		
		btnKaixo = new JButton("Kaixo");
		btnKaixo.addActionListener(this);
		Boton.add(btnKaixo);
		
		btnAgur = new JButton("Agur");
		btnAgur.addActionListener(this);
		Boton.add(btnAgur);
		
		txtMensaje = new JTextField();
		contentPane.add(txtMensaje, BorderLayout.NORTH);
		txtMensaje.setColumns(10);
		
		lblmensaje = new JLabel("No hay mensaje");
		contentPane.add(lblmensaje, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String mensaje;
		//cojo el texto del bototn que se ha pulsado
		//obtengo el botn que ha sido pulsado
		Object o=e.getSource();
		//obtengo el texto de ese boton y se lo doy al mensaje
		mensaje= ((JButton)o).getText();
		//completo el mensaje del boton
		mensaje=mensaje+" "+txtMensaje.getText();
		lblmensaje.setText(mensaje);
	}

}
