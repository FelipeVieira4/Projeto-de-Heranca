package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class VestiarioFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VestiarioFrame frame = new VestiarioFrame();
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
	public VestiarioFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"P", "M", "G", "GG", "XG", "XXG"}));
		comboBox.setBounds(336, 128, 88, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("rsc/ok_logo.png"));
		btnNewButton.setBounds(349, 194, 76, 56);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 42, 278, 24);
		contentPane.add(textField);
		
		JLabel lblCodigo = new JLabel("CODIGO");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 11, 126, 24);
		contentPane.add(lblCodigo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 108, 278, 24);
		contentPane.add(textField_1);
		
		JLabel lblPreo = new JLabel("PREÇO");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreo.setBounds(10, 77, 126, 24);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 174, 278, 24);
		contentPane.add(textField_2);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 143, 126, 24);
		contentPane.add(lblNome);
	}

}
