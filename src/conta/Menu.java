package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		/*
		// Instanciamento | Transformando uma Classe em um Objeto Utilizavel
		Conta c1 = new Conta(123456, 0001, 1, "Maria das Neves", 500f);
		c1.setSaldo(5000f);

		System.out.println("Titular" + ": " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());
		*/

		// Teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Tainá", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************************");
			System.out.println("                                                         ");
			System.out.println("                 BANCO DO BRAZIL COM Z                   ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("             1 - Criar Conta                             ");
			System.out.println("             2 - Listar Todas As Contas                  ");
			System.out.println("             3 - Buscar Conta por Número                 ");
			System.out.println("             4 - Atualizar Dados da Conta                ");
			System.out.println("             5 - Apagar Conta                            ");
			System.out.println("             6 - Sacar                                   ");
			System.out.println("             7 - Depositar                               ");
			System.out.println("             8 - Transferir Valores Entre Contas         ");
			System.out.println("             9 - Sair                                    ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("Entre Com A Opção Desejada:                              ");
			System.out.println("                                                         " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Do Brazil Com Z - O SEU FUTURO COMEÇA AQUI!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar Todas As Contas\n\n");
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar Dados Da Conta\n\n");
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados Da Conta\n\n");
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar A Conta\n\n");
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência Entre Contas\n\n");
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("\nProjeto Desenvolvido por: Tainá Lara");
		System.out.println("Contato: tainalara.dev@gmail.com");
		System.out.println("https://github.com/tainalara");
		System.out.println("\n*********************************************************");
	}

}
