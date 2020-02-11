import javax.swing.*;
import BreezySwing.*;

public class AddStudent extends GBDialog {
	
	public AddStudent(JFrame parent) {
		super(parent);
		setTitle("Input");
		setSize(300, 300);
	}
	
	JLabel nameLabel = addLabel("Name:",1,1,1,1);
	JTextField nameField = addTextField("",1,2,1,1);
}
