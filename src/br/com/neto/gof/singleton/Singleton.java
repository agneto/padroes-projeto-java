package br.com.neto.gof.singleton;

public class Singleton {

    private static class Instance {
        public static Singleton instancia = new Singleton();
    }

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        return Instance.instancia;
    }
}
