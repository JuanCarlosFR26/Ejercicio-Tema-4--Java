package com.company;

public class SmartDevice {
    //Atributos
    String fabricante;
    String modelo;
    String procesador;
    String camara;
    String color;
    String estado;
    double pantalla;
    int precio;
    int memoria;



    //Constructores:
    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, String procesador, String camara, String color,
                       double pantalla, int precio, int memoria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.camara = camara;
        this.color = color;
        this.estado = "Apagado";
        this.pantalla = pantalla;
        this.precio = precio;
        this.memoria = memoria;

    }



    //Método:
    public String encender() {
        this.estado = "Apagado";
        if(this.estado == "Apagado") {
            this.estado = "Encender";
            System.out.println("El dispositivo se está encendiendo");
        } else {
            System.out.println("El dispositivo está apagado");
        }
        return "El dispositivo ya está encendido";
    }

    public String apagar() {
        if(this.estado == "Encender") {
            System.out.println("El dispositivo está encendido");
            this.estado = "Apagado";
            System.out.println("El Dispositivo se está apagando");
        } else {
            System.out.println("El dispositivo sigue encendido");
        }
        return "El Dispositivo ya está apagado";
    }




}
