package oxbank.oxbankapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loans {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long loanId;
	
	private String securityAddress;
	private String loanStatus;
	private double loanAmount;
	private Long approvingManagerId;
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public String getSecurityAddress() {
		return securityAddress;
	}
	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Long getApprovingManagerId() {
		return approvingManagerId;
	}
	public void setApprovingManagerId(Long approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}
	
}
