/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.my.sena;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Roble
 */
public class Sena {
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Aprendiz> aprendices = new ArrayList<>(); //Creando la base de datos como array de Strings
        
        //Objetos, atributos
        //Aprendiz aprendiz = new Aprendiz(); // creamos un objeto aprendiz
        Aprendiz aprendiz1 = new Aprendiz(0,"John",28,2675524,1070923722); // creamos un objeto aprendiz
        aprendices.add(aprendiz1); // agregar aprendiz al array 
        
        Aprendiz aprendiz2 = new Aprendiz(1,"nelly",28,2675520,1127585406);    
        aprendices.add(aprendiz2); // agregar aprendiz al array      
        //metodos
        
        //condicional if else - for (ciclos)
        
        if(!aprendices.isEmpty()){
            
            for(int i = 0; i < aprendices.size(); i++){
            System.out.println("el aprendiz encontrado en for es: \n"+aprendices.get(i) + "\n"); //obtenemos los aprendices almacenados en el array
            }            
        }else {
                System.out.println("No se han encontrado aprendices");
        }        
        
        //Switch
        
        System.out.println("Ingrese el id del estudiante que desea buscar: ");
        int index = Integer.parseInt(sc.nextLine());
        
        switch(index){
            case 0:
                System.out.println(aprendices.get(0) + "\n");
                break;
            case 1:
                System.out.println(aprendices.get(1) + "\n");
                break;
            default:
                System.out.println("no se encontraron aprendices asignados a ese id\n");
                break;
        }
        
        
    }
}
