package com.nt.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;


@Repository("empDAO")
@Scope("singleton")
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public int registerEmployee(EmployeeBO bo) throws Exception {
		System.out.println("inserting into Employee DB table having data::"+bo);
		return 1;
	}

}
