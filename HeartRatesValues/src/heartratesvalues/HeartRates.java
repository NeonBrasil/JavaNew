/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heartratesvalues;

/**
 *
 * @author unifccicarelli
 */
public class HeartRates {
    private String name;
    private String surname;
    private int mes;
    private int dia;
    private int ano;
    /**
    * as duas primeiras strings representam o nome do user
    * as uúltimas três representam sua data de nascimento
    * 
    */

    public HeartRates(String name, String surname, int mes, int dia, int ano) {
        this.name = name;
        this.surname = surname;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


