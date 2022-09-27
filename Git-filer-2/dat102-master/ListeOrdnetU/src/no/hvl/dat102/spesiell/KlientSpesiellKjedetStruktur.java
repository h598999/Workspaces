package no.hvl.dat102.spesiell;

public class KlientSpesiellKjedetStruktur{
	
    public static void main(String[] args){
         SpesiellKjedetStruktur<Character> spesiell = new
                                      SpesiellKjedetStruktur<>();
        
        String streng = "Denne strengen er veldig spesiell!";
        
        int lengde = streng.length();

        for(int i = 0; i < lengde; i++) {
            spesiell.leggTil((streng.charAt(i)));
        }
      
        System.out.println(spesiell);           
        spesiell.snuKjedetStruktur();
             
        System.out.println(spesiell);
      
     }//main
}
