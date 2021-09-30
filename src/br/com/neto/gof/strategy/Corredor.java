package br.com.neto.gof.strategy;

public class Corredor {

    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void correr() {
        this.strategy.correr();
        this.strategy.tipoPisada();
    }
}
