package ConceptBuilding;

public class Interview0703 {
    public static void main(String[] args) {
        String str = "My name is Amit";
        //output = "yM eman si timA"
        String [] strArray = str.split(" ");
        StringBuilder strB = new StringBuilder();
        for (String s : strArray)
        {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            strB.append(stringBuilder).append(" ");
        }
        System.out.println(strB);
    }

}
