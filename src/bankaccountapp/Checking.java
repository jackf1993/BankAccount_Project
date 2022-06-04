package bankaccountapp;

public class Checking extends Account{
    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = 2 + accountNumber;
        setDebitCardNumber();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCardNumber(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() *Math.pow(10,4));
    }

    public void showInfo(){
        System.out.println("Checking Type: Checking");
        super.showInfo();
        System.out.println(
                "Your Checking Account Features: "+
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin: " + debitCardPin);
    }
}
