public class Empleado{
	private String nombre;
	private String departamento;
	private String posicion;
	private double salario;
	
	public Empleado(String nombre, String departamento, String posicion, double salario) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.posicion = posicion;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString(){
		return String.format("Nombre: %s - Departamento: %s - Posicion: %s - Salario: $%f", 
			nombre, departamento, posicion, salario);
	}
	
	public static void main(String[] args){
		Empleado[] baseDatosEmpleados = new Empleado[5];
		
		baseDatosEmpleados[0] = new Empleado("Juan", "Gerencia", "Gerente", 7000000);
		baseDatosEmpleados[1] = new Empleado("Edward", "Administración", "Administrador", 4500000);
		baseDatosEmpleados[2] = new Empleado("Camilo", "Ventas", "Asesor", 1700000);
		baseDatosEmpleados[3] = new Empleado("Pedro", "Ventas", "Asesor", 1700000);
		baseDatosEmpleados[4] = new Empleado("Lorena", "Despachos", "Distribuidor", 1500000);
		
		for(int i = 0; i < baseDatosEmpleados.length; ++i){
			System.out.println(baseDatosEmpleados[i]);
		}
	}
}