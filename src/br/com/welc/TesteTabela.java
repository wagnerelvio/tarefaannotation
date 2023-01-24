package br.com.welc;

/**
 * 
 * @author wagne
 * 
 */

@Tabela(
		autor = "Wagner Elvio",
		bancoDedados = "Postgres",
		versaodobancoDedados = "14.6",
		nomeDaTabela = "produto",
		numeroDeLinhas = 20000,
		numeroDeColunas = 120
		)

public class TesteTabela {
	@Tabela(
			autor = "Wagner Elvio",
			bancoDedados = "Postgres",
			versaodobancoDedados = "14.6",
			nomeDaTabela = "produto",
			numeroDeLinhas = 20000,
			numeroDeColunas = 120
			)

	public static void main(String[] args) {
		System.out.println("Olá");
		
	}
	

}
