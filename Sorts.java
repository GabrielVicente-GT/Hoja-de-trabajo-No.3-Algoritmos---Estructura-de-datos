public class Sorts{

    // Este codigo es para el quicksort
    public void quicksort(Comparable[] A, int izq, int der) {

        Comparable pivote = A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Comparable aux;
       
        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i].compareTo(pivote) <= 0 && i < j) i++; // busca elemento mayor que pivote
           while(A[j].compareTo(pivote) > 0) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux = A[i];                      // los intercambia
               A[i] = A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho
         
    }




// Radix Sort
// Es un ordenamiento mas elaborado
// Comenzamos por definir cuantas veces repetiremos el ciclo

// Using counting sort to sort the elements in the basis of significant places
void countingSort(Dato[] array, int size, int place) {
    Dato[] output = new Dato[size + 1];
    Dato max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i].compareTo(max) > 0)
        max = array[i];
    }
    int[] count = new int[max.getValor() + 1];

    for (int i = 0; i < max.getValor(); ++i)
      count[i] = 0;

    // Calculate count of elements
    for (int i = 0; i < size; i++)
      count[(array[i].getValor() / place) % 10]++;

    // Calculate cummulative count
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Place the elements in sorted order
    for (int i = size - 1; i >= 0; i--) {
      output[count[(array[i].getValor() / place) % 10] - 1] = array[i];
      count[(array[i].getValor() / place) % 10]--;
    }

    for (int i = 0; i < size; i++)
      array[i] = output[i];
  }

  // Function to get the largest element from an array
  int getMax(Dato[] array, int n) {
    Dato max = array[0];
    for (int i = 1; i < n; i++)
      if (array[i].compareTo(max) > 0)
        max = array[i];
    return max.getValor();
  }

  // Main function to implement radix sort
  void radixSort(Dato[] array, int size) {
    // Get maximum element
    int max = getMax(array, size);

    // Apply counting sort to sort elements based on place value.
    for (int place = 1; max / place > 0; place *= 10)
      countingSort(array, size, place);
  }

  // Revisar
//https://www.programiz.com/dsa/radix-sort

  public void GnomeSort(Dato [] array){
    for(int i = 1; i < array.length ;){
        if(array[i-1].compareTo(array[i]) <= 0){
          i++;
        }else{
          Dato temp;
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


  //Merge Sort
  public static  Dato[] MergeSort(Dato[] array) {
    if(array.length<=1){
        return array;
    }
    Dato[] first = new Dato[array.length / 2];
    Dato[] second = new Dato[array.length - first.length];
    System.arraycopy(array, 0, first, 0, first.length);
    System.arraycopy(array, first.length, second, 0, second.length);

    MergeSort(first);
    MergeSort(second); 
    Merge(first, second, array);

    return array;
    
}

private static void Merge(Dato[] first, Dato[] second, Dato[] result) {
    int iFirst = 0;
    int iSecond = 0;
    int iMerged = 0;

    while (iFirst < first.length && iSecond < second.length) 
    {
        if (first[iFirst].compareTo(second[iSecond]) > 0) 
        {
            result[iMerged] = first[iFirst];
            iFirst++;
        } 
        else
        {
            result[iMerged] = second[iSecond];
            iSecond++;
        }
        iMerged++;
    }
    System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
    System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
}

	boolean fixeado = false;
  // Bubble sort
  public void BubbleSort(Dato[] array){
    while(fixeado==false){
    	fixeado=true;
    	for(int i = 0; i < (array.length - 1);i++){
    		if(array[i].compareTo(array[i+1]) > 0){
    			Dato temp;
    			temp = array[i+1];
    			array[i+1] = array[i];
    			array[i]=temp;
    			fixeado=false;
    		}
    
    	}
    }
}
}


