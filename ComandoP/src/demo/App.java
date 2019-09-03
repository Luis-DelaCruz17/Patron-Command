package demo;

import command.Cuenta;
import command.DepositarImpl;
import command.Invoker;
import command.RetirarImpl;

public class App {
   // Enfoque orientado a comandos
    public static void main(String[] args) {
        //instanciar una cuenta
		Cuenta cuenta = new Cuenta(1, 200);
                // crear operacion --- comando despositar .. asociando cuenta y monto a 
                // depositar
		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
                // retirar -- para enlazar a la misma cuenta
                // retirar el monto respectivo (50)
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);
                
                // Instanciamos un invocador
		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}
}
