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
public class Espresso extends Beverage {
    
    /**
     * Metodo constructor que genera el nombre de la bebida
     */
    public Espresso() {
        description = "Espresso";
    }
    /**
     * Metodo que establece el costo de la bebida 
     * @return el costo de la bebida
     */
    @Override
    public double cost() {
        return 38.8d;
    }

}
