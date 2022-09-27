package no.hvl.dat102.klienter;

public class Kunde {

	private int ankTid, ferdigTid;

	public Kunde(int tid) {
		ankTid = tid;
		ferdigTid = 0;
	}

	public int getAnkTid() {
		return ankTid;
	}

	public void setFerdigTid(int nytid) {
		ferdigTid = nytid;
	}

	public int totalTid() {
		return ferdigTid - ankTid;
	}
}