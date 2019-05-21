package hmir1876.repository.repoInterfaces;

import hmir1876.model.Carte;

import java.util.List;

public interface CartiRepoInterface {
	void adaugaCarte(Carte c);
	void modificaCarte(Carte nou, Carte vechi);
	void stergeCarte(Carte c);
	List<Carte> cautaCarteDupaAutor(String ref);
	List<Carte> getCarti();
	List<Carte> cautaCartiDinAnulOrdonateDupaTitluSiAutor(String an);
}
