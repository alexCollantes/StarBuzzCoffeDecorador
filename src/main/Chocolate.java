/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase que representa un condimento
 * @author Alejandro
 */
public class Chocolate extends CondimentDecorator {
    /**
     * Constructor que tiene como parametro la bebida que se esta comprando
     * @param beverage bebida seleccionada
     */
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }
    /**
     * Regresa la descripcion de la bebida
     * @return descripcion de la bebida
     */
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
    /**
     * regresa el costo de la bebida
     * @return el costo total de la bebida
     */
    public double cost() {
        double cost = beverage.cost() + 19.0f;

        return cost;
    }

}
