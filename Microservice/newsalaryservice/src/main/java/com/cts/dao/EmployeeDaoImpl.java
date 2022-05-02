package com.cts.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Employee getEmployee(int empno) {
		   String sql="select * from employee where empno="+empno;
		    List<Employee>elist= getJdbcTemplate().query(sql,new EmpMapper());
		    return elist.get(0);
	}
	class EmpMapper implements RowMapper<Employee>{

		@Override
           public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			System.out.println(arg1);
			Employee e=new Employee(); 
			e.setEmpno(rs.getInt(1));    
            e.setName(rs.getString(2));    
            e.setSalary(rs.getInt(3));    
            return e;
		}
		
		
		
	}
	public Employee updateSalary(Employee emp){    
		//  Employee emp=restTemplate.getForObject("http://eureka-employee-service/employee/{empno}",Employee.class);
         // emp = new Employee(101,"Anita", 2000);
		int empno=emp.getEmpno();
		String name=emp.getName();
		int sal=emp.getSalary()+107;
		String sql="update employee set salary="+sal+" where empno="+empno;
		if(jdbcTemplate.update(sql)==1) {
			emp.setSalary(sal);
			return emp;
		}
	     return null;  
	}
}
