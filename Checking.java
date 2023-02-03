public class Checking extends AccountClass {

    protected String debitCardNo;
    protected String debitCardPIN;


    public Checking(String name, String ssn, String balance) {
        super(name, ssn, balance);
        accountNumber = "1"+accountNumber;
        debitCardNo = generateDebitCardNo();
        debitCardPIN = generateRandomString(4);
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        interestRate = (super.interestRate * 15)/100;
    }
    public String generateDebitCardNo(){
        return "9"+generateRandomString(15);
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                "\nACCOUNT TYPE: Checking  \n"+
                "DEBIT CARD NUMBER:" + debitCardNo + '\n' +
                "DEBIT CARD PIN:" + debitCardPIN + '\n' +
                "INTEREST RATE:" + this.interestRate+'%';

    }
}