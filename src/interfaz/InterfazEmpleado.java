package interfaz;

import mundo.Empleado;
public class InterfazEmpleado {

	public static void main(String[] args) {
	
	
		Empleado empleado1;
		
		empleado1 = new Empleado("Javir Padilla", 110783450, "cra 5 # 10-30",4000000.0, 8.0);
		
		System.out.println( empleado1.getNombre( ));
	}
}
