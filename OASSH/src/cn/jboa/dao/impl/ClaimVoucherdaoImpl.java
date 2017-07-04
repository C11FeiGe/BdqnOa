package cn.jboa.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.ClaimVoucherdao;
import cn.jboa.entity.ClaimVoucher;

public class ClaimVoucherdaoImpl extends HibernateDaoSupport implements ClaimVoucherdao {

	@Override
	public List<ClaimVoucher> selectAll() {
		return super.getHibernateTemplate().find("from ClaimVoucher");
	}

}
