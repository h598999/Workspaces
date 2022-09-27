package no.hvl.dat102.exceptions;

//********************************************************************
//  EmptyCollectionException.java   //
//  Representerersituasjonen n�r samlingen er tom.
//********************************************************************

public class EmptyCollectionException extends RuntimeException{
   /**
	 * 
	 */
	
/******************************************************************
     Setter opp dette unntaket med passende melding.
   ******************************************************************/
   public EmptyCollectionException (String collection){
      super (" Denne " + collection + " er tom.");
   }
}
