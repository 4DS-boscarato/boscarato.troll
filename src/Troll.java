import java.util.Random;

public class Troll {
    private String nome;
    private float pv;
    private float pd;


    public Troll() {
        nome = "Rabid";
        pv = 100;

        do{
            pd = (float) ((Math.random() * 25));
        }while (pd <= 15);
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
