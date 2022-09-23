package p1;

public class StudentMarksApp {
		
	/*    ---- information from business (BA)
	   if marks is less than 100 : fail 
	   100-150 : C
	   151-200 : B
	   201-250 : A
	   251+ - 300 : Ex
	   300+ : error 
	 
	 * */
	
	public static void main(String[] args) {
	
		
		int english = 50;
		int hindi = 93;
		int maths = 80;
		String grade = "";
		String studentName = "Ramesh";
		
		int totalMarks = english+hindi+maths;
		
		if(totalMarks < 100)
		{
			grade = "fail";
		}
		else if(totalMarks>=101 && totalMarks<=150)
		{
			grade = "C";
		}
		else if(totalMarks>=151 && totalMarks<=200)
		{
			grade = "B";
		}
		else if(totalMarks>=201 && totalMarks<=250)
		{
			grade = "A";
		}
		else if(totalMarks>=250 && totalMarks<=300)
		{
			grade = "Ex";
		}
		else if(totalMarks>300)
		{
			grade = "error";
		}
		
		System.out.println("Student "+studentName+"  score "+grade+" grade");
		
		
	}
	

}
