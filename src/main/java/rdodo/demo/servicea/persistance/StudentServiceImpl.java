package rdodo.demo.servicea.persistance;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.getOne(id);
	}
	
}
