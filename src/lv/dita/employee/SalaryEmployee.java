package lv.dita.employee;

import lv.dita.paysystem.Payee;

public class SalaryEmployee extends Employee {

	public SalaryEmployee(String name, Integer bankAccount, double grossSalary) {
		super(name, bankAccount, grossSalary);
	}

	public Double grossPayment() {
		return grossSalary + doCurrentBonus();
	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossSalary*(percentage/100.00);
	}

}
