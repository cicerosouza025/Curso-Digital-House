package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lanchonete.Bolo;
import lanchonete.Massa;
import lanchonete.Sanduiche;
import lanchonete.TiposMassa;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		do {
			System.out.println("Escolha uma opção:\n");
			System.out.println("       MENU  \n====================== \n[1] Sanduíches\n[2] Massas\n[3] Bolos\n[4] Sair \n======================");
			op = sc.nextInt();
			switch(op) {
				case 1: menuSanduiche();
					break;
				case 2: menuMassa();
					break;
				case 3: menuBolo();
					break;
				case 4: System.out.println("Obrigado! Volte Sempre!");
					break;
				default: System.out.println("Opção Inválida!");
			}
		}while(op != 4);
		
	}
	
	private static void menuBolo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha a massa: ");
		String massa = sc.nextLine();
		System.out.print("Escolha o recheio: ");
		String recheio = sc.nextLine();
		System.out.print("Escolha a cobertura: ");
		String cobertura = sc.nextLine();
		
		Bolo bolo = new Bolo(15.00, massa, recheio, cobertura);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+bolo.getPreco()+" Tempo para entrega: "+bolo.tempo(distancia)+" minutos");
		sc.nextLine();
			
	}
	
	private static void menuMassa() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha o molho: ");
		String molho = sc.nextLine();
		System.out.print("Escolha o tipo de Massa (M) Macarrão, (P) Pizza, (L) Lasanha: ");
		String t = sc.next().toUpperCase();
		TiposMassa tipo;
		
		if(t.charAt(0) == 'M') {
			tipo = TiposMassa.MACARRAO;
		}else {
			if(t.charAt(0) == 'P') {
				tipo = TiposMassa.PIZZA;
			}else {
				tipo = TiposMassa.LASANHA;
			}
		}
		
		Massa massa = new Massa(15.00, molho, tipo);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+massa.getPreco()+" Tempo para entrega: "+massa.tempo(distancia)+" minutos");
		sc.nextLine();
		
	}
	
	private static void menuSanduiche() {
		
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		List<String> ingredientes = new ArrayList<>();
		
		while(ingredientes.size() <= 10) {
			System.out.print("Digite um ingrediente: ");
			ingredientes.add( sc.nextLine() );
			cont = cont + 1;
			System.out.println("Deseja adicionar outro ingrediente? (s/n)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			if(c == 'n') {
				break;
			}				
		}
		
		Sanduiche sanduiche = new Sanduiche((12.00 + cont), ingredientes);
		
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+sanduiche.getPreco()+ "R$" +" tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
		sc.nextLine();
		
	}	

}
