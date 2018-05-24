package metodos;

public class EstoqueMedio {

    private int qntMinima, qntMaxima;

    public EstoqueMedio(int qntMinima, int qntMaxima){
        this.qntMinima = qntMinima;
        this.qntMaxima = qntMaxima;
    }

    public EstoqueMedio () {}

    public String toString () {
        return "O estoque médio é de: " + calculaEstoque();
    }

    public int calculaEstoque(){
        return (this.qntMinima + this.qntMaxima)/2;
    }
}


package metodos;

public class EstoqueMedioTeste {

    public static void main(String[] args) {

        EstoqueMedio estoque = new EstoqueMedio(100,670);

        estoque.calculaEstoque();
        System.out.println(estoque);
    }
}
