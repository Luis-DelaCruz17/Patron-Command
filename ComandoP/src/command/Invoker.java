package command; 

import java.util.ArrayList;

// responsable de apilar las operaciones y ejecutarlas
public class Invoker {

    // llamar a retirar
    // Llista de operaciones
    ArrayList<IOperacion> operaciones = new ArrayList<>();

    // sea un deposito o retiro ... se lo almacena en la lista (n operaciones)
    public void recibirOperacion(IOperacion operacion) {
        this.operaciones.add(operacion);
    }

    // realiar las operaciones
    public void realizarOperaciones() {
        //  ITERACION de la varible operaciones ... 
        // por cada operacion encontrada vamos a ejecutarla
        this.operaciones.forEach(x -> x.execute());
        // limpiar la lista
        this.operaciones.clear();
    }
}
