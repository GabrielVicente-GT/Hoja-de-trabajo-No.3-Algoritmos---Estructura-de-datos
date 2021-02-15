import java.io.IOException;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) throws IOException {
        //Instanciamos al scanner
        Scanner scan = new Scanner(System.in);

        //Primero se crean los numeros y se escriben en el documento
        Generador g = new Generador(3);
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
        ordenador.radixSort(lista, lista.length);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
