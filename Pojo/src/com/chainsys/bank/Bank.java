package com.chainsys.bank;

public class Bank {
	private String branchName;
    private String IFSC;
    private long accNo;
    private int amount;
    public int rand;
	
	public Bank(String branchName, String iFSC, long accNo, int amount,int rand) {
		this.branchName = branchName;
		this.IFSC = iFSC;
		this.accNo = accNo;
		this.amount=amount;
		this.rand=rand;
		
	}
	public int getRand() {
		return rand;
	}
	public void setRand(int rndLimit) {
		this.rand = rndLimit;
	}
	public Bank() {
		
	}
	
	public long getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getIFSC() {
		return IFSC;
	}

	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public void setIFSC(String iFSC) {
		this.IFSC = iFSC;
	}
	
	@Override
	public String toString() {
		return "Bank [branchName=" + branchName + ", IFSC=" + IFSC + ", accNo=" + accNo + ", amount=" + amount
				+ ", rand=" + rand + "]";
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
 
}


