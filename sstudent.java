package SecondYearOOP;

public class sstudent 
{
    public void fName() {
        System.out.println("First name is Mark Radana");
 }
     public void lName() {
        System.out.println("Last Name is Radana");
 }
     public void sNum() {
        System.out.println("SSS number is 201-06-202");
 }
     public void gSales() {
        System.out.println("Gross sales is 505050.00");
 }
     public void cRate() {
        System.out.println("Commission Rate: 0.05");

 }
 }
     class noli extends sstudent {

     public void Employee() {
        System.out.println("Mark Radana");
 }
     public void grSales() {
        System.out.println("Gross Sales: 100.00");

 }
     public void comRate() {
            System.out.println("Commission Rate: 100.00");
 }
 }
 public class OOP {

 public static void main(String[] args) {

    noli m1 = new noli();
    System.out.println("Employee information: ");
    m1.fName();
    m1.lName();
    m1.sNum();
    m1.gSales();
    m1.cRate();
    System.out.println("");
    System.out.println("Update Employee Information:");
    m1.Employee();
    m1.sNum();
    m1.gSales();
    m1.cRate();

 }
 }
}