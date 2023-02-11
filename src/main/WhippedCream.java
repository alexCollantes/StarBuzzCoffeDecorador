/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Tipo de condimento 
 * @author Alejandro
 */
public class WhippedCream extends CondimentDecorator {
    /**
     * Metodo constructor que establece la bebida de su parametro
     * @param beverage bebida escogida
     */
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }
    /**
     * Metodo que obtiene la descripcion de la bebida con sus condimentos
     * @return descripcion de la bebida 
     */
    public String getDescription() {
        return beverage.getDescription() + ", WhippedCream";
    }
    /**
     * Returna el costo de la bebida sumando el costo del condimento agregado
     * @return 
     */
    public double cost() {
        double cost = beverage.cost() + 12.3d;

        return cost;
    }
}
