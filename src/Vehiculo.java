public class Vehiculo 
{
    private  String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }
    // Getters y Setters
    public String getMarca() 
    {
        return marca; 
    } 
    public void setMarca(String marca) 
    {
        this.marca = marca; 
    } 
    public String getModelo() 
    {
        return modelo;
    }
    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    } 
    public int getAño()
    {
        return año;
    }
    public void setAño(int año)
    {
        this.año = año;
    }
    public int getKilometraje()
    {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje)
    {
        this.kilometraje = kilometraje;
    }
    // Método para mostrar la información del vehículo
public void mostrarinfo() 
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out. println("Kilometraje: " + kilometraje); 
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------//
//Método para realizar mantenimiento básico
    public void realizarMantenimiento() 
    {
        System.out.println("Realizando mantenimiento básico del vehículo...");
        //Acciones de mantenimiento
        System.out.println("Verificando niveles de aceite y líquido de frenos.");
        System.out.println("Revisando el filtro de aire y cambiándolo si es necesario.");
        System.out.println("Comprobando el estado de las bujías y reemplazándolas si están desgastadas.");
    }
}