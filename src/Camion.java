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
    public void mostrarinfo()
    {
        super.mostrarinfo();
        System.out.println("Número de Ejes: "+ numEjes);
    }
}
