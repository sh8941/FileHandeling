import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;  // it class is best to write data in file. it have more funtionality 
public class PrintWriterClass {
    public static void main(String[] args) throws Exception {
        File f1 = new File("Document.txt");
        FileWriter fw = new FileWriter(f1,true);
        PrintWriter pw = new PrintWriter(fw);
        // it would put data into file as a teas, it can put int, float, doublt, String, char
        // print and println are both different function first use to insert data and second used to insert data into new line
        pw.print("this is a String.");
        pw.println(55);
        pw.println(96.99);
        pw.println('c');
        pw.close();
    }
}
