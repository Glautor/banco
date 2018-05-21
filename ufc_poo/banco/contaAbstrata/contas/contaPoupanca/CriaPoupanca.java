public class CriaPoupanca {

	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca ("21.342-7");
		poupanca.creditar(500.87);
		poupanca.debitar(45.00); 
		System.out.println(poupanca.saldo());
		poupanca.renderJuros(0.01);
		System.out.println(poupanca.saldo()); 
	}
}