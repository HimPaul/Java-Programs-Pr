package basicjavaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentClassComparable {

	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(3,"sachin"));
		st.add(new Student(7 ,"himadri"));
		st.add(new Student(9, "Sourav"));
		st.add(new Student(1, "loru"));
		
		Collections.sort(st);
		
		for(Student sb : st) {
			System.out.println(""+sb.rollno + " "+sb.name);
		}
		
   }
}
