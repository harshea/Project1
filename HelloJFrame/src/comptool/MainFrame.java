package comptool;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 855, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		ToolPanel toolPanel = new ToolPanel();
		// Now add the Panel to parent frame
		frame.getContentPane().add(toolPanel, BorderLayout.WEST);

		
		JPanel propertyPanel = new JPanel();
		propertyPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.getContentPane().add(propertyPanel, BorderLayout.EAST);
		
		JLabel lblProperties = new JLabel("Properties");
		propertyPanel.add(lblProperties);
		
		JPanel filePanel = new JPanel();
		FlowLayout fl_filePanel = (FlowLayout) filePanel.getLayout();
		fl_filePanel.setAlignment(FlowLayout.LEFT);
		fl_filePanel.setAlignOnBaseline(true);
		filePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.getContentPane().add(filePanel, BorderLayout.CENTER);
		
		JTabbedPane fileTabbedPane = new JTabbedPane();
		//fileTabbedPane.setEnabled(true);		
		//fileTabbedPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		filePanel.add(fileTabbedPane);
		addNewFileTab(fileTabbedPane, "top-metric-tag1");
		addNewFileTab(fileTabbedPane, "top-metric-tag2");
		addNewFileTab(fileTabbedPane, "top-metric-tag3");
		addNewFileTab(fileTabbedPane, "top-metric-tag4");
	}

	private void addNewFileTab(JTabbedPane fileTabbedPane, String filename) {
		JPanel filePanel = new JPanel();
		JButton b = new JButton("This is file: " + filename);
		filePanel.add(b);
		fileTabbedPane.addTab(filename, filePanel);
	}
	
}
