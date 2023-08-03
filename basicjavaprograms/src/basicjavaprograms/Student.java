package basicjavaprograms;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		
		if (rollno == o.rollno)
			
			return 0;
		
		else if (rollno > o.rollno)
			
			return 1;
		
		else 
			
			return -1;
	}
	
}
