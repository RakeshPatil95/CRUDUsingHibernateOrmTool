package dao;

import dto.EmployeeDto;

public interface IEmployeeDaoImpl {
	
	public EmployeeDto getEmployee(EmployeeDto employeeDto);
	public boolean deleteEmployee(EmployeeDto employeeDto);
	public EmployeeDto updateEmployee(EmployeeDto employeeDto);
	public EmployeeDto addEmployee(EmployeeDto employeeDto);

}
