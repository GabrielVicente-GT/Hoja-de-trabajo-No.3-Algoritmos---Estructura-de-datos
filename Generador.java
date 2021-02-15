import java.util.ArrayList;
import java.util.Random;

// Atributos
public class Generador{
int[] arreglo;
Dato[] data;


Random rand = new Random();

    public Generador(int a){
        // Se ingresa la cantidad de datos que se quieren generar
        arreglo = new int[a];

        for(int i = 0; i < a ; i++){
            // Se generan datos aleatorios y se guardan en la lista
            int number = rand.nextInt(10000);
            arreglo[i]=number;
        }
    }

    // Metodos para la lista de int
    public int[] valores(){
        return arreglo;
    }

    //Metodos para la lista de Dato
    public Dato[] lista() {
        return data;
    }

    public void llenarDatos(String[] array){
        // Recibe una lista de Strings
        int repeticion = array.length;
        data = new Dato[array.length];
        
        for (int i = 0; i < repeticion; i++) {
            // Cada dato lo convierte a int y lo guarda en un objeto Dato
            // este objeto se almacena en la lista de datos
            if(array[i] != " "){
                Dato dato = new Dato(Integer.parseInt(array[i]));
                data[i] = dato;
            }
        }
    }

    public void ver(){
        for(int i=0; i<arreglo.length; i++) {
            System.out.println(data[i]);
        }
    }
}