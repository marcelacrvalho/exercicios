package metodos;

public class ParOuImpar {

    private int n1;
    private int n2;
    private String estadoN1, estadoN2;

    public ParOuImpar(int n1, int n2){
        this.setN1(n1);
        this.setN2(n2);
    }

    public ParOuImpar(){}

    public String toString (){
        return estadoN1 + " - " +  estadoN2;
    }

    public void verificarNumeros() {
        if (getN1() % 2 == 0) {
            estadoN1 = getN1() + " Par";
        } else {
            estadoN1 = getN1() + " Ímpar";
        }

        if (getN2() % 2 == 0){
            estadoN2 = getN2() + " Par";
        } else {
            estadoN2 = getN2() + " Ímpar";
        }
    }

    
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}


package metodos;

public class ParOuImparTeste {

    public static void main(String[] args) {

        ParOuImpar p = new ParOuImpar(10,22);

        p.verificarNumeros();
        System.out.println(p);
    }
}
