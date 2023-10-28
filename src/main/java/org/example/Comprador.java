package org.example;

/**
 * La clase Comprador representa a un cliente que realiza una compra a traves de un expendedor
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 * @see NoHayProductoException,PagoInsuficienteException,PagoIncorrectoException
 */
public class Comprador {
    /**
     * String para almacenar el "sonido" del producto comprado
     */
    private String sonido;

    /**
     * Entero para almacenar el vuelto de la compra
     */
    private int vuelto;

    /**
     * Constructor, recibe tres parametros para realizar la compra del producto y almacenar el sonido y calcular el vuelto
     *
     * @param m            representa la moneda usada para el pago
     * @param cualProducto indica el producto a comprar
     * @param exp          hace referencia al expendedor para realizar la compra
     * @throws NoHayProductoException    si no hay producto disponible o si es invalido
     * @throws PagoIncorrectoException   si el pago es invalido
     * @throws PagoInsuficienteException si el pago es insuficiente
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b = exp.comprarProducto(m, cualProducto);
        if (cualProducto == TipoProducto.COCA.getOpcion() || cualProducto == TipoProducto.SPRITE.getOpcion()
                || cualProducto == TipoProducto.FANTA.getOpcion() || cualProducto == TipoProducto.SNICKERS.getOpcion()
                || cualProducto == TipoProducto.SUPER8.getOpcion()) {
            int aux = 0;
            while (exp.getVuelto() != null) {
                aux += 100;
            }
            if (b != null) {
                sonido = b.sabor();
                vuelto = aux;
            } else if (b == null && m != null) {
                vuelto = aux;
                throw new NoHayProductoException("Error. Producto no disponible");
            }
        } else {
            vuelto = m.getValor();
            throw new NoHayProductoException("Error. Producto no disponible");
        }
    }

    /**
     * @return vuelto calculado en el constructor
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * @return sonido almacenado en el constructor
     */
    public String queCompraste() {
        return sonido;
    }

    /**
     * mÃ©todo que muestra un descripciÃ³n de la clase
     *
     * @return cadena de caderes que hace referencia al producto pedido, su sonido y el vuelto
     */
    @Override
    public String toString() {
        return "Su compra fue: " + sonido + ",y su vuelto=" + vuelto;
    }
}
