package lv.dita.employee;

import lv.dita.paysystem.Payee;

public class CommissionEmployee extends Employee {

	private Double grossCommission =0.00;
	private static final Double BONUS_MULTIPLIER = 1.5;

	public CommissionEmployee(String name, Integer bankAccount, double grossSalary) {
		super(name, bankAccount, grossSalary);

	}
	public Double grossPayment() {
		return grossSalary + doCurrentCommission() + doCurrentBonus();
	}

	private Double doCurrentCommission() {
		double commission = grossCommission;
//		grossCommission = 0.00;
		return commission;
	}

	public void giveCommission(Double amount) {
		grossCommission += amount;
	}
	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossSalary*(percentage/100.00)*BONUS_MULTIPLIER;

	}

}
