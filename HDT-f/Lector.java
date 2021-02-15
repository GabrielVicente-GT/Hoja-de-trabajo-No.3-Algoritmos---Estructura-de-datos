import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.io.*;

public class Lector {

    //Atributos
    String[] numText;

    //Metodos
    public String[] leer() throws IOException {
        ArrayList<String> stack = new ArrayList<String>();
        try {
            // Metodo para leer y extraer los numeros del archivo
            // Se ingresa la direccion del archivo y se guarda en una lista cada linea
            FileReader f = new FileReader(
            "Datos.txt");
            BufferedReader r = new BufferedReader(f);
            String cadena;
            
            while ((cadena = r.readLine()) != null) {
                stack.add(cadena);
            }
            r.close();
            
            //Separar y guardar los datos en un array
            numText = new String[stack.size()];
            for (int i = 0; i < numText.length; i++) {
                numText[i] = stack.get(i);
            }

            return numText;

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el archivo");
        }
        
        return numText;
    }
    
    public String[] verList(){
        return numText;
    }


    //Metodo para escribir
    public void escribirAleatorio(int[] datos, String nombre) throws IOException{
        //Metodo para escribir los numeros aleatorios en el documento
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try{
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(f);

            //Comenzamos a escribir en el documento
            for(int i = 0; i<datos.length; i++){
                //Condicional para no agregar lineas extra
                if(i == datos.length-1){
                    wr.write(String.valueOf(datos[i]));
                } else {
                    wr.write(String.valueOf(datos[i]) + "\n");
                }
            }

            wr.close();
            bw.close();
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e);
        }
    }
}
