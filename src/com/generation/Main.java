package com.generation;

public class Main {

    public static void main(String[] args) {
	    // const nombre = 'Victor Manuel';
        // Variable String
        String nombre = "Victor Manuel";
        //Datos primitivos numéricos
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //datos primitivos decimales
        //números decimales agregar f
        float decimal1 = 10.3948373f;
        double decimal2 = 20.398470954329035d;

        //datos primitivos char
        char character = 'f';

        // dato primitivo boolean
        boolean verdadero = true;


        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        // byte numByte1 = 120;
        // byte numByte2 = 120;
        // short suma = (short) (numByte1 + numByte2);

        System.out.println(nombre);
        //System.out.println(numInt);
        //System.out.println(suma);

        // Operadores aritméticos en Java
        // + sumar o concatenar cadenas
        // - restar
        // * multiplicar
        // / dividir
        // % residuo


        byte numej1 = 2;
        byte numej2 = 8;


        byte suma = (byte) (numej1 + numej2);
        byte resta = (byte) (numej2 - numej1);
        short multliplicacion = (short) (numej1 * numej2);
        byte division = (byte) (numej2 / numej1);

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multliplicacion);
        System.out.println(division);

    }
}
