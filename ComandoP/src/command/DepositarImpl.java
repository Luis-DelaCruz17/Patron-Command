package command;

//implementa a la interfaz
public class DepositarImpl implements IOperacion {

    private Cuenta cuenta;
    private double monto;

    // El constructor toma una cuenta y establece algun monto
    public DepositarImpl(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        // vamos a llamar a depositar...de la variable cuenta
        this.cuenta.depositar(this.monto);
    }
}
