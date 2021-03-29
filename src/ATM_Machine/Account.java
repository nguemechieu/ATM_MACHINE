package ATM_Machine;

import java.util.Date;

//Account Class
public class Account {


    //Private Data fields for id, balance, date, and interest variables
    private double balance ;  //Store balance

    private   int id;//  store account  id
    private double annualInterestRate ;// store account interest
    private java.util.Date dateCreated=new Date() ;//Create account date
    private double withdraw;// store withdrawal amount
    private double deposit;// store deposit amount

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }



    // Default constructor with no arguments
    public Account() {

          this.id=0;
          this.balance=0;
    }

    // Account constructor with parameters
    public Account(int ID, double balance, double annualInterestRate) {

        this();
        this.id=ID;
        this.balance = balance;
        this.annualInterestRate=annualInterestRate;
        dateCreated =new java.util.Date();// Create new  account date
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double amount) {
        this.withdraw -= amount;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double amount) {
        this.deposit += amount;
    }

    public int getId() {     //Method that reads id variable
        return (int) (Math.random() * 1000);
    }

    public void setId(int id) {     //Updates the id variable value
        this.id=id;
    }

    public double getBalance() {     //Method that reads value of balance variable
        return balance += getDeposit() + getWithdraw();
    }

    public void setBalance(double balance) {    //Updates the value balance variable
        this.balance = balance;
    }

    public double getAnnualInterestRate() {      //Method that reads the annualInterestRate variable
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {      //Updates annualInterestRate variable
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {    //Method that calculates the monthly interest rate
        return getAnnualInterestRate()/100/12;
    }



    public double getMonthlyInterest() {     //Method that calculates monthly interest
        return balance * getMonthlyInterestRate();
    }




}
