/************************************************************/
/* Program: Savings Account Class 8.6 pg 369                */
/* CIS163AA                                                 */
/* Laurie Hall                                              */
/* 11/18/2020                                               */
/* Purpose of program -  RUN PROGRAM for                    */
/* SavingsAccount.java file. Displays running 13 months of  */ 
/* two savings accounts ($2k and $3k starting balances with */
/* 4% interest for the first 12 months and 5% interest in   */
/* the 13th month                                           */
/************************************************************/

public class TestSavings {
    public static void main(String[] args)
    {
        savingsAccount saver1 = new savingsAccount (2000.0);
        savingsAccount saver2 = new savingsAccount (3000.0);
        savingsAccount.modifyInterestRate(.04);
        
            int i;
            System.out.println("Account Balance");
            System.out.format("%-8s %9s %9s\n", "Month", "Saver1", "Saver2");
    
            for (i = 1; i <=12; i++) {
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
    
                System.out.format("%-8d %9.2f %9.2f\n", i + 1, saver1.getBalance(), saver2.getBalance());
    
                  if (i == 12) {  //after the end of 12th month,change interest rate
                savingsAccount.modifyInterestRate(0.05);
            }
        }
    }
}

