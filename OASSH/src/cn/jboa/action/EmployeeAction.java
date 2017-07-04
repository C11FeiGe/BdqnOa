package cn.jboa.action;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

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
			HttpSession sessions=(HttpSession)ServletActionContext.getRequest().getSession();	
			sessions.setAttribute("login", objemp);
			sessions.setAttribute("employee_position", objemp.getSysPosition().getNameCn());
			return Action.SUCCESS;
		}else{
			HttpSession sessions=(HttpSession)ServletActionContext.getRequest().getSession();	
			sessions.setAttribute("loginerr", "登录失败");
			return Action.ERROR;
		}
		
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
