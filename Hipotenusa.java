package metodos;

public class Hipotenusa {

    private double base;
    private double h;

    public Hipotenusa(double base, double h){
        this.setBase(base);
        this.setH(h);
    }

    public Hipotenusa(){}


    public String toString(){
        return "O valor da hipotenusa é: " + calcularHipotenusa();
    }


    public double calcularHipotenusa(){
        return (Math.pow(getBase(),2) + Math.pow(getH(),2)) / 2;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}


package metodos;

public class HipotenusaTeste {

    public static void main(String[] args) {

        Hipotenusa hipo = new Hipotenusa(4,3);

        hipo.calcularHipotenusa();
        System.out.println(hipo);
    }
}
