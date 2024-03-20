import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayLists
	{
		ArrayList<Student> students = new ArrayList<Student>();
		public static void fillArrayList()
		{
			Scanner myFile = new Scanner(new File("Studentlist.txt"));
				while(myFile.hasNext())
					{
					String firstName = myFile.next();
					String lastName = myFile.next();
					Course course1.setClassName = myFile.next();
					Course course1.setLetterGrade = myFile.next();
					Course course2.setClassName = myFile.next();
					Course course2.setLetterGrade = myFile.next();
					Course course3.setClassName = myFile.next();
					Course course3.setLetterGrade = myFile.next();
					
					students.add new Student(firstName, lastName, course1, course2, course3);
					
					}
		}

	
	}
