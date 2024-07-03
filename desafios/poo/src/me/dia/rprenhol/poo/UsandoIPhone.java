package me.dia.rprenhol.poo;

import java.util.Arrays;
import java.util.List;

import me.dia.rprenhol.poo.aparelhos.AparelhoTelefonico;
import me.dia.rprenhol.poo.aparelhos.IPhone;
import me.dia.rprenhol.poo.aparelhos.NavegadorInternet;
import me.dia.rprenhol.poo.aparelhos.ReprodutorMusical;
import me.dia.rprenhol.poo.aparelhos.Smartphone;

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
