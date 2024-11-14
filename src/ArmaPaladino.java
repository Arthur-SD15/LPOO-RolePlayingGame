/*
 * Criamos uma classe abstrata ArmaPaladino que é uma subclasse de Arma, herdando os atributos de arma. 
 * Essa classe é responsável por criar uma ArmaPaladino do tipo Arma.
 * Dentro dessa classe, temos o construtor da classe ArmaPaladino que recebe o nome e o modificador de dano.
 * Utilizamos o construtor da superclasse para inicializar os atributos de arma.
*/
public abstract class ArmaPaladino extends Arma{
    public ArmaPaladino(String nome, double modDano){
        super(nome, modDano);
    }
}
