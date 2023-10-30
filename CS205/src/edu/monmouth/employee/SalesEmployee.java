package edu.monmouth.employee;

public class SalesEmployee implements Employee {
	
	private int commission;
	private int yearly_base; 
	
	public SalesEmployee(int yearly_base) {
		this.yearly_base = yearly_base;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	@Override
	public int getMonthlyPay() {
		return yearly_base / 12;
	}

	@Override
	public String toString() {
		return "SalesEmployee [commission=" + commission + ", yearly_base=" + yearly_base + "]";
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SalesEmployee)) {
			return false;
		}
		SalesEmployee that = (SalesEmployee) obj;
		return this.commission == that.commission
				&& this.yearly_base == that.yearly_base;
	}

}
