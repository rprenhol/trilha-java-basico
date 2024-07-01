package me.dia.rprenhol.poo;

public class UsandoIPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphone = new IPhone("2019", "Dourado");
		
		System.out.printf("Meu iphone é de %s e é %s\n\n", 
				iphone.getModelo(), iphone.getCor());
		
		iphone.ligarAparelho();
		
	
		iphone.desbloquearTela();
		iphone.ligar("+55 16 99999-0000");
		iphone.encerrarLigacao();
		
		iphone.selecionarMusica("Born to be wild");
		
		iphone.atender();
		iphone.encerrarLigacao();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina("https://www.google.com");
		iphone.atualizarPagina();
		
		iphone.desligarAparelho();
	}

}
