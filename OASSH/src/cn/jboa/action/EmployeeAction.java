package cn.jboa.action;

import cn.jboa.entity.Employee;
import cn.jboa.service.EmployeeService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	private Employee employee;
	private EmployeeService empservice;
	
	public String execute(){
		System.out.println("************进来");
		Employee objemp=empservice.login(employee);
		if(objemp != null){
			System.out.println("yes");
			
		}else{
			System.out.println("no");
		}
		return Action.SUCCESS;
		
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService getEmpservice() {
		return empservice;
	}

	public void setEmpservice(EmployeeService empservice) {
		this.empservice = empservice;
	}
	
	
	

	
	
	

}
