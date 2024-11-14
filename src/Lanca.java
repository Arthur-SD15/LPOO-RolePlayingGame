/*
 *  Criamos a classe Lanca que é uma subclasse de ArmaPaladino, herdando os atributos de ArmaPaladino.
 *  Essa classe é responsável por criar uma Arma de Paladino do tipo Lanca.
 *  Dentro dessa classe, temos o construtor da classe Lanca que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaPaladino.
*/
public class Lanca extends ArmaPaladino {
    public Lanca() {
        super("Lança", 0.5);
    }
}
