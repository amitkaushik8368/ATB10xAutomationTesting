package JavaOOPs;

public class GrandFather
{
    int no_Of_Fingers;
    int no_Of_Ears;

    public GrandFather(int no_Of_Fingers, int no_Of_Ears)
    {
        this.no_Of_Fingers = no_Of_Fingers;
        this.no_Of_Ears = no_Of_Ears;
    }

    void farmField(){
            System.out.println("I am the owner of 10 acres of Agricultural Land");
    }

    void ancestralHome(){
        System.out.println("I am the owner of 200 square metre of ancestral land");
    }
}
