package org.example;

/**
 * La clase enum TipoProducto representa el listado de productos, su posiciÃ³n dentro de la mÃ¡quina expendedora y
 * sus respectivos precios
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public enum TipoProducto {
    /**
     * elementos de la enumeraciÃ³n, que tienen la opciÃ³n y su respectivo precio
     */
    COCA(1, 1000),
    SPRITE(2, 1000),
    FANTA(3, 1000),
    SNICKERS(4, 600),
    SUPER8(5, 300);

    /**
     * entero para almacenar la opciÃ³n a escoger por el cliente
     */
    private final int opcion;

    /**
     * entero para almacenar el valor de la opciÃ³n a escoger por el cliente
     */
    private final int valor;

    /**
     * constructor por defecto, que recibe dos parametros para actualizar la referencia a la opciÃ³n y valor de la
     * lista de la enumeraciÃ³n
     *
     * @param opcion es la opciÃ³n de la enumeraciÃ³n
     * @param valor  indica el valor de la opciÃ³n elegida
     */
    TipoProducto(int opcion, int valor) {
        this.opcion = opcion;
        this.valor = valor;
    }

    /**
     * @return opcion actualizada en constructor
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * @return valor de la opcion actualizada en constructor
     */
    public int getValor() {
        return valor;
    }
}
