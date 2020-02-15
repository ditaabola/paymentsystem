package lv.dita.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	private List<Payee> payees;
	
		public PaymentSystem() {
		payees = new ArrayList<>();
	}

	public void addPayee(Payee payee) {
		if (!payees.contains(payee)) {
			payees.add(payee);
		}
	}

	public void processPayments() {
		for (Payee payee : payees) {
			Double grossPayment = payee.grossPayment();

			System.out.println("Paying to " + payee.name());
			System.out.println("Gross " + String.format("%1.2f", grossPayment));
			System.out.println("Transferred to Account " + payee.bankAccount()+"\n");
		}
	}
		public void printNames() {
			for (Payee payee : payees) {
				
				System.out.print(payee.name()+" ");
					}
		}
		}
