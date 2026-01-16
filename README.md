

<h1 align="center"> ☕ PROJETO: SISTEMA DE INGRESSOS PARA CINEMA ☕ </h1>

## 🚀 Introdução:

O projeto foi desenvolvido com o propósito de consolidar , na prática , o aprendizado em conceitos de **PROGRAMAÇÃO ORIENTADA A OBJETOS** em java.
Ele busca unir **boas práticas de desenvolvimento** com os conceitos fundamentais de POO para fins educacionais, refletindo os conhecimentos adquiridos ao longo dos meus estudos.

---

## 🎯 Objetivo:

🔵 <b> Pôr em prática conceitos de POO, como: **hierarquia de classes, métodos sobrescritos, herança e polimorfismo**</b>

🔵 <b>Criar uma aplicação leve e funcional para a **compra de ingressos de cinema em três modalidades distintas:</b>
     
      INGRESSO INDIVIDUAL
      INGRESSO P/ ESTUDANTE 
      INGRESSO FAMÍLIA

🔵 <b>Aplicar conceitos e boas práticas da programação orientada a objetos com Java;</b>

🔵 <b>Consolidar a base teórica com a prática do desenvolvimento de software real.</b>


## 📌 STATUS DO PROJETO:

![Badge desenvolvendoo](http://img.shields.io/static/v1?label=STATUS&message=DESENVOLVENDO&color=GREEN&style=for-the-badge)

Este repositório está em constante atualização. Novas funcionalidades e melhorias estão sendo implementadas conforme avanço nos estudos e testes.


## 📚 Aprendizados Aplicados:

* Código estruturado através de um diagrama UML para garantir a funcionalidade correta das classes e métodos polifórmicos;
* Utilização de classes, herança de classes, métodos e controle de fluxo;
* Simulação de interações com o usuário via terminal.

 ## ⚙️ COMO FUNCIONA?

1️⃣: Ao executar a aplicação, o usuário terá acesso ao menu interativo em idioma PT-BR, mostrando o valor atual do ingresso do cinema de forma individual.


2️⃣: Abaixo desses dados, o usuário terá que escolher a modalidade do seu ingresso de acordo com os números de" 1 a 3"  ou  " 0 " para fechar a aplicação.

:warning: **REGRAS DE NEGÓCIO APLICADAS:** :warning:

:heavy_check_mark: O valor do ingresso individual inteiro foi fixado em **R$ 35,00 (BRL).**


:heavy_check_mark: O ingresso estudante possui um **desconto de 50% do valor do ingresso individual inteiro.** 


:heavy_check_mark: O ingresso família, sendo a **família composta por + de 3 membros**, possui um **desconto de 5% do valor total da compra.**


:bangbang:  **Segue abaixo blocos de código do método polifórmico usado para cálculo da compra baseado na modalidade dos ingressos:**

:white_check_mark: **CLASSE INGRESSO:**

```java

package entities;

public class Ingresso {


  protected double valor;
	private String nomeFilme;
	private boolean dublado;
	private boolean legendado; 

  rest de código...

//método que será aplicado o polimorfismo 
 public double calculoIngressoTotal() {
		return valor = 35.0;
	}
}
```
---

:white_check_mark: **CLASSE IngMeiaEntrada:**
```java
package entities;

public class MeiaEntrada extends Ingresso {
	
rest de código...
@Override
	public double getvalorIngresso() {
		  return valor = 35.0;
	}
	
   @Override //metodo poliformico de calculo do ingresso meia entrada
   public double calculoIngressoTotal() {
		 
	      return (valor / 2.0);
	}
```
---

:white_check_mark: **CLASSE IngFamilia:**
```java
package entities;

public class IngFamilia extends Ingresso {
    
	private int numeroPessoas;

rest de código...

 //metodo poliformico para cálculo do ingresso familia
 @Override
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
        	
        	System.out.println("Desconto aplicado!");      

        return valorTotal;
  }
    }
```


   
3️⃣ A aplicação informa que caso o usuário entre com uma opção não listada pelo sistema, **o menu interativo irá aparecer para ele novamente.** 


4️⃣ Após o usuário escolher a modalidade do seu ingresso, o sistema solicitará a ele o nome do filme que ele pretende assistir.

5️⃣ Escolhendo o filme, o sistema solicitará se o usuário deseja assistir o filme em **DUBLADO ou LEGENDADO**, pedindo que ele confirme com as letras iniciais das opções.



6️⃣ Selecionando uma das duas opções, **o sistema mostrará todos os detalhes da compra efetuada.**

:bangbang: **Segue abaixo blocos de código do método <i>toString</i> utilizado nas classes para formatação com o objetivo de mostrar ao usuário os detalhes da compra efetuada.**

:white_check_mark: **CLASSE INGRESSO:**

```java
@Override
	public String toString() {
		return "[Ingresso] Nome do Filme:" + nomeFilme 
				+" | "+ "Valor total do Ingresso:" +" R$" + valor + " | "
				+ "Dublado:" + dublado + " | " + "Legendado:" + legendado;
	}

```
---
:white_check_mark: **CLASSE IngMeiaEntrada:**

```java
 @Override
   public String toString() {
		return "[Ingresso] Nome do Filme:" + getNomeFilme() + " | "+ "Valor total do Ingresso:" +" R$" + calculoIngressoTotal() + 
				" | " + "Dublado:" + isDublado() + " | " + "Legendado:" + getLegendado();
	}

```
---

:white_check_mark: **CLASSE IngFamilia:**

```java
  @Override
    public String toString() {
        return "[Ingresso Família] Filme: " + getNomeFilme() +
               " | Pessoas: " + numeroPessoas +
               " | Valor unitário:  R$" + getvalorIngresso() +
               " | Valor Total: R$ " + calculoIngressoTotal() +
               " | Dublado: " + isDublado() +
               " | Legendado: " + getLegendado();
    }

```
---
 ##  :computer: :hammer: ATUALIZAÇÕES FUTURAS:

 **(    ) Tornar a lista de filmes disponíveis através de API.**
 
 **(    ) Oferecer novos idiomas a aplicação.**
 
**(    ) Disponibilizar recursos de acessibilidade.**


---

 ## 🤝 Contribuição:

Este projeto faz parte do meu portfólio de aprendizado. Feedbacks, sugestões ou contribuições são bem-vindas! Fique à vontade para <b>abrir issues</b> ou  <b>pull requests</b>.

---

 ## ⚙️ TECNOLOGIAS UTILIZADAS:  ⚙️


<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" height="40"/>
<img src="https://logo.svgcdn.com/logos/eclipse.svg" width="40" height="40" alt="Eclipse IDE">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" width="40" height="40"/>

## 📞 Contato:

Desenvolvido por **Ruth Araújo**

Se você tiver dúvidas, sugestões ou quiser trocar ideias sobre o projeto, fique à vontade para entrar em contato:

* 📧 **E-mail:** [rutharaujosportfolio@outlook.com](mailto:rutharaujosportfolio@outlook.com)
* 💼 **LinkedIn:** [linkedin.com/in/ruth-araujos12](https://www.linkedin.com/in/ruth-araujos12/)
