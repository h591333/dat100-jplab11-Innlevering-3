package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.setTekst(tekst);
		this.setBruker(bruker);
		this.setDato(dato);
		this.id = id;
		this.likes = 0;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.setTekst(tekst);
		this.setBruker(bruker);
		this.setDato(dato);
		this.id = id;
		this.likes = likes;
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String str = super.toString() + this.getUrl() + "\n";
		str = str.substring(6,str.length());
		str = "BILDE\n" + str;
		return str;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}