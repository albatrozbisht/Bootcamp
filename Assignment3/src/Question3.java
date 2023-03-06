import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = sc.nextLine();
        System.out.println("\nEnter word to be searched: ");
        String wordname = sc.nextLine();
        int count=0;
        try(LineNumberReader r= new LineNumberReader(new FileReader(filename))){
            String line;
            while ((line = r.readLine())!=null){
                for (String element : line.split(" ")){
                    if(element.equalsIgnoreCase(wordname)){
                        count++;
                    }
                }
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n"+wordname+" count is "+count);
    }
}


//Output:
//
//        Enter the filename:
//        Question2.txt
//
//        Enter word to be searched:
//        Hi
//
//        Hi count is 0
//
//        Process finished with exit code 0