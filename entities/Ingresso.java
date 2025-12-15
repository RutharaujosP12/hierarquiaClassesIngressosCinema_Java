package entities;

public class Ingresso {

	protected double valor;
	private String nomeFilme;
	private boolean dublado;
	private boolean legendado; 
	
	//construtor da classe 
	
	public Ingresso(String nome, double valorIngressoReal, boolean dubladoFilme, boolean legendadoFilme) {
		
     nomeFilme= nome; 
     valor = valorIngressoReal; 
     dublado = dubladoFilme; 
     legendado = legendadoFilme;

	}
	
	
	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
	
	 public double getvalorIngresso() {
    	 return valor;
     }
	
	
	//método que será aplicado o polimorfismo 
     public double calculoIngressoTotal() {
		
		return valor = 35.0;
	}   
    

	 public boolean getLegendado() {
		return legendado;
	}

	public void setLegendado(boolean legendado) {
		this.legendado = legendado;
	}


	public boolean isDublado() {
		return dublado;
	}

	public void setDublado(boolean dublado) {
		this.dublado = dublado;
	}

	@Override
	public String toString() {
		return "[Ingresso] Nome do Filme:" + nomeFilme 
				+" | "+ "Valor total do Ingresso:" +" R$" + valor + " | "
				+ "Dublado:" + dublado + " | " + "Legendado:" + legendado;
	}

	
	
	}


