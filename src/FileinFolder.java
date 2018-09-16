import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileinFolder {

    public static void main(String[] fileName) throws IOException{
    File folder = new File("src");
    File[] listOfFiles = folder.listFiles();
        String extofFile = "" ;
        Scanner s = new Scanner(System.in);
        extofFile = s.nextLine();

        for (int i = 0; i < listOfFiles.length; i++) {
        if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());

        } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Directory " + listOfFiles[i].getName());
        }
    }
        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].getName().contains(extofFile))
            {
                FileReader sourceStream = new FileReader("/home/cgi/Desktop/P.E.2/src/" +listOfFiles[i].getName());
                int temp;
                while ((temp = sourceStream.read()) != -1) {
                    System.out.print((char)temp);
                }
                sourceStream.close();
            }
        }


    }
}

