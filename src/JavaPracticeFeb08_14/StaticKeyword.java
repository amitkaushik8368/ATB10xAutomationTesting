package JavaPracticeFeb08_14;

public class StaticKeyword {
     static int count = 0;

    public static void main(String[] args)
    {
        StaticKeyword sK = new StaticKeyword();
        StaticKeyword.count = 1;
        System.out.println(count);
    }

}
