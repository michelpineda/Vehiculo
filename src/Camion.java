//Camion.java
public class Camion extends VehiculoCarga
{
    private int numEjes;

    // Constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes)
    {
        super(marca, modelo, año, kilometraje, capacidadCarga) ;
        this.numEjes = numEjes;
    }

    // Getter y Setter para numEjes
    public int getNumEjes()
    {
        return numEjes;
    }

    public void setNumEjes(int numEjes)
    {
        this.numEjes = numEjes;
    }

    // Sobrescribir el método mostrarInfo ()
    //@Override
    public void mostrarInfo()
    {
        super.mostrarinfo();
        System.out.println("Número de Ejes: "+ numEjes);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------//
    //Implementando derivada de mantenimiento
    // Implementación específica para Camion
    @Override
    public void realizarMantenimiento() 
    {
        System.out.println("\nRealizando mantenimiento básico para Camión...");
        // Mantenimiento básico para Camión
        System.out.println("Inspeccionando el sistema de frenos y ajustando si es necesario.");
        System.out.println("Verificando la presión de los neumáticos y corrigiéndola según las especificaciones.");
        System.out.println("Revisando el sistema de escape y sellando posibles fugas.");
    }
}
