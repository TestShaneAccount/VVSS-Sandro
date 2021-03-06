package hmir1876.control;

import org.junit.Before;
import org.junit.Test;
import hmir1876.model.Carte;
import hmir1876.repository.repo.CartiRepo;
import hmir1876.repository.repoInterfaces.CartiRepoInterface;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaControllerTest2 {

    BibliotecaController controller;
    CartiRepoInterface cr = new CartiRepo("cartiTeste.txt");

    @Before
    public void setUp() throws Exception{
        controller = new BibliotecaController(cr);
    }

    @Test
    public void cautaCarte_WTB_valid3(){

        try {
            PrintWriter writer = new PrintWriter("cartiTeste.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Carte> lista = new ArrayList<>();
        List<String> r = new ArrayList<>();
        r.add("sadoveanu");
        List<String> c = new ArrayList<>();
        c.add("cuvint");
        try {
            controller.adaugaCarte(new Carte("titlul",r,"2000",c,"corint"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            lista = controller.cautaCarte("Sadoveanu");
            if(lista.size()==1)
                assertTrue(true);
            else
                assertTrue(false);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void cautaCarte_WTB_valid2(){
        try {
            PrintWriter writer = new PrintWriter("cartiTeste.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Carte> lista = new ArrayList<>();
        List<String> r = new ArrayList<>();
        //r.add("sadoveanu");
        List<String> c = new ArrayList<>();
        c.add("cuvint");
        try {
            controller.adaugaCarte(new Carte("titlul",r,"2000",c,"corint"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            lista = controller.cautaCarte("eminescu");
            if(lista.size()==1)
                assertTrue(false);
            else
                assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void cautaCarte_WTB_valid1(){
        try {
            PrintWriter writer = new PrintWriter("cartiTeste.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Carte> lista = new ArrayList<>();

        try {
            lista = controller.cautaCarte("sadoveanu");
            if(lista.size()==1)
                assertTrue(false);
            else
                assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void cautaCarte_WTB_valid4(){
        try {
            PrintWriter writer = new PrintWriter("cartiTeste.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Carte> lista = new ArrayList<>();
        List<String> r = new ArrayList<>();
        r.add("sadoveanu");
        List<String> c = new ArrayList<>();
        c.add("cuvint");
        try {
            controller.adaugaCarte(new Carte("titlul",r,"2000",c,"corint"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            lista = controller.cautaCarte("umberto");
            if(lista.size()==1)
                assertTrue(false);
            else
                assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void cautaCarte_WTB_invalid1(){
        try {
            PrintWriter writer = new PrintWriter("cartiTeste.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Carte> lista = new ArrayList<>();
        List<String> r = new ArrayList<>();
        r.add("sadoveanu");
        List<String> c = new ArrayList<>();
        c.add("cuvint");
        try {
            controller.adaugaCarte(new Carte("titlul",r,"2000",c,"corint"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            lista = controller.cautaCarte("1234");
            if(lista.size()==1)
                assertTrue(false);
            else
                assertTrue(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}