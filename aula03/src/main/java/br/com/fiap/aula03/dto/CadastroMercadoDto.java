package br.com.fiap.aula03.dto;

import br.com.fiap.aula03.model.CategoriaMercado;
import br.com.fiap.aula03.dto.DetalhesMercadoDto;


public record CadastroMercadoDto(String nome, CategoriaMercado categoria,String cnpj, Double faturamento) {

};
