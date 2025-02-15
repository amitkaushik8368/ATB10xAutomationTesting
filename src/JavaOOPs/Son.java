package JavaOOPs;

public class Son extends Father{

    int noOfCars;
    public Son(int no_Of_Fingers, int no_Of_Ears, int ownGoldOunce, int noOfCars) {
        super(no_Of_Fingers, no_Of_Ears, ownGoldOunce);
        this.noOfCars = noOfCars;
    }

    void residentialFlat(){
        System.out.println("I am the Owner of 2BHK residential flat in Pune");
    }


    void farmField() {
        System.out.println("I purchase 5 more acres and I have 15 acres now in total");
    }
}
