package exercicios.data;

import java.util.Date;
import java.util.Objects;

public class Data{

    int chave;
    Date date;

    public Data(int chave, Date date) {
        this.chave = chave;
        this.date = date;
    }

    public Data(){}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return chave == data.chave;
    }


    @Override
    public int hashCode() {

        return Objects.hash(chave);
    }


    @Override
    public String toString() {
        return "Data{" +
                "chave=" + chave +
                ", date=" + date +
                '}';
    }


    public void dataEmMilissegundos() {
        System.out.println(date.getTime());
    }


    public void milissegundoEmData(){
        System.out.println(this.date.toString());
    }
    
    
    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


package exercicios.data;

import java.util.Date;

public class DataTest {

    public static void main(String[] args) {

        Date date = new Date();
        Data data = new Data();

        data.chave = 1;
        data.date = date;

        data.dataEmMilissegundos();
        data.milissegundoEmData();
    }
}
