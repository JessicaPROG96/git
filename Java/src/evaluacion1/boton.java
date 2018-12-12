package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class boton extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -31445065330688236L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel lblResultado;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boton frame = new boton();
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
	public boton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		panel.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setText("0");
		txtNumero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mensaje;
				mensaje="El numero introducido es el" + txtNumero.getText();
				lblResultado.setText(mensaje);
				
			}
			
		});
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mensaje;
				mensaje="El numero introducido es el" + txtNumero.getText();
				lblResultado.setText(mensaje);
			}
			
		});
		panel.add(btnOk);
		
		lblResultado = new JLabel("No se ha introducido un numero");
		contentPane.add(lblResultado, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
