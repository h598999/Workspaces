package klasser;

public class TabellHaug <T extends Comparable<T>> {// 
	 
	private T[] data;
	private int antall;
	private static final int STDK = 100;
	public TabellHaug() {
	data = (T[]) new Comparable[STDK];
	antall = 0;
	}

	public void leggTilElement(T el) {
	if (antall == data.length)
	utvidTabell();
	data[antall] = el; // Plasser den nye helt sist
	antall++;
	if (antall > 1)
	reparerOpp(); // Bytt om oppover hvis nødvendig
	}
	private void utvidTabell() {
	// Dobler tabellen ved behov for utviding
	int lengde = data.length;
	T[] ny = (T[]) new Comparable[2 * lengde];
	for (int i = 0; i < antall; i++)
	ny[i] = data[i];
	data = ny;
	}
	private void reparerOpp() {
	T hjelp;
	int node;
	int forelder;
	node = antall - 1; // Siste node (fysisk)
	forelder = (node - 1) / 2;
	boolean ferdig = false;
	while ((node != 0) && (!ferdig)) {
	if ((data[node]).compareTo(data[forelder]) < 0) {
	hjelp = data[node]; // Bytter om med data i forelder
	data[node] = data[forelder];
	data[forelder] = hjelp;
	node = forelder; // Går 1 trinn oppover med begge
	forelder = (node - 1) / 2;
	} else {
	ferdig = true;
	}
	}
	}
	//fortset neste side

	 
	public T fjernMinste() throws Exception {
	if (erTom())
	throw new Exception("Haug er tom");
	T svar = data[0];
	data[0] = data[antall - 1];
	reparerNed(); // Bytter om nedover hvis nødvendig
	antall--;
	return svar;
	}
	
	public T finnMinste() throws Exception {
	if (erTom())
	throw new Exception("Haug er tom");
	T svar = data[0];
	return svar;
	}
	private void reparerNed() {
	T hjelp;
	boolean ferdig = false;
	int forelder = 0; // Start i roten og sml med neste nivå
	int minbarn;
	int vbarn = forelder * 2 + 1;
	int hbarn = vbarn + 1;
	while ((vbarn < antall) && !ferdig) { // Har flere noder lenger nede
	minbarn = vbarn;
	 if ((hbarn < antall) && ((data[hbarn]).compareTo(data[vbarn]) < 0))
	minbarn = hbarn;
	// Har funnet det "minste" av barna. Sml med forelder
	if ((data[forelder]).compareTo(data[minbarn]) <= 0)
	ferdig = true;
	else { // Bytt om og gå videre nedover hvis forelder er for stor
	hjelp = data[minbarn];
	data[minbarn] = data[forelder];
	data[forelder] = hjelp;
	forelder = minbarn;
	vbarn = forelder * 2 + 1;
	hbarn = vbarn + 1;
	}
	}
	}
	
	public boolean erTom() {
	return antall == 0;
	}

	public int antall() {
	return antall;
	}
	public void skrivTab() {
	// Hjelpemetode til test
	for (int i = 0; i < antall; i++)
	System.out.print(data[i] + " ");
	System.out.println();
	}
	}//clas
