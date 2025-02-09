package JavaPracticeFeb08_14;

class Encapsulation{
    private String name;
    private int age;
    private int linkedInConnection;

    Encapsulation(String name, int age, int linkedInConnection)
    {
        setName(name);
        setAge(age);
        setLinkedInConnection(linkedInConnection);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Invalid age");
    }

    public int getLinkedInConnection() {
        return linkedInConnection;
    }

    public void setLinkedInConnection(int linkedInConnection) {
        if (linkedInConnection>0) this.linkedInConnection = linkedInConnection;
        else System.out.println("Invalid Linkedin Connections");
    }
}


public class EncapsulationOops {
    public static void main(String[] args) {

        Encapsulation encap = new Encapsulation("Amit Sharma", 27, 200);
        System.out.println(encap.getName() + " Linked Connections: " + encap.getLinkedInConnection() + " age  : " + encap.getAge());

        encap.setName("Sunil Sharma");
        System.out.println(encap.getName());

    }
}
