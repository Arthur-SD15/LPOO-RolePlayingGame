/*
 * Importamos as classes necessárias, sendo elas: Locale e Scanner.
 * Locale: classe que permite a formatação de números decimais, o padrão do Brasileiro é diferente do padrão Americano. O padrão brasileiro utiliza vírgula como separador de casas decimais, enquanto o padrão americano utiliza ponto.
 * Scanner: classe que permite a leitura de dados.
*/
import java.util.Locale;
import java.util.Scanner;

// Classe Main que contém o método main que é o método principal por executar o programa.
public class Main {
    // Método main que é o método principal por executar o programa.
    public static void main(String[] args) {
        // Define o padrão de formatação de números decimais para o padrão americano.
        Locale.setDefault(Locale.US);

        // Cria um objeto sc da classe Scanner que permite a leitura de dados.
        Scanner sc = new Scanner(System.in);
        // Cria um vetor de personagens com tamanho 2, já que nosso RPG será de dois personagens.
        Personagem[] personagens = new Personagem[2];

        // Laço de repetição para ler os dados dos personagens.
        for (int i = 0; i < 2; i++) {
            // Lê o número do personagem (1: Mago, 2: Paladino, 3: Clérigo).
            int numeroPersonagem = sc.nextInt();
            // Lê os números de saúde, força, destreza.
            double numeroSaude = sc.nextDouble();
            double numeroForca = sc.nextDouble();
            double numeroDestreza = sc.nextDouble();
            // Lê o número da arma (Cada arma tem número de 1 e 2, mas, varia entre os personagens).
            int numeroArma = sc.nextInt();

            /*
             * Verificamos o número do personagem, de acordo com esse número, ele entrará em um dos casos. Caso o número seja diferente de 1, 2 ou 3 uma exceção será lançada.
             * Todos os casos tem a mesma estrutura, mudando apenas a arma de acordo com o personagem. Segue a estrutura:
             * - De acordo com o número do personagem, criamos inicalmente uma variável do tipo da arma do personagem.
             * - Verificamos o número da arma, de acordo com esse número, instanciamos a arma do personagem. Caso o número seja diferente de 1 ou 2 uma exceção será lançada.
             * - Instanciamos o personagem, de acordo com o número do personagem, passando os valores de saúde, força, destreza e a arma.
             * - Após instanciarmos o personagem, ele é adicionado no vetor de personagens.
            */
            switch (numeroPersonagem) {
                case 1:
                    ArmaMago armaMago;
                    switch (numeroArma) {
                        case 1:
                            armaMago = new Transmutacao();
                            break;
                        case 2:
                            armaMago = new Psikappa();
                            break;
                        default:
                            throw new IllegalArgumentException("Arma inválida para Mago.");
                    }
                    personagens[i] = new Mago(numeroSaude, numeroForca, numeroDestreza, armaMago);
                    break;

                case 2:
                    ArmaPaladino armaPaladino;
                    switch (numeroArma) {
                        case 1:
                            armaPaladino = new Espada();
                            break;
                        case 2:
                            armaPaladino = new Lanca();
                            break;
                        default:
                            throw new IllegalArgumentException("Arma inválida para Paladino.");
                    }
                    personagens[i] = new Paladino(numeroSaude, numeroForca, numeroDestreza, armaPaladino);
                    break;

                case 3:
                    ArmaClerigo armaClerigo;
                    switch (numeroArma) {
                        case 1:
                            armaClerigo = new Martelo();
                            break;
                        case 2:
                            armaClerigo = new Maca();
                            break;
                        default:
                            throw new IllegalArgumentException("Arma inválida para Clérigo.");
                    }
                    personagens[i] = new Clerigo(numeroSaude, numeroForca, numeroDestreza, armaClerigo);
                    break;

                default:
                    throw new IllegalArgumentException("Personagem inválido.");
            }
        }

        // Imprimimos o status inicial dos personagens.
        personagens[0].printStatus();
        personagens[1].printStatus();

        // Laço de repetição para ler os ataques e defesas dos personagens.
        while (true) {
            // Lê o número do personagem atacante.
            int ataque = sc.nextInt();
            // Lê o número do personagem defensor.
            int defesa = sc.nextInt();

            // Caso o número do personagem atacante ou defensor seja 0, o laço é interrompido.
            if (ataque == 0 || defesa == 0) {
                break;
            }

            /*
             * Dentro de [] utilizando o -1, pois o vetor começa em 0 e o número do personagem começa em 1. 
            */
            // Realizamos o ataque do personagem no personagem defensor.
            personagens[ataque - 1].atacar(personagens[defesa - 1]);
            // Imprimimos o status do atacante.
            personagens[ataque - 1].printStatus();
            // Imprimimos o status do defensor.
            personagens[defesa - 1].printStatus();
        }
        // Fecha o objeto sc da classe Scanner.
        sc.close();
    }
}
