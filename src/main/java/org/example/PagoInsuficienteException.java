package org.example;

/**
 * La clase representa una excepciÃ³n personalizada que se lanza cuando se produce un error relacionado con el pago
 * insuficiente en el expendedor.
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public class PagoInsuficienteException extends Exception {
    /**
     * crea una nueva instancia de la excepciÃ³n con un mensaje descriptivo
     *
     * @param mensaje mensaje que describe la razÃ³n del error
     */
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
