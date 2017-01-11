package net.ausiasmarch.validaciones.modelo;

import java.text.*;

/**
 * Convert.java
 * @author Programador
 */
public class Convert {

    /**
     * Transforma un String con una número entero 
     * @param s
     * @return
     * @throws java.lang.Exception
     */
    public static int parseInt(String s) throws Exception{
        if (!s.matches("^(-)?\\d{1,3}(\\.\\d{3})*|\\d+$")) {
            throw new RuntimeException("Formato numérico no valido");
        }

        NumberFormat nf = NumberFormat.getInstance();
        try {
            Number n = nf.parse(s);
            int i = Integer.parseInt(n.toString());
            return i;
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Comprueba si un String es un número int valido
     * @param s
     * @return
     */
    public static boolean isValidInt(String s) {
        try {
            parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * Obtiene un String de un número int
     * @param i
     * @return String mostrable al usuario
     */
    public static String format(int i) {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(i);
    }

}
