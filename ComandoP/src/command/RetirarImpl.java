package command;

//implementa a la interfaz
public class RetirarImpl implements IOperacion {

    private Cuenta cuenta;
    private double monto;

    // El constructor toma una cuenta y establece algun monto
    public RetirarImpl(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        // vamos a llamar a retirar...de la variable cuenta
        this.cuenta.retirar(this.monto);
    }
}
