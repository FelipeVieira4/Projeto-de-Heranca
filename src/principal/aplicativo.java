package principal;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class aplicativo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		
		JPanel Adicionar = new JPanel();
		tabbedPane_1.addTab("Eletronico", null, Adicionar, null);
		Adicionar.setLayout(null);
		


		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Eletronico", "Vestiario", "Alimenticio"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(58, 78, 224, 34);
		Adicionar.add(comboBox);
		
		JButton openJanelaEletronico = new JButton("Aceitar");
		openJanelaEletronico.setSelectedIcon(null);
		openJanelaEletronico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedItem().toString()) {
					case "Eletronico":
						EletronicoFrame EletronicoJanele = new EletronicoFrame();
						EletronicoJanele.setVisible(true);
						break;
					case "Vestiario":
						VestiarioFrame VestiarioJanele = new VestiarioFrame();
						VestiarioJanele.setVisible(true);
						break;
				}
				
				
			}
		});
		openJanelaEletronico.setBounds(292, 78, 89, 34);
		Adicionar.add(openJanelaEletronico);
		
		JPanel Remover = new JPanel();
		tabbedPane_1.addTab("Remover", null, Remover, null);
		
		JPanel Resultados = new JPanel();
		tabbedPane_1.addTab("Resultados", null, Resultados, null);
	}
}
