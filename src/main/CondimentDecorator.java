/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase abstracta que sirve como decorador
 * @author Alejandro
 */
public abstract class CondimentDecorator extends Beverage {
    // Variable de tipo bebida
    public Beverage beverage;
    /**
     * Metodo que regresara los condimentos agregados
     * @return descripcion de la bebida
     */
    public abstract String getDescription();
    /**
     * Metodo que sumara el costo de la bebida con el de los condimentos.
     * @return el costo total de la bebida
     */
    @Override
    public double cost() {
        return 0;
    }

}
