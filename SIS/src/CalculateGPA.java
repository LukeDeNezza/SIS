
import java.text.DecimalFormat;
<<<<<<< HEAD
=======

>>>>>>> a277283760e357e6ba47eaadb18cd5b24609bda1

public class CalculateGPA 
{

	
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	public void calculateGPA()
	{
<<<<<<< HEAD
		for(Student student : Database.students)
		{
		String[] classNames = {student.getClassName1(), student.getClassName2(), student.getClassName3()};
        String[] letterGrades = {student.getClassGrade1(), student.getClassGrade2(), student.getClassGrade3()};
        double totalGradePoints = 0.0;
=======
		double totalGradePoints= 0.0;
		
		
		for(int j=0;j<Database.students.size;j++)
		        {
				
		       	totalGradePoints+=convertGradeToNum(letterGrades[j]);
		        }
		
		for(int i=0;i<Database.students.size();i++)
		{
			Database.students.get(i);
			Database.students.gpa.set(i)=gpa;
			
			
		//{
			//String[] classNames = {Database.students.get(i).getClassName1(),
			//		Database.students.get(i).getClassName2(),Database.students.get(i).getClassName3()};
			//String[] letterGrades = {Database.students.get(i).getClassGrade1(),Database.students.get(i).getClassGrade2()
			//		,Database.students.get(i).getClassGrade3()};
			//double totalGradePoints = 0.0;
			//for(int j=0;j<classNames.length;j++)
	      //  {
	       // 	totalGradePoints+=convertGradeToNum(letterGrades[j]);
	      //  }
		
		
		//double gpa=totalGradePoints/classNames.length;
		//return Double.parseDouble(decimalFormat.format(gpa));
			}
		 
		
		//return Double.parseDouble(decimalFormat.format(gpa));
		
		//String[] classNames = {student.getClassName1(), student.getClassName2(), student.getClassName3()};
        //String[] //letterGrades = {student.getClassGrade1(), student.getClassGrade2(), student.getClassGrade3()};
        //double totalGradePoints = 0.0;
>>>>>>> a277283760e357e6ba47eaadb18cd5b24609bda1
        
       // for(int i=0;i<classNames.length;i++)
        //{
        //	totalGradePoints+=convertGradeToNum(letterGrades[i]);
        //}
	
	
	//double gpa=totalGradePoints/classNames.length;
	
<<<<<<< HEAD
	double roundedGpa= Double.parseDouble(decimalFormat.format(gpa));
	student.setGPA(roundedGpa);
		}
	
=======
	//return Double.parseDouble(decimalFormat.format(gpa));
>>>>>>> a277283760e357e6ba47eaadb18cd5b24609bda1
	
}
	

	private double convertGradeToNum(String letterGrade) {
		double count = 0.0;
<<<<<<< HEAD
=======
		
>>>>>>> a277283760e357e6ba47eaadb18cd5b24609bda1
	    if (letterGrade.equals("A+")) {
	        count += 4.3;
	    } else if (letterGrade.equals("A")) {
	        count += 4.0;
	    } else if (letterGrade.equals("A-")) {
	        count += 3.7;
	    } else if (letterGrade.equals("B+")) {
	        count += 3.3;
	    } else if (letterGrade.equals("B")) {
	        count += 3.0;
	    } else if (letterGrade.equals("B-")) {
	        count += 2.7;
	    } else if (letterGrade.equals("C+")) {
	        count += 2.3;
	    } else if (letterGrade.equals("C")) {
	        count += 2.0;
	    } else if (letterGrade.equals("C-")) {
	        count += 1.7;
	    } else if (letterGrade.equals("D+'")) {
	        count += 1.3;
	    } else if (letterGrade.equals("D")) {
	        count += 1.0;
	    }
	      else if(letterGrade.equals("D-")) {
	        count += 0.7;
	    }else if (letterGrade.equals("F")) {
	        count += 0.0;
	    } else {
	        count += 0.0; 
	    }


	    return count;
	}

}
