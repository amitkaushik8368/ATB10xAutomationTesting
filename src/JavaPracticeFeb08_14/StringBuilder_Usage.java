package JavaPracticeFeb08_14;

public class StringBuilder_Usage {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Amit Kumar");
        str.append("Amit Sharma");
        System.out.println(str);


        String str2 = "Kumar Ganesh";
        str2 = str2.concat("Sharma");
        System.out.println(str2);

    }
}
