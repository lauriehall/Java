/************************************************************/
/* Figure 9.10: page 394: CommissionEmployee                */
/* CIS163AA                                                 */
/* Laurie Hall                                              */
/* 11/23/2020                                               */
/* Purpose of program: Uses methods to manipulate its       */
/* private instance variables. Add default constructor      */ 
/*                                                          */
/*                                                          */
/************************************************************/

class CommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; //gross weekly sales
    private double commissionRate; //commission percentage

    public CommissionEmployee(){
     this(null,null,null,0,0.1);} // default constructor

    //five-argument constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        // implicit call to Object constructor occurs here

        // if grossSales is invalid throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0.00");
        }

        //if commsionRate is invalid trhow exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate muct be .0.0 and <1.0"); 
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
 }

    //return first name
    public String getFirstName() {
        return firstName; }

    //return last name
    public String getLastName() {
        return lastName; }

    //return social security number
    public String getsocialSecurityNumber() {
        return socialSecurityNumber; }

    //set gross sales
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.00) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0"); }

        this.grossSales = grossSales;}

    //return gross sales amount
    public double getGrossSales() {
        return grossSales; }

    //set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate muct be .0.0 and <1.0"); }
        this.commissionRate = commissionRate; }

    //return commission rate
    public double getCommissionRate() {
        return commissionRate; }

    //calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales(); }

    //return String representation of CommissionEMployee object
    @Override
    public String toString() {
        return String.format ("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
            "commission employee", getFirstName(), getLastName(),
            "social security number", getsocialSecurityNumber(),
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate());

    }
}