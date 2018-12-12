package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class contrase�a extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2963869013673894193L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passcontrase�a;
	private JButton btnAceptar;
	private JLabel lblEntrada;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contrase�a frame = new contrase�a();
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
	public contrase�a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIntroduceContrasea = new JLabel("Contrase\u00F1a");
		panel.add(lblIntroduceContrasea);
		
		passcontrase�a = new JPasswordField();
		passcontrase�a.setToolTipText("");
		passcontrase�a.setColumns(7);
		panel.add(passcontrase�a);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String contrasena = new String(passcontrase�a.getPassword());
			}
			
		});
		panel.add(btnAceptar);
		
		lblEntrada = new JLabel("Anonimo");
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEntrada, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		String contrase�a;
	}

}
