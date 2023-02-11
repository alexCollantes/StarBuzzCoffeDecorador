/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Condimento de la bebida
 *
 * @author Alejandro
 */
public class Soy extends CondimentDecorator {

    /**
     * Metodo constructor que establece la bebida de su parametro
     *
     * @param beverage bebida escogida
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     *Metodo que regresa la descripcion de la bebida
     * @return descripcion de la bebida
     */
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    /**
     * Metodo que establece el costo de la bebida sumando el costo del condimento
     * agregado
     * @return  el csoto total de la bebida
     */
    public double cost() {
        double cost = beverage.cost() + 15.0f;

        return cost;
    }

}
