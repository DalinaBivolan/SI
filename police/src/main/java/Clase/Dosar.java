package Clase;

import java.io.File;

public class Dosar {
	
	String NumeDosar;
	String Descriere;
	String StatusDosar;
	File DownloadDosar;
	String NumeCateg;
	
	public String getNumeDosar() {
		return NumeDosar;
	}
	public void setNumeDosar(String numeDosar) {
		NumeDosar = numeDosar;
	}
	public String getDescriere() {
		return Descriere;
	}
	public void setDescriere(String descriere) {
		Descriere = descriere;
	}
	public String getStatusDosar() {
		return StatusDosar;
	}
	public void setStatusDosar(String statusDosar) {
		StatusDosar = statusDosar;
	}
	public File getDownloadDosar() {
		return DownloadDosar;
	}
	public void setDownloadDosar(File downloadDosar) {
		DownloadDosar = downloadDosar;
	}
	public String getNumeCateg() {
		return NumeCateg;
	}
	public void setNumeCateg(String numeCateg) {
		NumeCateg = numeCateg;
	}
}
