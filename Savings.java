public class Savings extends AccountClass{

    protected String safetyDepositBoxID;
    protected String safetyDepositBoxPin;

    public Savings(String name, String ssn, String balance) {
        super(name, ssn, balance);
        accountNumber = "2"+accountNumber;
        safetyDepositBoxID = generateRandomString(3);
        safetyDepositBoxPin = generateRandomString(4);
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        interestRate = super.interestRate - 0.25 ;

    }
    @Override
    public String showInfo() {
        return super.showInfo() +
                "\nACCOUNT TYPE: Savings  \n"+
                "SAFETY DEPOSIT BOX ID:" + safetyDepositBoxID + '\n' +
                "SAFETY DEPOSIT BOX PIN:" + safetyDepositBoxPin + '\n' +
                "INTEREST RATE:" + this.interestRate+'%';

    }
}