package cn.jboa.service.impl;

import java.util.List;

import cn.jboa.dao.Employeedao;
import cn.jboa.entity.Employee;
import cn.jboa.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private Employeedao empdao;

	public Employeedao getEmpdao() {
		return empdao;
	}

	public void setEmpdao(Employeedao empdao) {
		this.empdao = empdao;
	}

	@Override
	public Employee login(Employee emp) {
		List list = empdao.login(emp);
		if (list.size() > 0) {
			return (Employee) list.get(0);
		} else {
			return null;
		}
	}

}
