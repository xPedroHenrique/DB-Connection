package main;

import Model.Conta;
import Util.Gerenciador;
import View.Sistema;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Conta> banco = new ArrayList<>();
    //public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        new Sistema().setVisible(true);
//        System.out.println(dotenv.get("URL"));
//        System.out.println(dotenv.get("user"));
//        System.out.println(dotenv.get("password"));
        Gerenciador.getConexao();
    }

}
