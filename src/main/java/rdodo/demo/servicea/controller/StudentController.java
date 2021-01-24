package rdodo.demo.servicea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rdodo.demo.servicea.persistance.Student;
import rdodo.demo.servicea.persistance.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/home")
	public String home() {
		return "This is home";
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Student>> getAllStudent() {
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
		Student s = studentService.getStudentById(id);
		System.out.println(s.toString());
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}
}
