package com.doyle.model;

public class Prestamo {

	String tipo;
	float monto;
	boolean aplicaSeguro;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public boolean isAplicaSeguro() {
		return aplicaSeguro;
	}
	public void setAplicaSeguro(boolean aplicaSeguro) {
		this.aplicaSeguro = aplicaSeguro;
	}

}
