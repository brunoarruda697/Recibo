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
	
	public String getCepFormatado(Integer cep){
		String parte1, parte2;
		if(cep.toString().length()<8) {
			parte1 = "0".concat(Integer.toString(cep).substring(0,4));
			parte2 = Integer.toString(cep).substring(4);
			
		}else {
			parte1 = Integer.toString(cep).substring(0,5);
			parte2 = Integer.toString(cep).substring(5);
		}
		
		return parte1.concat("-").concat(parte2);
		
	}
	
}
