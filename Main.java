import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
@author Marco Orozco & Gabriel Vicente
*/
public class Main {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //Instanciamos al scanner
        Scanner scan = new Scanner(System.in);

        //Primero se crean los numeros y se escriben en el documento
        Generador g = new Generador(300);
        Lector l = new Lector();
        l.escribirAleatorio(g.valores(), "Datos.txt");

        //Ahora estos datos se leen y se llena la lsita de tipo Dato para trabajarlos
        l.leer();
        g.llenarDatos(l.verList());

        //Variable para facilitar el acceso a la lista
        Dato[] lista = g.lista();

        //Imprimos la lista desordenada
        System.out.println("Desordenada");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        //Instanciar al ordenador
        Sorts ordenador = new Sorts();

        //Inicia el menu
        String opcion = "";
        Boolean verifier = true;
        while(verifier == true){
            System.out.println("________________________");
            System.out.println("1. Quick sort");
            System.out.println("2. Radix sort");
            System.out.println("3. Gnome Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Bubble sort");
            System.out.println("6. Salir");

            opcion = scan.next();
            if(opcion.equalsIgnoreCase("1")){
                System.out.println("Ordenada");
                ordenador.quicksort(lista, 0, lista.length-1);
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
                ordenador.quicksort(lista, 0, lista.length-1);
            } else if(opcion.equalsIgnoreCase("2")){
                System.out.println("Ordenada");
                ordenador.radixSort(lista, lista.length);
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
                ordenador.radixSort(lista, lista.length);
            } else if(opcion.equalsIgnoreCase("3")){
                System.out.println("Ordenada");
                ordenador.GnomeSort(lista);
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
            } else if(opcion.equalsIgnoreCase("4")){
                System.out.println("Ordenada");
                ordenador.MergeSort(lista);
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
            } else if(opcion.equalsIgnoreCase("5")){
                System.out.println("Ordenada");
                ordenador.BubbleSort(lista);
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
            } else if(opcion.equalsIgnoreCase("6")){
                verifier = false;
            } else{
                System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
