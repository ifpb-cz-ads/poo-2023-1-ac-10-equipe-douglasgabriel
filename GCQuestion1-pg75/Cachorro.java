public class Cachorro extends Mamifero{
    @Override
    public void mover(){
        System.out.println("O cachorro esta correndo");
    }
    @Override
    public void interagir(){
        System.out.println("Voce tentou interagir com o cachorro, porem ele esta correndo");
    }
}
