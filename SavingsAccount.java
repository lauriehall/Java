/************************************************************/
/* Program: Savings Account Class 8.6 pg 369                */
/* CIS163AA                                                 */
/* Laurie Hall                                              */
/* 11/18/2020                                               */
/* Purpose of program -  Create Savings account program     */
/* for 2 accounts, one with $2k starting balance and one    */ 
/* with $3k starting balance. Calculate interest at 4%      */
/* and show new account balances. After 12 months, increase */
/* to 5% interest and show 13th month with new balance      */
/* reflecting increased interest rate.                      */        
/************************************************************/

class savingsAccount  {
    private static double annualInterestRate; //static method
    private double savingsBalance;
    public savingsAccount (double amount) {
        this.savingsBalance = amount;
}
public void calculateMonthlyInterest() {
    double interest = (savingsBalance * annualInterestRate) / 12;
    savingsBalance += interest;
    return;
}
public static void modifyInterestRate (double interestRate) {
    annualInterestRate = interestRate;
}
public double getBalance() 
{
    return this.savingsBalance;
}}
