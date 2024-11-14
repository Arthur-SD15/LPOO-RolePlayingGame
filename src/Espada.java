/*
 *  Criamos a classe Espada que é uma subclasse de ArmaPaladino, herdando os atributos de ArmaPaladino.
 *  Essa classe é responsável por criar uma Arma de Paladino do tipo Espada.
 *  Dentro dessa classe, temos o construtor da classe Espada que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaPaladino.
*/
public class Espada extends ArmaPaladino {
    public Espada() {
        super("Espada", 0.3);
    }
}
