package vendingmachine.controller;

import vendingmachine.domain.Money;
import vendingmachine.domain.VendingMachine;
import vendingmachine.service.VendingMachineService;
import vendingmachine.view.ExceptionView;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class VendingMachineController {
	private VendingMachine vendingMachine;

	public VendingMachineController(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void run() {
		while (vendingMachine.isBuy()) {
			OutputView.insertMoneyUI(vendingMachine.getInsertMoney());
			String productName = RequestController.requestProductName();
		}
	}

	public void insertMoney() {
		try {
			Money insertMoney = RequestController.requestInsertMoney();
			VendingMachineService.insertMoney(vendingMachine, insertMoney);
		} catch (IllegalArgumentException e) {
			ExceptionView.errorUI(e.getMessage());
			insertMoney();
		}
	}
}
