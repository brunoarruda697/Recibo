package br.com.db1.start.recibo;

public class Executadora {
	
	public static void main(String[] args) {
		exibirCepFormatado(86975000);
		exibirCepFormatado(99999999);
		exibirCepFormatado(86468524);
		exibirCepFormatado(46847348);
		
	}

	private static void exibirCepFormatado(Integer cep) {
		Endereco endereco = new Endereco ();
		endereco.setCep(cep);
		System.out.println(endereco.getCepFormatado());
	}
}
