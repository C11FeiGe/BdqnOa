package cn.jboa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.jboa.dao.ClaimVoucherdao;
import cn.jboa.entity.ClaimVoucher;
import cn.jboa.service.ClaimVoucherService;

public class ClaimVoucherServiceImpl implements ClaimVoucherService {

	private ClaimVoucherdao cldao;
	public ClaimVoucherdao getCldao() {
		return cldao;
	}
	public void setCldao(ClaimVoucherdao cldao) {
		this.cldao = cldao;
	}
	@Override
	public List<ClaimVoucher> selectAll() {
		List<ClaimVoucher> lists=cldao.selectAll();
		return lists;
	}
	@Override
	public List<ClaimVoucher> selectStatus() {
		List<ClaimVoucher> list1=cldao.selectStatus();
		
		return list1;
	}

}
