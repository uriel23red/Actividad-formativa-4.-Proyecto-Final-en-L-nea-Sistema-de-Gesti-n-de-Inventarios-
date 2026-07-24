// Subclase para prendas de vestir
public class Ropa extends Producto {
    private String talla;

    public Ropa(String id, String nombre, double precioBase, int stock, String talla) {
        super(id, nombre, precioBase, stock);
        this.talla = talla;
    }

    @Override
    public double calcularPrecioFinal() {
        // La ropa no tiene impuestos adicionales en este modelo
        return precioBase;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularPrecioFinal() - (calcularPrecioFinal() * (porcentaje / 100));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ROPA] ID: " + id + " | Nombre: " + nombre + 
                           " | Talla: " + talla + " | Precio Final: $" + calcularPrecioFinal());
    }
}
