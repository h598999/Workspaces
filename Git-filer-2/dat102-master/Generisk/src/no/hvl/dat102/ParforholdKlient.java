package no.hvl.dat102;

import no.hvl.dat102.adt.ParADT;

public class ParforholdKlient {  
public static void main(String[] args) {
    ParADT<String> strPar = new Par<>("Ole", "Kari");   
    ParADT<Integer> intPar = new Par<>(2021, 2022);
    
    System.out.println(strPar);
    String maksStreng = strPar.maks();
    System.out.printf("stoerste %s%n",maksStreng);        
    //--------------------------------------
    System.out.println(intPar);
    int maksHeltall = intPar.maks();
    System.out.printf("stoerste %d%n",maksHeltall);      
  }
}

