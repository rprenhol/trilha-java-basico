/**
 * 
 */
package me.dia.rprenhol.poo;

/**
 * 
 */
public class IPhone implements Smartphone {
	private String modelo;
	private String cor;
	
	private boolean musicaEmAndamento = false;
	/**
	 * 
	 */
	public IPhone(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void tocar() {
		Smartphone.super.tocar();
		musicaEmAndamento = true;
	}
	public void pararMusica() {
		System.out.println("Parando de tocar música...");
		musicaEmAndamento = false;
	}
	@Override
	public void ligar(String numero) {
		if(musicaEmAndamento) {
			pausar();
		}
		Smartphone.super.ligar(numero);
	}
	@Override
	public void atender() {
		if(musicaEmAndamento) {
			pausar();
		}
		Smartphone.super.atender();
	}
	public void encerrarLigacao() {
		System.out.println("Chamada encerrada com sucesso.");
		if(musicaEmAndamento) {
			tocar();
		}
	}
	@Override
	public void desbloquearTela() {
		System.out.println("Tela desbloqueada");
	}
	public void ligarAparelho() {
		System.out.println("Apple");
		System.out.printf("Ligando iPhone...\n\n");
	}
	public void desligarAparelho() {
		System.out.println("Desligando iPhone...");
	}

}
