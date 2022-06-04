package bankaccountapp;

public class Savings extends Account {
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = 1 + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() *Math.pow(10,4));
    }

    public void showInfo(){
        System.out.println("Checking Type: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account features: "+
                "\n Safety Deposit Box ID: "+ safetyDepositBoxId+
                "\n Safety Deposit Box Key: "+ safetyDepositBoxKey
        );

    }
}
