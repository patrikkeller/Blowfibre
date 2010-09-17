import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ConnectionGui {
	private JFrame frame;

	private JPanel panel0;
	private JComboBox comboStart0;
	private String []scomboStart0;
	private JComboBox comboZiel1;
	
	private JTextField comment1;
	private JButton but0;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JTable table1;
	private JButton but2;
	String []scomboZiel1 = {"Chocolate","Ice Cream","Apple Pie"};
	
	
	public ConnectionGui() {
		createFrame();
		
	}
	
	public void createFrame(){
		panel0 = new JPanel();
		frame = new JFrame("Connections");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gbpanel0 = new GridBagLayout();
		GridBagConstraints gbcpanel0 = new GridBagConstraints();
		panel0.setLayout(gbpanel0);
		
		
		/// erstelle Gui   <Start>

		// Menubar mit Eintr�gen und Items
		
		
		comboZiel1 = new JComboBox(scomboZiel1);
		gbcpanel0.gridx = 8;
		gbcpanel0.gridy = 2;
		gbcpanel0.gridwidth = 4;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(comboZiel1, gbcpanel0);
		panel0.add(comboZiel1);

	/*
	 * nono 123456789
	 */

		String []scomboStart0 = {"Chocolate","Ice Cream","Apple Pie"};
		comboStart0 = new JComboBox(scomboStart0);
		gbcpanel0.gridx = 1;
		gbcpanel0.gridy = 2;
		gbcpanel0.gridwidth = 6;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(comboStart0, gbcpanel0);
		panel0.add(comboStart0);

		comment1 = new JTextField();
		gbcpanel0.gridx = 13;
		gbcpanel0.gridy = 2;
		gbcpanel0.gridwidth = 4;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(comment1, gbcpanel0);
		panel0.add(comment1);

		but0 = new JButton("OK");
		gbcpanel0.gridx = 18;
		gbcpanel0.gridy = 2;
		gbcpanel0.gridwidth = 1;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(but0, gbcpanel0);
		panel0.add(but0);

		label1 = new JLabel("Ziel:");
		gbcpanel0.gridx = 8;
		gbcpanel0.gridy = 1;
		gbcpanel0.gridwidth = 2;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(label1, gbcpanel0);
		panel0.add(label1);

		label0 = new JLabel("Start:");
		gbcpanel0.gridx = 1;
		gbcpanel0.gridy = 1;
		gbcpanel0.gridwidth = 2;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(label0, gbcpanel0);
		panel0.add(label0);

		table1 = new JTable();
		gbcpanel0.gridx = 1;
		gbcpanel0.gridy = 6;
		gbcpanel0.gridwidth = 18;
		gbcpanel0.gridheight = 14;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(table1, gbcpanel0);
		panel0.add(table1);

		label2 = new JLabel("Kommentar:");
		gbcpanel0.gridx = 13;
		gbcpanel0.gridy = 1;
		gbcpanel0.gridwidth = 4;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(label2, gbcpanel0);
		panel0.add(label2);
		
		but2 = new JButton("edit");
		gbcpanel0.gridx = 18;
		gbcpanel0.gridy = 4;
		gbcpanel0.gridwidth = 1;
		gbcpanel0.gridheight = 1;
		gbcpanel0.fill = GridBagConstraints.BOTH;
		gbcpanel0.weightx = 1;
		gbcpanel0.weighty = 0;
		gbcpanel0.anchor = GridBagConstraints.NORTH;
		gbpanel0.setConstraints(but2, gbcpanel0);
		panel0.add(but2);
		
		//
		frame.add(panel0);
		frame.pack();
		frame.setVisible(true);
		System.out.println(panel0.getComponent(0));
	}
	
	public void updateCombos(List<Raum> raumDB ){
		
		String []scomboZiel1 = null;
		//[]scomboZiel1 = null;
		for (int x =0; x< raumDB.size(); x++){
			scomboZiel1[x] = raumDB.get(x).toString();
			
		}
		//panel0.
		
	}
}
