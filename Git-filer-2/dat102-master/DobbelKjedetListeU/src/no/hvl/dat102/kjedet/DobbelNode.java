package no.hvl.dat102.kjedet;

//********************************************************************
//  DobbelNode.java       
//
//  Representer en node i en dobbelkjedet liste..
//********************************************************************


public class DobbelNode<T>{
    private DobbelNode<T> neste;
    private DobbelNode<T> forrige;
    private T element;

    /******************************************************************
      Oppretter en tom node node.
    ******************************************************************/
    public DobbelNode(){    
       neste   = null;
       element = null;
       forrige = null;
    }

    /******************************************************************
      Oppretter en node som lagrer det spesifiserte elementet.
    ******************************************************************/
    public DobbelNode(T elem) {
       neste = null;
       forrige = null;
       element = elem;
    }

    /******************************************************************
      Returnerer en referanse til etterfølgeren av denne noden, 
      eller null hvis denne er siste.
    ******************************************************************/
    public DobbelNode<T> getNeste() {
       return neste;
    }

    /*************************************************************************
      Returnerer forgjengeren til denne noden, eller null hvis denne er første 
    **************************************************************************/
    public DobbelNode<T>  getForrige() {
       return forrige;
    }

    /******************************************************************
      Setter neste til å peke på dnode.
    ******************************************************************/
    public void setNeste (DobbelNode<T> dnode){
       neste = dnode;
    }

    /******************************************************************
      Settter ny forrige til å peke på dnode.
    ******************************************************************/
    public void setForrige(DobbelNode<T> dnode) {
       forrige = dnode;
    }


    /******************************************************************
      Returnerer elementet til denne noden..
    ******************************************************************/
    public T getElement() {
       return element;
    }

    /******************************************************************
      Lagrer nytt element i denne noden..
    ******************************************************************/
    public void setElement (T elem) {
       element = elem;
    }

}



