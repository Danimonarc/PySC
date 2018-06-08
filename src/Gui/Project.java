package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class Project extends JFrame {

	private JPanel contentPane;
	private JTextField txtNPares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	private DefaultListModel<Integer> model1, model2, model3;
	public Project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 455, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		model1 = new DefaultListModel<Integer>();
		model2 = new DefaultListModel<Integer>();
		model3 = new DefaultListModel<Integer>();
		JPanel AbsolutePanel = new JPanel();
		contentPane.add(AbsolutePanel, BorderLayout.CENTER);
		
		JPanel PanelDeArriba = new JPanel();
		
		JLabel LabelDeArriba = new JLabel("Longitud de la lista a generar de pares aleatiorios'");
		PanelDeArriba.add(LabelDeArriba);
		
		txtNPares = new JTextField();
		PanelDeArriba.add(txtNPares);
		txtNPares.setColumns(10);
		
		JPanel panel = new JPanel();
		
		
		JList<Integer> listNA = new JList<Integer>();
		listNA.setBorder(new LineBorder(new Color(0, 0, 0)));
		listNA.setModel(model1);
		
		JList<Integer> listNB = new JList<Integer>();
		listNB.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(listNA, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(listNB, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(listNA, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(listNB, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel LabelIzquierda = new JLabel("Lista de naturales A");
		panel_1.add(LabelIzquierda);
		
		JLabel LabelDerecha = new JLabel("Lista de naturales B");
		panel_1.add(LabelDerecha);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_AbsolutePanel = new GroupLayout(AbsolutePanel);
		gl_AbsolutePanel.setHorizontalGroup(
			gl_AbsolutePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AbsolutePanel.createSequentialGroup()
					.addGroup(gl_AbsolutePanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PanelDeArriba, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_AbsolutePanel.setVerticalGroup(
			gl_AbsolutePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AbsolutePanel.createSequentialGroup()
					.addComponent(PanelDeArriba, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JList<Integer> listComprobar = new JList<Integer>();
		listComprobar.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(listComprobar, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(listComprobar, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		AbsolutePanel.setLayout(gl_AbsolutePanel);
		
		JPanel PanelDeAbajo = new JPanel();
		contentPane.add(PanelDeAbajo, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Comprobacion de ternas pitag\u00F3ricas");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		model1.addElement(5);
		
	}
}
