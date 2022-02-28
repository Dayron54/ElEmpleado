package mundo;

public class Empleado {

	
	//----------------------------
	// Atributos
	//----------------------------
	
	private String nombre;
	private int    cedula;
	private String direccion;
	private double salarioBase;
	private double porcentajeRetencion;
	
	//----------------------------
	// constructor
	//----------------------------
	
	public Empleado( String pNombre, int pCedula, String pDirrecion,
			double pSalarioBase, double pPorcentajeRetencion )
	{
		nombre = pNombre;
		cedula = pCedula;
		direccion = pDirrecion;
		salarioBase = pSalarioBase;
		porcentajeRetencion = pPorcentajeRetencion;
	}	
	//----------------------------
	//Metodos
	//----------------------------
	
	public double calcularDescuento()
	{
		return salarioBase * porcentajeRetencion / 100;
		
	}
	public double calcularSalarioPorPagar()
	{
		return salarioBase - calcularDescuento();
	}
	
	// get 
	
	public int getCedula()
	{
		return cedula;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public double getSalarioBase()
	{
		return salarioBase;
	}
	
	public String getDireccion()
	{
		return direccion;

	}
	
	public double getPorcentajeRetencion()
	{
		return porcentajeRetencion;
	}
	// set
	
	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}
	
	public void setCedula(int pCedula)
	{
		cedula = pCedula;
	}
	
	public void setDirrecion(String pDireccion)
	{
		direccion = pDireccion;
	}
	
	public void setSalarioBase(double pSalarioBase)
	{
		salarioBase = pSalarioBase;
	}
	
	public void setPorcentajeRetencion(double pPorcentajeRetencion)
	{
		porcentajeRetencion = pPorcentajeRetencion;
	}
	
	
}