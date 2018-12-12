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

public class ventanahola extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7146893524032589707L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanahola frame = new ventanahola();
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
	public ventanahola() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblHolaMundo = new JLabel("Hola Mundo");
		lblHolaMundo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHolaMundo, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNumero = new JLabel("Numero");
		panel.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mensaje;
				mensaje="El numero";
			}
			
			
		});
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblTexto = new JLabel("No se ha introducido un Numero");
		contentPane.add(lblTexto, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
