package metodos;

public class Modulo {

    private int num;

    public Modulo(int num){
        this.setNum(num);
    }

    public Modulo(){}


    public String toString(){
        return "O módulo do número é " + descobrirMod();
    }


    public String descobrirMod(){
        if (getNum() >= 0)
            return ": " + getNum();
        return ": " + getNum() * (-1);
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}



package metodos;

public class ModuloTeste {

    public static void main(String[] args) {

        Modulo mod = new Modulo(-1);

        mod.descobrirMod();
        System.out.println(mod);
    }
}
