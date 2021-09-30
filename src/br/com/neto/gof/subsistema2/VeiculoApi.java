package br.com.neto.gof.subsistema2;

import br.com.neto.gof.singleton.Singleton;

public class VeiculoApi {

    private static VeiculoApi instancia = new VeiculoApi();

    private VeiculoApi() {
        super();
    }

    public static VeiculoApi getInstancia() {
        return instancia;
    }

    public String recuperarModeloVeiculo(String chassi) {
        return "Mercedes-AMG A45S";
    }

    public Integer recuperarAnoModeloVeiculo(String chassi) {
        return 2022;
    }
}
