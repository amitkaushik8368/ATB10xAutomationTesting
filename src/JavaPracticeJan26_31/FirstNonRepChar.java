package JavaPracticeJan26_31;
/*
Program to find first non-repetitive character in a String
Input = "automation", output = 'u'

Input-> String "automation"   Output -> char 'u' boolean b = false;
Rough Logic ->

for(int i=0; i<len;i++){
    for(int j=i+1; j<len; j++){
        if(charAt(i) == charAt(j)){
         b = true
         break;
        }
    }
    if(!b){sout(charAt(i))}
}

 */
public class FirstNonRepChar {
    public static void main(String[] args) {

        String input = "automation";
        boolean[] dec = new boolean[input.length()];

        for (int i = 0; i < input.length(); i++) {
            boolean decide = false;
            if (dec[i]) continue;
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    dec[j] = true;
                    decide = true;

                }
            }
            if (!decide){
                System.out.println("First non-repetitive char is '" + input.charAt(i) + "'");
                break;
            }

        }



    }
}
