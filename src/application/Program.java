package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("/home/edimar/Documentos/Teste");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.hasNextLine());
            }
        } // edn try
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}