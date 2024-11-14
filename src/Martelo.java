/*
 *  Criamos a classe Martelo que é uma subclasse de ArmaClerigo, herdando os atributos de ArmaClerigo.
 *  Essa classe é responsável por criar uma Arma de Clerigo do tipo Martelo.
 *  Dentro dessa classe, temos o construtor da classe Martelo que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaClerigo.
*/
public class Martelo extends ArmaClerigo {
    public Martelo(){
        super("Martelo", 0.6);
    }
}
