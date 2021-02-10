//**********************
//* Grant Guernsey     *
//* Period D           *
//* Lab 3.1            *
//**********************

import java.util.Random;
import java.util.Scanner;

public class studentArray
{
	public static void main(String[]args)
	{
		STXStudent studArray [] = new STXStudent[5];
		studArray[0] = new STXStudent();
		studArray[1] = new STXStudent(11052, "Guernsey", "Grant", 3.9);
		studArray[2] = new STXStudent(12069, "Bob", "Billy", 4.20);
		studArray[3] = new STXStudent(10002, "Jeff", "Geoff", 1.1);
		studArray[4] = new STXStudent(12342, "Jones", "Alex", 1.0);

		System.out.println("Student 1 has a student number of " + studArray[0].getStudentNumber());
		System.out.println("Student 2's last name is " + studArray[1].getLastName());
		System.out.println("Student 3's first name is " + studArray[2].getFirstName());
		System.out.println("Student 4's GPA is " + studArray[3].getGPA());
		System.out.println("Student 5's full name is " + studArray[4].getFirstName() + " " + studArray[4].getLastName());
	}
}