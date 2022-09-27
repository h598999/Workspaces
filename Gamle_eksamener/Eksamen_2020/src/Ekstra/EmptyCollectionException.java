package Ekstra;

@SuppressWarnings("serial")
public class EmptyCollectionException extends RuntimeException{
	 /******************************************************************
	 Setter opp et unntak med passende melding.
	 ******************************************************************/
	 public EmptyCollectionException (String samling) {
	 super ("" + samling + " er tom.");
	 }
}
