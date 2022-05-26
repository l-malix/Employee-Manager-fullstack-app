package dev.malix.employee_manager.repo;

import dev.malix.employee_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}

