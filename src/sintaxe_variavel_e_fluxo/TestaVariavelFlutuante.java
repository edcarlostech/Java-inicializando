package sintaxe_variavel_e_fluxo;

public class TestaVariavelFlutuante {

	public static void main(String[] args) {
        
		//Double aceita numero inteiro é compativel o contrário não
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);

		// Fazendo conta
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		// Teste divisao com int 
		// Regra java calculos entre inteiros com resultados flutuantes 
		// o retorno será truncado
		
		int outradivisao = 5 / 2;
		System.out.println(outradivisao);
		
		// Teste divisao com double 
		double novatentativa = 5.0 / 2;
		System.out.println(novatentativa);
	}
}
