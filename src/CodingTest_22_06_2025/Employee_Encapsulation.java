package CodingTest_22_06_2025;

public class Employee_Encapsulation {
    public static void main(String[] args) {
        Employeedetails ed1=new Employeedetails();
        ed1.setEmployeeDetails(101,"Swati",100000);

        Employeedetails ed2=new Employeedetails();
        ed2.setEmployeeDetails(102,"John",50000);

        System.out.println(ed1.getemployeedetails());
        System.out.println(ed2.getemployeedetails());
    }

}
class Employeedetails
{
    private int id;
    private String name;
    private double sal;

    public void setEmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.sal = salary;
    }
    public String getemployeedetails()
    {
        return "ID: "+id+", Name: "+name+", Salary: "+sal;
    }
}