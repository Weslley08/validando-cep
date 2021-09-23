package com.json.cep;

public class StringUrl {

	private String url;

	private String url() {

		StringBuilder stringUrl = new StringBuilder();
		String tipoProtocolo = "https";
		String nome = "viacep";
		String dominio1 = ".com";
		String dominio2 = ".br";
		int cep = 38408902; // Coloque o cep que deseja verificar.

		// Construindo uma string com a URL da api para verificar os cep's.
		stringUrl.append(tipoProtocolo).append("://").append(nome).append(dominio1).append(dominio2).append("/")
				.append("ws").append("/").append(cep).append("/").append("json").append("/");

		url = stringUrl.toString();
		return url;

	}

	public StringUrl() {
		super();
	}

	public String getUrl() {
		return url();
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
