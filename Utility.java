import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Utility {
    public static List<AccountClass> readFromCSV(String path)  throws IOException {
    
    
      String l = "";
        String splitter = ",";
        List<AccountClass> accountClasses = new ArrayList<>();
      
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((l = reader.readLine()) != null) {
                String[] word = l.split(splitter);
              if (word [2].equals("Checking")) {
                accountClasses.add(new Checking(word[0], word[1], word[3]));
            }
              else if (word [2].equals("Savings")) {
                accountClasses.add(new Savings(word[0], word[1], word[3]));
            }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
      return accountClasses;
    }
}