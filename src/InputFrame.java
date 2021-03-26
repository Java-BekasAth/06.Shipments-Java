import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InputFrame extends JFrame {

	private JPanel panel;
	private JPanel branchPanel;
	private JLabel branchLabel;
	private JTextField branchNameField;
	private JButton calculateBranchCostButton;
	ArrayList<Branch> branches = new ArrayList<Branch>();

	public InputFrame(ArrayList<Branch> br) {

		panel = new JPanel();
		branchPanel = new JPanel();

		branchLabel = new JLabel("Branch");
		branchNameField = new JTextField("Branch Name");
		calculateBranchCostButton = new JButton("Calculate Branch Cost");

		branchPanel.setLayout(new GridLayout(3, 0));
		branchPanel.add(branchLabel);
		branchPanel.add(branchNameField);
		branchPanel.add(calculateBranchCostButton); 
		branchPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(branchPanel);

		ButtonListener listener = new ButtonListener();
		calculateBranchCostButton.addActionListener(listener);

		this.setContentPane(panel);

		this.setVisible(true);
		this.setSize(220, 140);
		this.setLocation(200, 0);
		this.setTitle("Input");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.branches = br;
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String branch = branchNameField.getText();
			
			for(int i=0; i < branches.size(); i++) {
				
				if(branches.get(i).getName().equals(branch)) {
					
					double sum =  branches.get(i).shipmentInfo();
					System.out.println("Sum: " + sum );
					System.out.println("==================");
					break;
				}
				
			}
			
		}
	}

}
