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
    public int getNumPasajeros() 
    {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros)
    {
        this.numPasajeros = numPasajeros;
    }
    // Sobrescribir el m~todo mostrarInfo()
    @Override
    public void mostrarinfo()
    {
        super.mostrarinfo();
        System.out.println("Numeros de pasajeros: " + numPasajeros);
    }
}