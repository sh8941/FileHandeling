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
        File dir = new File("directory");
        try  {
            dir.mkdir();
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
        System.out.println("directory status : "+dir.exists());
        dir.mkdirs();
        System.out.println("directory status : "+dir.exists());
        
        // to create a file in a directory
        try {
            File txt2 = new File(dir, "sampleFile.txt");
            txt2.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }

        // to print data of a directory
        File folder = new File("New folder");
        String[] data = folder.list();
        int items = 0;
        System.out.println("New folder data : ");
        for (String str : data) {
            System.out.println(str);
            items++;
        }
        System.out.println("Total files : "+items);
    }
}