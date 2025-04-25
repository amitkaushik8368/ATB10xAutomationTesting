package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class April_24
{


    public void firstMethod(int x)
    {
        System.out.println("Inside First Method");
    }

    public void firstMethod(int x, int y)
    {
        System.out.println("Overloaded Method");
    }

}


class ChildClass extends  April_24{

    @Override
    public void firstMethod(int x, int y) {
        System.out.println("This is overridden method");
    }
}
