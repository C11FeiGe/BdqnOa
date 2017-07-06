package cn.jboa.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.ClaimVoucherdao;
import cn.jboa.entity.ClaimVoucher;

public class ClaimVoucherdaoImpl extends HibernateDaoSupport implements
		ClaimVoucherdao {



	@Override
	public List<ClaimVoucher> selectStatus() {
		return super.getHibernateTemplate().find(
				"select status from ClaimVoucher group by status");
	}

	@Override
	public Integer selectcount() {
		return ((Number) super.getHibernateTemplate().find("select count(id) from ClaimVoucher").listIterator().next()).intValue();
}

	@Override
	public List<ClaimVoucher> selectAll(final Integer index, final Integer pagesize) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			   
			   public Object doInHibernate(Session session) throws HibernateException,
			     SQLException {
			    List result = session.createQuery("from ClaimVoucher").setFirstResult(index)
			        .setMaxResults(pagesize)
			        .list();
			    return result;
			   }
			  });
			  return list;
	}
}
