/*
 * Criamos uma classe abstrata ArmaMago que é uma subclasse de Arma, herdando os atributos de arma. 
 * Essa classe é responsável por criar uma ArmaMago do tipo Arma.
 * Dentro dessa classe, temos o construtor da classe ArmaMago que recebe o nome e o modificador de dano.
 * Utilizamos o construtor da superclasse para inicializar os atributos de arma.
*/
public abstract class ArmaMago extends Arma{
    public ArmaMago(String nome, double modDano){
        super(nome, modDano);
    }
}
