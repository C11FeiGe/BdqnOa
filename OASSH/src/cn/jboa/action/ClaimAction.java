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

public class ClaimAction extends ActionSupport {
	private ClaimVoucherService claimSer;
	private ClaimVoucher claimV;

	private Integer pageNo;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}



	Map statusMap = new HashMap();

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

	public String execute() {
		if (pageNo == null) {
			pageNo = 1;
		}
		List<ClaimVoucher> list2 = claimSer.selectAll(pageNo, 5);
		List<ClaimVoucher> list1 = claimSer.selectStatus();
		Integer tolCount = claimSer.selectcount();
		for (int i = 0; i < list1.size(); i++) {
			statusMap.put((i + 1), list1.get(i));
		}
		
		System.out.println(tolCount);
		Integer totalPageCount =tolCount % 5==0?tolCount/5:tolCount/5+1;
		
		Map map = new HashMap();
		map.put("items", list2);
		map.put("currPageNo", pageNo);
		map.put("totalCount", tolCount);
		map.put("totalPageCount", totalPageCount);

		ServletActionContext.getRequest().setAttribute("pageSupport", map);
		ServletActionContext.getRequest().setAttribute("statusMap", statusMap);
		return Action.SUCCESS;

	}
}
