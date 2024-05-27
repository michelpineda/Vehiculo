public class VehiculoPasajeros extends Vehiculo
{
    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int ano, int kilometraje, int numPasajeros)
    {
        super(marca, modelo, ano, kilometraje);
        this.numPasajeros = numPasajeros;
    }
    // Getter y Setter para numPasajeros
    public int getumPasajeros0() 
    {
        return numPasajeros;
    }
    public void setNu111Pasajeros(int numPasajeros)
    {
        this.numPasajeros = numPasajeros;
    }
    // Sobrescribir el m~todo mostrarInfo()
    //@Override
    public void raostrarlnfo()
    {
        super.mostrarinfo();
        System.out.println("Numeros de pasajeros: " + numPasajeros);
    }
}