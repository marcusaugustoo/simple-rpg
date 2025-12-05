package Personagens;
import Armas.Arma;
public abstract class Personagem {

    private String nomeTipo;
    private double saude, forca, destreza;
    private Arma arma;

    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;}

    //impressão do status dos personagens
    public void printStatus() {
        if(this.saude >= 1)
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n",this.nomeTipo, this.saude, this.forca, this.destreza, this.arma.getNome());
        else
            System.out.printf("%s [Morto, Forca: %.1f, Destreza: %.1f, %s]\n",this.nomeTipo, this.forca, this.destreza, this.arma.getNome());}

    //função atacar
     public void atacar(Personagem b){
        //verificação de vida dos personagens, se estiverem mortos, irá printar as mensagens abaixo
        if(this.estaMorto()){
            System.out.printf("O %s não consegue atacar, pois está morto!\n", this.nomeTipo);}

        else if(b.estaMorto()){
            System.out.printf("Pare! O %s já está morto!\n", b.nomeTipo);}

        //caso estiverem vivos, ocorrerá a batalha
        else{
            System.out.printf("O %s ataca o %s com %s.\n", this.nomeTipo, b.nomeTipo, this.arma.getNome());

        //se o personagem A ter uma destreza maior que a do personagem B, o B será atacado e irá sofrer dano
            if(this.destreza > b.destreza){
                System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n",this.calculaDano());
                b.recebeDano(this.calculaDano());
            }
        //se o personagem A ter uma destreza menor que a do personagem B, o A não afetará o B e vai ser revidado

            if(this.destreza < b.destreza){
                System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", b.calculaDano());
                this.recebeDano(b.calculaDano());
            }

        //caso ambas destrezas forem iguais, ninguém sofrerá dano
            if(this.destreza == b.destreza){
                System.out.printf("O ataque foi defendido, ninguem se machucou!\n");
            }}} 

    //função para calcular dano do personagem
    private double calculaDano() {
       return this.forca * this.arma.getModDano();
    }

    //função que subtrairá a vida do personagem com o dano causado
    private void recebeDano(double pontosDano) {
        this.saude -=  pontosDano;
    }

    //função para verificar o estado de vida do personagem
    private boolean estaMorto() {
        if(this.saude < 1)
            return true;
        return false;
    }
}
