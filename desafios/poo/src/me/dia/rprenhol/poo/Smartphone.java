/**
 * 
 */
package me.dia.rprenhol.poo;

/**
 * 
 */
public interface Smartphone extends NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

	@Override
	default void tocar() {
		System.out.println("Tocando música.");
	}

	@Override
	default void pausar() {
		System.out.println("Pausando reprodução de música...");
	}

	@Override
	default void selecionarMusica(String musica) {
		if(!musica.isEmpty()) {
			System.out.println("\"" + musica + "\" selecionada.");
			tocar();
		} else {
			System.out.println("Por favor, informe uma música.");
		}
	}

	@Override
	default void ligar(String numero) {
		if(!numero.isEmpty()) {
			System.out.println("Realizando chamada para \"" + numero + "\".");
		} else {
			System.out.println("Informe o número a ser chamado");
		}
	}

	@Override
	default void atender() {
		System.out.println("Atendendo ligação...");
	}

	@Override
	default void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}

	@Override
	default void exibirPagina(String url) {
		System.out.println("Acessando endereço: " + url);
	}

	@Override
	default void adicionarNovaAba() {
		System.out.println("Nova aba criada.");
	}

	@Override
	default void atualizarPagina() {
		System.out.println("Ataulizando página...");
	}
	
	void desbloquearTela();
}
