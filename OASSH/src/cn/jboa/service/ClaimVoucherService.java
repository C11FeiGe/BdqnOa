package cn.jboa.service;

import java.util.List;
import java.util.Map;

import cn.jboa.entity.ClaimVoucher;

public interface ClaimVoucherService {
	public List<ClaimVoucher> selectAll();

	//查询全部状态
		public List<ClaimVoucher> selectStatus();
}
