
package entities;

public class IngFamilia extends Ingresso {
    
	private int numeroPessoas;
  	
	//deixando os getters e setters 
	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	
	//construtor com o "this" para referenciar o atributo e ele receber o valor inicial do objeto

	public IngFamilia(String nome, double valorIngressoReal, boolean dubladoFilme, 
                      boolean legendadoFilme, int numeroPessoas) {
        super(nome, valorIngressoReal, dubladoFilme, legendadoFilme);
        this.numeroPessoas = numeroPessoas;
    }

    @Override //metodo poliformico para cálculo do ingresso familia
    public double calculoIngressoTotal() {
        
        //pega valor do ingresso da classe "pai"e armazena na variavel valorIngressoTotal
    	double valorIngressoTotal = getvalorIngresso();
    	
    	//variavel valorTotal recebe o calculo inicial do valor do ingresso pelo numero de pessoas
		double valorTotal = valorIngressoTotal * numeroPessoas;

		// bloco "if" para atribuir o desconto de 5% no valor total caso a familia seja composta por mais de 3 pessoas
        if (numeroPessoas > 3) {
            valorTotal *= 0.95; // multiplicando o valor total por 95% do valor do ingresso (dando diretamente 5% de desconto)
        }
        
        if (numeroPessoas > 3) {
        	
        	System.out.println("Desconto aplicado!");        }

        return valorTotal;
    }
    
    
    

    //sobrescrita do método ToString para impressão dos dados IngFamilia
    @Override
    public String toString() {
        return "[Ingresso Família] Filme: " + getNomeFilme() +
               " | Pessoas: " + numeroPessoas +
               " | Valor unitário:  R$" + getvalorIngresso() +
               " | Valor Total: R$ " + calculoIngressoTotal() +
               " | Dublado: " + isDublado() +
               " | Legendado: " + getLegendado();
    }
}
