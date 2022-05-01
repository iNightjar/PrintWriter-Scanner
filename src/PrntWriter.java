import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
class PrntWriter{
    public static void main(String[] args) {
        student [] students = {
            new student("mohamed" , "alex"),
            new student ("ahemd", " behara ")
        };
        File file = new File("test.txt");
        PrintWriter output = null;
        try {
            output  = new PrintWriter(file);
            for (int i = 0 ; i < students.length; i++){
            System.out.println(students[i].name + " , "+ students[i].address);}
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            output.close();
        }
    }
    
}