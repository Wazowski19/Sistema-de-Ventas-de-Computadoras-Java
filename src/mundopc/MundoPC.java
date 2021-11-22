
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Monitor monitorHP = new Monitor("Marca HP", 13.0);
 
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Monitor monitorGamer = new Monitor("Gamer", 34.0);
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP); 
        Computadora computadoraGamer = new Computadora("MAC", monitorGamer, tecladoHP, ratonGamer); 
        Computadora computadora3 = new Computadora("MACBOOK", monitorGamer, tecladoHP, ratonHP); 
        Computadora computadora4 = new Computadora("Alienware", monitorHP, tecladoGamer, ratonGamer);
        
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
        orden1.mostrarOrden();
    }
}
