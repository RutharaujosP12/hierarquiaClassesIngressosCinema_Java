
package entities;

public class MeiaEntrada extends Ingresso {
	
//construtor da classe pai e mesmos atributos
  
	public MeiaEntrada(String nome, double valorIngressoReal, boolean dubladoFilme, boolean legendadoFilme) {
		super(nome, valorIngressoReal, dubladoFilme, legendadoFilme);
	}
		
	
	@Override
	public double getvalorIngresso() {
		  return valor = 35.0;
	}
	
   @Override //metodo poliformico de calculo do ingresso meia entrada
   public double calculoIngressoTotal() {
		 
	      return (valor / 2.0);
	}
		
   
   @Override
   public String toString() {
		return "[Ingresso] Nome do Filme:" + getNomeFilme() + " | "+ "Valor total do Ingresso:" +" R$" + calculoIngressoTotal() + 
				" | " + "Dublado:" + isDublado() + " | " + "Legendado:" + getLegendado();
	}
} 



