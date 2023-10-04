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
            float pdG = 0;
            float pdT = 0;
            do{
                System.out.println("\n-------\n" + "E` IL TURNO ORA");
                System.out.println("-------\n" +
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
                    pdG = 0;

                    do{
                        pdG = (float)((Math.random() * 10));
                    }while(pdG <= 5);

                    System.out.println("SCAGLI UN COLPO ABBASTANZA SCARSO DA BEN " + pdG + " DANNI!");
                    t1.danniSubiti(pdG);

                    System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                    System.out.println("\nCommentatore: \nIO BASITO! Il nostro eroe assegna un colpo abbastanza scarsino al Troll!");
                    break;
                }

                case 2: {
                    if(vAttaccoPesante != 0){
                        vAttaccoPesante -= 1;
                        System.out.println("\nHAI SCELTO ATTACCO PESANTE!");
                        pdG = 0;

                        do{
                            pdG = (float)((Math.random() * 20));
                        }while(pdG <= 15);

                        System.out.println("SCAGLI UN COLPO POTENTE DA BEN " + pdG + " DANNI!");
                        t1.danniSubiti(pdG);

                        System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                        System.out.println("\nCommentatore: \nIO BASITO! Il nostro eroe assegna un colpo molto potente al Troll!");
                    }
                    break;
                }

                case 3: {
                    if(vAttaccoPesantissimo != 0){
                        vAttaccoPesantissimo -= 1;
                        System.out.println("\nHAI SCELTO ATTACCO SUPER MEGA IPER PESANTE!");
                        pdG = 0;

                        do{
                            pdG = (float)((Math.random() * 40));
                        }while(pdG <= 35);

                        System.out.println("SCAGLI UN COLPO SUPER POTENTENTISSIMO DA BEN " + pdG + " DANNI!");
                        t1.danniSubiti(pdG);

                        System.out.println("\nLa vita del Troll ora e`: " + t1.getPv() + "/100");

                        System.out.println("\nCommentatore: \nIO BASITO! Il nostro eroe assegna un colpo molto molto motlo potente al Troll!");
                    }
                    break;
                }

                case 4: {
                    if(vCuretta != 0 && pvEroe != 100){
                        int puntiVita = 0;
                        vCuretta -= 1;
                        System.out.println("\nHAI SCELTO DI CURARTI!");

                        do{
                            puntiVita = (int)((Math.random() * 25));
                        }while(puntiVita <= 20);

                        pvEroe += puntiVita;
                        System.out.println("TI CURI DI  " + puntiVita + " DI DANNO!");

                        System.out.println("\nCommentatore: \nIO ANCORA PIU` BASITO! Il nostro eroe decide di curarsi con il falo` tattico proprio davanti al Troll!");
                    }
                    break;
                }
            }

            System.out.println("\n-------\n" + "E` IL TURNO DI " + t1.getNome().toUpperCase() + " ORA" + "\n-------\n");

            pdT = t1.getPd();
            System.out.println("IL TROLL SCAGLIA UN BEN PIAZZATO DA " + pdT + " DANNI!");
            pvEroe -= pdT;

            System.out.println("\nLa tua vita ora e`: " + pvEroe + "/100");

            System.out.println("\nCommentatore: \nIO BASITO! Il Troll decide di attaccare con una bella mina il nostro eroe!");


            if(pvEroe <= 0){
                System.out.println("\n\nCommentatore: \nIO INCREDIBILMENTE BASITO! IL VINCITORE E` IL NOSTRO TROLLLLLLLL!");

                finisched = true;
            }

            if(t1.getPv() <= 0){
                System.out.println("\n\nCommentatore: \nIO INCREDIBILMENTE BASITO! IL VINCITORE E` IL NOSTRO EROEEEEEEE!");
                finisched = true;
            }

        }while(!finisched);
    }
}