package ConceptBuilding.FinalKeyword;

public class FinalMethod {
    public static void main(String[] args) {
        Child pratima = new Child();
        System.out.println(pratima.sum(23, 54));
    }
}

class Parent
{
    int sum(int x, int y)
    {
       return x+y;
    }

    final int sub(int a, int b)
    {
        return a-b;
    }
}

class Child extends Parent
{
    @Override
    int sum(int x, int y) {
        return x+y+23;
    }

    //sub(int,int) in ConceptBuilding.FinalKeyword.Child cannot override sub(int,int) in ConceptBuilding.FinalKeyword.Parent
    //overridden method is final

/*
    int sub(int a, int b)
    {
        return a-b;
    }
*/
}


