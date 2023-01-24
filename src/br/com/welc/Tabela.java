package br.com.welc;
/**
 * @wagner elvio
 */
import java.lang.annotation.Documented;

@Documented
public @interface Tabela {

	String autor();

	String bancoDedados();

	String versaodobancoDedados();


	String nomeDaTabela();

	int numeroDeLinhas();

	int numeroDeColunas();

}
