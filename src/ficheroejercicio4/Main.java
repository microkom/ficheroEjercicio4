/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            String line;int number=0,total=0;
            while ((line = br.readLine()) != null) {
                number = Integer.parseInt(line);
                try{
                    total+=number;
                }catch(NumberFormatException ex ){
                number+=0;
                }
            }
            System.out.println(total);

        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
    
}
