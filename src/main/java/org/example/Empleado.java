package org.example;

public class Empleado {
    public int id; //agregado de la clase 24/04 para tabla hash
    public String nombre;
    public int salario;

    public Empleado (String nombre,int salario,int id)
    {
        this.nombre=nombre;
        this.salario=salario;
        this.id=id;
    }
    public int getId(){
        return id;
    }


}