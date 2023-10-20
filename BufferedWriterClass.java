import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
// BufferWrite make fast to operation of writing in file
public class BufferedWriterClass {
    public static void main(String[] args) throws Exception {
        File f1 = new File("Document.txt");
        FileWriter fw = new FileWriter(f1,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("hello");
        bw.close();
    }
}
