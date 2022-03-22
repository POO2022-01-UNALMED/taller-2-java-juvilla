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
		int A=this.asientos.length;
		return A;
	}
	String verificarintegridad() {
		if (this.motor.registro==this.registro) {
			int a=1;
		}
		else {
			int a=0;
		}
		for (int i=0;i< this.asientos.length;i++) {
		if (this.asientos[i].registro==this.registro) {
			if (i==this.asientos.length) {
				int b=1;
			}
			continue;
		}
		else {
			return "Las piezas no son originales";
		}
	    }
		int c=a+b;
		if(==2)
	}
}
