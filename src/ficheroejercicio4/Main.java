package ficheroejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fileName = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //para la lectura del archivo
            fileName = new File("numeros.txt");
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            //lectura actual del archivo
            String line;
            int number = 0, total = 0, mayor = 0, menor = 0, cont = 0;
            while ((line = br.readLine()) != null) {

                try {
                    number = Integer.parseInt(line);
                    total += number;
                    cont++;
                    if (cont == 1) {
                        menor = mayor = number;
                    }

                    mayor = highestN(mayor, number);
                    menor = lowestN(menor, number);

                } catch (NumberFormatException ex) {
                    number = 0;
                }
            }

            System.out.println(
                    "Total: " + total + " \n"
                    + "Mayor: " + mayor + " \n"
                    + "Menor: " + menor
            );

        } catch (Exception err) {
            System.out.println(err.getMessage());
        } finally {
            try {
                if (fr != null) {
                    br.close();
                }
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
    }

    public static int highestN(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    public static int lowestN(int i, int j) {
        if (i < j) {
            return i;
        } else {
            return j;
        }
    }
}
