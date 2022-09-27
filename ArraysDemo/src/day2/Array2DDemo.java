package day2;

public class Array2DDemo {

	public static void main(String[] args) {
		
		
		int studentMarks[][] = new int[4][3]; // 5 students and 3 marks for every students , m1,m2 and final
		int i = 0;
		
		System.out.println();
		// ---- set marks of student -----
		studentMarks[i][0] = 88;
		studentMarks[i][1] = 77;
		studentMarks[i++][2] = 66;
		
		studentMarks[i][0] = 78;
		studentMarks[i][1] = 97;
		studentMarks[i++][2] = 26;
		
		studentMarks[i][0] = 18;
		studentMarks[i][1] = 97;
		studentMarks[i++][2] = 26;
		
		studentMarks[i][0] = 80;
		studentMarks[i][1] = 71;
		studentMarks[i++][2] = 56;
		
		studentMarks[i][0] = 82;
		studentMarks[i][1] = 72;
		studentMarks[i++][2] = 62;
		
		// <----- insert student marks 
		// ---- calculate and store total marks in different array (or in different Database column)
		int totalMarks[] = new int[5];
		i = 0;
		totalMarks[i] = studentMarks[i][0]+ studentMarks[i][1]+studentMarks[i][2]; i++;
		totalMarks[i] = studentMarks[i][0]+ studentMarks[i][1]+studentMarks[i][2]; i++;
		totalMarks[i] = studentMarks[i][0]+ studentMarks[i][1]+studentMarks[i][2]; i++;
		totalMarks[i] = studentMarks[i][0]+ studentMarks[i][1]+studentMarks[i][2]; i++;
		totalMarks[i] = studentMarks[i][0]+ studentMarks[i][1]+studentMarks[i][2]; 
		// <-- insert code to calculate new student marks
		i = 0;
		
		// ----- print marks of student whenever it requested [reports / data render ]
		System.out.println(" Marks of student  "+i+" - "+totalMarks[i++]);
		System.out.println(" Marks of student  "+i+" - "+totalMarks[i++]);
		System.out.println(" Marks of student  "+i+" - "+totalMarks[i++]);
		System.out.println(" Marks of student  "+i+" - "+totalMarks[i++]);
		System.out.println(" Marks of student  "+i+" - "+totalMarks[i]);
		
		// <<--- insert code to print new student marks 
		
		
		
		
		
		
		
								
		
		
	}

}
