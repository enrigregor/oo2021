import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("dummy.txt");
        File fileWrite = new File("out_dummy.txt");
        System.out.println(
            file.getName() + "\n"+
            file.isFile() + "\n"+
            file.isDirectory() + "\n"+
            file.isHidden() + "\n"+
            file.lastModified()
        );
    

    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    String line = br.readLine();
    while (line != null){
        String[] lineData = line.split(",");
        System.out.println(lineData[0] + " | " + lineData[lineData.length - 1]);

        //System.out.println(line);
        line = br.readLine();
    }

    fr.close();
    br.close();

    if(!fileWrite.exists()){
        fileWrite.createNewFile();
    }

    PrintWriter pw = new PrintWriter(fileWrite);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()){
        String line2 = scanner.nextLine();
        String[] lineData = line2.split(",");
        pw.println(
            "Number is "+lineData[0]+
            " and name is " + lineData[1]+
            " and lang is " +lineData[2]+
            " and year is " + lineData[3]
        );

        
    }
    pw.close();
    scanner.close();
    //--------------------------------------------
    //Lugeda sisse numbrid failist ja arvutada summa
    //ja trükkida summa uude faili

    File file2 = new File("numbers.txt");
    File fileWrite2 = new File("numbers_calculated.txt");

    FileReader fr2 = new FileReader(file2);
    BufferedReader br2 = new BufferedReader(fr2);
    int sum = 0;

    String line3 = br2.readLine();
    while (line3 != null){
        String[] lineData = line3.split(",");
        sum += Integer.parseInt(line3);
        line3 = br2.readLine();
    }

    fr.close();
    br.close();

    if(!fileWrite2.exists()){
        fileWrite2.createNewFile();
    }
    //-----------------------------------------------------------
    }
}
