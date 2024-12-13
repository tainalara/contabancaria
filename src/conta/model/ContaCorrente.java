package conta.model;

public class ContaCorrente extends Conta {

	// Atributos (Variáveis)

	// Quando usamos o conceito de herança, as variáveis que vão ser herdadas podem
	// ser apagadas

	private float limite;

	// Método Especial - Método Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {

		super(numero, agencia, tipo, titular, saldo); // Invocando o método Construtor Conta
		this.limite = limite; // this representa o nome da Classe
	}

	// Exemplo de Polimorfismo de Sobrecarga
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	// Métodos de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean sacar (float valor) {
		
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insuficiente");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// Polimorfismo de Sobrescrita => add mais lógica a um método já existente
	public void visualizar() {
		super.visualizar(); // Esse método veio da Classe Conta
		System.out.println("Limite de Crédito: " + this.limite);

	}

}
