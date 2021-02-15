import java.util.ArrayList;
import java.util.Random;

public class Generador{
	ArrayList<Integer> arreglo = new ArrayList<Integer>();
	ArrayList<Integer> arreglo_ordenado = new ArrayList<Integer>();
	int numero =0;
	int[] array = new int[200];
	Random rand = new Random();
	boolean fixeado = false;

    public Generador(int a){
    	numero = a;
        for(int i = 0; i < a ; i++){
            int number = rand.nextInt(5000);
            arreglo.add(number);
        }
        for(int x = 0; x < a ; x++){
            array[x]=arreglo.get(x);
        }
    }
    public void BubbleSort(){
    while(fixeado==false){
    	fixeado=true;
    	for(int i = 0; i < (array.length -1 );i++){
    		if(array[i] > array[i+1]){
    			int temp;
    			temp = array[i+1];
    			array[i+1] = array[i];
    			array[i]=temp;
    			fixeado=false;
    		}
    
    	}
    }
    }
    
    public void listado(){
    	BubbleSort();
        for(int x = 0; x < array.length ; x++){
            arreglo_ordenado.add(array[x]);
        }
    }
    public ArrayList lista(){
        return arreglo;
    }
    public ArrayList lista_final(){
    	listado();
        return arreglo_ordenado;
    }
}