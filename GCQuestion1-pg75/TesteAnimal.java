public class TesteAnimal {
    public static void main(String[] args) {

        System.out.println("======= Teste Animal =======\n");
        Animal animal = new Animal();
        animal.mover();
        animal.interagir();

        System.out.println("======= Teste Mamifero =======\n");
        Mamifero mamifero = new Mamifero();
        mamifero.mover();
        mamifero.interagir();

        System.out.println("======= Teste Reptil =======\n");
        Reptil reptil = new Reptil();
        reptil.mover();
        reptil.interagir();

        System.out.println("======= Teste Cachorro =======\n");
        Cachorro cachorro = new Cachorro();
        cachorro.mover();
        cachorro.interagir();

        System.out.println("======= Teste Cobra =======\n");
        Cobra cobra = new Cobra();
        cobra.mover();
        cobra.interagir();

        System.out.println("======= Teste Gato =======\n");
        Gato gato = new Gato();
        gato.mover();
        gato.interagir();


    }
}
