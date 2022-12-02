package com.Unit.crudpetshop;

public class Animal extends Pet 
{
    public String especie;
    public String preferencias;

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void cadastraPet()
    {
    }
}
