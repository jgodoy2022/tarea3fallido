package org.example;

/**
 * La clase Moneda100 es una subclase de Moneda y representa un tipo de moneda para pagar algÃºn producto en Expendedor
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public class Moneda100 extends Moneda {

    /**
     * Constructor por defecto
     */
    public Moneda100() {
        super();
    }

    /**
     * mÃ©todo adquirido por la Superclase
     *
     * @return el valor de la moneda, en este caso, 100.
     */
    public int getValor() {
        return 100;
    }

    /**
     * mÃ©todo que muestra un descripciÃ³n de la clase
     *
     * @return cadena de caderes que hace referencia al valor de la moneda.
     */
    @Override
    public String toString() {
        return super.toString() + getValor() + " pesos";
    }
}
