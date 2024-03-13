package br.com.fiap.aula03.dto;

import br.com.fiap.aula03.model.CategoriaMercado;

public record CadastroMercadoDto(String nome, CategoriaMercado categoria,string cnpj, Double faturamento) {

}

public DetalhesMercaoDto(Mercado mercado){

    this(mercado.getId(),mercado.getName().mercado.getCategoria(),mercado.getCnpj(),mercado.getFaturamento());
}
