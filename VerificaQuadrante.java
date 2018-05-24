package metodos;

public class VerificaQuadrante {

    private int x,y;
    private String quad;

    public VerificaQuadrante(int x, int y){
        this.x = x;
        this.y = y;
    }

    public VerificaQuadrante(){}

    public String toString() {
        return "X = " + x + " Y = " + y
                + "\n" + quad;
    }

    public void encontrarQuadrante() {
        if (this.x >= 0 && this.y < 0){
            quad = "Quadrante 4!";
        } else if (this.x < 0 && this.y >= 0){
            quad = "Quadrante 2!";
        } else if (this.x < 0 && this.y < 0){
            quad = "Quadrante 3!";
        }else {
            quad = "Quadrante 1!";
        }
    }
}


package metodos;

public class VerificaQuadranteTeste {

    public static void main(String[] args) {

        VerificaQuadrante verifica = new VerificaQuadrante(10,-2);

        verifica.encontrarQuadrante();
        System.out.println(verifica);
    }
}
