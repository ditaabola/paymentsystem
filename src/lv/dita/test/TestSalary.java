package lv.dita.test;

import java.util.Arrays;

import lv.dita.employee.CommissionEmployee;
import lv.dita.employee.SalaryEmployee;
import lv.dita.paysystem.PaymentSystem;

public class TestSalary {

	public static void main(String[] args) {
	
		PaymentSystem paymentSystem = new PaymentSystem();
		
		CommissionEmployee tomsBerzins = new CommissionEmployee("Toms Berzins", 543879, 1000.00);
		paymentSystem.addPayee(tomsBerzins);
		CommissionEmployee ievaBerzina = new CommissionEmployee("Ieva Berzina", 234903, 1200.00);
		paymentSystem.addPayee(ievaBerzina);
		
		SalaryEmployee dinaSkreitule = new SalaryEmployee("Dina Skreitule", 420503, 1500.00);
		paymentSystem.addPayee(dinaSkreitule);
		SalaryEmployee maijaUsca = new SalaryEmployee("Maija Usca", 425673, 1500.00);
		paymentSystem.addPayee(maijaUsca);
		
		// simulate work
		
		tomsBerzins.giveCommission(200.00);
		tomsBerzins.giveCommission(20.00);
		ievaBerzina.giveCommission(50.00);
		ievaBerzina.giveCommission(200.00);
		ievaBerzina.giveCommission(70.00);
		
		paymentSystem.printNames();
		tomsBerzins.giveBonus(5.0);
		ievaBerzina.giveBonus(10.0);
		dinaSkreitule.giveBonus(10.00);
		maijaUsca.giveBonus(8.00);
		
		System.out.println("\n");
		
		paymentSystem.processPayments();
			
		
	}

}
