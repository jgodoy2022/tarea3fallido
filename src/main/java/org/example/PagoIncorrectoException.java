package org.example;

/**
 * La clase representa una excepciÃ³n personalizada que se lanza cuando se produce un error relacionado con un
 * pago erroreo o nulo del producto a escoger.
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public class PagoIncorrectoException extends Exception {
    /**
     * crea una nueva instancia de la excepciÃ³n con un mensaje descriptivo
     *
     * @param mensaje mensaje que describe la razÃ³n del error
     */
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
