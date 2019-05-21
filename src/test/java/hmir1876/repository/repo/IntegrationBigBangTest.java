package hmir1876.repository.repo;

import org.junit.Before;
import org.junit.Test;
import hmir1876.control.BibliotecaController;
import hmir1876.model.Carte;
import hmir1876.repository.repoInterfaces.CartiRepoInterface;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IntegrationBigBangTest {
    CartiRepoInterface cr = new CartiRepo("cartiTeste1.txt");

    @Test
    public void adaugaCarte_ECP_modulA_test() {
        List<String> r = new ArrayList<>();
        r.add("Eminescu");
        List<String> c = new ArrayList<>();
        c.add("poezii");
        c.add("luceafarul");
        try{
            Integer size = cr.getCarti().size();
            cr.adaugaCarte(new Carte("Poezii",r,"2010",c,"corint"));
            if(cr.getCarti().size() == size + 1)
                assertTrue(true);
            else
                assertTrue(false);
        }catch (Exception s){
            assertTrue(false);
        }
    }

    @Test
    public void cautaCarte_WTB_modulB_test(){
        List<Carte> lista = new ArrayList<>();
        try {
            lista = cr.cautaCarteDupaAutor("Sadoveanu");
            if(lista.size()==1)
                assertTrue(true);
            else
                assertTrue(false);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void cautaCartiDinAnul_WTB_modulC_test() {
        List<Carte> lista = new ArrayList<>();
        try {
            lista = cr.cautaCartiDinAnulOrdonateDupaTitluSiAutor("1997");
            if(lista.size()==1)
                assertTrue(true);
            else
                assertTrue(false);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void integrationBigBang(){
        List<String> r = new ArrayList<>();
        List<Carte> lista = new ArrayList<>();
        List<Carte> lista2 = new ArrayList<>();

        r.add("Eminescu");
        List<String> c = new ArrayList<>();
        c.add("poezii");
        c.add("luceafarul");

        try{
            Integer size = cr.getCarti().size();

            cr.adaugaCarte(new Carte("Poezii",r,"2010",c,"corint"));
            lista = cr.cautaCarteDupaAutor("Sadoveanu");
            lista2 = cr.cautaCartiDinAnulOrdonateDupaTitluSiAutor("1997");

            if(cr.getCarti().size() == size + 1 && lista.size()==1 && lista2.size()==1)
                assertTrue(true);
            else
                assertTrue(false);
        }catch (Exception s){
            assertTrue(false);
        }

    }

}