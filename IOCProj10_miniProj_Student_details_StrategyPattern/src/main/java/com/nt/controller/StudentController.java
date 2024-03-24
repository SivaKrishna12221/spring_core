package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Student;
import com.nt.service.IstudentService;
@Controller("stuController")
public class StudentController 
{
	@Autowired
  private IstudentService iservice;//has-a property
  public String processStudent(Student stu)throws Exception
  {
	  String result=iservice.studentRegistration(stu);
	  return result;
  }
}
