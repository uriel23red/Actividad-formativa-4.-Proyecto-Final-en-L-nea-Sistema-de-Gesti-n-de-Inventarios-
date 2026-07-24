import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // POLIMORFISMO EN ACCIÓN:
        // Una lista de tipo 'Producto' almacena objetos de subclases distintas.
        List<Producto> inventario = new ArrayList<>();

        inventario.add(new Electronico("E01", "Laptop Gamer", 1200.00, 5, 12));
        inventario.add(new Alimento("A01", "Leche Entera", 2.50, 20, 2)); // Próxima a caducar
        inventario.add(new Ropa("R01", "Chamarra de Mezclilla", 45.00, 10, "M"));

        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIOS ===");
        System.out.println("--- Demostración de Polimorfismo en Invención de Métodos ---");

        double valorTotalInventario = 0;

        // Se recorre la lista tratando a todos como 'Producto'.
        // Java ejecuta la versión del método que le corresponde a CADA objeto específico en tiempo de ejecución.
        for (Producto p : inventario) {
            p.mostrarDetalles(); // Polimorfismo en mostrarDetalles()
            valorTotalInventario += p.calcularPrecioFinal(); // Polimorfismo en calcularPrecioFinal()
            
            // Ejemplo usando la interfaz
            double precioConPromocion = p.aplicarDescuento(10);
            System.out.println("   -> Precio con 10% desc. especial: $" + precioConPromocion);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Valor total estimado del inventario: $" + valorTotalInventario);
    }
}
