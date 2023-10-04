import java.util.Random;

public class Troll {
    private String nome;
    private float pv;
    private float pd;


    public Troll(){
        pv = 100;
        do{
            pd = (int)((Math.random()*20));
        }while(pd >= 5);
        nome = "Rabid";
    }

    public String getNome() {
        return nome;
    }

}
