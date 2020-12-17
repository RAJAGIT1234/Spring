package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeMgmtService {
public int fetchEmpscount();
public String fetchEmpNameByNo(int eno);
public Map<String,Object>fetchEmpDetailsByNo(int no);
public List<Map<String,Object>>getEmpDetailsByDesgs(String desg1,String desg2);
public String registerEmp(String name,String desg,float salary);
public String putBounsToEmpByDesg(String desg,float bonus);
}
