/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrocuadrado;

import java.util.Scanner;

/**
 *
 * @author Cheetos
 */
public class AreaPerimetroCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        System.out.println("Por favor ingrese el valor X del lado del cuadrado:");
        Scanner sc = new Scanner(System.in);
        lado = sc.nextInt();
        int area, perimetro;
        area = lado*lado;
        perimetro = lado*4;
        System.out.println("El area del cuadrado es "+area);
        System.out.println("El perimetro del cuadrado es "+perimetro);
    }
    }