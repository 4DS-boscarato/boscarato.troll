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


        int vAttaccoPesante = 2;
        int vAttaccoPesantissimo = 1;
        int vCuretta = 1;
        do{
            int scelta = 0;
            float pd = 0;


            do{
                System.out.println("\n-------\n" +
                        "Cosa vuoi fare eroe?");
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
                    System.out.println("\nHAI SCELTO ATTACCO LEGGERO!");
                    pd = 0;

                    do{
                        pd = (float) ((Math.random() * 10));
                    }while(pd <= 5);

                    System.out.println("SCAGLI UN COLPO ABBASTANZA SCARSO DA BEN " + pd + " DANNI!");
                    t1.danniSubiti(pd);

                    System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                    System.out.println("\nCommentatore: \nIl nostro ero assegna un colpo abbastanza scarsino al Troll!");
                    break;
                }

                case 2: {
                    if(vAttaccoPesante != 0){
                        vAttaccoPesante -= 1;
                        System.out.println("\nHAI SCELTO ATTACCO PESANTE!");
                        pd = 0;

                        do{
                            pd = (float) ((Math.random() * 20));
                        }while(pd <= 15);

                        System.out.println("SCAGLI UN COLPO POTENTE DA BEN " + pd + " DANNI!");
                        t1.danniSubiti(pd);

                        System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                        System.out.println("\nCommentatore: \nIl nostro ero assegna un colpo molto potente al Troll!");
                    }
                    break;
                }

                case 3: {
                    if(vAttaccoPesantissimo != 0){
                        vAttaccoPesantissimo -= 1;
                        System.out.println("\nHAI SCELTO ATTACCO SUPER MEGA IPER PESANTE!");
                        pd = 0;

                        do{
                            pd = (float) ((Math.random() * 40));
                        }while(pd <= 35);

                        System.out.println("SCAGLI UN COLPO SUPER POTENTENTISSIMO DA BEN " + pd + " DANNI!");
                        t1.danniSubiti(pd);

                        System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                        System.out.println("\nCommentatore: \nIl nostro ero assegna un colpo molto molto motlo potente al Troll!");
                    }
                    break;
                }

                case 4: {
                    System.out.println("\nHAI SCELTO DI CURARTI!");
                }
            }


        }while(!finisched);
    }
}