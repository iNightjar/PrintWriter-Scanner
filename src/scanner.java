import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;       
    class scanner{
        public static void main(String[] args) {
            student [] students = new student[2];
            students[0].name= "mohamed"; students[0].address = "menofia";
            students[1].name= "alex"; students[1].address = "sweedin";
            File file = new File ("test.txt");
            Scanner input = null;
            try {
                input = new  Scanner(file);
                input.useDelimiter(",");
                while(input.hasNext()){
                    String value = input.next();
                    System.out.println(value);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }finally{
                if(input != null){
                    input.close();
                }
            }
            }
        }