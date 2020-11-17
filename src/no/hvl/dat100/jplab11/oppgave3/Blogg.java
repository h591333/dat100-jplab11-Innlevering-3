package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig = 0;
	

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int id = -1;
		
		for(int i = 0; i < this.nesteledig; i++) {
			if(this.innleggtabell[i].erLik(innlegg)) {
				id = innlegg.getId();
			}
		}
		
		return id;
	}

	public boolean finnes(Innlegg innlegg) {
		if(this.finnInnlegg(innlegg) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		return (this.innleggtabell.length > this.nesteledig);
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (this.ledigPlass()){
			this.innleggtabell[this.nesteledig] = innlegg;
			this.nesteledig++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String str = this.nesteledig + "\n";
		for(int i = 0; i < this.nesteledig; i++) {
			str += this.innleggtabell[i].toString();
		}
		
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyTabell = new Innlegg[this.innleggtabell.length*2];
		for(int i = 0; i < this.nesteledig; i++) {
			nyTabell[i] = this.innleggtabell[i];
		}
		this.innleggtabell = nyTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		System.out.println(this.innleggtabell.length);
		if(!this.finnes(innlegg)) {
			if(!this.leggTil(innlegg)) {
				this.utvid();
				System.out.println(this.innleggtabell.length);
				return this.leggTil(innlegg);
			}
		}
		return false;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		int id = finnInnlegg(innlegg);
		if(id != -1) {
		    Innlegg[] newArray = new Innlegg[this.innleggtabell.length];
		    for(int i = 0; i < this.nesteledig; i++) {
		    	if (i >= id) {
		    		newArray[i] = this.innleggtabell[i++];
		    	} else {
		    		newArray[i] = this.innleggtabell[i];
		    	}
		    }

		    this.innleggtabell = newArray;
		    this.nesteledig--;
		    
			return true;
			
		} else {
			return true;
		}
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}