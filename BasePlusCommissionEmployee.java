/************************************************************/
/* Figure 9.11: page 396: BasePlusCommissionEmployee.java   */
/* CIS163AA                                                 */
/* Laurie Hall                                              */
/* 11/23/2020                                               */
/* Purpose of program: Re-write original                    */
/* BasePlusCommissionEmployee class using hierarchy so it   */ 
/* contains a reference to a CommissionEmployee object      */
/* rather than inheriting from class CommissionEmployee     */
/************************************************************/

class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; //base salary per week

    //reference variable of CommissionEmployee

    private CommissionEmployee commissionEmployee;



    //six argument constructor

    public BasePlusCommissionEmployee(String firstName, String lastName,

        String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)

    {
        System.out.printf("%s %.2f%n", "Base salary is", baseSalary);
        this.commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        //if baseSalary is invalid throw exception

        

        this.baseSalary = baseSalary;

    }

    //return the commissionEmployee object

    public CommissionEmployee getCommissionEmployee()

    {

        return commissionEmployee;

    }

    //set the commissionEMployee class object with parameter value

    public void setCommissionEmployee(CommissionEmployee commissionEmployee)

    {

        this.commissionEmployee = commissionEmployee;

    }

    //set base salary

    public void setBaseSalary(double baseSalary) {

        if (baseSalary < 0.0) {

            throw new IllegalArgumentException("Base salary must be >= 0.00");

        }

        this.baseSalary = baseSalary;



    }

    //return base salary

    public double getBaseSalary() {
        return baseSalary;
    }

    //*********add the setter and getter method for baseSalary from 9.11

    //computer the earnings of the employee

    public double earnings()

    {

        return getBaseSalary() + commissionEmployee.earnings();
    }

    //return first name

    public String getfirstName()

    {

        return commissionEmployee.getFirstName();

    }

    //return last name

    public String getlastName()

    {

        return commissionEmployee.getLastName();

    }

    //return social secrity number

    public String getsocialSecurityNumber()

    {

        return commissionEmployee.getsocialSecurityNumber();

    }

    //return gross sales amount

    public double getgrossSales()

    {

        return commissionEmployee.getGrossSales();

    }

    //return commission rate

    public double getcommissionRate()

    {

        return commissionEmployee.getCommissionRate();

    }

    //returns the BasePlusCommissionEmployee data in a string format

    @Override

    public String toString()

    {

        return String.format("%s %s%n%s: %.2f", "base-salaried", commissionEmployee, "base salary", getBaseSalary());

    }

}
