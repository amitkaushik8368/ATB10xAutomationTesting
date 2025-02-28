package ConceptBuilding;

public class ThreadUnderstanding2
{

    public static ThreadUnderstanding2 ownTypeMethod()
    {
        return new ThreadUnderstanding2();
    }

    public static void main(String[] args)
    {

        ThreadUnderstanding2 threadUnderstanding2 = ThreadUnderstanding2.ownTypeMethod();

    }
}
