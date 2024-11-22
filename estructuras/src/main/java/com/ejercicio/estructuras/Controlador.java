package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Ejercicio 1.
@RestController
public class Controlador {
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero) {
		String ret = "";
		if (numero % 2 == 0) {
			ret += "Es par el " + numero;
		} else {
			ret = "Hola mundo.";

		}
		return ret;
	}
//Ejercicio 2.
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero) {
		String nMultiplicar = "";
		for (int i = 1; i <= 10; i++) {
			nMultiplicar += "<h3>" + numero * i + "</h3>";
		}

		return nMultiplicar;
	}

//Ejercicio 3.
	
	
	
	
	
	
	
	
	
}
