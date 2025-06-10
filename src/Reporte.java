
public class Reporte {

    public static void main(String[] args) {
        int[][] notas = {
            {85, 90, 78},
            {92, 88, 84},
            {76, 85, 80}
        };

        analizarNotas(notas);
    }

    public static void analizarNotas(int[][] notas) {
        int numAlumnos = notas.length;
        int numNotas = notas[0].length;

        for (int i = 0; i < numAlumnos; i++) {
            double sumaNota = 0;
            for (int j = 0; j < numNotas; j++) {
                sumaNota += notas[i][j];
            }
            System.out.println("promedio alumno " + (i + 1) + ": " + (sumaNota / numNotas));
        }

        for (int j = 0; j < numNotas; j++) {
            double sumaNota = 0;
            for (int i = 0; i < numAlumnos; i++) {
                sumaNota += notas[i][j];
            }
            System.out.println("promedio de la nota " + (j + 1) + ": " + (sumaNota / numAlumnos));
        }

        int maxNota = Integer.MIN_VALUE;
        int minNota = Integer.MAX_VALUE;
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numNotas; j++) {
                if (notas[i][j] > maxNota) {
                    maxNota = notas[i][j];
                }
                if (notas[i][j] < minNota) {
                    minNota = notas[i][j];
                }
            }
        }
        System.out.println("nota mas alta: " + maxNota);
        System.out.println("nota mas baja: " + minNota);
    }
}
