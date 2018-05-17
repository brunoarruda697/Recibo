package br.com.db1.start.recibo;

public class Executadora {

	public static void main(String[] args) {
		exibirCepFormatado(86975000);
		exibirCepFormatado(99999999);
		exibirCepFormatado(86468524);
		exibirCepFormatado(46847348);
		
		exibirDocumentoFormatado("47993624886");
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}

	private static void exibirDocumentoFormatado(String documentoSemFormatacao) {
		Emitente emitente = new Emitente();
		emitente.setDocumento(documentoSemFormatacao);
		System.out.println(emitente.getDocumentoFormatado());
	}

}
