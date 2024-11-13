import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Personagem[] personagens = new Personagem[2];

        for (int i = 0; i < 2; i++) {
            int numeroPersonagem = sc.nextInt();
            double numeroSaude = sc.nextDouble();
            double numeroForca = sc.nextDouble();
            double numeroDestreza = sc.nextDouble();
            int numeroArma = sc.nextInt();

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

        personagens[0].printStatus();
        personagens[1].printStatus();

        while (true) {
            int ataque = sc.nextInt();

            if (ataque == 0) {
                break;
            }

            int defesa = sc.nextInt();
            
            personagens[ataque - 1].atacar(personagens[defesa - 1]);
            personagens[0].printStatus();
            personagens[1].printStatus();
        }

        sc.close();
    }
}
