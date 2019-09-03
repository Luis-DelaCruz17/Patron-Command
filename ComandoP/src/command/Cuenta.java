package command;

//Receiver/Request 
// Retiro y deposito de la cuenta
public class Cuenta {

    private int id;
    private double saldo;

    //Constructor .. inicializar los valores por medio de 
    // los parametros
    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    // Metodo retirar
    public void retirar(double monto) {
        this.saldo = this.saldo - monto;
        System.out.println("[COMANDO RETIRAR] Cuenta: " + id + " Saldo: " + this.saldo);
    }

    // Metodo depositar
    public void depositar(double monto) {
        this.saldo = this.saldo + monto;
        System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id + " Saldo: " + this.saldo);
    }
}
