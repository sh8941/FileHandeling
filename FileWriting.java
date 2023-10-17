import java.io.File;
import java.io.FileWriter;

public class FileWriting {
    public static void main(String[] args) throws Exception {
        File file = new File("Document.txt");   // first add file into program
        FileWriter fw = new FileWriter(file,true);  // make a object of FileWrite first argument take file reference and second is append mode true/false
        fw.write("\nHello World again!");  // write data in file as a String
        fw.write(65);  // it would put like a ascii value
        fw.close();  // file closing is important, if file not close then it data would not put in file
    }
}
