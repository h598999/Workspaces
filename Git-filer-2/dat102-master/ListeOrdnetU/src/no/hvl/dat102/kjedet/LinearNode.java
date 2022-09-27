package no.hvl.dat102.kjedet; 

public class LinearNode<T> {

    private LinearNode<T> neste;
    private T element;

    /**
     * Oppretter en tom node
     */
    public LinearNode() {
        neste = null;
        element = null;
    }

    /**
     * Oppretter en node med et element.
     *
     * @param elem elementet som skal inn i noden
     */
    public LinearNode(T elem) {
        neste = null;
        element = elem;
    }

    /**
     * Returnerer etterfølger.
     *
     * @return neste node
     */
    public LinearNode<T> getNeste() {
        return neste;
    }

    /**
     * Setter neste til node
     *
     * @param node neste node
     */
    public void setNeste(LinearNode<T> node) {
        neste = node;
    }

    /**
     * Returnerer elementet til denne noden
     *
     * @return elementet
     */
    public T getElement() {
        return element;
    }

    /**
     * Setter nytt element i denne noden.
     *
     * @param elem nytt element
     */
    public void setElement(T elem) {
        element = elem;
    }

}
