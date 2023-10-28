package org.example;

/**
 * La clase Moneda es abstracta y representa la forma de pago realizada en una mÃ¡quina expendedora
 *
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public abstract class Moneda implements Comparable<Moneda> {
    /**
     * Constructor por defecto
     */
    public Moneda() {
    }

    /**
     * @return nÃºmero de serie de la moneda
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * metodo abstracto que debe ser implementado por todas las subclases de moneda
     *
     * @return valor de la moneda
     */
    public abstract int getValor();

    /**
     * mÃ©todo adquirido por la interfaz Comparable que compara un el valor de Moneda, con otro valor de otra moneda
     *
     * @param m representa el objeto tipo Moneda con el cual se compararÃ¡
     * @return un entero que representa si el objeto ingresado en el parametro es mayor, menor o igual con el
     * que estamos comparando
     */
    @Override
    public int compareTo(Moneda m) {
        return Integer.compare(getValor(), m.getValor());
    }

    /**
     * mÃ©todo que muestra un descripciÃ³n de la clase
     *
     * @return cadena de caderes que hace referecia a la moneda y la cual se va a implementar por las subclases
     * para especificar mejor que tipo de moneda es
     */

    @Override
    public String toString() {
        return "Moneda de ";
    }
}
