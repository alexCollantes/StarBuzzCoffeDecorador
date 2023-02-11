/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Alejandro
 */
public abstract class Beverage {
// creacion de variable que contendra la bebida
    String description = "Beverage";
/**
 * Metodo que obtiene el nombre de bebida
 * @return ,la descripcion de la bebida
 */
    public String getDescription() {
        return description;
    }
    /**
     * Metodo que te regresa el costo total de la bebida
     * @return el costo de la bebida
     */
    public abstract double cost();

}
