/**
 * @author Michael Chadwick            
 * @version 4/22/20
 */
public class Employee
{
    private int empNum;
    private String empName;
    private double empSalary;

    /**
     * Default constructor.
     * @param empNum sets variables value to zero.
     * @param empName sets variables value to an empty space.
     * @param empSalary sets variables value to zero.
     */
    public Employee()
    {
        empNum = 0;
        empName = " ";
        empSalary = 0.0;
    }

    /**
     * Constructor for objects of class Employee.
     * @param empNum sets variables value.
     * @param empName sets variables value.
     * @param empSalary sets variables value.
     */
    public Employee(int empNum, String empName, double empSalary)
    {
        this.empNum = empNum;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    /**
     * This method returns the objects employee number.
     * @return empNum returns Employee's number.
     */
    public int getEmp_Num()
    {
        return this.empNum;
    }

    /**
     * This method sets the objects employee number.
     * @param empNum sets Employee's number.
     */
    public void setEmp_Num(int empNum)
    {
        this.empNum = empNum;
    }

    /**
     * This method returns the objects Employee name.
     * @return empName returns Employee's name.
     */
    public String getEmp_Name()
    {
        return this.empName;
    }

    /**
     * This method sets the objects Employee name.
     * @param empName sets Employee's name.
     */
    public void setEmp_Name(String empName)
    {
        this.empName = empName;
    }

    /**
     * This method returns the objects Employee salary.
     * @return empSalary returns Employee's salary.
     */
    public double getEmp_Salary()
    {
        return this.empSalary;
    }

    /**
     * This method sets the objects Employee salary.
     * @param empSalary sets Employee's salary.
     */
    public void setEmp_Salaray(double empSalary)
    {
        this.empSalary = empSalary;
    }

    /**
     * This method creates and displays a string with the three elements of an Employee object.
     */
    @Override
    public String toString()
    {
        return "~ Employee Number: " + empNum + " Name: " + empName + " Salary: $" + empSalary + " ~"; 
    }
}
