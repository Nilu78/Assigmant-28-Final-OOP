public abstract class AccountClass implements BaseInterestRate{
    protected String name;
    protected String ssn;
    protected String balance;
    protected String accountNumber;
    protected String routingNumber;
    protected double interestRate;

    public AccountClass(String name, String ssn, String balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        this.interestRate = BaseInterestRate.getBaseInterestRate();
    }
    public String generateAccountNumber(){

        return ssn.substring(ssn.length()-4) + generateRandomString(7);
    }
    public String generateRoutingNumber(){

        return "00"+ generateRandomString(7);
    }
    public void deposit(double Amount){
        balance += Amount;
        System.out.println("New Balance : " + balance );
    }
    public void withdraw(double  Amount){
        // if (Amount > balance) {
        //     System.out.println("You cannot withdraw more than your balance!");
        // }else{
        //     balance -= Amount;
            System.out.println("New Balance : " + balance );

        // }

    }
    public String showInfo() {
        return  "NAME:" + name + '\n' +
                "SSN:" + ssn + '\n' +
                "ACCOUNT NUMBER:" + accountNumber + '\n' +
                "ROUTING NUMBER:" + routingNumber + '\n' +
                "BALANCE:" + balance ;
    }
    public static String generateRandomString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            str = str + (int) (Math.random() * 10);
        }
        return str;
    }
}