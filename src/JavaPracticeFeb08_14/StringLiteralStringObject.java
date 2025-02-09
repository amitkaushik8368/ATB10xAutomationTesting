package JavaPracticeFeb08_14;

public class StringLiteralStringObject {
    public static void main(String[] args) {
        String name1 = "Amit Sharma";
        final String name2 = new String("Mamta Rani");
        System.out.println("String Literal : " + name1);
        System.out.println("String Object : " + name2);

        name2.concat("Amit");
        System.out.println(name2);



    }
}
