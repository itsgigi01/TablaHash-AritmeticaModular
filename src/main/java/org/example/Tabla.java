package org.example;

public class Tabla {
    Empleado[] T;

    public Tabla(){
        this.T=new Empleado[1000];
    }

    public void insertar(Empleado empleado){
        T[aModular(empleado.id)]=empleado;
    }

    public int aModular(int x ){
        return x%997;
    }

    public void muestra(){
        System.out.println("             -- E M P L E A D O S --");
        for (int i=0;i<T.length;i++){
            if(T[i]!=null)
            {
                System.out.println("El empleado se ubico en la posicion: "+i+ " y su clave era : "+T[i].getId());
            }
        }
    }


}