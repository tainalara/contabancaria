package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList <Conta> listaContas = new ArrayList <Conta> ();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta!= null)
			conta.visualizar();
		else
			System.out.println("\nA Conta Número: " + numero +  " Não Foi Encontrada");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta Número: " + conta.getNumero() + " Foi Criada Com Sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta),conta);
			System.out.println("\nA Conta Número: " + conta.getNumero() + " Foi Atualizada Com Sucesso!");
		}else
			System.out.println("\nA Conta Número: " + conta.getNumero() + " Não Foi Encontrada!");
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) ==  true)
				System.out.println("\nA Conta Número: " + numero + " Foi Deletada Com Sucesso");
		} else
			System.out.println("\nA Conta Número: " + numero + " Não Foi Encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			
			if (conta.sacar(valor) == true)
				System.out.println("\nO Saque Na Conta Número: " + numero + " Foi Efetuado Com Sucesso!");
		} else
			System.out.println("'\nA Conta Número: " + numero + " Não Foi Encontrada!");
		
	}

	@Override
	public void depoistar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO Depósito Na Conta Número: " + numero + " Foi Efetuado Com Sucesso");
		} else
			System.out.println ("\nA Conta Número: " + numero + " Não Foi Encontrada");
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA Transferência Foi Efetuada Com Sucesso");
			}
		} else 
			System.out.println("\nA Conta De Origem e/ou Destino Não Foi Encontrada");
				
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}
}
