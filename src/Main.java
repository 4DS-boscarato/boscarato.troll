import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Troll t1 = new Troll();
        boolean finisched = false;
        boolean sceltaValida = false;

        String eroe = "";
        float pvEroe = 100;

        System.out.print("Inserisci il tuo nome, Eroe: ");
        input = new Scanner(System.in);
        eroe = input.nextLine();

        System.out.println("\nCommentatore: \nBuongiorno a tutti Signori e Signore! Benvenuti in questo nuovo combattimento nell'arena di Verona! " +
                "\nOggi il famigerato Troll di nome " + t1.getNome() + " dovra` scontrarsi con il nostro nuovo campione di quest'anno, cioeeee` " + eroe +
                "\nCHE LO SCONTRO ABBIAAAAAA INIZIOOO!!");

        System.out.println("\n\nGAME\n");

        do {
            int scelta = 0;
            do{
                System.out.println("\nCosa vuoi fare eroe?");
                System.out.println("1) Attacco leggero" +
                        "\n2) Attacco pesante" +
                        "\n3) Attacco super mega iper Pesante" +
                        "\n4) Curata col falo` tattico");

                System.out.print("\nInserisci la scela: ");
                input = new Scanner(System.in);
                scelta = input.nextInt();

                if(scelta <= 4 && scelta >= 1) {
                    sceltaValida = true;
                }
                else{
                    System.out.println("A quanto pare abbaimo un eroe che non sa leggere i numeri!" +
                            "\nRifai!");
                }
            }while(!sceltaValida);

            switch(scelta) {
                case 1: {

                }
                default:
            }


        }while(!finisched);
    }
}