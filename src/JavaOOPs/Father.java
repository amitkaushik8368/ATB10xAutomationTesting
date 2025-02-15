package JavaOOPs;

public class Father extends GrandFather
{
    int ownGoldOunce;
    public Father(int no_Of_Fingers, int no_Of_Ears, int ownGoldOunce) {
        super(no_Of_Fingers, no_Of_Ears);
        this.ownGoldOunce = ownGoldOunce;
    }



    void residentialPlot()
    {
        System.out.println("I am the owner of 150 sq metre of residential plot in the City");
    }
}
