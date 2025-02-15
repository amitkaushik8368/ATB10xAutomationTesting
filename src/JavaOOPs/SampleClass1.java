package JavaOOPs;

public class SampleClass1 {
    String name;
    int age;
    SampleClass1 sC1 = new SampleClass1();
    void nonExecutableClassMethod()
    {
        System.out.println("This is a class without main method ");
    }
    public SampleClass1(){
        System.out.println("Inside Default Constructor: ");
    }

    public void anotherMethod(){
        this.name = "Amit Sharma";
        this.age = 27;

    }

//    public void moreMethod()
//    {
//        sC1.name = "Pratima Kaushik";
//        sC1.age = 1;
//
//        System.out.println(name  + " " + age);
//    }

    void getDetails()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }



}
