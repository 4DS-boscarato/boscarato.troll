import java.util.Random;

public class Troll {
    private String nome;
    private float pv;
    private float pd;


    public Troll(){
        pv = 100;
        do{
            pd = (int)((Math.random()*30));
        }while(pd >= 5);
        nome = "Rabid";
    }

    public void danniSubiti(float danniAttacco){
        pv -= danniAttacco;
    }




    public String getNome() {
        return nome;
    }

    public float getPv() {
        return pv;
    }

    public float getPd() {
        return pd;
    }
}
