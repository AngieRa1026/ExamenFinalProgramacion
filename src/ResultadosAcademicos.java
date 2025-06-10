
import java.util.Scanner;

public class ResultadosAcademicos {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos:");
        int alumnos = scanner.nextInt();

        System.out.println("Ingrese la cantidad de notas:");
        int notas = scanner.nextInt();

        int matrizNotas[][] = new int[alumnos][notas];
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < notas; j++) {

                System.out.println("Ingrese las notas del alumno " + (i + 1));
                double notasAlumnos = scanner.nextDouble();
                if (notas >= 0 && notas <= 100) {
                    System.out.println("La nota debe ser mayor a 0 y menor que 100");
                } else {

                }
            }
            double notasAlumnos = scanner.nextDouble();

        }
    }
}
