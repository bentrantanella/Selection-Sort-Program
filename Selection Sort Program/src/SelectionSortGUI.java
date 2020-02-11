import javax.swing.*;
import BreezySwing.*;

public class SelectionSortGUI  extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new SelectionSortGUI();
		frm.setTitle("Student Grades");
		frm.setSize(300, 300);
		frm.setVisible(true);
	}
	
	JButton newStudentButton = addButton("New Student",1,1,1,1);
	JButton printByNameButton = addButton("Print Students by name",2,1,1,1);
	JButton printByAverageButton = addButton("Print Students by average",3,1,1,1);
	JTextArea outputArea = addTextArea("",4,1,1,1);
	
	public void buttonClicked(JButton button) {
		if (button == newStudentButton) {
			
		}
	}
	
}
