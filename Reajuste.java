package metodos;

public class ReajusteSalario {

    private double sal;

    public ReajusteSalario(double sal){
        this.setSal(sal);
    }

    public ReajusteSalario(){}


    public String toString(){
        return "O salário reajustado é de R$ " + reajustar();
    }


    public double reajustar(){
        return this.getSal() + (this.sal * 0.2);
    }


    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}


package metodos;

public class ReajusteSalarioTeste {

    public static void main(String[] args) {

        ReajusteSalario sal = new ReajusteSalario(5200);

        sal.reajustar();
        System.out.println(sal);
    }
}
