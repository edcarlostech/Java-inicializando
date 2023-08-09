package sintaxe_variavel_e_fluxo;

public class TestaVariaveis { // Classe Testa Variaveis
	// Metodo main
	public static void main(String[] args) {

		// Instrução a ser executada
		System.out.println("Ola! Ed");
		int idade; // declaração de variavel a cadas término de instrução colocar ponto e virgula
					// ";"
		idade = 37;  // Guardando valor em variavel 
		/*
		 * ava linguagem estaticamente tipada , precisa declarar todas as variaiceis a
		 * ser usadas e seu tipo
		 */
		System.out.println(idade); // Exibindo o conteudo da variavel

		// Trabalhando operadores aritiméticos

		idade = 30 + 7;
		System.out.println(idade); //Exibindo o novo valor da variavel idade
		
		idade = (7 * 5) + 2; // Exobindo o novo valor da variavel idade
		System.out.println(idade);
		
		System.out.println("a idade é "+ idade + ", parabéns"); // o sinal de mais concatena algum valor com uma strin
	}

}
