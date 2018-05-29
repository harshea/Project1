package comptool;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToolPanel extends JPanel {
	private JPanel toolPanel;
	
	ToolPanel() {
		toolPanel.setLayout(new GridLayout(2,1, 1, 1));
		toolPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		JButton btnActor = new JButton("Actor");
		toolPanel.add(btnActor);
		
		JButton btnPacket = new JButton("Packet");
		toolPanel.add(btnPacket);
	}
}
