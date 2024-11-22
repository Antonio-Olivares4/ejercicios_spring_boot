package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controlador {
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero) {
		String ret="";
		if(numero%2==0) {
			ret +="Es par el "  + numero;
		}else {
			ret="Hola mundo.";
			
		}
		return ret;
	}
	
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numeromul) {
		String nMultiplicar="";
		for(int i =0; i<=10; i++) {
			nMultiplicar="" + numeromul*i;
		}
		
		return nMultiplicar;
	}
	
	
	
	
	
}
