
public class StudentInfo {
	
	int[] tests = new int[5];
	int[] quizzes = new int[8];
	double hwavg;
	double finalavg;
	String name;
	
	public StudentInfo(int[] ts, int[] qs, double HWavg, double FinalAvg, String nm) {
		tests = ts;
		quizzes = qs;
		hwavg = HWavg;
		finalavg = FinalAvg;
		name = nm;
	}

	public double getFinalAvg() {
		return finalavg;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInfo() {
		String testlist = "";
		for(int a : tests) {
			if (a == 0)
				break;
			testlist += a + " ";
		}
		
		String quizlist = "";
		for(int a : quizzes) {
			if (a == 0)
				break;
			quizlist += a + " ";
		}
		
		return "Name: " + name + "\n" +
				"Test scores: " + testlist + "\n" +
				"Quiz scores: " + quizlist + "\n" +
				"Homework average: " + hwavg + "\n" +
				"Final average: " + finalavg;
	}
	
	
	
}
