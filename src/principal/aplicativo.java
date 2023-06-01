package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class aplicativo extends JFrame {

	private JPanel contentPane;
	
	private ArrayList<Object> produto = new  ArrayList<Object>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aplicativo frame = new aplicativo();
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
	public aplicativo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("Eletronico", null, panel, null);
		panel.setLayout(null);
		
		JButton openJanelaEletronico = new JButton("New button");
		openJanelaEletronico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eletronico test = new Eletronico();
				test.setVisible(true);
			}
		});
		openJanelaEletronico.setBounds(294, 78, 89, 23);
		panel.add(openJanelaEletronico);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Eletronico", "Vestiario", "Alimenticio"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(58, 78, 224, 34);
		panel.add(comboBox);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Vestuario", null, panel_1, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("RESULTADOS", null, panel_3, null);
	}
}
