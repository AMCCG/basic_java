package pattren.structural.facade;

import pattren.structural.facade.bankaccount.BankAccountFacade;

public class MainFacade {
    public static void main(String[] args) {
        System.out.println("Facade");
        System.out.println("*********************************");
        BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 1234);
        bankAccountFacade.withdrawCash(50.00);
        bankAccountFacade.withdrawCash(50.00);
        bankAccountFacade.depositCash(200);
    }

}
