package estudo;

public class tomadaDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && !amigoDoDono) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
		
		while (idade < 18) {
			System.out.println(idade);
			idade = idade + 1;
		}
		
		// for (inicialização; condição; incremento)
		for(int inicializacao = 0; inicializacao < 2; inicializacao = inicializacao +1) {
			System.out.println("Olá!");
		}
						
		for(int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um número divisivel por 19 entre x e y");
				break;
			}
		}
	}

}
