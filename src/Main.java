import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Troll t1 = new Troll();
        boolean finisched = false;

        String eroe = "";
        float pvEroe = 100;

        System.out.println("Inserisci il tuo nome, Eroe: ");
        input = new Scanner(System.in);
        eroe = input.nextLine();

        System.out.println("\nCommentatore: \nBuongiorno a tutti Signori e Signore! Benvenuti in questo nuovo combattimento nell'arena di Verona! " +
                "\nOggi il famigerato Troll di nome " + t1.getNome() + " dovra` scontrarsi con il nostro nuovo campione di quest'anno, cioeeee` " + eroe +
                "\nCHE LO SCONTRO ABBIAAAAAA INIZIOOO!!");

        System.out.println("\n\nGAME");

        do{

        }while(!finisched);
    }
}