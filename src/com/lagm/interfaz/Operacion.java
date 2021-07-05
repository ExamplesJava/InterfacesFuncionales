package com.lagm.interfaz;

// Una interfaz funcional es aquella que define una �nica operaci�n (un solo m�todo)
@FunctionalInterface // Anotaci�n java 8 para definir interfaces funcionales
public interface Operacion {
	double calcular(double n1, double n2);
}
