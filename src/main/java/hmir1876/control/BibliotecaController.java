package hmir1876.control;

import hmir1876.model.Carte;
import hmir1876.repository.repoInterfaces.CartiRepoInterface;
import hmir1876.util.Validator;

import java.util.List;

public class BibliotecaController {

	private CartiRepoInterface cartiRepoInterface;
	
	public BibliotecaController(CartiRepoInterface cr){
		this.cartiRepoInterface = cr;
	}
	
	public void adaugaCarte(Carte c) throws Exception{
		Validator.validateCarte(c);
		cartiRepoInterface.adaugaCarte(c);
	}
	
	public void modificaCarte(Carte nou, Carte vechi) throws Exception{
		cartiRepoInterface.modificaCarte(nou, vechi);
	}
	
	public void stergeCarte(Carte c) throws Exception{
		cartiRepoInterface.stergeCarte(c);
	}

	public List<Carte> cautaCarte(String autor) throws Exception{
		Validator.isStringOK(autor);
		return cartiRepoInterface.cautaCarteDupaAutor(autor);
	}
	
	public List<Carte> getCarti() throws Exception{
		return cartiRepoInterface.getCarti();
	}
	
	public List<Carte> getCartiOrdonateDinAnul(String an) throws Exception{
		if(!Validator.isNumber(an))
			throw new Exception("Nu e numar!");
		return cartiRepoInterface.cautaCartiDinAnulOrdonateDupaTitluSiAutor(an);
	}
	
	
}
