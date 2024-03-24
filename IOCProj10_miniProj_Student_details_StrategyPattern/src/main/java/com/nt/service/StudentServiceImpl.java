package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IstudentDAO;
import com.nt.model.Student;
@Service("studService")
public class StudentServiceImpl implements IstudentService 
{
	@Autowired
	@Qualifier("dao")
	private IstudentDAO istudDAO;
	
   
	@Override
	public String studentRegistration(Student stu) throws Exception
	{
		int count=0;
		float average=((stu.getMaths()+stu.getStats()+stu.getComps())/3);
		int total=stu.getMaths()+stu.getStats()+stu.getComps();
		stu.setAverage(average);
		stu.setTotal(total);
		
		 count=istudDAO.insert(stu);
		return "Student registered having average marks"+average+",total marks:"
				+total;
		
		
	}

}
