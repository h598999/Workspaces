package no.hvl.dat102.listeklient;
import java.util.Scanner;

import no.hvl.dat102.tabell.TabellOrdnetListe;

public class KlientOrdnetTabellListe {
   /*****************************************************************
     .
   *****************************************************************/
   public static void main (String[] args )
     {
   TabellOrdnetListe<String> navneListe1 = new TabellOrdnetListe<String>();
   TabellOrdnetListe<String> navneListe2 = new TabellOrdnetListe<String>();
    // Alternativ: Bruk KjedetOrdnetListe
    Scanner in = new Scanner(System.in);
    String navn, svar;

    do{
          System.out.println("Oppgi navn?");
          navn   = in.nextLine();
          // Legger navnene sortert inn i  navnelistene
          navneListe1.leggTil(navn);
          navneListe2.leggTil(navn);

          System.out.print("Oppgi flere navn [J/N]?:");
          svar = in.nextLine();

      }while(svar.equals("j")|| svar.equals("J"));

       //Skriver navnene ut i stigende ordning
       System.out.println("\n\nNavnelisten i stigende ordning:");

        while(navneListe1.antall() > 0)
              System.out.print(navneListe1.fjernFoerste() + " ");


      //Skriver ut navnen i avtagende ordning
       System.out.println("\n\nNavnelisten i fallende ordning:");

        while(navneListe2.antall() > 0)
           System.out.print(navneListe2.fjernSiste() + " ");


 }//main

}//class
