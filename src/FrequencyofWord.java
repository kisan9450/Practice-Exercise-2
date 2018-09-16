import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyofWord {

    public static void main(String[] fileName) throws IOException {
        int ch;
        List<String> myList = new ArrayList();
        List<Integer> count = new ArrayList();
        FileReader fr = null;
        try {
            fr = new FileReader("/home/cgi/Desktop/P.E.2/src/FileDemo.txt");
            String fileData = "";
            Scanner scanner = new Scanner(fr);

            while (scanner.hasNext()) {

                String word = scanner.next();
                //System.out.println(word);
                if(myList.indexOf(word) == -1)
                {
                    myList.add(word);
                    count.add(1);
                }
                else
                    count.set(myList.indexOf(word),count.get(myList.indexOf(word))+1);
              //  System.out.print("a");
            }

            fr.close();
            for(int i=0; i <myList.size();i++)
            {
                System.out.println(myList.get(i) + "->" + count.get(i));
            }

        } catch (Exception e) {
            System.out.print("ERROR");
        }


    }
}
