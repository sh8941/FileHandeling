import java.io.File;

public class FileAndDirectoryUsingFileClass{
    public static void main(String[] args) {
        // Constructing a file class object
        // this object would refer to the file if already exists
        File file1 = new File("hello.txt");
        // check this file exists or not
        System.out.println("file status : "+file1.exists()); //false if not exists
        // to create a file use createNewFile method
        // it can throw exception so write in try catch block
        try {
            file1.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
        System.out.println("file status : "+file1.exists()); //true after created

        // to create a directory
        File dir = new File("MyDirectory");
        System.out.println("directory status : "+dir.exists());
        dir.mkdirs();
        System.out.println("directory status : "+dir.exists());
    }
}