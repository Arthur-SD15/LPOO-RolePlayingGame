/*
 *  Criamos a classe Transmutacao que é uma subclasse de ArmaMago, herdando os atributos de ArmaMago.
 *  Essa classe é responsável por criar uma Arma de Mago do tipo Transmutacao.
 *  Dentro dessa classe, temos o construtor da classe Transmutacao que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaMago.
*/
public class Transmutacao extends ArmaMago {
    public Transmutacao() {
        super("Magia da Transmutação", 0.25);
    }
}
