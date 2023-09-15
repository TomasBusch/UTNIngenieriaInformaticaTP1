import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloo World");
        System.out.println("Hola mundo");

        System.out.println("Hola mundo");

        File file = new File(
            "..\\config\\secret.txt");  

        try (
        BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String st;
            
            while ((st = br.readLine()) != null)

                System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}