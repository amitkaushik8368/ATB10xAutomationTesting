package JavaOOPs;

class Employee
{
    String name;
    double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    void bonusEnquiry()
    {
        System.out.println("I am inside the Employee Class");
    }
    void getDetails()
    {
        System.out.println("Employee name " + this.name);
        System.out.println("Employee salary " + this.salary);
    }

}
class Manager extends Employee
{
    public Manager(String name, double salary)
    {
        super(name,salary);
    }
    @Override
    void bonusEnquiry()
    {
        System.out.println("I am inside Manager class");
    }

    void uniqueManager()
    {
        System.out.println("This method is belongs to manager class and not to Employee class");
    }
}

class Engineer extends Manager
{

    public Engineer(String name, double salary)
    {
        super(name, salary);
    }

    @Override
    void bonusEnquiry() {
        System.out.println("I am inside Engineer class");
    }
}

public class DynamicDispatch
{
    public static void main(String[] args)
    {
        Employee m1 = new Manager("Monica Gandhare", 2000);
        Employee e1 = new Engineer("Amit Sharma", 1000);
        Manager m2 = new Engineer("Rohit Sharma", 1500);
        m1.bonusEnquiry();


    }
}


