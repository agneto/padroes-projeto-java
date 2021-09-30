package br.com.neto.gof.strategy;

public class CorredorElite implements Comportamento {
    @Override
    public void correr() {
        System.out.println("Corre rápido");
    }

    @Override
    public void tipoPisada() {
        System.out.println("Médio pé");
    }
}
