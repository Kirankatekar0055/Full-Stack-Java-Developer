package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Employeecontroller 
{
	@Autowired
	EmployeeRepos repo;
	
	@RequestMapping("emp")
	public String show()
	{
		return "EmpInfo";
	}
	
	@RequestMapping("insert")
	public String show1()
	{
		return "InsertEmp";
	}
	
	@RequestMapping("insEmp")
	public String show(EmpRec emp)
	{
		repo.save(emp);
		System.out.println("Record Inserted...");
		return "EmpInfo";
		
	}
	
	@RequestMapping("select")
	public String show2()
	{
		return "SelectEmp";
		
	}
	
	@RequestMapping("selEmp")
	@ResponseBody
	public EmpRec show3(@RequestParam("id") int id)
	{
		return repo.findById(id).orElse(null);
		
	}
	
	@RequestMapping("showall")
	@ResponseBody
	public List<EmpRec>show4()
	{
		return repo.findAll();
		
	}
	
	

}
