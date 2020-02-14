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
	
	AllStudents s = new AllStudents();
	
	public SelectionSortGUI() {
		printByNameButton.setEnabled(false);
		printByAverageButton.setEnabled(false);
	}
	
	public void buttonClicked(JButton button) {
		if (button == newStudentButton) {
			AddStudent a = new AddStudent(this, s) ;
			a.setVisible(true);
			
			StudentInfo[] b = s.getStudents();
			
			if (b[0] != null) {
				printByNameButton.setEnabled(true);
				printByAverageButton.setEnabled(true);
			}
		}
		
		if (button == printByNameButton) {
			String output = "";
			s.SortByName();
			
			for(StudentInfo a : s.getStudents()) {
				if (a == null)
					break;
				output += a.getInfo() + "\n\n";
			}
			
			outputArea.setText(output);
		}
		
		if (button == printByAverageButton) {
			String output = "";
			s.SortByAvg();
			
			for(StudentInfo a : s.getStudents()) {
				if (a == null)
					break;
				output += a.getInfo() + "\n\n";
			}
			
			outputArea.setText(output);
		}
		
	}
	
}
