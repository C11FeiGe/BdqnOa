package cn.jboa.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.jboa.entity.ClaimVoucher;
import cn.jboa.entity.Employee;
import cn.jboa.service.ClaimVoucherService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ClaimAction extends ActionSupport{
	private ClaimVoucherService claimSer;
	private ClaimVoucher claimV;
	Map statusMap=new HashMap();
	
	public ClaimVoucherService getClaimSer() {
		return claimSer;
	}

	public void setClaimSer(ClaimVoucherService claimSer) {
		this.claimSer = claimSer;
	}

	public ClaimVoucher getClaimV() {
		return claimV;
	}

	public void setClaimV(ClaimVoucher claimV) {
		this.claimV = claimV;
	}

	public String execute(){
		List<ClaimVoucher> list2=claimSer.selectAll();
		List<ClaimVoucher> list1=claimSer.selectStatus();
		for (int i = 0; i < list1.size(); i++) {
			statusMap.put((i+1), list1.get(i));
		}
		Map map=new HashMap();
		map.put("items", list2);
		
		ServletActionContext.getRequest().setAttribute("pageSupport", map);
		ServletActionContext.getRequest().setAttribute("statusMap", statusMap);
		return Action.SUCCESS;
		
		
	}
}
