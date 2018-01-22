import java.util.Scanner;

/**
 * Created by GilRa1731814 on 2018-01-15.
 */
public class jeuDesAllumettes {
    public static void main(String[] args) {
        //variable
        int nombreAllumette = 0;
        int totalAllumette = 0;
        int nombreDeTour = 1;
        int choix=0;
        String nom1;
        String nom2;
        boolean fin = false;
        int tabnom1[]=new int[50];
        int tabnom2[]=new int[50];
        int nbtour1=0;
        int nbtour2=0;
        int boucle=0;
        int valeur=1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue au jeu des allumettes, votre but est de ne pas enlever la derniere allumette.\n Quel est le nom du premier joueur");
        nom1 = sc.nextLine();
        System.out.println("Quel est le nom du joueur 2.");
        nom2 = sc.nextLine();




        while (fin==false) {
            while (totalAllumette <= 0) {
            totalAllumette = (int) ((20 + Math.random() * (100 - 20)));}

            while (totalAllumette>=0){

                System.out.println("Il a " + totalAllumette + " allumettes");
                if (nombreDeTour % 2 == 1) {

                    System.out.println(nom1 + ",combien d'allumette (entre 1 et 3) voulez-vous retirer?)");
                    nombreAllumette = sc.nextInt();
                    tabnom1[nbtour1]=nombreAllumette;
                    nbtour1++;
                } else {
                        System.out.println(nom2 + ",combien d'allumette (entre 1 et 3) voulez-vous retirer?)");
                        nombreAllumette = sc.nextInt();
                    tabnom2[nbtour2]=nombreAllumette;
                    nbtour2++;
                    }

                    if (nombreAllumette >= 1 && nombreAllumette <= 3) {
                        totalAllumette = totalAllumette - nombreAllumette;
                        nombreDeTour++;
                    }
                    else if(totalAllumette<=0){
                    nombreDeTour++;
                    }

                    else{
                        System.out.println("Veuillez mettre un nombre valide.");
                    }
                }
                if (nombreDeTour%2==1)
                    System.out.println(nom2+" est le gagnant!");
                else
                    System.out.println(nom1 + " est le gagnant!");

            System.out.print(nom1 + ":");
            boucle=0;
            valeur=1;
            while (valeur!=0){
                System.out.print("[");
                valeur=tabnom1[boucle+1];
                System.out.print(tabnom1[boucle]);
                boucle++;
                System.out.print("]");
            }
            valeur=1;
            System.out.println("");
            System.out.print(nom2+":");
            boucle=0;
            while (valeur!=0){
                System.out.print("[");
                valeur=tabnom2[boucle+1];
                System.out.print(tabnom2[boucle]);
                boucle++;
                System.out.print("]");
            }

            nbtour1 = 0;
            nbtour2=0;
                    System.out.println("\n"+"Voulez-vous rejouer? (1-oui 2-non)");
                    choix=sc.nextInt();
                    if (choix==1){
                        fin = false;
                        totalAllumette = (int) ((20 + Math.random() * (100 - 20)));
                    }
                    else if (choix==2)
                        fin=true;
                    else
                        System.out.println("Veuillez mettre un nombre valide.");

            while (totalAllumette <= 0) {
                for (int i = 0; i < tabnom1.length; i++) {
                    tabnom1[i] = 0;
                }
                for (int i = 0; i < tabnom2.length; i++) {
                    tabnom2[i] = 0;
                }
            }
            }

        }
    }
