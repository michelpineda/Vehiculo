public class VehiculoCarga extends Vehiculo
{
    private int capacidadCarga; 
    // Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga)
    {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }
    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga() 
    {
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga)
    {
        this.capacidadCarga = capacidadCarga;
    }
    // Sobrescribir el m~todo mostrarInfo()
    //@Override
    public void mostrarlnfo()
    {
        super.mostrarinfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    }
}