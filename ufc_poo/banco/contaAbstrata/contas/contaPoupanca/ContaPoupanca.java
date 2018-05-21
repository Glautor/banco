package banco.contaAbstrata.contas.ContaPoupanca;
import banco.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca (String numero){
		super(numero);
	}
	public void renderJuros(double taxa){
		creditar(saldo() * taxa);
	}
}