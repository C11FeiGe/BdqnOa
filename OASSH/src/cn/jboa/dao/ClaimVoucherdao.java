package cn.jboa.dao;

import java.util.List;

import cn.jboa.entity.ClaimVoucher;

public interface ClaimVoucherdao {
	
	//查看报销单列表
	public List<ClaimVoucher> selectAll();

}
