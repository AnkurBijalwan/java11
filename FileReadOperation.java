import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadOperation {
    public static void main(String [] args) throws IOException {
       oldWayToReadFile();
       newWayToReadFile();
    }

    private static void oldWayToReadFile() throws IOException{
       File myFile= new File("SampleText.txt");
        System.out.println(myFile.isFile());
       BufferedReader bufferedReader=new BufferedReader(new FileReader(myFile));
       String data;
       while((data= bufferedReader.readLine())!=null){
            System.out.println(data);
       }
    }

    private static void newWayToReadFile() throws IOException{
        String data= Files.readString(Path.of("SampleText.txt"));
        System.out.println(data);
     }
}


