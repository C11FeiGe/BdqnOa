package cn.jboa.dao;

import java.util.List;

import cn.jboa.entity.ClaimVoucher;

public interface ClaimVoucherdao {
	
	//查看报销单列表
	public List<ClaimVoucher> selectAll(Integer index,Integer pagesize);
	
	//查询全部状态
	public List<ClaimVoucher> selectStatus();
	
	//查询总记录数
	public Integer selectcount();

}
