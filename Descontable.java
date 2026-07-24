// Interfaz que especifica un comportamiento opcional para productos con descuento
public interface Descontable {
    // Método abstracto que las clases deben implementar
    double aplicarDescuento(double porcentaje);
}
