package hmir1876;


import hmir1876.control.BibliotecaController;
import hmir1876.repository.repo.CartiRepo;
import hmir1876.repository.repoInterfaces.CartiRepoInterface;
import hmir1876.view.Consola;

import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        CartiRepoInterface cr = new CartiRepo();
        BibliotecaController bc = new BibliotecaController(cr);
        Consola c = new Consola(bc);
        try {
            c.executa();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
