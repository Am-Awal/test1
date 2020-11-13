package com.tcs.department.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.tcs.department.model.Department;
import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.dao.EmployeeRepositoryImpl;
import com.tcs.employee.model.Employee;
import com.tcs.employee.utils.DBUtils;

public class DepartmentRepositoryImpl implements DepartmentRepository {
	
	private DepartmentRepositoryImpl() {
		
		// TODO Auto-generated constructor stub
}
private static DepartmentRepository departmentRepo;

public static DepartmentRepository getInstance() {
	
	if(departmentRepo==null) {
		departmentRepo = new DepartmentRepositoryImpl();
		return departmentRepo;
	}
	return departmentRepo;
}
	

	@Override
	public String addDepartment(Department department) {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		
		String insertEmployee = 
				"insert into DEPARTMENT (departmentId,organizationId,name) values(?,?,?)";
		
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(insertEmployee);
			preparedStatement.setLong(1, department.getId());
			preparedStatement.setLong(2, department.getOrganizationId());
			preparedStatement.setString(3, department.getName());
			
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
	public String updateDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Department department = null;
		String query = "select * from DEPARTMENT where departmentId=?";				
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
					department = new Department();
					department.setId(resultSet.getInt("departmentId"));
					department.setName(resultSet.getString("name"));
					department.setOrganizationId(resultSet.getLong("organizationId"));

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
		return Optional.ofNullable(department);		
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Department>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
