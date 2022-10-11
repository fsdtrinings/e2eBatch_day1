package maps2;

import java.util.Comparator;

public class StudentsSortedByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
	
		int totalOfS1 = getTotalMarksofStudent(s1);
		int totalOfS2 = getTotalMarksofStudent(s2);
		
		return totalOfS1 - totalOfS2;
		
		
	}

	
	public int getTotalMarksofStudent(Student s)
	{
		int total = 0;
		for (Subject subject : s.getAllSubjects()) {
			total += subject.getMarksObtain();
		}
		return total;
	}
	
}
