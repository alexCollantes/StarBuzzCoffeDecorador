/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Tipo de bebida
 * @author Alejandro
 */
public class Decaf extends Beverage {
    
    /**
     * Metodo constructor que genera el nombre la bebida
     */
    public Decaf() {
        description = "Decaf Coffee";
    }
    /**
     * Metodo que obtiene el costo total de la bebida
     * @return el costo de la bebida
     */
    @Override
    public double cost() {
        return 44.0d;
    }

}
