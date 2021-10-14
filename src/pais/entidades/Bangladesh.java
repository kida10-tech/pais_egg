/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais.entidades;

/**
 *
 * @author maxco
 */
public class Bangladesh {
    private int poblacion;
    private String idioma;

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Bangladesh(int poblacion, String idioma) {
        this.poblacion = poblacion;
        this.idioma = idioma;
    }
    
    
}
