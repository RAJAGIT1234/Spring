package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeMgmtImpl implements EmployeeMgmtService {
    private EmployeeDAO dao;
	
	public EmployeeMgmtImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public int fetchEmpscount() {
		// use Dao
		return dao.getEmpsCount();
	}

	@Override
	public String fetchEmpNameByNo(int no) {
		return dao.getEmpNameByNo(no);
	}
	
	@Override
	public Map<String, Object> fetchEmpDetailsByNo(int no) {
		
		return dao.getEmpDetailsByNo(no);
	}

	@Override
	public List<Map<String, Object>> getEmpDetailsByDesgs(String desg1, String desg2) {
		
		return dao.getEmpDetailsByDesgs(desg1, desg2);
	}
	@Override
	public String registerEmp(String name, String desg, float salary) {
		int count=0;
		//use dao
		count=dao.insertEmp(name, desg, salary);
		return count==0?"Employee not registered":"employee register";//ternary operator
	}
	@Override
	public String putBounsToEmpByDesg(String desg, float bonus) {
		int count=0;
		//use Dao
		count=dao.addBonusToEmpByDesg(desg, bonus);
		return count==0?"employee not found to daa bouns":count+"no.of salary is added with bouns";
	}
}
