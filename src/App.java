public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");

        // Crear instancias de cada tipo de vehículo
        Auto auto = new Auto("Toyota", "Corola", 2020, 15000, 5, "Gasolina");
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 2000, 4);

        // Mostrar la información de cada vehículo
        System.out.println("Información del Auto: ");
        auto.mostrarinfo();
        System.out.println("\nlnformación del Camion: ");
        camion .mostrarlnfo();
    }
}