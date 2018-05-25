package metodos;

public class Relacionamento{

    private int n1;
    private int n2;

    public Relacionamento(int n1, int n2){
        this.setN1(n1);
        this.setN2(n2);
    }

    public Relacionamento(){}


    public String toString(){
        return "Relacionamento: " + relacionarNumeros();
    }


    public String relacionarNumeros(){
        if (this.getN1() == getN2()){
            return "São iguais";
        } else if (this.getN1() != this.getN2() && this.getN1() > this.getN2()){
            return "São diferentes e " + getN1() + " é maior!";
        }
        return "São diferentes e " + getN2() + " é maior!";
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

public class RelacionamentoTeste {

    public static void main(String[] args) {

        Relacionamento r = new Relacionamento(11,10);

        r.relacionarNumeros();
        System.out.println(r);
    }
}
