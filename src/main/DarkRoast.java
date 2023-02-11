/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Tipo de Bebida
 * @author Alejandro
 */
public class DarkRoast extends Beverage {
    /**
     * Metodo constructor que genera el nombre de la bebida
     */
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    /**
     * Metodo que regresa el costo de la bebida
     * @return el costo de l abebida
     */
    public double cost() {
        return 40.0d;
    }

}
