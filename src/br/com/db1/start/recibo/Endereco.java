package br.com.db1.start.recibo;

public class Endereco {
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private Integer cep;
	
	public String getCepFormatado(){
		return cep.toString();
		
	}
	
}
