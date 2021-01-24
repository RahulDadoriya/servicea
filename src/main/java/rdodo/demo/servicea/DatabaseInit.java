package rdodo.demo.servicea;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import rdodo.demo.servicea.persistance.Student;
import rdodo.demo.servicea.persistance.StudentRepo;

public class DatabaseInit implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Rahul Dadoriya", "Gwalior, (M.P.)", 80));
		studentList.add(new Student("Purnima Singhal", "New Delhi", 95));
		studentList.add(new Student("Tommy Hilfigure", "Gulla, (U.P.)", 83));
		studentList.add(new Student("Lalita Ben", "Mulla, (A.P.)", 69));
		studentList.add(new Student("Stan Lee", "Gwalior, (M.P.)", 40));
		studentList.add(new Student("Jack Mohan", "New Delhi", 34));
		studentList.add(new Student("Ravindra Rathore", "New Delhi, (M.P.)", 67));
		studentList.add(new Student("Vipin Yadav", "Mulla, (A.P.)", 55));
		studentList.add(new Student("Lokesh Pandey", "Gwalior, (M.P.)", 71));
		
		studentRepo.saveAll(studentList);
	}

}
