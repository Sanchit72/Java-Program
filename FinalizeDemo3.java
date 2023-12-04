
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
 }
 
 class FinalizeDemo3
{
    public static void main(String Arg[])
    {
        Employee eobj = new Employee("Sanchit", 80000, 20, "Telkudagaon");
        eobj.Dispaly();
        String str = "Marvellous";

        //System.out.println(eobj.getClass());
        System.out.println(eobj.getClass());
        
    }
}
