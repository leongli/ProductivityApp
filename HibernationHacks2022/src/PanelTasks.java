import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelTasks extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTasks() {
		setForeground(new Color(102, 51, 0));
		setBorder(null);
		setBackground(new Color(255, 255, 204));
		setBounds(0,0,505,574);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Task\r\n");
		lblNewLabel.setBounds(149, 168, 271, 183);
		add(lblNewLabel);
		setVisible(true);

	}

}
