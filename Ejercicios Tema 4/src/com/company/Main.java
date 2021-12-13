package com.company;

public class Main {


    /**
     * Ejercicio tema 4
     * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
     *
     *
     * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
     *
     *
     * Crear constructor vacío y con todos los parámetros para cada clase.
     *
     *
     * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     *
     */

    public static void main(String[] args) {


        SmartDevice SmartPhone = new SmartDevice("Apple","Iphone 11","A13 Bionic","12 megapíxeles","Blanco",6.1d,540,
                64);


        SmartDevice SmartWatch = new SmartDevice("Sony","Sony Smartwatch 3","Qualcomm Snapdragon 400 a 1,2 GHz","Sin " +
                "Cámara","Negro",1.6d,112,4);


        System.out.println(SmartPhone.precio);
        System.out.println(SmartWatch.procesador);
        System.out.println(SmartPhone.encender());

    }
}
