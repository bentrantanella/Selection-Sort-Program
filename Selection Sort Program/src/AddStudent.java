import javax.swing.*;
import BreezySwing.*;

public class AddStudent extends GBDialog {
	
	AllStudents students = new AllStudents();
	
	public AddStudent(JFrame parent, AllStudents a) {
		super(parent);
		setTitle("Input");
		setSize(500, 500);
		
		students = a;
	}
	
	JLabel nameLabel = addLabel("Name:",1,1,2,1);
	JTextField nameField = addTextField("",1,2,2,1);
	
	JLabel testLabel = addLabel("Test score:",2,1,1,1);
	IntegerField testField = addIntegerField(0,2,2,1,1);
	JButton addTestButton = addButton("Add",2,3,1,1);
	JLabel testCountLabel = addLabel("Scores entered: 0",2,4,1,1);
	
	JLabel quizLabel = addLabel("Quiz score:",3,1,1,1);
	IntegerField quizField = addIntegerField(0,3,2,1,1);
	JButton addQuizButton = addButton("Add",3,3,1,1);
	JLabel quizCountLabel = addLabel("Scores entered: 0",3,4,1,1);
	
	JLabel hwLabel = addLabel("Homework Average:",4,1,1,1);
	IntegerField hwField = addIntegerField(0,4,2,1,1);
	
	JButton addStudentButton = addButton("Add Student",5,1,2,1);
	
	int testcount = 0;
	int quizcount = 0;
	int[] tests = new int[5];
	int[] quizes = new int[8];
	
	public void buttonClicked(JButton button) {
		if (button == addTestButton) {
			if (testField.getNumber() <= 0 || !testField.isValidNumber()) {
				messageBox("Invalid input");
				return;
			}
				
			tests[testcount] = testField.getNumber();
			testcount++;
			testField.setNumber(0);
			testCountLabel.setText("Scores entered: " + testcount);
			if (testcount == 5)
				addTestButton.setEnabled(false);
				
		}
		
		if (button == addQuizButton) {
			if (quizField.getNumber() <= 0 || !quizField.isValidNumber()) {
				messageBox("Invalid Input");
				return;
			}
			
			quizes[quizcount] = quizField.getNumber();
			quizcount++;
			quizField.setNumber(0);
			quizCountLabel.setText("Scores entered: " + quizcount);
			if (quizcount == 8)
				addQuizButton.setEnabled(false);
			
		}
		
		if (button == addStudentButton) {
			StudentInfo s = new StudentInfo(tests, quizes, hwField.getNumber(), getFinalAvg(), nameField.getText());
			students.addStudent(s);
		}
		
		
	}
	
	private double getFinalAvg() {
		return 0.5 * getTestAvg() + 0.3 * getQuizAvg() + 0.2 * hwField.getNumber();
	}
	
	private double getTestAvg() {
		double total = 0;
		int count = 0;
		for(int a : tests) {
			if (a == 0)
				break;
			total += a; 
			count++;
		}
		
		return total / count;
	}
	
	private double getQuizAvg() {
		double total = 0;
		int count = 0;
		for(int a : quizes) {
			if (a == 0)
				break;
			total += a;
			count++;
		}
		
		return total / count;
	}
	

	
}
