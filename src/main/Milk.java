/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Condimento de la bebida
 * @author Alejandro
 */
public class Milk extends CondimentDecorator {
    
    /**
     * Metodo constructor que determina la bebida de su parametro
     * @param beverage bebida escogida
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    /**
     * Metodo que regresa la descripcion de la bebida mas la del condimento
     * @return descripcion de la bebida
     */
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    
    /**
     * Metodo que establece el costo total de la bebida
     * @return el costo total de la bebida
     */
    public double cost() {
        double cost = beverage.cost() + 10.0f;

        return cost;
    }

}
