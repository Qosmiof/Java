package org.qosmiof2.grades;

public enum Ocene {
	Sloven��ina(""),
	Matematika(""),
	Zgodovina(""),
	Angle��ina(""),
	Nem��ina(""),
	Glasba(""),
	Likovna(""),
	�portna(""),
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
