import java.text.DecimalFormat;

public class CalculateGPA 
{
	
	DecimalFormat d = new DecimalFormat("0.00");
	private double convertGradeToNum(String letterGrade) {
		double count = 0.0;
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
	    double finalCount = count/3;
	    return d.format(finalCount);
}
}
