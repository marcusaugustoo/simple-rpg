import java.util.Scanner;
import Armas.*;
import Personagens.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] dadoA = input.nextLine().split(" ");
        String[] dadoB = input.nextLine().split(" ");

        Personagem A = criarPersonagem(dadoA);
        Personagem B = criarPersonagem(dadoB);

        A.printStatus();
        B.printStatus();

        int atacanteA = input.nextInt();
        int atacanteB = input.nextInt();

        while(atacanteA != 0){

            if(atacanteA == 1){
                A.atacar(B);
            }
            else if(atacanteB == 1){
                B.atacar(A);
            }

            atacanteA = input.nextInt();
            atacanteB = input.nextInt();
            
        }
   
        input.close();
        
    }

    public static Personagem criarPersonagem(String[] dado){

        String tipoPersonagem = dado[0];
        double saudePersonagem = Double.parseDouble(dado[1]);
        double forcaPersonagem = Double.parseDouble(dado[2]);
        double destrezaPersonagem = Double.parseDouble(dado[3]);
        String tipoArma = dado[4];

        if(tipoPersonagem.equals("1")){
            ArmaMago arma;
            if(tipoArma.equals("1")){
                arma = new Transmutacao();
                return new Mago(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
            else{
                arma = new Psikappa();
                return new Mago(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
        }
        else if(tipoPersonagem.equals("2")){
            ArmaPaladino arma;
            if(tipoArma.equals("1")){
                arma = new Espada();
                return new Paladino(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
            else{
                arma = new Lanca();
                return new Paladino(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
        }
        else{
            ArmaClerigo arma;
            if(tipoArma.equals("1")){
                arma = new Martelo();
                return new Clerigo(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
            else{
                arma = new Maca();
                return new Clerigo(saudePersonagem, forcaPersonagem, destrezaPersonagem, arma);
            }
        }

    }

}