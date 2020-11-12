package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg [] innlegger;
	private int nesteledig; 

	public Blogg() {
		innlegger = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innlegger = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innlegger;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i=0; i < nesteledig; i++) {
			if (innlegger[i].erLik(innlegg)) {
				return i;	
			}
			
		}
		
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		if (finnInnlegg(innlegg) >= 0) {
			return true;
		}
		
		return false;
	}

	public boolean ledigPlass() {
		
		for (int i=0; i < innlegger.length; i++) {
			if (innlegger[i] == null) {
				
				return true;
			}
		}

		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		 if (!finnes(innlegg) && ledigPlass()) {
			 innlegger[nesteledig] = innlegg;
			 nesteledig++;
			 return true;
		 }
		 
		 return false; 
	}
	
	public String toString() {
		
		String s = nesteledig + "\n";
		for (int i=0; i < innlegger.length; i++) {
			s += innlegger[i];
		}
		
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}