import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    	long inicio = System.nanoTime();

    	for (int i =0;i<1000 ;i++ ) {
    		for (int j =0;j<1000 ;j++ ) {
    			new Random().nextDouble();
    		}
    	}
    	
        Generador g = new Generador(3000);
        System.out.println("Arreglo inicial");
        System.out.println(g.lista());
		System.out.println("");
        System.out.println("Arreglo ordenado");
        System.out.println(g.lista_final());

        long fin = System.nanoTime();

        double dif = (double)(fin-inicio)*1.0e-9;

        System.out.println("El programa dura 	"+ dif +"s");
    }
}
