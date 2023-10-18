import java.io.*;

public class FileReading {
    public static void main(String[] args) throws Exception {
        File f1 = new File("Document.txt");  // to add file into program
        FileReader fr = new FileReader(f1);  // construct a FileReader object and pass reference as a constructer argument
        int c = fr.read();  // it would be return ascii value of a character
        // check condition if value equals to -1 that mean no more data exist
        while (c != -1) {
            System.out.print((char)c);
            c = fr.read();  // update value of c in every iteration
        }

        // but if you want to print file data more than one time so you need to follow this appraoch
        System.out.println("Second approach");
        char[] fdata = new char[(int)f1.length()];  // create a array of size characters in file
        fr.read(fdata);  // it will take all characters of file in char array

        // and now you can print it

        for(int i=0;i<fdata.length;i++){
            System.out.print(fdata[i]);
        }
    }
}
