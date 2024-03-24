package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IemployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired 
    @Qualifier("dao")
	private IemployeeDAO idao;
	@Override
	public String registerEmployee(Employee empl) throws Exception 
	{
		int count=0;
		float gsal=(empl.getSal()*40/100);
		float netsal= gsal-(gsal*40/100);
	    empl.setGsal(gsal);
	    empl.setNetsal(netsal);
	     count=idao.insert(empl);
	    return "student registered having "
	    		+ "gsal  :"+empl.getGsal()+" ,net sal:"+empl.getNetsal();
	}

}
