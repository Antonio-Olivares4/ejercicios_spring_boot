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
			nMultiplicar += "<h3>" + numero + " x " + i + " = " + numero * i + "</h3>";
		}

		return nMultiplicar;
	}

//Ejercicio 3.
	@PostMapping("/promedioCalificaciones")
	public String calcularPromedio(@RequestParam String calificaciones) {
	    try {
	        // Convierte las calificaciones en un array de números.
	        String[] calificacionesArray = calificaciones.split(",");
	        double suma = 0;
	        for (String calificacion : calificacionesArray) {
	            suma += Double.parseDouble(calificacion.trim());
	        }

	        // Calculo el promedio
	        double promedio = suma / calificacionesArray.length;

	   
	        String resultado = promedio >= 5 ? "Aprobado" : "Suspenso";

	       
	        return "<h2>Promedio: " + promedio + "</h2>" +
	               "<h2>Estado: " + resultado + "</h2>";
	    } catch (Exception e) {
	        return "<h3 style='color: red;'>Error: Asegúrate de ingresar números válidos separados por comas.</h3>";
	    }
	}

}
