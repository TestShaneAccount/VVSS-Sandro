package hmir1876.repository.repo;

import org.junit.Test;
import hmir1876.model.Carte;
import hmir1876.repository.repoInterfaces.CartiRepoInterface;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CautaCarteDupaAniRepoTest {

    CartiRepoInterface cr = new CartiRepo("cartiTeste1.txt");

    @Test
    public void cautaCartiDinAnulOrdonateDupaTitluSiAutor_valid() {
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
    public void cautaCartiDinAnulOrdonateDupaTitluSiAutor_invalid() {
        List<Carte> lista = new ArrayList<>();
        try {
            lista = cr.cautaCartiDinAnulOrdonateDupaTitluSiAutor("hhh");
            if(lista.size()==1)
                assertTrue(false);
            else
                assertTrue(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}