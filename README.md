<h1 align="center">
  LPOO-RolePlayingGame
</h1>

<p align="center">
  <a href="#earth_americas-repositório">Repositório</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#mag_right-detalhes">Detalhes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-funcionalidades">Funcionalidades</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#man-aluno">Aluno</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#book-docs">Docs</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#woman_teacher-professora">Professora</a>
</p>

<p align="center">
  <img src="https://etcpan.ufms.br/wp-content/uploads/sites/249/nggallery/apoio/facom.png" width="250px">
</p>

## :earth_americas: Repositório

O repositório, de maneira geral, armazena os códigos e as documentações de um projeto prático da disciplina de Linguagem de Programação Orientada a Objetos, desenvolvido na Universidade Federal de Mato Grosso do Sul. Este projeto simula um Role Playing Game (RPG), aplicando fundamentos de Orientação a Objetos na linguagem Java. O código contém comentários explicativos sobre as operações realizadas e inclui um relatório em PDF, desenvolvido em LaTeX, como documentação base. O código fonte em LaTeX também está disponível neste repositório.

## :mag_right: Detalhes

O projeto segue rigorosamente os princípios de Orientação a Objetos, contendo 15 arquivos .java com classes abstratas, concretas e heranças. Como apoio, foi utilizado o Diagrama UML, que serviu como base ao longo do desenvolvimento. O código será detalhado com mais profundidade no relatório, pois este breve resumo não tem a intenção de abordar toda a estrutura do código.

## :rocket: Funcionalidades

O Role Playing Game (RPG) possui três personagens: Mago, Paladino e Clérigo, que são identificados pelos números (1, 2 e 3) e podem ser selecionados via linha de comando. Os personagens possuem atributos de saúde, força e destreza, com pontos variando de 0.0 a 10.0.

Além dos atributos citados, cada personagem possui uma arma com um modificador de dano. Cada personagem tem à disposição duas armas, mas deve escolher apenas uma. Após selecionar o personagem, a arma é escolhida via comando 1 ou 2.

- Mago
  - Magia da Transmutação: reduz o cálcio dos ossos do oponente, deixando-os mais porosos. Modificador: 0.25.
  - Psi-Kappa: com o poder de telecinese, arremessa o oponente à distância. Modificador: 0.5.

- Paladino
  - Espada: possui uma lâmina afiada, mas é frágil. Modificador: 0.3.
  - Lança: permite ataques a longa distância. Modificador: 0.5.

- Clérigo
  - Martelo: embora pesado, é uma arma letal. Modificador: 0.6.
  - Maça: mais leve, sendo mais fácil de manusear. Modificador: 0.4.

Durante a batalha, caso a saúde de um personagem fique abaixo de 1 ponto, ele é considerado morto. Na batalha, é possível atacar, defender e contra-atacar golpes. 

De forma a simplificar a lógica da batalha, suponha que o personagem A ataca um personagem B, temos o seguinte fluxograma:


<p align="center">
  <img src="/docs/ilustracaoLPOO.png" width="100%">
</p>

__Observação: o fluxograma não tem como objetivo ser algo representativo como um diagrama da UML, como o diagrama de atividade. Este fluxograma tem apenas o propósito de ilustrar, de forma simplificada e a grosso modo, o funcionamento do RPG.__

Transcrevendo, o fluxograma:
- Verifique se o personagem A está vivo:
  - Se o personagem A estiver vivo, o personagem A ataca o personagem B.
	  - Verifique se o personagem B está vivo:
		  - Se o personagem B estiver vivo, verifique a destreza do personagem A e do personagem B:
			  - destreza personagem A > personagem B:
				  - o ataque é bem sucedido, o personagem B sofre o dano da força * modificador.
			  - destreza personagem A < personagem B:
				  - o ataque é mal sucedido, o personagem A sofre o dano da força * modificador.
			  - destreza personagem A = personagem B:
				  - o ataque é defendido pelo personagem B.
		  - Se o personagem B estiver morto, o personagem B já está morto.
  - Se o personagem A estiver morto, o personagem A não consegue atacar.

Indo para as entradas e saídas, durante a batalha temos, por exemplo:
- Para, Mago com 10 pontos de saúde, 10 pontos de força, 5 pontos de destreza com Magia da Transmutação;
- Para, Mago com 10 pontos de saúde, 10 pontos de força, 6 pontos de destreza com Psi-kappa;

Entrada:
```
1 10 10 5 1 
1 10 10 6 2 
```

Impresso:
```
Mago [Saude: 10.0, Forca: 10.0, Destreza: 5.0, Magia da Transmutação]
Mago [Saude: 10.0, Forca: 10.0, Destreza: 6.0, Psi-kappa]
```

Entrada (atacante, defensor):
```
1 2 
```

Impresso:
```
O Mago ataca o Mago com Magia da Transmutação.
O ataque foi inefetivo e revidado com 5.0 pontos de dano!
Mago [Saude: 5.0, Forca: 10.0, Destreza: 5.0, Magia da Transmutação]
Mago [Saude: 10.0, Forca: 10.0, Destreza: 6.0, Psi-kappa]
```

Entrada (atacante, defensor):
```
2 1 
```

Impresso:
```
O Mago ataca o Mago com Psi-kappa.
O ataque foi efetivo com 5.0 pontos de dano!
Mago [Saude: 10.0, Forca: 10.0, Destreza: 6.0, Psi-kappa]
Mago [Morto, Forca: 10.0, Destreza: 5.0, Magia da Transmutação]
```

Fim:
```
0
```


## :book: Docs
> [![Baixar PDF](https://img.shields.io/badge/Baixar%20PDF-red?style=for-the-badge&logo=adobeacrobatreader&logoColor=white)](/docs/LPOO_RolePlayingGame.pdf)


## :man: Aluno

- Arthur Silva Dantas

## :woman_teacher: Professora

- Graziela Santos de Araújo - Linguagem de Programação Orientada a Objetos
