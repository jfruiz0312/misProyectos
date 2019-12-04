/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

/**
 *
 * @author fernando.ruizusam
 */
public class City {
    private Long id;
    private String nombre;
    private Long idCountry;//Foregkey de la tabla CountryCity

    public City() {
    }

    public City(Long id, String nombre, Long idCountry) {
        this.id = id;
        this.nombre = nombre;
        this.idCountry = idCountry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    
    
    
}
