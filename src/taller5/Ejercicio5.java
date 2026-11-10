package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante (Ejercicio5 combina ambas formas de E/S):
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        // Pedir nombre y edad con JOptionPane
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        int edad = Integer.parseInt(edadStr);

        // Pedir las tres notas con BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la nota 1: ");
        double nota1 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la nota 2: ");
        double nota2 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la nota 3: ");
        double nota3 = Double.parseDouble(br.readLine());

        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);

        // Mostrar resumen con JOptionPane
        String mensaje = String.format("Nombre: %s%nEdad: %d%nPromedio: %.2f",
                estudiante.getNombre(),
                estudiante.getEdad(),
                estudiante.getPromedio());
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
