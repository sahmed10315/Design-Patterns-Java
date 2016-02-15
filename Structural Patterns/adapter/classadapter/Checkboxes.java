package adapter.classadapter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Checkboxes extends JFrame implements ItemListener {
	
	private static final long serialVersionUID = 1L;
	CheckboxAdapter checks[];
	JTextField text;

	public Checkboxes() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		checks = new CheckboxAdapter[4];

		for (int loopIndex = 0; loopIndex <= checks.length - 1; loopIndex++) {
			checks[loopIndex] = new CheckboxAdapter("Check " + loopIndex);
			checks[loopIndex].addItemListener(this);
			contentPane.add(checks[loopIndex]);
		}

		text = new JTextField(30);

		contentPane.add(text);
	}
	/**
	 * We can handle AWT adapted check boxes as we would standard 
	 * Swing check boxes when it comes to the isSelected method
	 */
	public void itemStateChanged(ItemEvent e) {
		String outString = new String("Selected: ");

		for (int loopIndex = 0; loopIndex <= checks.length - 1; loopIndex++) {
			if (checks[loopIndex].isSelected()) {
				outString += " checkbox " + loopIndex;
			}
		}
		text.setText(outString);
	}

}