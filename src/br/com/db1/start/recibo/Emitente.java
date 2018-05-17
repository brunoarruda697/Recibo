package br.com.db1.start.recibo;

public class Emitente {

	private String nome;

	private String documento;

	private byte[] assinatura;

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documentoSemFormatacao) {
		this.documento = documentoSemFormatacao;
	}

	public String getDocumentoFormatado() {
		String documentoFormatado = documento.toString();
		documentoFormatado = documentoFormatado.substring(0, 3) + "." + documentoFormatado.substring(3, 6) + "."
				+ documentoFormatado.substring(6, 9) + "-" + documentoFormatado.substring(9, 11);
		return documentoFormatado;
	}
}
