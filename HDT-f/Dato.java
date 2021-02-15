public class Dato implements Comparable<Dato>{

    // Cada dato debera recibir un valor
    private Integer valor;

    public Dato(int value){
        valor = value;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String toString(){
        return String.valueOf(valor);
    }

    @Override
    public int compareTo(Dato otherData) {
        // Se compara el valor del Dato con otro Dato qeui recibe del parametro
        Integer criterio;
        Integer otherDatavalue=((Dato)otherData).getValor();

        criterio = valor.compareTo(otherDatavalue);
        
        // Si el numero con el que se compara es menor, devolvera 1
        // si es mayor devolvera -1
        return criterio;
    }
}
