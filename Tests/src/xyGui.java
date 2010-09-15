import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class xyGui {
	private JFrame frame;
	private JPanel panel0;
	private JButton but0;
	
	public xyGui(){ createFrame(); }
	
    public void createFrame(){
        frame = new JFrame("Titel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel0 = new JPanel();
	GridBagLayout gbpanel0 = new GridBagLayout();
	GridBagConstraints gbcpanel0 = new GridBagConstraints();
	panel0.setLayout(gbpanel0);

	but0 = new JButton("");
	gbcpanel0.gridx = 3;
	gbcpanel0.gridy = 0;
	gbcpanel0.gridwidth = 1;
	gbcpanel0.gridheight = 1;
	gbcpanel0.fill = GridBagConstraints.BOTH;
	gbcpanel0.weightx = 1;
	gbcpanel0.weighty = 0;
	gbcpanel0.anchor = GridBagConstraints.NORTH;
	gbpanel0.setConstraints(but0, gbcpanel0);
	panel0.add(but0);
    }
}
