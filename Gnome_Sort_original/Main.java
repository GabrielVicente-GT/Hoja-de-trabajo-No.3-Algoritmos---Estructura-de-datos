public class Main {
    public static void main(String[] args) {
    	
        Generador g = new Generador(200);
        System.out.println("Arreglo inicial");
        System.out.println(g.lista());
		System.out.println("");
        System.out.println("Arreglo ordenado");
        System.out.println(g.lista_final());
      
    }
}
