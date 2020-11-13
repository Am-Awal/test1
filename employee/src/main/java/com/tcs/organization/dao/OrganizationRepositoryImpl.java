package com.tcs.organization.dao;

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
import com.tcs.organization.model.Organization;

public class OrganizationRepositoryImpl implements OrganizationRepository {
	
	
	
private OrganizationRepositoryImpl() {
	
		// TODO Auto-generated constructor stub
}
private static OrganizationRepository organizationRepo;

public static OrganizationRepository getInstance() {
	
	if(organizationRepo==null) {
		organizationRepo = new OrganizationRepositoryImpl();
		return organizationRepo;
	}
	return organizationRepo;	
	
}


	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub

		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		
		String insertOrganization = 
			"insert into ORGANIZATION (organizationId, name, address) values(?,?,?)";
		
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(insertOrganization);
			preparedStatement.setLong(1, organization.getId());
			preparedStatement.setString(2, organization.getName());
			preparedStatement.setString(3, organization.getAddress());
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
	public String updateOrganization(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrganization(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub

		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Organization organization = null;
		String query = "select * from ORGANIZATION where organizationId=?";				
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				organization = new Organization();
				organization.setId(resultSet.getInt("organizationId"));
				organization.setName(resultSet.getString("name"));
				organization.setAddress(resultSet.getString("address"));
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
		return Optional.ofNullable(organization);		
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

}
