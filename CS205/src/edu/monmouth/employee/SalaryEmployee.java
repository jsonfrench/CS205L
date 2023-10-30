package edu.monmouth.employee;

public class SalaryEmployee implements Employee {

	private int yearly_salary;

	public SalaryEmployee(int yearly_salary) {
		this.yearly_salary = yearly_salary;
	}
	
	@Override
	public int getMonthlyPay() {
		return yearly_salary / 12;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [yearly_salary=" + yearly_salary + "]";
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SalaryEmployee)) {
			return false;
		}
		SalaryEmployee that = (SalaryEmployee) obj;
		return this.yearly_salary == that.yearly_salary;
	}
}
