//Course Code: CSC164-6C1 Computer Science II
//Author: Kirin Stevens, Noel Martial Nguemechieu
//Course Code: CSC164-6C1 Computer Science II
//Submission Type: Project1a 9.7 The Account Class
//Due Date: 2021/03/02

/*Description: Create a program that creates an account object, The account must have an id of 11222 and a balance of
                $20,000. Create a method to withdraw 2,500 and deposit 3,000 with an annual interest rate of 4.5%.
                Print out the resulting balance, interest rate, and the current date.
 */


import ATM_Machine.Account;

// Main class
    public class Project1a {

    //Main method
    public static void main(String[] args) {
        Account account = new Account();// Create  new account object

        account.setId((int) (Math.random() * 9000));//Set Random account number

        account.setAnnualInterestRate(4.5); //set bank annual interest

        account.setBalance(20000);//set account balance to 20000

        account.setAnnualInterestRate(4.5);     //Sets amount of interest rate in account Object

        account.setDeposit(3000);     //Sets value of deposit variable in account Object

        account.setWithdraw(25000);     //Sets value of withdraw variable in account Object

        System.out.println("Account ID: " + account.getId() + " Date :" + account.getDateCreated());//Display Account Id

        System.out.println("Balance $: " + account.getBalance());//print balance

        // control balance before withdrawal
        if (account.getBalance()<0) {

            System.out.println("Insufficient balance. Your account is overdraw!");
        }
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());    //Prints monthly interest rate

        System.out.println("Deposit:" + account.getDeposit());//print deposit

        System.out.println("Withdraw:" + account.getWithdraw());  //Sets value of withdraw variable in account Object

    }



    }// Project1a class end

