import javax.swing.*;
import BreezySwing.*;

public class AddStudent extends GBDialog {
	
	public AddStudent(JFrame parent) {
		super(parent);
		setTitle("Input");
		setSize(300, 300);
	}
	
	JLabel nameLabel = addLabel("Name:",1,1,2,1);
	JTextField nameField = addTextField("",1,2,2,1);
	
	JLabel testLabel = addLabel("Test score:",2,1,1,1);
	IntegerField testField = addIntegerField(0,2,2,1,1);
	JButton addButton = addButton("Add",2,3,1,1);
	JLabel testCountLabel = addLabel("Scores entered: 0",2,4,1,1);
	
	
}
