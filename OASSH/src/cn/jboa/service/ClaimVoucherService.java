package cn.jboa.service;

import java.util.List;
import java.util.Map;

import cn.jboa.entity.ClaimVoucher;

public interface ClaimVoucherService {
	public List<ClaimVoucher> selectAll(Integer index,Integer pagesize);

	//查询全部状态
	public List<ClaimVoucher> selectStatus();
		
	//查询全部记录数
	public Integer selectcount();
	
	

}
