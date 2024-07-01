package pattren.structural.facade.bankaccount;

public class SecurityCodeCheck {

    public int getSecurityCode() {
        return 1234;
    }

    public boolean isCodeCorrect(int securityCode) {
        return securityCode == getSecurityCode();
    }
}
