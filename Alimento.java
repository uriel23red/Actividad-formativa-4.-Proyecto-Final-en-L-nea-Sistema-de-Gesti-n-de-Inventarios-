// Subclase para productos alimenticios
public class Alimento extends Producto {
    private int diasParaCaducar;

    public Alimento(String id, String nombre, double precioBase, int stock, int diasParaCaducar) {
        super(id, nombre, precioBase, stock);
        this.diasParaCaducar = diasParaCaducar;
    }

    @Override
    public double calcularPrecioFinal() {
        // Si está a menos de 3 días de caducar, se le aplica un 20% de rebaja automática
        if (diasParaCaducar <= 3) {
            return precioBase * 0.80;
        }
        return precioBase;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularPrecioFinal() - (calcularPrecioFinal() * (porcentaje / 100));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ALIMENTO] ID: " + id + " | Nombre: " + nombre + 
                           " | Caduca en: " + diasParaCaducar + " días | Precio Final: $" + calcularPrecioFinal());
    }
}
