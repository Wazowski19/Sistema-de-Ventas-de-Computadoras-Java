
package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        this.idOrden = ++Orden.contadorOrdenes;
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Se ha sobrepasado el numero maximo de la orden (" + Orden.MAX_COMPUTADORAS +")");
        }
    }
    
    public void mostrarOrden (){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras de la orden #" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
    
    
}
