import java.util.ArrayList;
import java.util.Random;

public class Generador{
	ArrayList<Integer> arreglo = new ArrayList<Integer>();
	ArrayList<Integer> arreglo_ordenado = new ArrayList<Integer>();
	int numero =0;
	int[] array = new int[200];
	Random rand = new Random();

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
    public void GnomeSort(){
    	for(int i = 1; i < array.length ;){
    		if(array[i-1]<=array[i]){
    			i++;
    		}else{
    			int temp;
    			temp = array[i-1];
    			array[i-1] = array[i];
    			array[i]=temp;
    			i--;
    		}
    		if (i==0) {
    			i=1;
    		}
    	}
    }
    
    public void listado(){
    	GnomeSort();
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