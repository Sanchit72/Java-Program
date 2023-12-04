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
    protected void finalize()
    {
        System.out.println("Inside finalize method... ");
    }

    void Dispaly()
    {
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
 }
 
 class FinalizeDemo2
{
    public static void main(String Arg[])
    {
        Employee eobj = new Employee("Sanchit", 80000, 20, "Telkudagaon");
        Employee eobj3 = new Employee("Sagar", 70000, 21, "Telkudagaon");
        eobj.Dispaly();
        Employee eobj2 = eobj;
        System.out.println("Hash code of eobj is :"+eobj.hashCode());
        System.out.println("Hash code of eobj is :"+eobj2.hashCode());
        System.out.println("Hash code of eobj is :"+eobj3.hashCode());
         
        eobj = null;
        System.gc();
    }
}
