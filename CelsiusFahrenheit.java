package metodos;

public class ConverterCelsius {

    private double fah;
    private double celsius;

    public ConverterCelsius (double fah){
        this.fah = fah;
    }

    public ConverterCelsius(){}

    public String toString () {
        return "Temperatura: " + celsius;
    }

    public void converter(){
        celsius = (getFah() - 32) * 5/9;
    }


    public double getFah() {
        return fah;
    }

    public void setFah(double fah) {
        this.fah = fah;
    }
}


package metodos;

public class ConverterCelsiusTeste {

    public static void main(String[] args) {

        ConverterCelsius c = new ConverterCelsius(90);

        c.converter();
        System.out.println(c);
    }
}
