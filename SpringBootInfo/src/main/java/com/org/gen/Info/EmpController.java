package com.org.gen.Info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@RequestMapping("/empinfo")
	public Employee Emp(@RequestParam(value="Empid" ) String Empid)
	{
		Employee e1=new Employee();
		e1.setEmpName("Sourabh");
		e1.setEmpid(101);
		e1.setAddress("Noida");
		return e1;
	}
	

}
