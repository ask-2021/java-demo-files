package fileWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

    public static void main(String[] args) throws IOException {

        //stream connectivity
        //use .txt for text or notepad file, .csv for csv file or excel, .html for html files
        File file = new File("C:\\astha\\FileWriting\\myTextFileHTML.html");
        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        //writing inside the file
//        for(int i = 0 ; i<4 ; i++){
//
//            for(int j = 0 ; j<3 ; j++){
//
//                int num = (int) (Math.random() * 100);
//                writer.write(num + ",");
//
//            }
//
//            writer.newLine();
//        }

//        writer.newLine();
//        writer.write("Second Line");
//        writer.newLine();
//        writer.write("USA");
//        writer.newLine();
//        writer.write("Way2Automation Tech");
//        writer.newLine();
//        writer.write("Kshitij");


        //writing in a html file
        writer.write("<html><body><title>Ways2Automation</title><h1>Learning Java from Ways2Automation</h1></body></html>");

        //closing stream
        writer.close();

        System.out.println("File created");
    }
}
