public class Gato extends Mamifero{

    @Override
    public void mover(){
        System.out.println("O gato esta andando");
    }
    @Override
    public void interagir(){
        System.out.println("Voce tentou interagir com o gato, o gato ficou feliz");
    }
}
