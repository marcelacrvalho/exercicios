package metodos;

public class Volume {

    private double h, r;

    public Volume (double h, double r){
        this.h = h;
        this.r = r;
    }

    public Volume (){}

    public String toString () {
        return "Volume: " + calcularVolume();
    }

    public double calcularVolume(){
        return 3.14159 * r * r  * h;
    }
}


package metodos;

public class VolumeTeste {

    public static void main(String[] args) {

        Volume vol = new Volume(10,10);

        vol.calcularVolume();
        System.out.println(vol);
    }
}
