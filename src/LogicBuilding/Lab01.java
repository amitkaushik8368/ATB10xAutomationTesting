package LogicBuilding;

public class Lab01
{
    public static void main(String[] args) {


        ParentClass_1 p = new ChildClass_1();
        ChildClass_1 c = new ChildClass_1();


        p.someMethod();
        c.someMethod();
        ParentClass_1.staticMethod();
        ChildClass_1.staticMethod();

    }
}
