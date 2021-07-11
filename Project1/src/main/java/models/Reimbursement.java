package models;

import java.sql.ResultSet;

/*
 * Class for reimbursement
 * rebur: reimbursement ID
 * amount: amount of money
 * requester: employee who requested
 * resolver: manager who resolved
 * status: comes as 'pending', 'approved', or 'denied'
 */

public class Reimbursement {

	
	private long amount;
	private String requester;
	private String resolvedby;
	private String status;

	
	// the manager can view reimbursements completely
	public Reimbursement( String requester, String resolvedby, long amount, String status) {
		
	}
	
	// the employees can view reimbursements they have 
	public Reimbursement( long amount, String requester, String status) {
		
	}
	
	
	public Reimbursement(ResultSet resultSet) {
		
	}

	

	public Reimbursement(String status, int amount, String requester, String resolvedby) {
		// TODO Auto-generated constructor stub
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public String getResolvedby() {
		return resolvedby;
	}

	public void setResolver(String resolvedby) {
		this.resolvedby = resolvedby;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
