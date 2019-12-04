/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.empresa.model.*;
import java.util.ArrayList;

/**
 *
 * @author fernando.ruizusam
 */
@ManagedBean
@ViewScoped
public class CountryCityBean implements Serializable {

    private Long idCountry;//Recogemos el valor de pais que manda el selector en la vista
    private Long idCity;//Recogemos el valor de city que manda el selector en la vista

    private List<Country> listaCountry;//Lista de paises

    private List<City> listaCity;//Lista de ciudades
    private List<City> listaTemporalCity;//Lista de ciudades

    //Constructor vacio
    public CountryCityBean() {//Creamos nustras lista
        this.listaCountry = new ArrayList<>(4);//Cuando tenemos definido el numero de pais 
        this.listaCountry.add(new Country(1L, "El salvador"));
        this.listaCountry.add(new Country(2L, "Panama"));
        this.listaCountry.add(new Country(3L, "Honduras"));
        this.listaCountry.add(new Country(4L, "Estados Unidos"));

        //Esta lista se la pasamos a la vista()
        this.listaCity = new ArrayList<>(12);//16 ciudad 4 por cada pais
        this.listaCity.add(new City(1L, "San salvador", 1L));
        this.listaCity.add(new City(2L, "Apopa", 1L));
        this.listaCity.add(new City(3L, "Zacamil", 1L));

        this.listaCity.add(new City(4L, "Colon", 2L));
        this.listaCity.add(new City(5L, "Herrera", 2L));
        this.listaCity.add(new City(6L, "Veraguas", 2L));

        this.listaCity.add(new City(7L, "Tegucigalpa", 3L));
        this.listaCity.add(new City(8L, "San Pedro Sula", 3L));
        this.listaCity.add(new City(9L, "La ceiba", 3L));

        this.listaCity.add(new City(10L, "Nueva York", 4L));
        this.listaCity.add(new City(11L, "Los Angeles", 3L));
        this.listaCity.add(new City(12L, "San Francisco", 2L));

    }

    public void handleCountryChange() {
        if (this.idCountry != null && !this.idCountry.equals(0L)) {
            this.listaTemporalCity = new ArrayList<>();
            
            for (City c : this.listaCity) {
                if (c.getIdCountry().equals(this.idCountry)) {
                    this.listaTemporalCity.add(c);

                }
            }

        }

    }

    public List<Country> getListaCountry() {
        return listaCountry;
    }

    public void setListaCountry(List<Country> listaCountry) {
        this.listaCountry = listaCountry;
    }

    public List<City> getListaCity() {
        return listaCity;
    }

    public void setListaCity(List<City> listaCity) {
        this.listaCity = listaCity;
    }

    public List<City> getListaTemporalCity() {
        return listaTemporalCity;
    }

    public void setListaTemporalCity(List<City> listaTemporalCity) {
        this.listaTemporalCity = listaTemporalCity;
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

}
