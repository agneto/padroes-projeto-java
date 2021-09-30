package br.com.neto.gof;

import br.com.neto.gof.singleton.Singleton;
import br.com.neto.gof.strategy.Comportamento;
import br.com.neto.gof.strategy.Corredor;
import br.com.neto.gof.strategy.CorredorDeFinalDeSemana;
import br.com.neto.gof.strategy.CorredorElite;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        // strategy
        Comportamento corredorElite = new CorredorElite();
        Comportamento corredorDeFinalSemana = new CorredorDeFinalDeSemana();

        Corredor corredor = new Corredor();
        corredor.setStrategy(corredorElite);

        // corredor de elite
        corredor.correr();

        corredor.setStrategy(corredorDeFinalSemana);

        // corredor de final de semana
        corredor.correr();

    }
}
