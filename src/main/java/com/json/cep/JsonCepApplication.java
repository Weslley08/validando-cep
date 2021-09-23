package com.json.cep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonCepApplication {

	public static void main(String[] args) {

		DownloadJson json = new DownloadJson();
		JSONParser jsonParser = new JSONParser();

		// Chamando metodo json que está na classe DownloadJson 
		try {
			json.json();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {

			FileReader reader = new FileReader(json.getFile());
			Object obj = jsonParser.parse(reader);

			JSONObject jsonObject = (JSONObject) obj;

			/* 
			 * Especificando quais objetos quero do JSON, 
			 * você pode escolher também os seguintes objetos:
			 * "cep", "logradouro", "complemento", "bairro", 
			 * "localidade", "uf", "ibge", "gia", "ddd", "siafi"
			*/
			String logradouro = (String) jsonObject.get("logradouro");
			System.out.println(logradouro);

			String bairro = (String) jsonObject.get("bairro");
			System.out.println(bairro);

			String localidade = (String) jsonObject.get("localidade");
			System.out.println(localidade);

			String uf = (String) jsonObject.get("uf");
			System.out.println(uf);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
