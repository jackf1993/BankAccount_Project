package bankaccountapp;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    public static void main(String[] args) throws FileNotFoundException {

        List<Account> accounts = new LinkedList<>();

        String file = "C:\\Java Udemy Projects\\Projects\\BankAppication_Project_Final\\src\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for(String[] accountHolder: newAccountHolders){
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, SSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name,SSN,initDeposit));
            }
            else{
                System.out.println("Error Reading Account Type");
            }
        }

        for(Account acc: accounts){
            System.out.println("\n**************************");
            acc.showInfo();
        }


        /*
        Checking checking1 = new Checking("Tom Willson", "123457896", 1500);
        Savings savings1 = new Savings("Jack Farah", "9877411245" , 2500);



        checking1.showInfo();
        System.out.println("**************");
        savings1.showInfo();
        savings1.compound();
*/
    }
}
