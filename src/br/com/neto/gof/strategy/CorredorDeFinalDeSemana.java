package br.com.neto.gof.strategy;

public class CorredorDeFinalDeSemana implements Comportamento {
    @Override
    public void correr() {
        System.out.println("Devagar");
    }

    @Override
    public void tipoPisada() {
        System.out.println("Retropé");

    }
}
