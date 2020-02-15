package lv.dita.employee;

import lv.dita.paysystem.Payee;

public abstract class Employee implements Payee {
	private String name;
	private Integer bankAccount;
	
	protected Double currentBonus;
	protected Double grossSalary;
	

	public Employee(String name, Integer bankAccount, Double grossSalary) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossSalary = grossSalary;
		currentBonus = 0.00;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}

	public abstract void giveBonus(Double percentage);
	
	protected Double doCurrentBonus(){
		Double bonus = currentBonus;
		currentBonus = 0.00;
		return bonus;
	}

}
