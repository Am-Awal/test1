package com.tcs.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.employee.utils.DBUtils;
import com.tcs.organization.model.Organization;
import com.tcs.organization.service.OrganizationService;
import com.tcs.organization.service.OrganizationServiceImpl;
import com.tcs.department.model.Department;
import com.tcs.department.service.DepartmentService;
import com.tcs.department.service.DepartmentServiceImpl;
import com.tcs.employee.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	DBUtils dbUtils;


	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		
		String insertEmployee = "insert into EMPLOYEE (employeeId,organizationId,departmentId,name,age, position) values(?,?,?,?,?,?)";
		
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(insertEmployee);
			preparedStatement.setLong(1, employee.getId());
			preparedStatement.setLong(2, employee.getOrganization().getId());
			preparedStatement.setLong(3, employee.getDepartment().getId());
			preparedStatement.setString(4, employee.getName());
			preparedStatement.setInt(5, employee.getAge());
			preparedStatement.setString(6, employee.getPosition());
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				connection.commit();
				
				return "success";
			}else return "fail";
			
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
		finally {DBUtils.closeConnection(connection);}

	}

	@Override
	public String updateEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub

		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Employee employee = null;
		String query = "select * from EMPLOYEE where employeeId=?";				
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			OrganizationService orgServ = new OrganizationServiceImpl();
			DepartmentService depServ = new DepartmentServiceImpl();

			
			
			if(resultSet.next()) {
					employee = new Employee();
				employee.setId(resultSet.getInt("employeeId"));
				employee.setName(resultSet.getString("name"));
				Optional<Organization> myOrg = orgServ.findById(resultSet.getLong("organizationId"));
				Optional<Department> myDep = depServ.findById(resultSet.getLong("departmentId"));
				employee.setOrganization(myOrg);
				employee.setDepartment(myDep);
				employee.setAge(resultSet.getInt("age"));
				employee.setPosition(resultSet.getString("position"));

			}
			
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
		finally {
			DBUtils.closeConnection(connection);
		}
		return Optional.ofNullable(employee);		
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
