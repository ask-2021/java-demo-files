package fileWriting;

import java.io.*;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {

        //stream connectivity
        File file = new File("C:\\astha\\FileWriting\\myTextFile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        //reading from file
        //System.out.println(reader.readLine());   --> this is going to print only first line so we need to add while loop

        //reading file using while loop
        String line;//= null;
        int counter = 0;
        while((line = reader.readLine())!=null){
            counter++;
            System.out.println(line);
        }
        System.out.println("\nTotal lines in the file : " +counter);

       //closing stream
       reader.close();
        System.out.println("File Read successfully");
    }
}
