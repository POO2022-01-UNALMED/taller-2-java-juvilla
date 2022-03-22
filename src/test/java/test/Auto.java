package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos() {
		int b=0;
		for (Asiento t:asientos) {
			if (t!=null) {
				++b;}
		}
		return b;
		}
	String verificarintegridad() {
		if (this.motor.registro!=this.registro) 
		{return "Las piezas no son originales";}
		for (Asiento w:asientos) {
				if (w==null) {
				continue;
				}
				else if (w.registro!=this.registro) {
				return "Las piezas no son originales";
				}
		}
		return "Auto original";
	}
	}
