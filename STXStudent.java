
class STXStudent
{
	private int studentNumber;
	private String lastName;
	private String firstName;
	private double GPA;

	public STXStudent()
	{
		studentNumber = 10202;
		lastName = "Joey";
		firstName = "Joe";
		GPA = 3.7;
	}

	public STXStudent(int sn, String ln, String fn, double gpa)
	{
		studentNumber = sn;
		lastName = ln;
		firstName = fn;
		GPA = gpa;
	}

	public int getStudentNumber()
	{
		return studentNumber;
	}


	public void setStudentNumber(int sn)
	{
		studentNumber = sn;
	}

	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String fn)
	{
		firstName = fn;
	}

	public String getLastName()
	{
		return lastName;
	}


	public void setLastName(String ln)
	{
		lastName = ln;
	}

	public double getGPA()
	{
		return GPA;
	}


	public void setGPA(double gpa)
	{
		GPA = gpa;
	}
}
