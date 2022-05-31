package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       try (FileWriter fileWriter = new FileWriter("alfavit.txt")){
           fileWriter.write("A a\nB b\nC c\n ...\n1\n2\n3\n...");
       }catch (Exception e){
           e.printStackTrace();
       }

       try (FileReader fileReader= new FileReader("alfavit.txt")){
           Scanner scanner=new Scanner(fileReader);
           while (scanner.hasNextLine()){
               System.out.println(scanner.nextLine());
           }
       }catch (Exception a){
           a.printStackTrace();
       }




    }
}
