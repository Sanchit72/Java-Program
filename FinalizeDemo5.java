class Employee 
 {
    public String name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str,int amount,int A,String addr)
    {
        this.name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }

    void Dispaly()
    {
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
    public String toString()
    {
        return name+" kale  "+Salary+"  "+Age+"  "+Address;
    }
}
class FinalizeDemo5 
{
    public static void main(String Arg[])
    {
        Employee eobj1 = new Employee("Sanchit", 80000, 20, "Telkudagaon");

        System.out.println(eobj1);
    }
}
