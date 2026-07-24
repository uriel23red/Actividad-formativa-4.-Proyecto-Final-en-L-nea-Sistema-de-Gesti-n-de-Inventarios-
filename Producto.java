// Clase abstracta: Sirve como plantilla base y NO puede ser instanciada directamente.
public abstract class Producto implements Descontable {
    // Atributos protegidos para que las subclases puedan acceder a ellos
    protected String id;
    protected String nombre;
    protected double precioBase;
    protected int stock;

    // Constructor base de la jerarquía de herencia
    public Producto(String id, String nombre, double precioBase, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Métodos Abstractos: Obligan a las subclases a definir su propio comportamiento
    public abstract double calcularPrecioFinal();
    public abstract void mostrarDetalles();

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }
}
