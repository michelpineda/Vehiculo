public class Auto extends VehiculoPasajeros
{
    private String tipoCombustible;
    
    // Constructor 
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) 
    {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
    // Getter y Setter para tipoCombustible
    public String getTipoCombustible()
    {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible)
    {
        this. tipoCombustible = tipoCombustible;
    }
    // Sobrescribir el método mostrarlnfo()
    //@Override
    public void mostrarlnfo()
    {
        super.mostrarinfo();
        System. out. println( "Tipo de Combustible: " + tipoCombustible);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------//
    //Implementando derivada de mantenimiento
    @Override
    public void realizarMantenimiento() 
    {
        System.out.println("\nRealizando mantenimiento básico para Auto...");
        // Mantenimiento básico para Auto
        System.out.println("Verificando niveles de aceite y líquido de frenos.");
        System.out.println("Revisando el filtro de aire y cambiándolo si es necesario.");
        System.out.println("Comprobando el estado de las bujías y reemplazándolas si están desgastadas.");
    }

    // Calcular el costo de mantenimiento del auto
    public double calcularCostoMantenimiento(double costoPorKm, double kilometrosRecorridos) 
    {
        double costoTotal = costoPorKm * kilometrosRecorridos;
        return costoTotal;
    }
}
