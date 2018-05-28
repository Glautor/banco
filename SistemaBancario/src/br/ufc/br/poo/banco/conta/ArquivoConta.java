package br.ufc.br.poo.banco.conta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.ufc.br.poo.banco.persistencia.IRepositorioConta;

public class ArquivoConta implements IRepositorioConta {

	public void inserir(ContaAbstrata conta) {
		File diretorio = new File(
				"/home/404201/Área de Trabalho/SistemaBancario/SistemaBancario/src/br/ufc/br/poo/banco/conta");
		if (!diretorio.isDirectory()) {
			diretorio.mkdir();
		}
		File arquivo = new File(diretorio, "ContaDados.txt");
		try {
			FileWriter arquivo1 = new FileWriter(arquivo);
			PrintWriter gravador = new PrintWriter(arquivo1);
			for (int i = 0; i < 5; i++) {
				gravador.println("Linha[" + i + "] POO-Texto");
			}
			gravador.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public void remover(String numero) {

	}

	public ContaAbstrata procurar(String numero) {
		return null;
	}

	public ContaAbstrata[] listar() {
		return null;
	}

	public int tamanho() {
		return 0;
	}
}