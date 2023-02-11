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
public class HouseBlends extends Beverage {
    
    /**
     * Metodo constructor que genera el nombre de la bebida al crearse un objeto
     */
    public HouseBlends() {
        description = "House Blend Coffee";
    }
    /**
     * Metodo que establece el costo de la bebida y lo returna
     * @return el costo de la bebida
     */
    public double cost() {
        return 43.0d;
    }

}
