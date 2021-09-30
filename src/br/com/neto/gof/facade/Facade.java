package br.com.neto.gof.facade;

import br.com.neto.gof.subsistema1.CrmService;
import br.com.neto.gof.subsistema2.VeiculoApi;

public class Facade {

    public void migracao(String placa, String chassi) {

        String modelo = VeiculoApi.getInstancia().recuperarModeloVeiculo(chassi);
        Integer anoModelo = VeiculoApi.getInstancia().recuperarAnoModeloVeiculo(chassi);

        CrmService.gravarInformacaoesVeiculo(placa, chassi, modelo, anoModelo);

    }
}
