/*
 *  Criamos a classe Psikappa que é uma subclasse de ArmaMago, herdando os atributos de ArmaMago.
 *  Essa classe é responsável por criar uma Arma de Mago do tipo Psikappa.
 *  Dentro dessa classe, temos o construtor da classe Psikappa que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaMago.
*/
public class Psikappa extends ArmaMago {
    public Psikappa() {
        super("Psi-kappa", 0.5);
    }
}
