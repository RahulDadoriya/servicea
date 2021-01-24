package rdodo.demo.servicea.persistance;

import java.util.List;

public interface StudentService {
	List<Student> getAllStudent();
	Student getStudentById(int id);
}
