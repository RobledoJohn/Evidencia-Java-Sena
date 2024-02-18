/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.sena;

import java.util.Scanner;

/**
 *
 * @author Roble
 */
public class Aprendiz {
    
    public int id;
    public String nombre;
    public int edad;
    public int ficha;
    public int identificacion;
    
    public Aprendiz() {
        Scanner sc = new Scanner(System.in); // Objeto que sirve para obtener entrada de datos del usuario
        
        System.out.println("Ingrese la id: ");
        this.id = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese el nombre: "); //solicitamos que se ingrese un nombre por consola
        this.nombre = sc.nextLine(); // obtenemos el dato ingresado por el usuario y lo almacenamos en una variable
        
        System.out.println("Ingrese la edad: ");
        this.edad = Integer.parseInt(sc.nextLine()); // obtenemos el dato ingresado por el usuario y lo almacenamos en una variable, tambien como el dato ingresado es String y la variable es int, convertimos el String en int con parseInt
        
        System.out.println("Ingrese la ficha: ");
        this.ficha = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese la identificacion: ");
        this.identificacion = Integer.parseInt(sc.nextLine());
    }

    public Aprendiz(int id, String nombre, int edad, int ficha, int identificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.ficha = ficha;
        this.identificacion = identificacion;
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Datos del Aprendiz: " + "\nid=: " + id + "\nnombre=" + nombre + ",\nedad=" + edad + ",\nficha=" + ficha + ",\nidentificacion=" + identificacion + '.';
    }   
}