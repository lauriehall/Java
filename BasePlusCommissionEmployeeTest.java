/************************************************************/
/* Figure 9.07: page 386: BasePlusCommissionEmployeeTest    */
/* CIS163AA                                                 */
/* Laurie Hall                                              */
/* 11/23/2020                                               */
/* Purpose of program: Tests class                          */
/* BasePlusCommissionEmployee using hierarchy so it         */ 
/* contains a reference to a CommissionEmployee object      */
/* rather than inheriting from class CmmissionEmployee      */
/************************************************************/


public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        //instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee =

            new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);

        //get base salaried commission employee data

        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First name is", employee.getfirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getlastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getsocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getgrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getcommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
        
        employee.setBaseSalary(1000);
        
        System.out.printf("%n%s:,%n%n%s%n", "Updated employee infomraiton obtained by toString", employee.toString());

    }

}