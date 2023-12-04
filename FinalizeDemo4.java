 class Employee implements Cloneable
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
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
 }
 
 class FinalizeDemo4
{
    public static void main(String Arg[]) throws Exception
    {
        try
        {
        Employee eobj1= new Employee("Sanchit", 80000, 20, "Telkudagaon");
        
        Employee eobj2 = (Employee)eobj1.clone();
        eobj1.Dispaly();
        eobj2.Dispaly();

        System.out.println(eobj1.hashCode());
        System.out.println(eobj2.hashCode());
        
        }
        catch(CloneNotSupportedException obj)
        {
            System.out.println("inside catch");
        }
        

       
    }
}
