package codingtechniques.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codingtechniques.model.Employee;
import codingtechniques.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> findEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeId(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}