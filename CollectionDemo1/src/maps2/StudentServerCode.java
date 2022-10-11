package maps2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentServerCode {
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
  ///       stream has number students 	
	Map<String, List<Student>> colg = new HashMap<>();

	
	public int insertStudent(Student student)
	{
		String studentStream = student.getStream();
		
		List<Student> allStudentsOfStream = getStudentByStream(studentStream);
		// initally no student in the stream , so we'll null
		if(allStudentsOfStream == null)
		{
			List<Student> newListOfStudents = new ArrayList<>(); // created new list
			newListOfStudents.add(student);// insert student in new list
			
			colg.put(studentStream, newListOfStudents); // bind the list with stream through hashMap
		}
		else if(allStudentsOfStream != null)
		{
			// if Stream already having students , then add the student under that list
			allStudentsOfStream.add(student);
		}
		
		// number of students in the Stream
		return colg.get(student.getStream()).size();
	}
	
	
	public Student getStudentBasedOnRollNumberAndStream(int rollNumber,String stream)
	{
		List<Student> allStudentsOfStream = getStudentByStream(stream);
		if(allStudentsOfStream != null)
		{
				for (Student student : allStudentsOfStream) {
					if(student.getRollNum() == rollNumber)
						return student;
				}
		}
		return null;
	}
	
	public Student updateStudentProfile(Student student,StudentDetails profile)
	{
		
		student.setProfile(profile);
		return student;
	}
	
	public Student addStudentMarks(Student student, List<Subject> subjects)
	{
		
		
			student.setAllSubjects(subjects);
			return student;
		
	}
	
	
	
	public List<Student> getStudentByStream(String stream)
	{
		List<Student> allStudentsOfStream = colg.get(stream);
		return allStudentsOfStream;
				
	}
	public List<Student> getStudentByStreamSortedByMarks(String stream)
	{
		List<Student> allStudentsOfStream = getStudentByStream(stream);
		Collections.sort(allStudentsOfStream,new StudentsSortedByMarks());
		return allStudentsOfStream;
	}
	
}
