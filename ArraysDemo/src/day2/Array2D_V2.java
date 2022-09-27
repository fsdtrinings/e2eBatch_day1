package day2;

public class Array2D_V2 {

	public static void main(String[] args) {
		
		int studentMarks[][] = new int[5][3]; 
		
		int i = 0;
		
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
				
		// ---- calculate and store total marks in different array (or in different Database column)
				int totalMarks[] = new int[5];		
				
				for(int studentNumber = 0;studentNumber<studentMarks.length; studentNumber++)
				{
					int all3ExamMarks = 0;
					System.out.println("\n========== student "+studentNumber+"================================\n");
				
					for(int test=0;test<3;test++)
					{
						System.out.println("\t "+studentMarks[studentNumber][test]);
						all3ExamMarks += studentMarks[studentNumber][test];
						
					}
					totalMarks[studentNumber] = all3ExamMarks;
					System.out.println(" total marks :- "+all3ExamMarks);
				}
				
				
				// ============================= all records 
				for(int x = 0;x<totalMarks.length;x++)
				{
					System.out.println(totalMarks[x]);
				}
				
				
				
	}
}



















