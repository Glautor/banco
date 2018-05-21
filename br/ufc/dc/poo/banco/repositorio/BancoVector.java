package br.ufc.dc.poo.banco.repositorio;

import java.util.Vector;
import br.ufc.dc.poo.banco.contas.Conta;
import br.ufc.dc.poo.banco.contas.ContaPoupanca;

public class BancoVector {
	private Vector<Conta> contas;
	private double taxa;
	
	public BancoVector() {
		contas = new Vector<Conta>();
		taxa = 0.01;
	}     

	public void cadastrar(Conta conta){
		if(procurar(conta.getNumero()) == null) {
			contas.add(conta);
		}
	} 

	private Conta procurar(String numero){
		for(Conta conta : contas) {
			if(conta.getNumero().equals(numero)) {
				return conta;
			}
		}
		return null;	
	} 

	public void creditar(String numero, double valor) {
		Conta conta = procurar(numero);
		if(conta != null) {
			conta.creditar(valor);
		}
	} 

	public void debitar(String numero, double valor){
		Conta conta = procurar(numero);
		if(conta != null && conta.getSaldo() >= valor) {
			conta.debitar(valor);
		}
	} 
	
	public double saldo(String numero) {
		Conta conta = procurar(numero);
		if(conta != null) {
			return conta.getSaldo();
		}
		
		return 0.0;
	} 

	public void transferir(String origem, String destino, double valor){
		Conta contaOrigem = procurar(origem);
		Conta contaDestino = procurar(destino);
		
		if(contaOrigem != null && contaDestino != null && contaOrigem.getSaldo() >= valor) {
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);
		}
	
	}
	
	public void renderJuros(String numero) {
		Conta conta = procurar(numero);
		if(conta != null && conta instanceof ContaPoupanca) {
			((ContaPoupanca) conta).renderJuros(this.taxa);
		}
	}


