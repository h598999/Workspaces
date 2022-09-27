package no.hvl.dat102.listeklient; 
  
public class Lag implements Comparable<Lag>{
 private String navn; 
 private int seire; 

 /*****************************************************************
   Setter opp dette laget med spesifisert informasjon.
 *****************************************************************/
 public Lag (String startNavn, int antallSeire){
    navn = startNavn;
    seire = antallSeire;
 }

 /*****************************************************************
   Returnerer navnet til laget.
 *****************************************************************/
 public String getNavn () {
    return navn;
 }
 
/*****************************************************************
   Returnerer antall seire til laget.
 *****************************************************************/
 public int getSeire (){
 	 return seire;
 }

 /*****************************************************************
   Sammenligner antall seire av dette lag med et annet lag.
   Returnerer  -1, 0, or 1 for mindre enn, lik , eller større enn.
 *****************************************************************/
 @Override
public int compareTo (Lag detAndre){
    int resultat = 0;
    if (seire < detAndre.getSeire()){
        resultat = -1;
    }
    else if (this.seire == detAndre.getSeire()){
        resultat = 0;
     }
    else{
         resultat = 1;
    }
   return resultat;
 }

 /*****************************************************************
   Returnerer navnet til laget.
 *****************************************************************/
 @Override
public String toString(){
   return navn;
 }
}//class


