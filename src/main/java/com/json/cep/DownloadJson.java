package com.json.cep;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadJson {
	private File file;

	public void json() throws IOException {

		StringUrl stringUrl = new StringUrl();

		// Chamando a API
		URL url = new URL(stringUrl.getUrl());
		
		// Criando arquivo temporário em .json
		file = new File("C:\\Users\\Weslley\\Desktop\\demo\\src\\main\\java\\com\\example\\util\\file.json");

		FileUtils.copyURLToFile(url, file);

	}

	public DownloadJson() {
		super();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
