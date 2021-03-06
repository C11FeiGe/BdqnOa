package cn.jboa.entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 报销单实体类。
 *
 */
@SuppressWarnings("unchecked")
public class ClaimVoucher implements java.io.Serializable {

	private static final long serialVersionUID = -8423258065596709084L;
	private Long id;
	private Employee creator;
	private Employee nextDeal;
	private Date createTime;
	private String event;
	private Double totalAccount = 0d;
	private String status;
	private Date modifyTime;
	

	private List<ClaimVoucherDetail> detailList = new ArrayList<ClaimVoucherDetail>();
	private List checkResultList = new ArrayList();

	// Constructors

	/** default constructor */
	public ClaimVoucher() {
	}


	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	

	public Employee getCreator() {
		return creator;
	}

	public void setCreator(Employee creator) {
		this.creator = creator;
	}
	
	

	public Employee getNextDeal() {
		return nextDeal;
	}


	public void setNextDeal(Employee nextDeal) {
		this.nextDeal = nextDeal;
	}


	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Double getTotalAccount() {
		return this.totalAccount;
	}

	public void setTotalAccount(Double totalAccount) {
		this.totalAccount = totalAccount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public List<ClaimVoucherDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<ClaimVoucherDetail> detailList) {
		this.detailList = detailList;
	}


	public List getCheckResultList() {
		return checkResultList;
	}


	public void setCheckResultList(List checkResultList) {
		this.checkResultList = checkResultList;
	}
	
	

}