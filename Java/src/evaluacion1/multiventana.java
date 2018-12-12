package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class multiventana extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2598554994068433556L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multiventana frame = new multiventana();
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
	public multiventana() {
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
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setText("");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		panel.add(lblContra);
		
		passfield = new JPasswordField();
		passfield.addActionListener(this);
		passfield.setColumns(7);
		passfield.setText("");
		panel.add(passfield);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
