package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.tekst = tekst;
		this.setBruker(bruker);
		this.setDato(dato);
		this.id = id;
		this.likes = 0;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.likes = likes;
		this.tekst = tekst;
		this.setBruker(bruker);
		this.setDato(dato);
	}
	
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "TEKST\n" + super.toString() + this.getTekst() + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
