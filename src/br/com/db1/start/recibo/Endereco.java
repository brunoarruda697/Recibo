package br.com.db1.start.recibo;

import br.com.db1.start.tipo.TipoLogradouro;

public class Endereco {

	private TipoLogradouro tipoLogradouro;

	private String logradouro;

	private String numero;

	private String complemento;

	private String bairro;

	private Integer cep;

	private Cidade cidade;
	
	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCepFormatado() {
		String cepFormatado = cep.toString();
		cepFormatado = cepFormatado.substring(0, 5) + "-" 
		+ cepFormatado.substring(5, 8);
		return cepFormatado;
		
	}

}

