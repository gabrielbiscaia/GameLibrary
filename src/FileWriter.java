import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter {
    private String pathName;

    public void writeFile(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Type de name of the file: ");
            System.out.println("Type here: ");
            pathName = sc.nextLine();
            sc.close();
            File file = new File(pathName);
            if(file.createNewFile()){
                System.out.println("File created: "+pathName);
            }else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
