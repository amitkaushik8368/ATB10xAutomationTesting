package ConceptBuilding.Constructors;

public class ConstructorOverriding
{
    public static void main(String[] args)
    {

    }
}

class Amit
{
    String aim;
    int durationInMonths;

    Amit(String aim, int durationInMonths)
    {
        this.aim = aim;
        this.durationInMonths = durationInMonths;
    }

}

class Mukul extends Amit
{

//    Amit(String aim, int durationInMonths)                //Not valid
//    {
//        this.aim = aim+" 30 ";
//        this.durationInMonths = durationInMonths;
//    }

    Mukul(String aim, int durationInMonths) {
        super(aim, durationInMonths);
    }
}
