package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado emp1,emp2,emp3;
        Tabla taHash=new Tabla();
        emp1=new Empleado("Michael",400000,245643);
        emp2=new Empleado("Jim",20000,245981);
        emp3=new Empleado("Pam",20000,257135);

        taHash.insertar(emp1);
        taHash.insertar(emp2);
        taHash.insertar(emp3);
        taHash.muestra();
        
    }
}