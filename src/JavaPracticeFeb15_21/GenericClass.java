package JavaPracticeFeb15_21;

public class GenericClass {

    public static void main(String[] args)
    {
        Add<Integer> add = new Add<>(4, 5);
        System.out.println(add.num1);
        System.out.println(add.num2);

        Add<String> names = new Add<>("Amit Sharma", "Mamta Rani");
        System.out.println(names.num1);
        System.out.println(names.num2);

        Reason reason = new Reason("Pratima Kaushik", 1);
        System.out.println(reason.name);
        System.out.println(reason.age);
    }

}

class Reason
{
    String name;
    Integer age;
    Reason(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
}


class Add<T>
{
    T num1;
    T num2;


    Add(T num1, T num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

}