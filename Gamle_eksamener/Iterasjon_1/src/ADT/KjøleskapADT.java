package ADT;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import Entiteter.Vare;

public interface Kj?leskapADT {

	/**
	 * Legger til varen som har id som blir satt som parameter. Dersom varen finnes i kj?leskap fra f?r, skal antall av denne varen ?kes,
	 * hvis ikkje skal den legges til med antall 1.
	 * @param vare
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void leggTil(int id) throws IOException, InterruptedException;
	
	/**
	 * fjerner en vare med id gitt som parameter, dersom denne varen ikkje finnes i kj?leskapet gj?r den ingenting
	 * @param id
	 * @return true dersom en vare ble fjernet false ellers.
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public boolean fjern(int id) throws IOException, InterruptedException;
	
	/**
	 * fjerner antall varer gitt ved antall som har id gitt ved id, og returnerer antall varer som blir fjernet
	 * @param id varetypen som skal fjernes
	 * @param antall antall varer som skal fjernes
	 * @return antall varer som ble fjernet
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public int fjernFlere(int id, int antall) throws IOException, InterruptedException;
	
	/*
	 * returnerer en liste med alle varer som kj?leskapet inneholder
	 */
	public Set<Vare> getAlle();
	/**
	 * Oppdaterer antall til en bestemt vare
	 * @param vare varen som skal oppdateres
	 * @param antall nye antallet av varen i kj?leskapet
	 */
	
	public void redigerAntall(Vare vare, int antall);
	
	
}
