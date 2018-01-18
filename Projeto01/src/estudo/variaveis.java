package estudo;

public class variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 15;
		int idadeNoAnoQueVem = idade + 1;
		System.out.println(idade);
		System.out.println(idadeNoAnoQueVem);
		
		System.out.println("Exercicio:");
		double gastosJaneiro = 15000.00;
		double gastosFevereiro = 23000.00;
		double gastosMarco = 17000.00;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos do Trimestres " + gastosTrimestre);
		
		double mediaMensal = gastosTrimestre / 3;
		System.out.println("Média de gastos " + mediaMensal);
	}

}
