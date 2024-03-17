package pattren.structural.facade.bankaccount;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return this.securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {
        if (securityCode == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
