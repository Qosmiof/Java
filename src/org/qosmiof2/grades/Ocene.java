package org.qosmiof2.grades;

public enum Ocene {
	Slovenšèina(""),
	Matematika(""),
	Zgodovina(""),
	Anglešèina(""),
	Nemšèina(""),
	Glasba(""),
	Likovna(""),
	Športna(""),
	Fizika(""),
	Biologija(""),
	Geografija(""),
	Kemija("");

	String ocena;

	Ocene(String ocena) {
		this.ocena = ocena;
	}

	public void setOcena(String ocena) {
		this.ocena = ocena;
	}

	public String getOcena() {
		return ocena;
	}

}
