package sintaxe_variavel_e_fluxo;

public class TestaConversão {
	
	public static void main (String[]  args) {
		
		//double salario = 1270.50;
		//int valor = salario;
		
		//Inteiro para double ok o inverso disso o java não aceita
		//double valor = 3;
		// Vamos moldar o double para inteiro
		// Usando a casting Ex.: abaixo 
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		// Retornando inteiro devido o casting
		
		// O tipo int aceita até 32bits 
		int numeromedio = 122000;
		System.out.println(numeromedio);
		
		// Algo a mais do que isso em java se utiliza o Long que é 64 bits 
		Long numeroGrande = 32432422353l;
		System.out.println(numeroGrande);
		
		// Numero de 16 bits 
		short valorPequeno = 2131;
		System.out.println(valorPequeno);
		
		// Numero menor ainda vai até 256 bytes
		byte valormenorainda= 127;
		System.out.println(valormenorainda);
		
		//Salario para dinheiro não se utiliza muito exemplo; 
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		// Porque não saiu somente 03, devido a uma conversão matematica que considera iEEE 754;
		
		// Tem também o float
		float pontoflutuante = 3.14f;
		System.out.println("Ed este é o ponto flutuante: "+pontoflutuante);
		//Focar no double, int e long
	}

}
