
public class AllStudents {
	
	StudentInfo[] allstudents;
	int count = 0;
	
	public AllStudents() {
		allstudents = new StudentInfo[15];
	}
	
	public void SortByName() {
		
		int count = 0;
		
		for(StudentInfo s : allstudents) {
			if (s == null)
				break;
			count++;
		}
		
		int n = count;
		
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (allstudents[j].getName().compareTo(allstudents[min_idx].getName()) < 0)
					min_idx = j;
			}
			StudentInfo temp = allstudents[min_idx];
			allstudents[min_idx] = allstudents[i];
			allstudents[i] = temp;
		}
		
	}
	
	public void SortByAvg() {
		
		int count = 0;
		
		for(StudentInfo s : allstudents) {
			if (s == null)
				break;
			count++;
		}
		
		int n = count;
		
	    for (int i = 0; i < n-1; i++) {
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++){
	    		if (allstudents[j].getFinalAvg() > allstudents[min_idx].getFinalAvg())
	                   min_idx = j;
	           }
	    	StudentInfo temp = allstudents[min_idx];
	    	allstudents[min_idx] = allstudents[i];
	    	allstudents[i] = temp;
	       }

		
	}
	
	public void addStudent(StudentInfo s) {
		allstudents[count] = s;
		count++;
	}
	
	public StudentInfo[] getStudents() {
		return allstudents;
	}
}
