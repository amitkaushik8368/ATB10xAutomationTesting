package JavaOOPs;

public class AbstractionDetails {
    public static void main(String[] args) {
        StatesOf_India statesOfIndia = new Maharashtra();
        StatesOf_India statesOfIndia1 = new UttarPradesh();
        statesOfIndia.language();
        statesOfIndia1.language();
    }
}

abstract class StatesOf_India
{
    abstract void language();   //Now whatever classes extends StatesOf_India they have to enforce their own language method
}


class Maharashtra extends StatesOf_India
{

    @Override
    void language() {
        System.out.println("My native language is Marathi");
    }
}

class UttarPradesh extends StatesOf_India
{

    @Override
    void language() {
        System.out.println("My native language is Hindi");
    }
}