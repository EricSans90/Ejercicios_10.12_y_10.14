import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("datos.txt", true); // true para agregar datos al final
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombre + ", " + edad);
            bw.newLine();
            bw.close();
            System.out.println("Datos guardados en el archivo datos.txt");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar los datos en el archivo.");
            e.printStackTrace();
        }

    }
}
