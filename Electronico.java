// Subclase que hereda de Producto (Relación "Es-Un")
public class Electronico extends Producto {
    private int mesesGarantia;

    public Electronico(String id, String nombre, double precioBase, int stock, int mesesGarantia) {
        // 'super' invoca al constructor de la clase abstracta Producto
        super(id, nombre, precioBase, stock);
        this.mesesGarantia = mesesGarantia;
    }

    // Implementación del método abstracto (Polimorfismo)
    @Override
    public double calcularPrecioFinal() {
        // Los electrónicos incluyen un costo adicional del 5% por seguro de garantía
        return precioBase + (precioBase * 0.05);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularPrecioFinal() - (calcularPrecioFinal() * (porcentaje / 100));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ELECTRÓNICO] ID: " + id + " | Nombre: " + nombre + 
                           " | Garantía: " + mesesGarantia + " meses | Precio Final: $" + calcularPrecioFinal());
    }
}
