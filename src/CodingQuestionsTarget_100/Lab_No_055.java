package CodingQuestionsTarget_100;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab_No_055
{
    public static void main(String[] args) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File file = new File("D:\\JavaUtilityFiles\\amit_" + timestamp+  ".txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Writer writer = new FileWriter(file);


        writer.write("This text file is created through Java code");


//        File folder = new File("D:\\JavaUtilityFiles\\");
//
//        for (File f: folder.listFiles())
//        {
//            f.delete();
//        }

        System.out.println(file.getAbsolutePath());

        String str = null;
        try{
            System.out.println(str.length());

        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }







    }
}
