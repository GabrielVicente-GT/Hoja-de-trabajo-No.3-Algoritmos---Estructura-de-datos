import java.util.ArrayList;
import java.util.Random;

public class Generador{
	ArrayList<Integer> arreglo = new ArrayList<Integer>();
	ArrayList<Integer> arreglo_ordenado = new ArrayList<Integer>();
	int numero =0;
	int[] arrayy = new int[3000];
	Random rand = new Random();

    public Generador(int a){
    	numero = a;
        for(int i = 0; i < a ; i++){
            int number = rand.nextInt(5000);
            arreglo.add(number);
        }
        for(int x = 0; x < a ; x++){
            arrayy[x]=arreglo.get(x);
        }
    }

    private int[] mergeSort(int[] array) {
		
		// Recursive control 'if' statement.
		if(array.length <= 1) {
			
			return array;
			
		}
		
		int midpoint = array.length / 2;
		
		// Declare and initialize left and right arrays.
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 == 0) { // if array.length is an even number.
			
			right = new int[midpoint];
			
		} else {
			
			right = new int[midpoint + 1];
			
		}
		
		// Populate the left and right arrays.
		for(int i=0; i < midpoint; i++) {
			
			left[i] = array[i];
			
		}
		
		for(int j=0; j < right.length; j++) {
			
			right[j] = array[midpoint+j];
			
		}
		
		int[] result = new int[array.length];
		
		// Recursive call for left and right arrays.
		left = mergeSort(left);
		right = mergeSort(right);
		
		// Get the merged left and right arrays.
		result = merge(left, right);
		
		// Return the sorted merged array.
		return result;
		
	}
	private int[] merge(int[] left, int[] right) {
		
		// Merged result array.
		int[] result = new int[left.length + right.length];
		
		// Declare and initialize pointers for all arrays.
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		// While there are items in either array...
		while(leftPointer < left.length || rightPointer < right.length) {
			
			// If there are items in BOTH arrays...
			if(leftPointer < left.length && rightPointer < right.length) {
				
				// If left item is less than right item...
				if(left[leftPointer] < right[rightPointer]) {
					
					result[resultPointer++] = left[leftPointer++];
					
				} else {
					
					result[resultPointer++] = right[rightPointer++];
					
				}
				
			}
			
			// If there are only items in the left array...
			else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			}
			
			// If there are only items in the right array...
			else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
 			
		}
		
		return result;
		
	}


    
    public void listado(){
    	arrayy = mergeSort(arrayy);
        for(int x = 0; x < arrayy.length ; x++){
            arreglo_ordenado.add(arrayy[x]);
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