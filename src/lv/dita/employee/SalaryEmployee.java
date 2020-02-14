package lv.dita.employee;

import lv.dita.paysystem.Payee;

public class SalaryEmployee implements Payee{
	
	private String name;
	private Integer bankAccount;
	private double grossSalary;
	
	SalaryEmployee (String name, Integer bankAccount, double grossSalary){
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossSalary = grossSalary;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}

	@Override
	public Double grossPayment() {
		return grossSalary;
	}
	

}
